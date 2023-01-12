package model.entities;

import java.util.Date;

public class Instalment {

	private Date dueDate;
	private Double amount;
	
	public Instalment() {
		
	}

	public Instalment(Date dueDate, Double amount) {	
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
}
