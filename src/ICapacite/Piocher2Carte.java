package ICapacite;
//import java.util.Random;

import ExceptionHeathstone.ExceptionHeathstone;
import IJoueur.IJoueur;
//import ICarte.ICarte;
public class Piocher2Carte implements ICapacite{

	private String nom="Piocher  Carte";
	private String discription="Piocher  Carte";
	
	private int nombrePioche=0;
	public Piocher2Carte(int i) {
		setnombre(i);
	}
	
	
	private void setnombre(int i) {
	this.nombrePioche=i;
		
	}

private int getnombre() {
	return this.nombrePioche;
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
			throw new  ExceptionHeathstone("cible est null");
		}
	for(int i = 0 ;i<2;i++) {
	if(cible instanceof IJoueur) {
		try {
			((IJoueur) cible).piocher();
		} catch (ExceptionHeathstone e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	}
		
	 }
	@Override
	public String getDescription() {
	return this.discription;
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
		return this.discription +"nombre: "+this.getnombre();
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
