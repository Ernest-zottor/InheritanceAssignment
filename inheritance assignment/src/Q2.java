
class Members{
	String name;
	int age;
	String number;
	String address;
	int salary;
	
	Members(String name, int age, String number, String address, int salary){
		this.name = name;
		this.age = age;
		this.number = number;
		this.address =address;
		this.salary = salary;
	}
	public void printSalary() {
		System.out.println(salary);
		
	}
	
	public String toString() {
		return "Details: \n" + "Name: " + name +"\n" + "Age: "+ age + "\n" + "Number: " +
				 number +"\n" + "Address: "+ address +"\n" + "Salary: " + salary;
				
	}
	
}


class Employee extends Members{
	String specialization;
	
	Employee(String name, int age, String number, String address, int salary, String specialization){
		super(name, age, number, address, salary);
		this.specialization = specialization;
	}
	public String toString() {
		return super.toString() + "\n" + "Specialization: " + specialization +"\n";
	}
}



class Manager extends Members{
	String department;
	
	Manager(String name, int age, String number, String address, int salary, String department){
		super(name, age, number, address, salary);
		this.department = department;
	}
	public String toString() {
		return super.toString() + "\n" + "Department: " + department +"\n";
	}
}



public class Q2 {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Alex", 30, "0022220222", "AS144", 5000, "Electronics" );
		Manager manager = new Manager("Daniel", 50, "0033234567",  "PHA135 ", 10000, "Production");
		
		System.out.println("Employee1");
		System.out.println(employee1);
		System.out.println("Manager");
		System.out.println(manager);
		
		employee1.printSalary();
		manager.printSalary();
	}

}
