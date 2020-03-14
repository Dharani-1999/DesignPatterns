package CreationalDesignPattern.Builder_AbstractFactoryPattern;

import java.util.ArrayList;
import java.util.List;

public class CDType {
   private List<Packing> items=new ArrayList<Packing>();
   public void addItem(Packing packs) {
	   items.add(packs);
   }
   public void getCost() {
	   for(Packing packs:items) {
		   packs.price();
	   }
   }
   public void showItems() {
	   for(Packing packing:items) {
		   System.out.format("%s","CD name: "+packing.pack());
		   System.out.format("%s",", Price: "+packing.price()+"\n");
	   }
   }
}