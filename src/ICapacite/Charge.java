package ICapacite;

import ExceptionHeathstone.ExceptionHeathstone;
import ICarte.ICarte;

//import ExceptionHeathstone.ExceptionHeathstone;
//import IJoueur.IJoueur;
//import IJoueur.Joueur;
//import ICarte.ICarte;

public class Charge implements ICapacite {

	//  战吼
	
	private String nom="Charge";
	private String  Description="ne pas attend la tour";
	
	
	
	
	public Charge() {
		
	}
	
	@Override
	public void executerAction(Object cible) throws ExceptionHeathstone {
		if(cible ==null) {
			throw new ExceptionHeathstone ("cible est null ");
		}

	 if(cible instanceof ICarte) {
		 ((ICarte) cible).setsomeille(false);
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
	public void executerEffetMisEnJeu(Object cible)  {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getattaque() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
		return this.getDescription();
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
	
}
