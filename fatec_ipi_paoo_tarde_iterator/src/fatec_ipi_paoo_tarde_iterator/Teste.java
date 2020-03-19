package fatec_ipi_paoo_tarde_iterator;

public class Teste {
	
	public static void main(String[] args) {
		PancakeHouseMenu phm = new PancakeHouseMenu();
		DinerMenu dm = new DinerMenu();
		SnackMenu sm = new SnackMenu();
		Garconete garconete = new Garconete(phm, dm, sm);
		garconete.printMenu();
	}

}
