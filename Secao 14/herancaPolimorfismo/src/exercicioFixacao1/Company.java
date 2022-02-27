package exercicioFixacao1;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anaulIncome, Integer numberOfEmployees) {
		super(name, anaulIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		
		if (numberOfEmployees > 10) {
			return anaulIncome * 0.14;
		} else {
			return anaulIncome * 0.16;
		}
	}

}
