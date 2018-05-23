package ICapacite;
import ExceptionHeathstone.ExceptionHeathstone;
import IJoueur.IJoueur;
//import IJoueur.Joueur;
//import ICarte.ICarte;
import ICarte.Serviteur;

public class Golemisation implements ICapacite {

	//  亡语
	
	private String nom="Golemisation";
	private String  Description="invoque un Golem endomage quand il mort";
	
	public  Golemisation() {
		
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
	public void executerEffetDisparition(Object cible) throws ExceptionHeathstone {
		
		if(cible ==null) {
			throw new  ExceptionHeathstone ("cible est null dans Golemisation");
		}
		// TODO Auto-generated method stub
		if(cible instanceof IJoueur) {
		
		try {
			System.out.println("Golemisation L37");
		   ((IJoueur) cible).getJeu().add(new Serviteur("Golem endomage", ((IJoueur) cible), 0, 1, 2, new CapaciteVide(), false   ));
		
		
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
	public String toString() {
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