package ICapacite;

import ExceptionHeathstone.ExceptionHeathstone;

public class CapaciteVide implements ICapacite{

	
	public CapaciteVide() {
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "";
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
		return "";
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
