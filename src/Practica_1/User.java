package Practica_1;

public class User {
	//atributos
	private int userId;
	private String userName;
	private String password;
	
	//constructores
	
	public User(int userId, String userName, String password) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	public int userId () {
		return userId;
	}
	public void setUserId (int userId) {
		this.userId = userId;
	}
	public String userName () {
		return userName;
	}
	public void setUserName (String userName) {
		this.userName = userName;
	}	
	public String password () {
		return password;
	}
	public void setPassword (String password) {
		this.password = password;
	}
}
