package practica;

public class Book extends Item{
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
}