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



public class Serviteur implements ICarte,Cloneable {


	
	private String nom="";
	private IJoueur prioritaire;
	private int mana=1;
	private int attaque=1;
	private int PV=1;
	private boolean estjoue =false;
	private ICapacite capacite;
	private boolean CibleAdversaire;
    private boolean someille=false;
	public    Serviteur (String nom ,IJoueur jouer,int mana,int PV,int Attaque,ICapacite capacite,boolean CibleAdversaire) throws ExceptionHeathstone {
		
		this.setNom(nom);
		this.setprioritaire(jouer);
		this.setMana(mana);
		this.setPV(PV);
	    this.setAttaque(Attaque);	
	    this.setCibleadversaire(CibleAdversaire);
	    this.setCapacite(capacite);
		
		
		this.prioritaire=jouer;
		
	}


/***************************   DISPARAIT **************/
	@Override
	public boolean disparait() {
		
		if (this.PV==0) 
		{return true;}
		return false;
		
	}
	
	/**************************   CLONE ******************/
	
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

	
	/*********************  EST JOUE **************/
	@Override
	public boolean estjoue() {
	
		
		return this.estjoue;
	}

	/***************** SET JOUE *************/
	
	@Override
	public void setjoue(boolean a) {
		this.estjoue=a;
		
	}

	/**************** executerAction *********************/
	
	@Override
	public void executerAction(Object cible) throws ExceptionHeathstone {
		if(cible==null) {
			throw new ExceptionHeathstone("null arguments de cible en executerAction dans class sort ");
		}
		else {
			this.capacite.executerAction(cible);
		}
	}
	/**************** executerEffetDisparition *********************/
	@Override
	public void executerEffetDisparition(Object cible) throws ExceptionHeathstone {
		if(cible==null) {
			throw new ExceptionHeathstone("null arguments de cible en executerEffetDisparition dans class sort ");
		}
		else {
			this.capacite.executerEffetDisparition(cible);
		}
		
	}
	/****************executerEffetFinTour *********************/
	
	public void executerEffetFinTour(Object cible) throws ExceptionHeathstone {
		if(cible ==null) {
			throw new ExceptionHeathstone("cible est null dans executerFinTour");
		}
	this.capacite.executerEffetFinTour();
		
	}
	/****************executerDebutEffetMisEnJeu *********************/
	
	@Override
	public void executerDebutEffetMisEnJeu(Object cible) throws ExceptionHeathstone {
		if(cible==null) {
			throw new ExceptionHeathstone("null arguments de cible en executerDebutEffetMisEnJeu dans class sort ");
		}
		else {
			this.capacite.executerEffetMisEnJeu(cible);
		}
		
	}
	
	
	
	/**************** getCount *********************/
	
	
	

	@Override
	public int getCount() {
		return this.PV;
	}

	
	/**************** setPV *********************/
	
	@Override
	public void setPV(int pv) throws ExceptionHeathstone {
	
		if(pv<0)
		{this.PV=0;}
		else
		{this.PV=pv;}
		
		
	}

	/****************  getNom*********************/
	
	@Override
	public String getNom() {
		return this.nom;
	}

	
	/**************** getProprietaire*********************/
	
	@Override
	public IJoueur getProprietaire() {
	return this.prioritaire;
	}
	
	
	/**************** setAttaque*********************/
	@Override
	public void setAttaque(int a) throws ExceptionHeathstone {
		if(a<0) {
			throw new ExceptionHeathstone("null arguments de cible en setAttaque dans class Serviteur ");
		}
		else {
			this.attaque=a;
		}
		
		
	}

	
	/**************** getCapacite*********************/
	
	@Override
	public ICapacite getCapacite() {
		return this.capacite;
	}

	
	/**************** getAttaque ********************/
	
	
	@Override
	public int getAttaque() {
	return this.attaque;
	}

	
	/**************** getMana ********************/
	@Override
	public int getMana() {
		return this.mana;
	}

	
	/**************** CibleAdversaire() ********************/
	@Override
	public boolean CibleAdversaire() {
		return this.CibleAdversaire;
	}

	

	/**************** setNom ********************/
	@Override
	public void setNom(String nom) throws ExceptionHeathstone {
		if(nom==null) {
			throw new ExceptionHeathstone("null arguments de cible en setNom dans class Serviteur ");
		}
		else {
			this.nom=nom;
		
		}
	}


	/**************** set prioritaire********************/
	
	@Override
	public void setprioritaire(IJoueur jouer) throws ExceptionHeathstone {
		if(jouer==null) {
			throw new ExceptionHeathstone("null arguments de cible en setprioritaire dans class Serviteur ");
		}
		else {
			this.prioritaire=jouer;
		
		}
		
	}
	
	
	/****************set Mana********************/

	@Override
	public void setMana(int mana) throws ExceptionHeathstone {
		if(mana<0) {
			throw new ExceptionHeathstone("null arguments de cible en setMana dans class Serviteur");
		}
		else {
			this.mana=mana;
		
		}
	}
	
	
	/****************set Capacite********************/

	@Override
	public void setCapacite(ICapacite capacite) throws ExceptionHeathstone {
		if(capacite==null) {
			throw new ExceptionHeathstone("null arguments de cible en setCapacite dans class Serviteur ");
		}
		else {
			this.capacite=capacite;
		
		
		}
	}
	
	
	
	public String toString() {
		return "Serviteur [Carte [nom=" +this.getNom()+
				", cout="+ this.getMana() +
				"] attaque="+this.getAttaque() + 
				"; vie="+this.getCount()+
				"]Capacite [nom="+this.capacite.getNom()+
				", description="+this.capacite+
				"[jouée?:] "+this.estjoue()+ "]";
	}

	/****************set  Cibleadversaire********************/
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

	/**************** set  someille********************/
    public void setsomeille(boolean a) {
    	this.someille=a;
    }
    
    
	/**************** est  someille********************/
	@Override
	public boolean estsomeille() {
		return this.someille;
	}

}

	
	
	