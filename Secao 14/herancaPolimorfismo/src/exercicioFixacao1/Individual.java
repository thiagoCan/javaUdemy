package exercicioFixacao1;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anaulIncome, Double healthExpenditures) {
		super(name, anaulIncome);
		this.healthExpenditures = healthExpenditures;
	}



	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		
		if (anaulIncome < 20000.00) {
			return anaulIncome * 0.15 - healthExpenditures * 0.5;
		} else {
			return anaulIncome * 0.25 - healthExpenditures * 0.5;
		}
		
	}

}
