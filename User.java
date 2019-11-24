package practica;
import java.util.*;

public class User implements Vectorinterfaces{

	private String name;
	private String surname;
	private int dni;
	boolean logged;
	Vector<Item>useritems;


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
		useritems=new Vector<Item>();
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
	public void addBook(Book b) {
		useritems.add(b);
	}
	public void addFilm(Film f) {
		useritems.add(f);
	}
	public void addItem(Item e) {
		useritems.add(e);
	}

	public Vector<Double> getPrecios(){
		Vector<Double> precios;
		precios= new Vector<Double>();
		for(int i=0;i<useritems.size();i++) {
			precios.add(useritems.get(i).getValue());
		}
		return precios;
	}
	public Item getMaximo() {
		Vector <Double> precios=getPrecios();
		int max=0;
		double maxprecio=precios.get(0);
		for(int i=1;i<precios.size();i++) {
			if(precios.get(i)>maxprecio) {
				maxprecio=precios.get(i);
				max=i;
			}
		}
		return useritems.get(max);
	}
	public Item getMinimo() {
		Vector <Double> precios=getPrecios();
		int min=0;
		double minprecio=precios.get(0);
		for(int i=1;i<precios.size();i++) {
			if(precios.get(i)<minprecio) {
				minprecio=precios.get(i);
				min=i;
			}
		}
		return useritems.get(min);
	}

}