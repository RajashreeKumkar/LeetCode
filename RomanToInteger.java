package LeetCodeNew;

import java.util.HashMap;

public class RomanToInteger {
	public int romanToInt(String s) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int out=0;
        int sum=0;
        for(int i=0; i<s.length();i++) {
        	
        	if(i<s.length()-1 && map.get(Character.toString(s.charAt(i)))<map.get(Character.toString(s.charAt(i+1)))) {
        	sum=sum-map.get(Character.toString(s.charAt(i)));
        	}
        	else {
        		sum=sum+map.get(Character.toString(s.charAt(i)));
        		}
        	
        }
        	
        	
        return sum;
    }
	 public static void main(String[] args) {
			
		    RomanToInteger x = new RomanToInteger();
			int out = x.romanToInt("VII");
			System.out.println("output::"+out);
		}
}
