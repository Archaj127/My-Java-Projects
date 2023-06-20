package oops;

class Emp
{
	private String Empname;
	private String Empdesignation;
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public String getEmpdesignation() {
		return Empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		Empdesignation = empdesignation;
	}
}


public class Encapsulationprgrm {

	public static void main(String[] args) {
		Emp e=new Emp();
        e.setEmpname("Archana");
        e.setEmpdesignation("tester");
        System.out.println(e.getEmpname());
        System.out.println(e.getEmpdesignation());
        
        
        

	}

}
