package inheritance;

class Member
{
	String name;
	int age;
	int phoneno;
	String address;
	int salary;
	

public void printdetails()
{
	System.out.println("member name="+name);
	System.out.println("member age="+age);
	System.out.println("member phoneno="+phoneno);
	System.out.println("member address="+address);
	System.out.println("member salary="+salary);
}
}
class Employee extends Member
{
	String specializatin;
	
	
	
}
class Manager extends Member
{
	
	String department;
	
}

public class Inheritancequestion {

	public static void main(String[] args) {
     
    
    Employee e=new Employee();
    e.name="Archana";
    e.age=23;
    e.address="bhavan";
    e.phoneno=998767856;
    e.salary=34500;
    System.out.println(e.specializatin="tester");
    e.printdetails();
    Manager m=new Manager();
    m.name="Amal";
    m.age=29;
    m.address="bhavan";
    m.phoneno=998767856;
    m.salary=54500;
    System.out.println(m.department="HR");
    m.printdetails();
    
    
    

	}

}
