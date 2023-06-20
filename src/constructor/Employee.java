package constructor;

public class Employee {
	 int empid;
	 String empname;
	 String company="GIT";
	 
	 public Employee(int empid,String empname)
	 {
		 this.empid=empid;
		 this.empname=empname;
	 }
	 public void display()
	 {
		 System.out.println("Employee id="+empid);
		 System.out.println("Employee name="+empname);
		 System.out.println("Company="+company);
		 
		 
	 }

	public static void main(String[] args) {
		 Employee e=new Employee(101,"arun");
         e.display();
	}

}
