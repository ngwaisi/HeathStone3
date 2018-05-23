package ICapacite;

import ExceptionHeathstone.ExceptionHeathstone;
import IJoueur.IJoueur;

public class BouDeFeu implements ICapacite {

	 private String nom=" BouDeFeu";
	 private String Description="Inflige  1 degats au hero";
	 private int attaque=1;
	
	
	public BouDeFeu() {
		
	}
	@Override
	public void executerAction(Object cible) {
		if(cible instanceof IJoueur) {
			((IJoueur) cible).getHeros().setPV(((IJoueur) cible).getHeros().getPV()-this.getattaque());
		}
	    	
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
		// TODO Auto-generated method stub
		
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

	@Override
	public int getattaque() {
		return this.attaque;
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
	public String toString() {
		return this.Description;
	}

}
