package test2.com;

public class Employee extends AbstractEmployee {
	
	private double hoursOfWork;

	public double getHoursOfWork() {
		return hoursOfWork;
	}

	public void setHoursOfWork(double hoursOfWork) {
		this.hoursOfWork = hoursOfWork;
	}

	@Override
	public boolean promotion() {
		if(getHoursOfWork() <= 500 ) {
			setSalary(600);
			setTitle("Your current title is: Junior");
			return false;
		}
		
		else if(getHoursOfWork() > 500 && getHoursOfWork() <= 1000) {
			setSalary(1000);
			setTitle("Your current title is now: Medior");
			return true;
		}
		
		else {
			setSalary(2000);
			setTitle("Your current title is now: Senior ");
			return true;
		}
		
	}

}
