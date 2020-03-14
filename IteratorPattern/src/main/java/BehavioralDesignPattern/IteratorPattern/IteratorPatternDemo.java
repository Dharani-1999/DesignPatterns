package BehavioralDesignPattern.IteratorPattern;

public class IteratorPatternDemo {
	public static void main(String[] args) {
		CollectionOfNames c=new CollectionOfNames();
		for(Iterator  iter=c.getIterator(); iter.hasNext();) {
			String name=(String)iter.next();
			System.out.format("%s", "\nName : "+name);
		}
	}
}
