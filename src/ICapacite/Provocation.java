package ICapacite;
//import ExceptionHeathstone.ExceptionHeathstone;
//import IJoueur.IJoueur;
//import IJoueur.Joueur;
//import ICarte.ICarte;


public class Provocation implements  ICapacite{
	
	private String nom="Provocation";
	private String  Description="Provocation";
	
	public Provocation() {

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
