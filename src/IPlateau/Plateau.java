package IPlateau;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Scanner;
import java.util.Random;

import ExceptionHeathstone.ExceptionHeathstone;

import ICarte.ICarte;
import IJoueur.IJoueur;
//import IJoueur.Joueur;
import io.Console;

public class Plateau implements IPlateau{  
   
	private static Plateau instance = new Plateau();  
    
	public Plateau(){}  

   private  ArrayList<IJoueur> lesJoueur=new ArrayList<IJoueur>();
   private  IJoueur JoueurAdversaire;
   private  IJoueur JoueurCourant;
    
    
    
    
    public static Plateau newInstance(){  
        return instance;  
    }  

    
    
    public static void main(String[] args) throws ExceptionHeathstone {
		
	
	
	
	
	
	}
    
    
    /**************************************  ajouterJoueur  **************************/
    
	@Override
	public void ajouterJoueur(IJoueur joueur) throws ExceptionHeathstone{
 	
	  if(this.lesJoueur.size()>2) {
throw new ExceptionHeathstone("ne pouvez pas ajouter 2+ joueurs");
	  }	
		
       if(joueur==null) {
    	   throw new  ExceptionHeathstone("Le joueur est null");
       }
       else this.lesJoueur.add(joueur);
       }
	@Override
	
	   /**************************************  demarrer  Partie  **************************/
	
	public void demarrerPartie()throws ExceptionHeathstone {
	
		  if(this.lesJoueur.get(0)==null || this.lesJoueur.get(1)==null) {
			  throw new ExceptionHeathstone("Manque un joueur");
		  }
		

		  Random r = new Random();
    	      int i = r.nextInt(2); 
		
		  if(i==0) {
			  this.JoueurCourant=this.lesJoueur.get(0);
			  this.JoueurAdversaire=this.lesJoueur.get(1);
		  }else {
			  this.JoueurCourant=this.lesJoueur.get(1);
			  this.JoueurAdversaire=this.lesJoueur.get(0);
		  }
		
		
		
		/*
		
		
		  Iterator<ICarte> iterator2 = this.getAdversaire().getMain().iterator();
          while (iterator2.hasNext()) {
                    ICarte integer2 = iterator2.next();
                        integer2=null;
                }
          Iterator<ICarte> iterator1 = this.getAdversaire().getJeu().iterator();
          while (iterator1.hasNext()) {
                    ICarte integer1 = iterator1.next();
                        integer1=null;
                }
	
		
          Iterator<ICarte> iterator3 = this.getJoueurCourant().getJeu().iterator();
          while (iterator3.hasNext()) {
                    ICarte integer3 = iterator3.next();
                        integer3=null;
                }
	
          Iterator<ICarte> iterator4 = this.getJoueurCourant().getMain().iterator();
          while (iterator4.hasNext()) {
                    @SuppressWarnings("unused")
					ICarte integer4 = iterator4.next();
                        integer4=null;
                }
	
          
          this.getAdversaire().getHeros().setPV(15);
          this.getJoueurCourant().getHeros().setPV(15);
       
          try {
			this.getAdversaire().getHeros().setMana(0);
		} catch (ExceptionHeathstone e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          try {
  			this.getJoueurCourant().getHeros().setMana(0);
  		} catch (ExceptionHeathstone e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
            
            */
          
	
	}
	
	
	/*****************************est Demarree**********************************/
	
	
	@Override
	public boolean estDemarree() {
		
		if(this.JoueurAdversaire==null || this.JoueurCourant==null) {
			return false;
		}
		return true;
		
	/*	System.out.println("Demarre? tapper 1 pour oui ,2 pour non");
	     int choose = 0;
	  
	     Console s = new Console();
	      choose = s.readInt();
         
	     
	   
	     if(choose==1) {return true;}
	    return false;
	    */
	}
	
	
	 /****************************************FINI TOUR *****************************/
	
	@Override
	public void finTour(IJoueur joueur) throws ExceptionHeathstone {
		
		if(joueur == null) {
			throw new ExceptionHeathstone("null joueur qui veut Finir son Tour en finTour");
		}
		if(joueur.equals(this.getAdversaire())) {
			throw new ExceptionHeathstone("joueur qui veux finir son tour est la joueur ADVERSAIRE!");
		}
		
		joueur.setutilisepouvoir(false);
		
		

		Iterator<ICarte> iterator3 = joueur.getJeu().iterator();

		while (iterator3.hasNext()) {
			ICarte integer = iterator3.next(); 
		    integer.setsomeille(false);
		  }
		
		

if(joueur.getPseudo().equals("player1")) {
	
	
	try {
		this.setAdversaire(this.lesJoueur.get(0));
	} catch (ExceptionHeathstone e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		this.setJoueurCourant(this.lesJoueur.get(1));
	} catch (ExceptionHeathstone e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}


    else {
		try {
			this.setAdversaire(this.lesJoueur.get(1));
		} catch (ExceptionHeathstone e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.setJoueurCourant(this.lesJoueur.get(0));
		} catch (ExceptionHeathstone e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}


	  
	   
	
	}
		

	
	
	/***********************  GET ADVERSE  ********************/

	@Override
	public IJoueur getAdversaire() {
		return this.JoueurAdversaire;
	}
	
	/***********************  GET COURANT  ********************/
	
	@Override
	public IJoueur getJoueurCourant() {
	return this.JoueurCourant;
	}
	
	
	
	
	/*********************** SET COURANT  ********************/
	
	@Override
	
	
	
	public void setJoueurCourant(IJoueur joueur)throws ExceptionHeathstone {
	
		if((joueur==null)||!( joueur instanceof IJoueur)) {
			throw new ExceptionHeathstone ("set joueur courant est invalide");
		}
		else {
			this.JoueurCourant=joueur;
		}
	}

	/*********************** GAGNE PARTIE ********************/
	

	@Override
	public void gagnePartie(IJoueur joueur)throws ExceptionHeathstone {
		if(joueur == null) {
			throw new ExceptionHeathstone("joueur est null dans gagnePartie");
		}
		
		System.out.println("Joueur"+joueur.getPseudo()+"est mort");
		
	    joueur=null;
	
	}
	/*********************** SET ADVERSE ********************/

	@Override
	public void setAdversaire(IJoueur joueur)throws ExceptionHeathstone {
		if((joueur==null)||!( joueur instanceof IJoueur)) {
			throw new ExceptionHeathstone ("set joueur  adversaire est invalide");
		}
		else {
			this.JoueurAdversaire=joueur;
		}
	}
	/*********************** GET LESJOUEUR ********************/
	
	public ArrayList<IJoueur> getlesJoueur() {
		 return this.lesJoueur;
	}




}  