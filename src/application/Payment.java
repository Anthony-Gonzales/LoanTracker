package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class Payment {
	
	private final SimpleStringProperty date;
	private final DoubleProperty paid;
	private final DoubleProperty total;
	
	public Payment(String date, double paid, double total) {
		this.date = new SimpleStringProperty(date);
		this.paid = new SimpleDoubleProperty(paid);
		this.total = new SimpleDoubleProperty(total);
	}
	

	public SimpleStringProperty dateProperty() {
		return date;
	}
	
	public DoubleProperty paidProperty() {
		return paid;
	}
	
	public DoubleProperty totalProperty() {
		return total;
	}
	
	public String getDate() {
		return date.get();
	}
	
	public double getPaid() {
		return paid.get();
	}
	
	public double getTotal() {
		return total.get();
	}

	public void setDate(String date) {
		this.date.set(date);
	}
	
	public void setPaid(double paid) {
		this.paid.set(paid);
	}

	public void setTotal(double total) {
		this.total.set(total);
	}
	
}
