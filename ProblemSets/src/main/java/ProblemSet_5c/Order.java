package ProblemSet_5c;

import java.util.ArrayList;
import java.util.List;


public class Order {

	private List<Pizza> pizzas;
	Customer customer;
	
	public Order(Customer customer) {
	pizzas = new ArrayList<Pizza>();
	this.customer = customer;
	}
	
	public void addPizza(Pizza pizzas) {
		this.pizzas.add(pizzas);
	}
	
	public double calculateTotal() {
		double total = 0;
		for (int i = 0; i < pizzas.size(); i++) {
			total = total + (pizzas.get(i).calculateCost());
		}
		return total;
	}
	
	public String printReceipt() {
		String output = "Customer: " + customer.toString() + "\n";
		output = output + "Number of Pizzas: " + pizzas.size() + "\n";
		output = output + "Total Cost: " + calculateTotal();
		return output;
	}
	
	public int howManyPizzasInOrder() {
		return pizzas.size();
	}
}
