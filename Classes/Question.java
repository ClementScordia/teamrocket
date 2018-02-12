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
		


		public void Intituler(String param)
		{
		
			this.qst_intitule = param ;
			
		}
		
		
		public void AppliquerDefault(boolean param)
		{

			this.qst_default = param;
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
			
			result = "Intitulé : "+this.getQst_intitule();
			
			
			result += " Default : "+this.isQst_default();
			
			
			result+= "ID : "+this.getQst_id();
			
			return result;
		}
		
	







}