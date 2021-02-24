package employ;

public class Employee {
	private String name, address;
	  private int year, salary;
	  public Employee(String n, int y, int sal, String add){
	    name = n;
	    year = y;
	    salary = sal;
	    address = add;
	  }
	  public String getName(){
	    return name;
	  }
	  public int getYear(){
	    return year;
	  }
	  public int getSalary(){
	    return salary;
	  }
	  public String getAddress(){
	    return address;
	  }
	}

	class Emp{
	  public static void main(String[] args){
	    Employee e1 = new Employee("Robert", 1994, 500000, "64C- WallsStreet");
	    Employee e2 = new Employee("Sam", 2000, 740000, "68D- WallsStreet");
	    Employee e3 = new Employee("John", 1999, 600000, "26B- WallsStreet");
	    System.out.println("Name\tYear of joining\tSalary\tAddress");
}
}