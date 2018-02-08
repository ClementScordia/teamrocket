package projetsportif;

public class TestReponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reponse rep= new Reponse();
		Question q = new Question(rep);
		q.AppliquerDefault();
		
		
		
		System.out.println("etat1:"+rep.getRepEtat());
		System.out.println("valeur1:"+rep.getRepValeur());
		
		rep.modifierReponse();
		System.out.println("etat5:"+rep.getRepEtat());
		System.out.println("valeur5:"+rep.getRepValeur());
		
		rep.setRepActive();
		System.out.println("etat2:"+rep.getRepEtat());
		System.out.println("valeur2:"+rep.getRepValeur());

		
		rep.repondre();
		System.out.println("etat3:"+rep.getRepEtat());
		System.out.println("valeur3:"+rep.getRepValeur());
		
		
		rep.repondre();
		System.out.println("etat4:"+rep.getRepEtat());
		System.out.println("valeur4:"+rep.getRepValeur());
		
	
		rep.modifierReponse();
		System.out.println("etat5:"+rep.getRepEtat());
		System.out.println("valeur5:"+rep.getRepValeur());
		
		rep.modifierReponse();
		System.out.println("etat6:"+rep.getRepEtat());
		System.out.println("valeur6:"+rep.getRepValeur());
		
	}

}
