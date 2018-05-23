package ICapacite;

import ExceptionHeathstone.ExceptionHeathstone;
//import ICarte.ICarte;
import IJoueur.IJoueur;
import jeu.Hero;
//import jeu.Rexxar;

public class AttaqueHero implements ICapacite{

	// attaque direcitement qu hero 
	
	 private String nom="";
	 private String Description="Inflige  de degats au hero";
	 private int attaque =0;
	
	
	
	public AttaqueHero( String nom ,int attaque) {
		this.setnom(nom);
		this.setattaque(attaque);
		
	}
	
	
	
	
	
	
	private void setnom(String nom2) {
	this.nom=nom2;
		
	}






	@Override
	public void executerAction(Object cible) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetDebutTour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetDisparition(Object cible) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetFinTour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetMisEnJeu(Object cible) throws ExceptionHeathstone {

		if(cible == null) {
			throw new  ExceptionHeathstone("cible est  null dans AttaqueHero");
		}
		
	   if(cible instanceof Hero) {
		   ((Hero) cible).setPV(((Hero) cible).getPV()-this.getattaque());
	   }
	
	   
	 
	 
	
	}

	@Override
	public String getDescription() {
	return this.Description;
	}

	@Override
	public String getNom() {
		return this.nom;
	}






	@Override
	public void setattaque(int a) {
	this.attaque=a;
		
	}


public boolean equals(Object obj) {
		
		if (obj==null) {
			return false;
		}
		if(!( obj instanceof ICapacite  )) {
			return false;
		}
		if(obj instanceof ICapacite) {
			if(((ICapacite) obj).getNom().equals(this.getNom()) ) {
				return true;
			}
		}
		return false;
	}



	@Override
	public int getattaque() {
		return this.attaque;
	}
	
   public String toString() {
	return "Capacite:"+this.getNom()+" Description: Infligier "+this.getattaque()+"degat au hero adversaire";
	   
   }
}
