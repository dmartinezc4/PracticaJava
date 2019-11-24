package practica;

public abstract class Item {
	private String name;
	private String author;
	private String genre;
	
	public Item(String na,String au,String gen) {
		name=na;
		author=au;
		genre=gen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void show() {
		
	}
	public abstract double getValue();
}