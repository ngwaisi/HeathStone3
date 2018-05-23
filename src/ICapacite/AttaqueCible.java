package ICapacite;

import ExceptionHeathstone.ExceptionHeathstone;
import ICarte.ICarte;
import jeu.Hero;
//import jeu.Heros;
//import jeu.Rexxar;

public class AttaqueCible implements ICapacite{

	 private String nom="";
	 private String Description="Inflige  de degats au cible";
	 private int attaque =0;
	
	
	
	public AttaqueCible( String nom ,int attaque) {
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

		if(cible==null) {
			throw new  ExceptionHeathstone("cible est null dans executerEffetMisEnJeu");
		}
		
		
		if((cible instanceof Hero)) {
			
		
			((Hero) cible).setPV((((Hero) cible).getPV())-this.getattaque());
	      
		}
		if(cible instanceof ICarte) {
		//	ICarte j=(ICarte) cible;
			try {
				((ICarte) cible).setPV(	(((ICarte) cible).getCount())-this.getattaque());
			} catch (ExceptionHeathstone e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  ;
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
			}else {return false;}
		}
		return false;
	}
	
	
	
	public String toString() {
		return "  Infligier "+this.getattaque()+"au cible";
		   
	   }
}
