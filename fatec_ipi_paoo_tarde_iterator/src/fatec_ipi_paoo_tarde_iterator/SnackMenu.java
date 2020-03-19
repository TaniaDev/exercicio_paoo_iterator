package fatec_ipi_paoo_tarde_iterator;

import java.util.ArrayList;
import java.util.List;

public class SnackMenu implements Menu{
	private List<MenuItem> items = new ArrayList<> ();
	
	public Iterator createIterator() {
		return new SnackMenuIterator(this.items);
	}
	
	private void addItem(String nome, String descricao, boolean vegetariano, double preco) {
		MenuItem item = new MenuItem(nome, descricao, vegetariano, preco);
		items.add(item);
	}

	public SnackMenu() {
		addItem("Crispy Chicken Pops", "Small pieces of fried chickens with sauce", false, 3.59);
		addItem("Garlic Cheese Fries", "French fries with garlic cheese", true, 2.99);
		addItem("Spanish Tortilla", "It's a kind of pie with tomatos, eggs, popatos and onions", true, 3.59);
		addItem("Double Cheeseburguer", "It's a sandwich with 2 hamburgers, cheeese, onions, salad and pickles", false, 3.99);
	}

}
