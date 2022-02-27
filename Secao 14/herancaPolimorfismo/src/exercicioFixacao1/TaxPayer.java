package exercicioFixacao1;

public abstract class TaxPayer {
	
	protected String name;
	protected Double anaulIncome;
	
	public TaxPayer() {
	}
	
	public TaxPayer(String name, Double anaulIncome) {
		super();
		this.name = name;
		this.anaulIncome = anaulIncome;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnaulIncome() {
		return anaulIncome;
	}

	public void setAnaulIncome(Double anaulIncome) {
		this.anaulIncome = anaulIncome;
	}

	public abstract Double tax();

}
