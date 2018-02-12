import java.util.Scanner;

public class TestQuestion {
	
	
	
	
	
	private static  String un ="1";
	private static  String zero ="0";
	
	
	

	
	
	
	public static void main(String[] args)

	{
		

		Question Q = new Question("Comment allez vous ",true) ;
		
		System.out.println("Intitulé : "+Q.getQst_intitule());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir l'intitule de la question :");
		Q.Intituler(sc.nextLine()); 
		
		System.out.println("Intitulé : "+Q.getQst_intitule());
		
		
		
		
		int t=0;
		String var = "";
		Scanner sca = new Scanner(System.in);
		System.out.println("Réponse par défault ? (1 pour Oui ,0 pour Non )");
		var = sca.nextLine();
		System.out.println("VALEUR DE VAR : "+var);
		while (t != 1 )
		{
			
			if ( !(un.equals(var)) && !(zero.equals(var)))
			{
				 sca = new Scanner(System.in);
				System.out.println("Veuillez remplir les champs correctement : 1 pour Oui 0 pour Non");
				var = sca.nextLine();
			}
			
			else {
				t = 1 ;
			}
		}
		if (un.equals(var)) {
			
		}
		else if (zero.equals(var)) {
			Q.AppliquerDefault(false);  
		}
		
		
		System.out.println("Default : "+Q.isQst_default());
		
		
		System.out.println("ID : "+Q.getQst_id());
		
	}

}
