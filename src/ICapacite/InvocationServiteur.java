package ICapacite;

import ExceptionHeathstone.ExceptionHeathstone;
import ICarte.ICarte;
import ICarte.Serviteur;
import IJoueur.IJoueur;





public class InvocationServiteur implements ICapacite{

	
	 private String nom="InvocationServiteur ";
	 private String Description="Invoque des serviteur";
	 private int attaque =1;
	private String nomCarteInvoca=" ";
	 private int nombre=1;
	 private int pv=1;
	
	
	
	public InvocationServiteur( String nom ,String nomCarteInvocat, int nombre,int pv,int attaque) {
		this.setnom(nom);
	    this.setnomcarteInvoca(nomCarteInvocat);
		this.setnombre(nombre);
		this.setpv(pv);
	    this.setattaque(attaque);
	    this.setnomcarteInvoca(nomCarteInvocat);
		
	    
	}
	
	
	
	private void setpv(int pv2) {
		this.pv=pv2;
		
	}
	
	
	private int getpv() {
		return this.pv;
	}



	private void setnomcarteInvoca(String nomCarteInvocat) {
		this.nomCarteInvoca=nomCarteInvocat;
	}


   private String getnomcarteInvoca() {
	   return this.nomCarteInvoca;
   }
   
	private void setnombre(int nombre2) {

		this.nombre=nombre2;
	}
	
	
	
    private int getnombre() {
    	return this.nombre;
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
			throw new  ExceptionHeathstone("cible est null");
		}
		if(cible instanceof IJoueur) {
		     for( int i = 0;i<this.getnombre();i++  ) {	
		    	 ICarte a = new Serviteur(this.getnomcarteInvoca(), (IJoueur)cible, 0, this.getpv(), this.getattaque(),  new CapaciteVide(), false) ;
			 a.setsomeille(true);
		    	 ((IJoueur) cible).getJeu().add( a );
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
		this.attaque=a;
		
	}

	@Override
	public int getattaque() {
		return this.attaque;
	}

	
	public String toString() {
		return "Invocation "+this.getnombre()+" Serviteur avec:attaque:"+this.getattaque()+",pv:"+this.getpv();
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
