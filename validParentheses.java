package LeetCodeNew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class validParentheses {
	 public boolean isValid(String s) {
		boolean out=true;
		HashMap<Character,Character> map=new HashMap<>();
		map.put('}','{');
		map.put(')','(');
		map.put(']','[');
		if(s.length()==0) {return true;}
		if(s.length()%2!=0) {return false;}
		Stack<Character> stack = new Stack<>(); 
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i)) ){
				if( stack.size()!=0 && !(stack.pop()==map.get(s.charAt(i)))) {
					return false;
				}
			}else {
				stack.push(s.charAt(i));
				}
		}
		return stack.isEmpty();
	    }

	public static void main(String[] args) {
		validParentheses x = new validParentheses();
		boolean out = x.isValid("({})[]{}");
		System.out.println("output::" + out);
	}
}
