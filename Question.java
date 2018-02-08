import java.util.Scanner; 

public class Question {
	
		int qst_id;
		String qst_intitule;
		boolean qst_default ; 
		private static int i;
		
		public Question(Questionnaire q , String qst_intitule)
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
			Scanner sc = new Scanner(System.in);
			System.out.println("Réponse par défault ? (1 pour Oui ,2 pour Non )");
			
			this.qst_default = Boolean.parseBoolean(sc.nextLine());
			
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
		
		
	

}
