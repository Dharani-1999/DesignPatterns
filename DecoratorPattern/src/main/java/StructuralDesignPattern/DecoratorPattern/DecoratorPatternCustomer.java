package StructuralDesignPattern.DecoratorPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorPatternCustomer {
	private static int choice;
	public static void main(String[] args) throws NumberFormatException,IOException{
		do {
			System.out.format("%s", "Food Menu\n");
			System.out.format("%s", "1. Vegetarian Food\n");
			System.out.format("%s", "2. Non Vegetarian Food\n");
			System.out.format("%s", "3.Exit\n");
			System.out.format("%s", "Enter choice : \n");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			choice=Integer.parseInt(br.readLine());
			switch(choice) {
				case 1 : VegFood vf=new VegFood();
				         System.out.format("%s", vf.prepareFood()+"\n");
				         System.out.format("%s", vf.foodPrice()+"\n");
				         break;
				case 2 : Food f1=new NonVegFood((Food) new VegFood());
		                 System.out.format("%s", f1.prepareFood()+"\n");
		                 System.out.format("%s", f1.foodPrice()+"\n");
		                 break;
		        default : System.out.format("%s", "Other than these no food available\n");
			}
			
		}while(choice!=3);
	}
}
