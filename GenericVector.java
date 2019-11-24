package practica;

import java.util.*;

public class GenericVector<T> implements Vectorinterfaces{
	Vector<T>content;

	public GenericVector() {
		content=new Vector<T>();
	}
	public void add(T e){
		content.add(e);
	}
	public void show() {
		for(T i:content) {
			System.out.println(i);
		}
	}
	
}
