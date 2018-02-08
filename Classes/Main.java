package projetSportif;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList sportifs = new ArrayList<Sportif>();
		
		Sportif sp = new Sportif();
		Sportif spr = new Sportif();
		sportifs.add(sp);
		sportifs.add(spr);
		
		
		/*afficher*/
		//sp.afficher();
		
	
		for(int i=0;i<sportifs.size();i++){
			((Sportif) sportifs.get(i)).afficher();
		}

		sportifs.remove(spr);
		
	
		
	}

}
