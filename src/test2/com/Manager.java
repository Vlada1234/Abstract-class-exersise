package test2.com;

public class Manager extends AbstractEmployee {
	
	private int productSales= 0;
	private double bonus = 0;
	
	public int getProductSales() {
		return productSales;
	}

	public void setProductSales(int productSales) {
		this.productSales = productSales;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	

	@Override
	public boolean promotion() {
		if(productSales <= 20000) {
			setSalary(800);
			bonus = 0;
			setTitle("Your current manager title is: Junior");
			return false;
		}
		else if(productSales > 20000 && productSales <= 30000) {
			setSalary(1800);
			bonus = 200;
			setTitle("Your current manager title is: Medior");
			return true;
		}
		else {
			setSalary(2500);
			bonus = 500;
			setTitle("Your current manager title is: Senior");
			return true;
		}
		
		
		
	}
	

}
