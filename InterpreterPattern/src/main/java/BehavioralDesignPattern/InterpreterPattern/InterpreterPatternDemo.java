package BehavioralDesignPattern.InterpreterPattern;

public class InterpreterPatternDemo {
	public static void main(String[] args) {
		String infix="a+b*c";
		InfixToPostfixPattern ip=new InfixToPostfixPattern();
		String postfix=ip.conversion(infix);
		System.out.format("%s", "\nInfix : "+infix);
		System.out.format("%s", "\nPostfix : "+postfix);
	}
}
