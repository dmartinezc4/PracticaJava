package practica;

public class Book extends Item implements Product{
	private int pages;
	private String ISBN;
	
	
	public Book(String na,String auth,String gen,int pags,String is) {
		super(na,auth,gen);
		pages=pags;
		ISBN=is;
	}
		
	

	public int getPages() {
		return pages;
	}
	public void setPages(int pag) {
		pages=pag;
	}
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String is) {
		ISBN=is;
	}
	
	public void show() {
		System.out.println(super.getName() + " by"+ super.getAuthor() + " with " + pages +"pages and from the " + super.getGenre() +" genre");
	}



	public double getValue() {
		float suma=0;
		if(super.getName().charAt(0)=='A' ||super.getName().charAt(0)=='Z') {
			suma=suma+50;
		}else {
			suma=suma+30;
		}
		if(super.getGenre()=="fantasia"||super.getGenre()=="ficcion"||super.getGenre()=="accion"||super.getGenre()=="filsófico") {
			suma=suma+30;
		}else {
			suma=suma+50;
		}
		suma=(float) (suma+Math.pow(pages/100, 2));
		
		if(ISBN.charAt(0)=='1'||ISBN.charAt(0)=='9'||ISBN.charAt(0)=='7'||ISBN.charAt(0)=='3'||ISBN.charAt(0)=='5') {
			suma=suma*2;
		}else {
			suma=(float) (suma*1.25);
		}
		return suma;
	}
	public static Book Maximo(Book a,Book b) {
		if(a.getValue()==Math.max(a.getValue(), b.getValue())) {
			return a;
		}else {
			return b;
		}
	}
	public static Book Minimo(Book a, Book b) {
		if(a.getValue()==Math.min(a.getValue(), b.getValue())) {
			return a;
		}else {
			return b;
		}
	}



	public String getID() {
		return ISBN;
	}
}