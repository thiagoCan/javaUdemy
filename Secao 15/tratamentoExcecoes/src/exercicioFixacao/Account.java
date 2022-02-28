package exercicioFixacao;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance, withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	
	
	public Double getBalance() {
		return balance;
	}

	
	public void deposit (Double amount) {
		balance += amount;
	}
	
	public void withdraw (Double amount) {
		
		if (amount > withdrawLimit) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		balance -= amount;
	}
}
