package Practica_1;

public class Product{
	
	//atributos
	private String name;
	private double price;
	private int id;
	private boolean stock;	
	private Category cat;
	
	//constructores
	public Product() {
	}

	public Product(int id, String name, double price, boolean stock, Category cat) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.cat = cat;
		cat.listproducts.add(this);
	}
	
	public int id () {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}
	public String name () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public boolean stock () {
		return stock;
	}
	public void setStock (boolean stock) {
		this.stock = stock;
	}
	public double price () {
		return price;
	}
	public void setPrice (double price) {
		this.price = price;
	}
}
