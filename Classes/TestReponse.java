package projetsportif;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TestReponse {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		Reponse rep = new Reponse(1);
		boolean test = false;
		System.out.println(rep.getRepDate());

		while (test == false) {
			System.out.println("Saisir une valeur true ou false");
			sc = new Scanner(System.in);
			try {
				String str = sc.nextLine();
				if (("true".equals(str)) || ("false".equals(str))) {
					rep.addReponse(Boolean.parseBoolean(str));
					test = true;
				} else {
					System.out.println("Valeurs érronées.");
				}

			} catch (Exception e) {
				System.out.println("Valeurs érronées.");
			}
		}

		System.out.println(rep.getRepDate());
		ArrayList<Boolean> tab = rep.getRepListe();
		for (int i = 0; i < tab.size(); i++) {
			System.out.println(tab.get(i));
		}
		test = false;

		while (test == false) {
			System.out.println("Saisir une valeur true ou false");
			try {
				sc = new Scanner(System.in);
				String str = sc.nextLine();
			
				if (("true".equals(str)) || ("false".equals(str)) ) {

					rep.addReponse(Boolean.parseBoolean(str));
					test = true;
				} else {
					System.out.println("Valeurs érronées.");
				}

			} catch (Exception e) {
				System.out.println("Valeurs érronées.");
			}
		}

		System.out.println(rep.getRepDate());
		tab = rep.getRepListe();
		for (int i = 0; i < tab.size(); i++) {
			System.out.println(tab.get(i));
		}

		test = false;

		while (test == false) {
			System.out.println("Saisir une valeur true ou false");
			try {
				sc = new Scanner(System.in);
				String str = sc.nextLine();
			
				if (("true".equals(str)) || ("false".equals(str))) {

					rep.addReponse(Boolean.parseBoolean(str));
					test = true;
				} else {
					System.out.println("Valeurs érronées .");
				}

			} catch (Exception e) {
				System.out.println("Valeurs érronées.");
			}
		}

		System.out.println(rep.getRepDate());
		tab = rep.getRepListe();
		for (int i = 0; i < tab.size(); i++) {
			System.out.println(tab.get(i));
		}
		
		System.out.println(rep.getRepDate());
		rep.setRepDate(new Date(118,6,10));
		System.out.println(rep.getRepDate());
	}

}
