package practica;

public class MassiveRemove extends Thread{
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

	public MassiveRemove(Shelve estante,Book b) {
		this.estante=estante;
		this.book=b;
		this.film=null;
	}
	public MassiveRemove(Shelve estante,Film f) {
		this.estante=estante;
		this.book=null;
		this.film=f;
	}
	public MassiveRemove(Shelve estante,Book b,Film f) {
		this.estante=estante;
		this.book=b;
		this.film=f;
	}

	public void run() {
		synchronized(this.estante) {
			if(book!=null) {
				this.estante.remove(book);
			}
			if(film!=null) {
				this.estante.remove(film);
			}
		}
	}
}
