package ICapacite;

import java.util.Iterator;

import ExceptionHeathstone.ExceptionHeathstone;
import ICarte.ICarte;
import IJoueur.IJoueur;

public class AttaqueTotal implements ICapacite{

	
	 private String nom="AttaqueTotal";
	 private String Description="Inflige  au tous les serviteurs adversaires";
	 private int attaque =0;
	
	
	
	public AttaqueTotal( String nom ,int attaque) {
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
	
		    if(cible ==null) {
		    	throw new  ExceptionHeathstone("cible est null dans AttaqueTotal");
		    }
		
		
		    if(cible instanceof IJoueur) {
		     Iterator<ICarte> iterator2 = ((IJoueur) cible).getJeu().iterator();
	         while (iterator2.hasNext()) {
	                    ICarte integer2 = iterator2.next();
	                    try {
							integer2.setPV(integer2.getCount()-this.getattaque());
						} catch (ExceptionHeathstone e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
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
		this.attaque=a;
	}

	@Override
	public int getattaque() {
	return this.attaque;
	}
	public String toString() {
		return this.getDescription() ;
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
