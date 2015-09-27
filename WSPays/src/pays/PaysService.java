package pays;

import java.util.ArrayList;

public class PaysService {

	/*
	 * Pays
	 */
	// public String getPays(String pays) {
	// return pays+" Pouet";
	// }

	/*
	 * Pays
	 */
	public Pays getPays(String pays) {
		return new Pays(pays,"Pouet "+pays,10000);
	}

	/*
	 * ListPays
	 */
	public ListPays getListPays(String pays) {
		ArrayList<Pays> listPaysArray = new ArrayList<Pays>();
		listPaysArray.add(new Pays("Pouet"));
		listPaysArray.add(new Pays("Pouet Pouet"));
		listPaysArray.add(new Pays("Pouet Pouet Pouet"));
		listPaysArray.add(new Pays("Pouet Pouet Pouet Pouet"));

		return new ListPays(listPaysArray);
	}

}
