package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		ItemVisitor catalogPrinter = new CatalogPrinter();
		for (Item i : items) {
			i.accept(catalogPrinter);
		}
	}
	
	public void printOnlyBooks() {
		ItemVisitor bookPrinter = new BookPrinter();
		for (Item i : items) {
			i.accept(bookPrinter);
		}
	}

	public void printOnlyCDs() {
		ItemVisitor cdPrinter = new CDPrinter();
		for (Item i : items) {
			i.accept(cdPrinter);
		}
	}
}
