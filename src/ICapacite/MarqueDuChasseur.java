package ICapacite;

import java.util.Random;

import ExceptionHeathstone.ExceptionHeathstone;
import IJoueur.IJoueur;
//import jeu.Hero;

public class MarqueDuChasseur implements ICapacite {

	private String nom="MarqueDuChasseur";
	private String  Description=" Utiliser 1  pt de mana pour savoir une carte en main de adverse ";
	
	
	
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
			throw new  ExceptionHeathstone("cible est null");
		}
		if(cible instanceof IJoueur) {
			
            if(((IJoueur) cible).getMain().size()>0){
			  Random r = new Random();
	      	  int i = r.nextInt(((IJoueur) cible).getMain().size());
	      	  
	      	  System.out.println("[SECRETE] Une carte en main adversaire est:"+((IJoueur) cible).getMain().get(i));
	      	  }
            
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
	public String toStirng() {
		return this.Description;
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
