package ProblemSet_5c;

import java.util.ArrayList;

public class Order {

	private ArrayList<Pizza> pizzas;
	Customer customer;
	
	public Order() {
	pizzas = new ArrayList<Pizza>();
	}
	
	public void addPizza(Pizza pizzas) {
		this.pizzas.add(pizzas);
	}
	
	public double calculateTotal() {
		double total = 0;
		for (int i =0; i< pizzas.size(); i++) {
			total = total + (pizzas.get(i).calculateCost());
		}
		return total;
	}
	
	public String printReceipt() {
		String output = "Customer: " + customer.toString() +"\n";
		output = output + "Number of Pizzas: " + pizzas.size() + "\n";
		output = output + "Total Cost: " +calculateTotal();
		return output;
	}
	
	public int howManyPizzasInOrder() {
		return pizzas.size();
	}
}
