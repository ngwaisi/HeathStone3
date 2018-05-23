package ICapacite;

import ExceptionHeathstone.ExceptionHeathstone;
import IJoueur.IJoueur;
import jeu.Hero;
//import jeu.Heros;

public class AttaqueDuLepreux implements ICapacite {

	//    亡语
	
    private String nom="Attaque Du Lepreux";
    private String Description="Inflige 2 Serviteurpoints de degats au hero quand il disparu";
	
    
    public  AttaqueDuLepreux() {
    	
    }
	

	public void executerAction(Object cible) {
		// TODO Auto-generated method stub
		return ;
	}

	public void executerEffetDebutTour() {
		// TODO Auto-generated method stub
		return ;
	}


	public void executerEffetDisparition(Object cible)throws ExceptionHeathstone {
		if(cible ==null) {
			throw new  ExceptionHeathstone("cible est null executerEffetDisparaition");
		}
          if(cible instanceof IJoueur) {
			System.out.println("AttaqueL33");
			((IJoueur) cible).getHeros().setPV(	((IJoueur) cible).getHeros().getPV()-2);
		}
	
	
if(cible instanceof Hero) {
	   ((Hero) cible).setPV(((Hero) cible).getPV()-2);
}
	}

	
	public void executerEffetFinTour() {
		// TODO Auto-generated method stub
		return ;
	}

	
	
	public void executerEffetMisEnJeu(Object cible) {
	
	}
	

	
	public String getDescription() {
		
		return  this.Description;
	}

	
	public String getNom() {
		
		return this.nom;
	}

	
	public String toStirng() {
		return this.Description;
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
	return this.getDescription();
}
	
	
}
