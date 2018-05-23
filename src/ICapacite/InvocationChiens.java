package ICapacite;

import ExceptionHeathstone.ExceptionHeathstone;
//import ICarte.ICarte;
import IJoueur.IJoueur;
import ICarte.Serviteur;
import ICapacite.Charge;

public class InvocationChiens implements ICapacite{
	
	private String nom="Ivocation des chiens ";
	 private String Description="Ivocation des chiens";
	
	 public InvocationChiens() {
		 
	 }
	 // private int attaque =1;
	//private String nomCarteInvoca=" ";
	// private int nombre=1;
//	 private int pv=1;
//	private ICarte Serviteur;
	
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
		
		if(cible==null) {
			throw new  ExceptionHeathstone ("cible est  null");
		}
		if(cible instanceof IJoueur) {
			Serviteur a = new Serviteur("chien", (IJoueur) cible, 0, 1, 1, new Charge(), false) ;
			a.setsomeille(true);
			((IJoueur) cible).getJeu().add( a    );
		}
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.Description;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
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
		return "Invocation 1 Chien"+" Serviteur avec:attaque:1,pv:1";
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
