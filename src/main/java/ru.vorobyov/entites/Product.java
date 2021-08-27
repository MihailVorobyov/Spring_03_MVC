package ru.vorobyov.entites;

public class Product {
	private int id;
	private String title;
	private double cost;
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
}