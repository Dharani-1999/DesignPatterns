package BehavioralDesignPattern.InterpreterPattern;

import java.util.Stack;

public class InfixToPostfixPattern implements Pattern{
	public String conversion(String expr) {
		int priority=0;
		String postfix="";
		Stack<Character> s1=new Stack<Character>();
		for(int i=0;i<expr.length();i++) {
			char ch=expr.charAt(i);
			if(ch=='+'|| ch=='-' || ch=='*' || ch=='/' || ch=='%') {
				if(s1.size()<=0) {
					s1.push(ch);
				}
				else {
					Character chTop=(Character)s1.peek();
					if(chTop == '*' || chTop == '/') {
						priority=1;
					}
					else
						priority=0;
					if(priority==1) {
						if(ch == '*' || ch=='/' || ch=='%') {
							postfix+=s1.pop();
							i--;
						}
						else {
							postfix+=s1.pop();
							i--;
						}
					}
					else {
						if(ch=='+' || ch=='-') {
							postfix+=s1.pop();
							s1.push(ch);
						}
						else {
							s1.push(ch);
						}
					}
				}
				
			}
			else {
				postfix+=ch;
			}
		}
		int len=s1.size();
		for(int j=0;j<len;j++) {
			postfix+=s1.pop();
		}
		return postfix;
	}   
}
