package BehavioralDesignPattern.IteratorPattern;

public class CollectionOfNames implements Container{
    public String name[]= {"a","b","c","d","e"};
    
    public Iterator getIterator() {
		return new CollectionOfNamesIterate();
	}
    
    private class CollectionOfNamesIterate implements Iterator{
    	int i;
    	public boolean hasNext() {
    		if(i<name.length) {
    			return true;
    		}
    		return false;
    	}
    	public Object next() {
    		if(this.hasNext()) {
    			return name[i++];
    		}
    		return null;
    	}
    }
	
}
