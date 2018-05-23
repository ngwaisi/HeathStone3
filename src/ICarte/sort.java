package ICarte;
import ExceptionHeathstone.ExceptionHeathstone;
//import ICapacite.Charge;
//import ICapacite.Provocation;
 
//import ICapacite.AttackMagic;
 
import ICapacite.ICapacite;
//import ICapacite.ImageMirroir;
//import ICapacite.Piocher2Carte;
 
import IJoueur.IJoueur;
//import IJoueur.Joueur;
//import jeu.Rexxar;
//import jeu.Heros;

public class sort implements ICarte,Cloneable {

	
	
	private String nom="";
	private IJoueur prioritaire;
	private int mana=2;
	private int attaque=0;
	private int PV=0;
	private boolean estjoue =false;
	private ICapacite capacite;
    private boolean CibleAdversaire;
    private boolean someille=false;
	public   sort(String nom ,IJoueur jouer,int mana,ICapacite capacite,boolean cibleadversaire) throws ExceptionHeathstone {
		
		this.setNom(nom);
		this.setprioritaire(jouer);
		this.setMana(mana);
		
		this.setCibleadversaire(cibleadversaire);
	   
		this.setjoue(estjoue);
	    this.setCapacite(capacite);
		
		
		this.prioritaire=jouer;
		
	}

	@Override
	public boolean disparait() {
		
		if (this.PV==0) {return true;}
		return false;
		
	}
	

	@Override
	public boolean estjoue() {
		// TODO Auto-generated method stub
		return this.estjoue;
	}

	@Override
	public void setjoue(boolean a) {
		this.estjoue=a;
		
	}

	@Override
	public void executerAction(Object cible) throws ExceptionHeathstone {
		if(cible==null) {
			throw new ExceptionHeathstone("null arguments de cible en executerAction dans class sort ");
		}
		else {
			this.capacite.executerAction(cible);
		}
	}

	@Override
	public void executerEffetDisparition(Object cible) throws ExceptionHeathstone {
		if(cible==null) {
			throw new ExceptionHeathstone("null arguments de cible en executerEffetDisparition dans class sort ");
		}
		else {
			this.capacite.executerEffetDisparition(cible);
		}
		
	}

	public void executerEffetFinTour(Object cible) throws ExceptionHeathstone {
		if(cible ==null) {
			throw new  ExceptionHeathstone ("null cible dans executerEffetFinTour");
		}
	this.capacite.executerEffetFinTour();
		
	}

	@Override
	public void executerDebutEffetMisEnJeu(Object cible) throws ExceptionHeathstone {
		if(cible==null) {
			throw new ExceptionHeathstone("null arguments de cible en executerDebutEffetMisEnJeu dans class sort ");
		}
		else {
			this.capacite.executerEffetMisEnJeu(cible);
		}
		
	}

	@Override
	public int getCount() {
		return this.PV;
	}

	@Override
	public void setPV(int pv) throws ExceptionHeathstone {
	
		if(pv<0)
		{this.PV=0;}
		else
		{this.PV=pv;}
		
		
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public IJoueur getProprietaire() {
	return this.prioritaire;
	}

	@Override
	public void setAttaque(int a) throws ExceptionHeathstone {
		if(a<0) {
			throw new ExceptionHeathstone("null arguments de cible en setAttaque dans class sort ");
		}
		else {
			this.attaque=a;
		}
		
		
	}

	@Override
	public ICapacite getCapacite() {
		return this.capacite;
	}

	@Override
	public int getAttaque() {
	return this.attaque;
	}

	@Override
	public int getMana() {
		return this.mana;
	}

	@Override
	public boolean CibleAdversaire() {
		return this.CibleAdversaire;
	}

	@Override
	public void setNom(String nom) throws ExceptionHeathstone {
		if(nom==null) {
			throw new ExceptionHeathstone("null arguments de cible en setNom dans class sort ");
		}
		else {
			this.nom=nom;
		
		}
	}

	@Override
	public void setprioritaire(IJoueur jouer) throws ExceptionHeathstone {
		if(jouer==null) {
			throw new ExceptionHeathstone("null arguments de cible en setprioritaire dans class sort ");
		}
		else {
			this.prioritaire=jouer;
		
		}
		
	}

	@Override
	public void setMana(int mana) throws ExceptionHeathstone {
		if(mana<0) {
			throw new ExceptionHeathstone("null arguments de cible en setMana dans class sort ");
		}
		else {
			this.mana=mana;
		
		}
	}

	@Override
	public void setCapacite(ICapacite capacite) throws ExceptionHeathstone {
		if(capacite==null) {
			throw new ExceptionHeathstone("null arguments de cible en setCapacite dans class sort ");
		}
		else {
			this.capacite=capacite;
		
		}
	}

	public String toString() {
		return "Sort [Carte [nom=" +this.getNom()+
				", cout="+ this.getMana() +
				"] attaque="+this.getAttaque() + 
				"; vie="+this.getCount()+
				"]Capacite [nom="+this.capacite.getNom()+
				", description="+this.capacite.getDescription()+
				" "+"jouée?:"+this.estjoue()+ "]";
	}

	@Override
	public void setCibleadversaire(boolean a) {
	this.CibleAdversaire=a;
		
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof ICarte) ) {
			return false;
		}
	    if(obj == null) {
	    	return false;
	    }
	    if( obj instanceof ICarte ) {
	    	   if(  ((ICarte) obj).getNom().equals(this.getNom()) ) {
	    		   return true;
	    	   }else {return false;}
	    }
		return false;
	}

	@Override
	public boolean estsomeille() {
		return this.someille;
	}

	@Override
	public void setsomeille(boolean a) {
		this.someille=a;
	}
	
	public ICarte clone() {
		ICarte o = null;

		try {		
			o = (ICarte) super.clone();

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
		
	}
}
	