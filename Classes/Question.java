import java.util.Scanner; 

public class Question {
	
		int qst_id;
		String qst_intitule;
		boolean qst_default ; 
		private static int i=0;
		private  String un ="1";
		private  String zero ="0";
		
		public Question()
		{
			this.qst_id = i;
			i++;
			this.qst_intitule = qst_intitule ;
		}
		
		
		public void Intituler()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir l'intitule :");
			this.qst_intitule = sc.nextLine();
			
		}
		
		
		public void AppliquerDefault()
		{
			int t=0;
			String var = "";
			Scanner sc = new Scanner(System.in);
			System.out.println("R�ponse par d�fault ? (1 pour Oui ,0 pour Non )");
			var = sc.nextLine();
			System.out.println("VALEUR DE VAR : "+var);
			while (t != 1 )
			{
				
				if ( !(this.un.equals(var)) && !(this.zero.equals(var)))
				{
					 sc = new Scanner(System.in);
					System.out.println("Veuillez remplir les champs correctement : 1 pour Oui 0 pour Non");
					var = sc.nextLine();
				}
				
				else {
					t = 1 ;
				}
			}
			if (this.un.equals(var)) {
				this.qst_default = true ;
			}
			else if (this.zero.equals(var)) {
				this.qst_default = false;
			}
			
		}


		public int getQst_id() {
			return qst_id;
		}


		public String getQst_intitule() {
			return qst_intitule;
		}


		public boolean isQst_default() {
			return qst_default;
		}
		
		
	




public static void main(String[] args)
{
	Question Q = new Question() ;
	
	Q.Intituler(); 
	
	System.out.println("Intitul� : "+Q.getQst_intitule());
	
	Q.AppliquerDefault();
	
	System.out.println("Default : "+Q.isQst_default());
	
	
	System.out.println("ID : "+Q.getQst_id());
	
}


}