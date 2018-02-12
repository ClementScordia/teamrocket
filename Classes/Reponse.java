package projetsportif;

import java.util.ArrayList;
import java.util.Date;

public class Reponse {

	private ArrayList<Boolean> rep_listeReponse;
	private Date rep_datereponse;
	
	
	public Reponse() {
		this.rep_listeReponse = new ArrayList<Boolean>();
		this.rep_datereponse = new Date();
	}

	
	void addReponse(boolean param)
	{
		this.rep_listeReponse.add(param);
		this.rep_datereponse = new Date();
	}
	
	
	ArrayList<Boolean> getRepListe()
	{
		return this.rep_listeReponse;		
	}
	
	
	Date getRepDate(){
		return this.rep_datereponse;
	}
}
