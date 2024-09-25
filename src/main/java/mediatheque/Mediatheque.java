package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		BookPrinter bookPrinter = new BookPrinter();
		CDPrinter cdPrinter = new CDPrinter();
		for (Item i : items) {
			i.accept(bookPrinter);
			i.accept(cdPrinter);
		}
	}
	
	public void printOnlyBooks() {
		BookPrinter bookPrinter = new BookPrinter();
		for (Item i : items) {
			i.accept(bookPrinter);
		}
	}

	public void printOnlyCDs() {
		CDPrinter cdPrinter = new CDPrinter();
		for (Item i : items) {
			i.accept(cdPrinter);
		}
	}
}
