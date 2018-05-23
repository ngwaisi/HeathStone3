package jeu;

//import ICapacite.BouDeFeu;
import ICapacite.ICapacite;
import ExceptionHeathstone.ExceptionHeathstone;

public class Hero {

	private String nom="";
	private int PV=15;
	private ICapacite pouvoir;
	private int Mana=0;
	
	
	public Hero(String nom ,ICapacite pouvoir ) {
		try {
			setpouvoir(pouvoir);
		} catch (ExceptionHeathstone e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			setnom(nom);
		} catch (ExceptionHeathstone e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void setnom(String nom2) throws ExceptionHeathstone{
		// TODO Auto-generated method stub
		if(nom2 ==null) {
			throw new ExceptionHeathstone("null nom2 en Hero");
		}
		else this.nom=nom2;
		
	}
	public String getnom() {
		return this.nom;
	}
	public void setpouvoir(ICapacite pouvoir2) throws ExceptionHeathstone{
	
		if(pouvoir2 ==null ) {
			throw new ExceptionHeathstone("null pouvoir dans Hero setpouvoir");
		}
		this.pouvoir=pouvoir2;
	}
	
	public int getPV() {
		return this.PV;
	}
	public int getMana() {
		return this.Mana;
	}
	public ICapacite getPouvoir() {
		return this.pouvoir;
	}
	public void setPV(int pv) {
	
		if(pv<0) 
		{this.PV=0;
		}
		else {this.PV=pv;}
	}
	public String toString() {
		return  
	            this.nom+",pointsDeVieCourant="+this.getPV()+
				", pointsDeVieMax=15]\n"+
				"Stock de mana :" +this.getMana()+
				"\nPouvoir du héros :"+this.getPouvoir();
	}

    public ICapacite getCapacite() {
    	return this.pouvoir;
    }

    
    public void setMana(int a ) throws ExceptionHeathstone{
    	if(a<0) {this.Mana=0;}
    	else this.Mana=a;
    }
  
}
