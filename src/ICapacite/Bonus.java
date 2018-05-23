package ICapacite;

import java.util.Iterator;

import ExceptionHeathstone.ExceptionHeathstone;
import ICarte.ICarte;
import IJoueur.IJoueur;

public class Bonus implements ICapacite {

	private String nom="";
	private String  Description="ajoute de pt de Magic attack de Hero";
	private int Attaque=0;
	private int pv=0;
	public  Bonus (String nom,int AttaqueMagic,int pv ) {
		this.setattaque(AttaqueMagic);
		this.setnom(nom);
		this.setpv(pv);
	}
	
	public void setpv(int a) {
		this.pv=a;
	}
	
	private void setnom(String nom2) {
		this.nom=nom2;
		
	}

	public int getPluspv() {
		return this.pv;
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
	
		
		
		
	}

	@Override
	public void executerEffetFinTour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetMisEnJeu(Object cible) throws ExceptionHeathstone {

        if(cible == null) {
        	throw new  ExceptionHeathstone("cible est null dans executerEffetMisEnJeu");
        }		
		
		if(cible instanceof ICarte) {
			 ICarte j=( ICarte) cible;
			try {
				j.setAttaque(j.getAttaque()+this.getattaque());
				j.setPV(j.getCount()+this.getPluspv());
			} catch (ExceptionHeathstone e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
		
		if(cible instanceof IJoueur) {
			  Iterator<ICarte> iterator2 = ((IJoueur) cible).getJeu().iterator();
	             while (iterator2.hasNext()) {
	                       ICarte integer2 = iterator2.next();
	                     
	                       integer2.setAttaque(integer2.getAttaque()+this.getattaque());
	                       integer2.setPV(integer2.getCount()+this.getPluspv());
	                       
	                       
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
		return this.nom;
	}

	@Override
	public void setattaque(int a) {
	this.Attaque=a;
		
	}

	@Override
	public int getattaque() {
		// TODO Auto-generated method stub
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
			}
		}
		return false;
	}
	public String toString() {
		return "Ajouter un bonus pour tous des cartes :+"+this.getattaque()+" \\"+this.getPluspv(); 
	}

}
