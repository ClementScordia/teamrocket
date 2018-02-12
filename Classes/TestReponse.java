package projetsportif;

import java.util.ArrayList;
import java.util.Scanner;

public class TestReponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		Reponse rep = new Reponse();
		boolean test = false;
		System.out.println(rep.getRepDate());
		
		
		
		
		while(test==false)
		{
			System.out.println("Saisir une valeur true ou false");
			sc = new Scanner(System.in);
			try {
					String str = sc.nextLine();
					System.out.println(str);
					if (("true".equals(str)) || ("false".equals(str))|| ("1".equals(str))|| ("0".equals(str))) {
						boolean b = Boolean.parseBoolean(str);
						System.out.println(b);
						rep.addReponse(b);
						test=true;
					} else {
						System.out.println("Valeurs érronées ::");
					}
			
			}catch (Exception e) {
				System.out.println("Valeurs érronées.");
			}
		}
		
		System.out.println(rep.getRepDate());
		ArrayList<Boolean> tab = rep.getRepListe();
		for(int i=0;i<tab.size();i++)
		{
			System.out.println(tab.get(i));
		}
		test=false;
		
		
		while(test==false)
		{
			System.out.println("Saisir une valeur true ou false");
			try { 
				sc = new Scanner(System.in);
				String str = sc.nextLine();
				System.out.println(str);
				if (("true".equals(str)) || ("false".equals(str))|| ("1".equals(str))|| ("0".equals(str))) {
					
					rep.addReponse(Boolean.parseBoolean(str));
					test=true;
				} else {
					System.out.println("Valeurs érronées ::");
				}
	
			} catch (Exception e) {
				System.out.println("Valeurs érronées.");
			}
		}
		
		System.out.println(rep.getRepDate());
		tab = rep.getRepListe();
		for(int i=0;i<tab.size();i++)
		{
			System.out.println(tab.get(i));
		}
		
	}

}
