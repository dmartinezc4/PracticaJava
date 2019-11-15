package practica;
import java.util.*;

public class User implements Vectorinterfaces{

	private String name;
	private String surname;
	private int dni;
	boolean logged;
	
	
	
	public boolean isLogged() {
		return logged;
	}
	public void setLogged(boolean logged) {
		this.logged = logged;
	}
	public User(int dni,String name,String surname) {
		this.dni=dni;
		this.name=name;
		this.surname=surname;
		this.logged=false;
	}
	public User(int dni,String name,String surname,boolean a) {
		this.dni=dni;
		this.name=name;
		this.surname=surname;
		this.logged=a;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni=dni;
	}
	
	public void show() {
		System.out.println(this.name +" "+this.surname+" ID: "+this.dni);
		
	}
}