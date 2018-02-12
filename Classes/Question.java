import java.util.Scanner; 

public class Question {
	
		private int qst_id;
		private String qst_intitule;
		private boolean qst_default ; 
		private static int i=0;
		
		
		public Question(String intitule, boolean qdefault )
		{
			
			this.qst_default = qdefault;
			this.qst_intitule = intitule;
			this.qst_id = i;
			i++;
		
		}
		

		public void Intituler(String Intitule)
		{
		
			this.qst_intitule = Intitule ;
			
		}
		
		
		public void AppliquerDefault(boolean leDefault)
		{

			this.qst_default = leDefault;
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
		
		
		
		public String toString()
		{
			
			String result;
			
			result = " Intitulé : \n"+this.getQst_intitule();
			
			
			result += " Default : \n"+this.isQst_default();
			
			
			result+= " ID : \n"+this.getQst_id();
			
			return result;
		}
		
	







}