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
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import static free.elmasry.islamicPrograms.MyHelper.*;
import elmasry.myUtils.MyString;

public class IslamicProgramsEntry extends ListActivity implements OnItemClickListener {

	ListView lv;
	private String[] appFeatures;
	private String[] arProgramsNames;

	/** run at first time activity created */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		// get program names from strings.xml
		arProgramsNames = getResources().getStringArray(R.array.programs_names);

		// this application's logic is based on the uniqueness of programs' names so it
		// is so important to check this uniqueness
		// check that every item on the list view is unique unless exception will be thrown
		MyString.checkUniquenessOfLstItems(arProgramsNames);	

		// check that every list item is properly mapped
		checkLstItemsMapping(arProgramsNames);



		// create a new adapter containing a list of the islamic television programs
		// before displaying program names we will display application features
		// set this adapter to this list activity' adapter
		appFeatures = getResources().getStringArray(R.array.app_features);
		setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item2, 
				MyString.concat2Arrays(appFeatures, arProgramsNames)));

		// get list view of this activity
		lv = getListView();

		// enable filtering when the user types in virtual keyboard
		lv.setTextFilterEnabled(true);

		// set event handlers for this activity list
		lv.setOnItemClickListener(this);

		// storing application version to help us making further updates more easy 
		SharedPreferences mPrefs = getSharedPreferences(STR_PREFS_FILE_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor ed = mPrefs.edit();
		String appVersion = mPrefs.getString("app_version", "");
		
		// application version 1.2 was designed to have only one program called live the moment
		// we want to map the value of lastEpisode key to refer to the last watched episode
		// in the live the moment program
		// if appVersion equals to "" then the application version is before 1.3 version or just installed
		if (appVersion.equals("")) {
			// lastEpisode is a key was exist in application's preferences before version 1.3
			int lastEpisode = mPrefs.getInt("lastEpisode", 0);
			
			// if lastEpisode == 0 then the user didn't watch any episode in the live the moment program
			if (lastEpisode != 0) {
				ed.putString(STR_LAST_WATCHED_PROGRAM, 
						SECTION_NAME_EN_MOSTAFA_HOSNY + PROGRAM_NAME_EN_LIVE_THE_MOMENT);
			    ed.putInt(STR_LAST_WATCHED_EPISODE + SECTION_NAME_EN_MOSTAFA_HOSNY
			    		+ PROGRAM_NAME_EN_LIVE_THE_MOMENT, lastEpisode);
			}
		}
		ed.putString("app_version", "1.3");
		ed.commit();



	}


	/** handler for clicking item on the list view */
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		String itemText = ((TextView)view).getText().toString();
		Intent intent = new Intent(this, EpisodesActivity.class);
		
		// the first items is reserved for the application features
		if (position < appFeatures.length) {
			SharedPreferences mPrefs = getSharedPreferences(STR_PREFS_FILE_NAME, Context.MODE_PRIVATE);
			String lastWatchedProgram = mPrefs.getString(STR_LAST_WATCHED_PROGRAM, null);
			
			// if null so the user hasn't watched for any episode yet
			if (lastWatchedProgram == null) {
				showMessage(this, "لم تقم بمشاهدة أى برنامج حتى الآن");
				return;
			}
			
			// search if any item in the program name list mapped to this string (lastWatchedProgram)
			String arProgramName = getArProgramName(lastWatchedProgram, arProgramsNames);
			if (arProgramName == null)
				throw new RuntimeException(lastWatchedProgram + " <=> " + "No arProgramName in the list maps it");
			
			// showing a message to the user to remember him what last program was watching
			showMessage(this, arProgramName);
			
			// launch episodes activity with the given data
			intent.putExtra("arProgramName", arProgramName);
			startActivity(intent);
			return;
		}
		
		// check if this text of the item represents program name or not
		if (isArProgramName(itemText)) {
			intent.putExtra("arProgramName", itemText);
			startActivity(intent);
		}

	}

}
