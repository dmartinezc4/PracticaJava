package practica;

public class Restock extends Thread{
	private Shelve estante;
	public Shelve getEstante() {
		return estante;
	}
	public Book getBook() {
		return book;
	}
	public Film getFilm() {
		return film;
	}

	private Book book;
	private Film film;

	public Restock(Shelve estante,Book b) {
		this.estante=estante;
		this.book=b;
		this.film=null;
	}
	public Restock(Shelve estante,Film f) {
		this.estante=estante;
		this.book=null;
		this.film=f;
	}
	public Restock(Shelve estante,Book b,Film f) {
		this.estante=estante;
		this.book=b;
		this.film=f;
	}

	public void run() {
		synchronized(this.estante) {
			if(book!=null) {
				this.estante.add(book);
			}
			if(film!=null) {
				this.estante.add(film);
			}
		}
	}
}
