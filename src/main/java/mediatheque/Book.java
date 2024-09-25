package mediatheque;

public class Book extends Item {
	private String author;

	public Book(String author, String title) {
		super(title);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void accept(ItemVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "Livre : " + super.toString() + " de " + author;
	}
	
}
