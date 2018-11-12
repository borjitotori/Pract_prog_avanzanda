package Practica_1;

import java.util.ArrayList;
import java.util.List;

public class Category {
	
	//atributos
	private String catName;
	private int catId;
	
	static List<Product> listproducts = new ArrayList<Product>();
	static List<Category> listcategory = new ArrayList<Category>();
	
	//constructores
	public Category() {
	}

	public Category(String catName, int catId) {
		this.catName = catName;
		this.catId = catId;
		listcategory.add(this);
	}

	public int catId() {
		return catId;
	}
	public void setCatId (int catId) {
		this.catId = catId;
	}
	public String catName () {
		return catName;
	}
	public void setCatName (String catName) {
		this.catName = catName;
	}
}
