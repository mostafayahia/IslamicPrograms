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

package elmasry.myUtils;

public class MyString {
	
	/** this methods stops application and throw exception if there is any 
	 * repeated item in the given list */ 
	public static void checkUniquenessOfLstItems(String[] items) {
		for (int i = 0, N = items.length; i < N - 1; i++) {
			String item = items[i];
			for (int j = i + 1; j < N; j++)
				if (item.equals(items[j]))
					throw new RuntimeException("Repeated Items at " + i + " " + j + " <=> " + item );
		}

	}
	
	
	// consider correction: this method should be in MyArray class not here
	/** this method concatenates any 2 arrays of type object[] in the given order*/
	public static Object[] concat2Arrays(Object[] arr1, Object[] arr2) {
		int n1 = arr1.length, n2 = arr2.length;
		Object[] out = new Object[n1 + n2];
		
		// this code is more efficient than below
		for (int i = 0, N = n1 + n2; i < N; i++)
			if (i < n1) out[i] = arr1[i];
			else        out[i] = arr2[i - n1];
		
		/*
		// you shouldn't using iterator while you already using index
		int index = 0;
		for (Object obj : arr1) out[index++] = obj;
		for (Object obj : arr2) out[index++] = obj;
		*/
		return out;
	}
	
	// consider correction: this method should be in MyArray class not here
	/** this method concatenates any 2 string arrays in the same given order */
	public static String[] concat2Arrays(String[] arr1, String[] arr2) {
		String[] out = new String[arr1.length + arr2.length];
		// consider correction: you shouldn't use iterator while using index (bad implementation)
		int index = 0;
		for (Object obj : concat2Arrays((Object[])arr1, (Object[])arr2))
			out[index++] = (String)obj;
		return out;
	}

}
