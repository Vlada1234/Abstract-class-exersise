package test2.com;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();

		manager.setProductSales(25000);
		manager.setEmployeeName("Bla");
		manager.promotion();
		

		System.out.println("************ Manager *************");
		System.out.println("Your name is: " + manager.getEmployeeName());
		System.out.println("Your salary is: " + manager.getSalary() + "$");
		System.out.println(manager.getTitle());
		System.out.println("Your bonus for this month is: " + manager.getBonus() + "$");
		

		
		employee.setHoursOfWork(2000);
        employee.setEmployeeName("Blabla");
		employee.promotion();

		System.out.println("");
		
        
		System.out.println("************ Employee ************");
		System.out.println("Your name is: " + employee.getEmployeeName());
		System.out.println("Your salary is: " + employee.getSalary() + "$");
		System.out.println(employee.getTitle());


	}

}
