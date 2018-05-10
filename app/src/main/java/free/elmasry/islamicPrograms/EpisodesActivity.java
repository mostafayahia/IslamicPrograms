/*
 * Copyright (C) 2018 Yahia H. El-Tayeb
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Free Application
 * El-Masry
 * My Simple application
 * Used to watch the islamic programs' episodes online and make you 
 * easy to trace what you watch
 */
package free.elmasry.islamicPrograms;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import static free.elmasry.islamicPrograms.MyHelper.*;

public class EpisodesActivity extends ListActivity implements OnItemClickListener, OnScrollListener {
	
    // using this variable to track the last episode the user watched
	// this is useful to save episodeNo in onStop state only not onPause state !
	int episodeNo, itemPosition;
	
	// Grey color (alpha R G B)
	private final int GRAY  = 0xffeeeeee;
	private final int WHITE = 0xffffffff;
	
	private SharedPreferences mPrefs;
	private ListView lv;
	
	private final String TAG = EpisodesActivity.class.getSimpleName();
	
	// using this variable to ENSURE this activity onStop state
	// and the user activate another activity to watch an episode
	boolean watchEpisode;

	// these variable store program data
	private String arProgramName;
	private String programName;
	private String programSection;
	
    /** run at first time activity created */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//showMessage("onCreate");

		// get from the activity invoked this activity Arabic program name 
		// which should be unique
		arProgramName = getIntent().getExtras().getString("arProgramName");

		// get program data
		programName = PROGRAM_AR_EN_MAP.get(arProgramName);
		programSection = PROGRAM_SECTION_MAP.get(arProgramName);

		
		// create a new adapter containing a list of episodes' names
		// set the adapter on this list activity's built-in list view
		setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, 
				getResources().getStringArray(getArrResID(arProgramName))));
		
		// getting the list view of this activity
		lv = getListView();
		
		// enable filtering when the user types in the virtual keyboard
		lv.setTextFilterEnabled(true);
		
		// set event handler for this list view
		lv.setOnItemClickListener(this);
		lv.setOnScrollListener(this);
		
		// get preferences of this application
		mPrefs = getSharedPreferences(STR_PREFS_FILE_NAME, Context.MODE_PRIVATE);
		
		
		/*
		// if screen orientation change the retrieve the saved episode number from the bundle
		if (savedInstanceState != null) { 
			episodeNo = savedInstanceState.getInt("episodeNo");
			itemPosition = episodeNo;
			return;
		}
		*/

		Log.i(TAG, "onCreate() is called");
		
	}


	
    
	
	/** run when the activity is return from onStop state or after finishing onCreate method */
	@Override
	protected void onStart() {
		super.onStart();
		
		// scroll the list to the certain position (position of the item on the list view)
		// scroll to just before the last episode watched by the user
		// note: first item in the list view is the program name
		int lastWatchedEpisode = mPrefs.getInt(STR_LAST_WATCHED_EPISODE + programSection 
				+ programName, 0);
		if (lastWatchedEpisode != 0) lv.setSelection(lastWatchedEpisode-1);
		episodeNo = lastWatchedEpisode;
		itemPosition = episodeNo;
		
		//showMessage("onStart");
		//showMessage("episodeNo from onStart(): "+episodeNo);
		
		TextView tv = (TextView) lv.getChildAt(0);
		if (tv == null) return;
		
		int firstVisibleItemPosition = lv.getFirstVisiblePosition();
		int lastVisibleItemPostion   = lv.getLastVisiblePosition();
		updateItemsColors(firstVisibleItemPosition, lastVisibleItemPostion-firstVisibleItemPosition+1);
		
	}
	
	/*
	@Override
	protected void onStart() {
		super.onStart();
		// if you don't put this code in runnable of the post method you will get error
		// because the list view has not rendered yet
		
		showMessage("onStart method is called");
		showMessage("episode number is " + episodeNo);
		lv.post(new Runnable() {
			
			@Override
			public void run() {
				showMessage("first " + lv.getFirstVisiblePosition()+"");
				showMessage("last "  + lv.getLastVisiblePosition()+"");
				showMessage("run method is called");
				TextView tv = (TextView) lv.getChildAt(0);
				showMessage("the text in tv: "+tv.getText());
				tv.setBackgroundColor(GREY);
				
				
			}
		});
	}
	*/
	
	/** run when the activity is visible to the user */
	@Override
	protected void onResume() {
		super.onResume();
		//showMessage("onResume");
		
		watchEpisode = false;
	}
	
	/* run when the activity completely invisible */
	@Override
	protected void onStop() {
		super.onStop();
		//showMessage("onStop");
		
		// save item position in episode number
		if (watchEpisode) { 
			episodeNo = itemPosition;
			// IMPORTANT: if we don't save the preferences in the onStop() state 
			// and retrieve it in onStart() state, we get sometimes a freak error
			// regarding episode number
			savePreferences();
			//showMessage("episode no from onStop(): " + episodeNo);
			Log.i(TAG, "onStop() is called");
		}
	}





	/** run at last state of the activity life cycle */
	@Override
	protected void onDestroy() {
		super.onDestroy();
		//showMessage("onDestroy");
		Log.i(TAG, "onDestroy() is called");
	}
	
	/*
	 * save preferences of this application
	 */
	private void savePreferences() {
		// save the last episode number watched by the user
		SharedPreferences.Editor ed = mPrefs.edit();
		ed.putInt(STR_LAST_WATCHED_EPISODE + programSection + programName, episodeNo);
		
		// storing last watched program
	    ed.putString(STR_LAST_WATCHED_PROGRAM, programSection + programName);
	    
		ed.commit();
		Log.i(TAG, "savePreferences method is called");
		
	}
	
	/* run when changing orientation of the device screen and used
	 * to save the state
	 */
	
	/*
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		showMessage("onSaveInstaceState");
		outState.putInt("episodeNo", episodeNo);
	}
	*/
	
	/* handler for clicking item on the list view */
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		
		//showMessage(String.valueOf(parent.getPositionForView(view)));
		
		// start corresponding episode for the selected item
		// note that the first item is the program name
		if (position == 0) return;
		watchEpisode = true;
		final String[] EPISODES_LINKS = getEpisodesLinks(arProgramName);
		String episodeLink = EPISODES_LINKS[position-1];
		
		// we don't want to display episode in the list version of Youtube site
		int index;
		if ((index = episodeLink.indexOf("&list=")) != -1)
			episodeLink = episodeLink.substring(0, index);
		if ((index = episodeLink.indexOf("&index=")) != -1)
			episodeLink = episodeLink.substring(0, index);
		if ((index = episodeLink.indexOf("&t=")) != -1)
			episodeLink = episodeLink.substring(0, index);
		
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(episodeLink)));
		itemPosition = position;
		Log.i(TAG, "onItemClick() is called");
	}

	/* handler for scrolling the list view */
	@Override
	public void onScrollStateChanged(AbsListView view, int scrollState) {
		//showMessage("scrollState: "+scrollState);	
		
	}
	@Override
	public void onScroll(AbsListView view, int firstVisibleItem,
			int visibleItemCount, int totalItemCount) {
		
		
		updateItemsColors(firstVisibleItem, visibleItemCount);
	}
	
	private void updateItemsColors(int firstVisibleItem, int visibleItemCount) {
		for (int i = 0; i < visibleItemCount; i++) {
			TextView tv = (TextView) lv.getChildAt(i);
			if (tv == null) break;
			
			if (firstVisibleItem + i == episodeNo) tv.setBackgroundResource(R.drawable.touch_selector_selected_episode);
			else                                   tv.setBackgroundResource(R.drawable.touch_selector_general);
			
		}
	}





	/** show toast message for the input text */
	private void showMessage(CharSequence text) {
		Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
		
		/*
		final String[] strings = {"test1", "test2"};
		final int[] x = {1, 2};
		final int[] xx = new int[]{1, 2};
		final int[] xxx;
		xxx = {1, 2 ,3}; // not allowed
		xxx = new int[] {1, 2, 3}; // allowed
		*/
	}
	
	
	

	
	
}
