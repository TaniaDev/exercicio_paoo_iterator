package fatec_ipi_paoo_tarde_iterator;

public class Garconete {
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;
	private Menu snackMenu;
	
	public Garconete(Menu pancakeHouseMenu, Menu dinerMenu, Menu snackMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.snackMenu = snackMenu;
	}
	
	public void printMenu (Iterator iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void printMenu() {
		printMenu(pancakeHouseMenu.createIterator());
		printMenu(dinerMenu.createIterator());
		printMenu(snackMenu.createIterator());
	}
}