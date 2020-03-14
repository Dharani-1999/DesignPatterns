package StructuralDesignPattern.PrototypeDesign;

public class EmployeeRecord implements Prototype{
   private int id;
   private String name,designation;
   private double salary;
   private String address;
   
   public EmployeeRecord() {
	   System.out.format("%s","Employee Records of Oracle Corporation\n");
	   System.out.format("%s","Employee_id"+"\t"+"Employee_Name"+"\t"+"Employee_Designtion"+"\t"+"Employee_Salary"+"\t\t"+"Employee_Address"+"\n");
	   
   }
   public EmployeeRecord(int id,String name,String designation,double salary,String address) {
	   this();
	   this.id=id;
	   this.name=name;
	   this.designation=designation;
	   this.salary=salary;
	   this.address=address;
   }
   public void showRecord() {
	   System.out.format("%s", id+"\t\t"+name+"\t\t"+designation+"\t\t\t"+salary+"\t\t\t"+address);
	   
   }
   public Prototype getClone() {
	   return new EmployeeRecord(id,name,designation,salary,address);
   }
}
