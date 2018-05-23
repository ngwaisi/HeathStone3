package ICapacite;
import java.util.Iterator;

import ExceptionHeathstone.ExceptionHeathstone;
import IJoueur.IJoueur;
//import IJoueur.Joueur;
import ICarte.ICarte;

public class AttackMagic implements ICapacite  {

	private String nom="";
	private String  Description="ajoute de pt de Magic attack de Hero";
	private int Attaque=0;
	
	public  AttackMagic (int Attaque,String nom ) {
		this.setattaque(Attaque);
		this.setnom(nom);
	}
	
	private void setnom(String nom2) {
		this.nom=nom2;
		
	}
	
	
	

	@Override
	public void executerAction(Object cible)  throws ExceptionHeathstone {
    
		
	}

	@Override
	public void executerEffetDebutTour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetDisparition(Object cible) {
	
		


        Iterator<ICarte> iterator4 =((IJoueur) cible).getJeu().iterator();
	      
        while (iterator4.hasNext()) {
                   ICarte integer = iterator4.next();
                     try {
						integer.setAttaque(integer.getAttaque()-this.getattaque());
					} catch (ExceptionHeathstone e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	
	
        }
	
	}
			
		
	

	@Override
	public void executerEffetFinTour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetMisEnJeu(Object cible) {


		if(cible instanceof ICarte) {
			 ICarte j=( ICarte) cible;
			try {
				j.setAttaque(j.getAttaque()+this.getattaque());
			} catch (ExceptionHeathstone e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
		
		if(cible instanceof IJoueur) {
			  Iterator<ICarte> iterator2 = ((IJoueur) cible).getJeu().iterator();
	             while (iterator2.hasNext()) {
	                       ICarte integer2 = iterator2.next();
	                     
	                       try {
							integer2.setAttaque(integer2.getAttaque()+this.getattaque());
						} catch (ExceptionHeathstone e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	                
	                       
	                   }
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
		this.Attaque=a;
		
	}

	@Override
	public int getattaque() {
		return this.Attaque;
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
		return "capacite:"+this.getNom()+"description:"+this.getDescription()+"attaque:"+this.getattaque();
	}
}
