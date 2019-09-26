package LeetCodeNew;

import java.io.CharConversionException;

public class prefix {
	
	 public String longestCommonPrefix(String[] strs) {
	        if(strs.length==0) return "";
	         if(strs.length==1)return strs[0];
			 int min = strs[0].length();
				for (int i = 0; i < strs.length; i++) {
					if (strs[i].length() < min) {
						min = strs[i].length();
					}
				}
				
			String prefix=strs[0].substring(0, min);
			
			String compare ="";
			for (int i = 1; i < strs.length; i++) {
				compare= strs[i];
				for (int j = strs[i].length(); j >0; j--) {
						if (!prefix.equals(compare) && compare.length()>prefix.length()){
						compare = compare.substring(0, j);
					}else if(!prefix.equals(compare) ){
						compare = compare.substring(0, j);
						prefix = prefix.substring(0, j);
					}
				}
				if(! compare.equals(prefix)){
					return "";
				}
			}
			return compare;
	    }

	 
	 public static void main(String[] args) {
			String[] arr = {"flower","flow","flight"};
			prefix x = new prefix();
			String out = x.longestCommonPrefix(arr);
			System.out.println("output::"+out);
		}
}
