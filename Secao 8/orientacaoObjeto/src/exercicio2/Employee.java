package exercicio2;

public class Employee {
	
	private String name;
	private double grossSalary, tax;
	
	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public double netSalary () {
		return grossSalary - tax;
	}
	
	public double increaseSalary (double percentage) {
		
		double per = (grossSalary * percentage) / 100;
		
		return netSalary() + per;
	}
	
	@Override
	public String toString() {
		
		return "Employee: "
			+ name
			+ ", $ "
			+ String.format("%.2f", netSalary());
	}
}