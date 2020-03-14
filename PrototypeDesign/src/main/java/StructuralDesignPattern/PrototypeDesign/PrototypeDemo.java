package StructuralDesignPattern.PrototypeDesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {
   public static void  main(String[] args) throws IOException {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   System.out.format("%s", "Enter Employee Id : ");
	   int eid=Integer.parseInt(br.readLine());
	   System.out.format("%s", "\nEnter Employee name : ");
	   String ename=br.readLine();
	   System.out.format("%s", "\nEnter Employee designation : ");
	   String edesignation=br.readLine();
	   System.out.format("%s", "\nEnter Employee address : ");
	   String eaddress=br.readLine();
	   System.out.format("%s", "\nEnter Employee salary : ");
	   double esalary=Double.parseDouble(br.readLine());
	   
	   EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);
	   e1.showRecord();
	   System.out.format("%s", "\n");
	   EmployeeRecord e2=(EmployeeRecord) e1.getClone();
	   e2.showRecord();
	   
   }
}
