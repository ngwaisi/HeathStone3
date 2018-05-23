package ICapacite;
import ExceptionHeathstone.ExceptionHeathstone;
import IJoueur.IJoueur;
//import IJoueur.Joueur;
//import ICarte.ICarte;
import ICarte.Serviteur;


public class ImageMirroir implements ICapacite{
	private String nom="Image Mirroir";
    private String Description="Invoque 2 serviteurs de jaina 0/+2 ayant provocation";
	
    public ImageMirroir() {
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
	public void executerEffetMisEnJeu(Object cible)  throws ExceptionHeathstone {
		if(cible ==null) {
			throw new  ExceptionHeathstone ("cible est null ");
		}
		if(cible instanceof IJoueur) {
			
		   try {
			((IJoueur) cible).getJeu().add(new Serviteur("Serviteur Provocation" ,(IJoueur) cible,0,2,1,new Provocation(), false));
		} catch (ExceptionHeathstone e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   try {
			   ((IJoueur) cible).getJeu().add(new Serviteur("Serviteur Provocation" ,(IJoueur) cible,0,2,1,new Provocation(), false));
		} catch (ExceptionHeathstone e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
