package IJoueur;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
//import java.util.Scanner;

import ExceptionHeathstone.ExceptionHeathstone;
import ICapacite.AttackMagic;
import ICapacite.AttaqueCible;
import ICapacite.AttaqueDuLepreux;
import ICapacite.AttaqueHero;
 
import ICapacite.AttaqueTotal;
import ICapacite.Bonus;
 
import ICapacite.Charge;
import ICapacite.Golemisation;
import ICapacite.MarqueDuChasseur;
//import ICapacite.ICapacite;
import ICapacite.ImageMirroir;
import ICapacite.InvocationServiteur;
import ICapacite.Piocher2Carte;
import ICapacite.Provocation;
//import ICapacite.Provocation;
import ICarte.ICarte;
import ICarte.Serviteur;
import ICarte.sort;
//import ICapacite.ICapacite;
//import ICapacite.Provocation;
import ICapacite.InvocationChiens;
import jeu.Hero;

public class Joueur implements IJoueur , Cloneable{
    private String nom;
  
	private ArrayList<ICarte> CartesEnMain;
	private ArrayList<ICarte> CartesEnJeu;
	
	private ArrayList<ICarte> Deck;

	public boolean utilisepouvoir;
    private Hero hero;
    private int StockMana=0;
 
  
	
/**************          getDeck                  ***********/	
	
	
	private ArrayList<ICarte> getDeck() {
		return this.Deck;
		
		
		
	}



	
    
    
	public Joueur(String nom,Hero hero) throws ExceptionHeathstone {
		  this.setNom(nom);
		   
		  this.CartesEnMain = new ArrayList<ICarte>();
		  this.CartesEnJeu=new ArrayList<ICarte>();
		  this.Deck=new ArrayList<ICarte>();
	    try {
			this.sethero(hero);
		} catch (ExceptionHeathstone e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	    if(this.getHeros().getnom().equals("Jaina")) {
        
	    	   
 		         this.getDeck().add( new Serviteur("Archimage",this,6,4,7,new AttackMagic(2, "Archimage"), false));   
 
 	  
 		           this.getDeck().add( new sort("AttaqueMentale",this,2, new AttaqueHero("AttaqueMentale", 5), true));  
 	  
    
 		        this.getDeck().add( new Serviteur("Champion de Hurlevent",this,7,6,6, new Bonus("Bonus de hurlevent",1,1), false));   
 		        
 	  
 		        this.getDeck().add( new sort("Charge",this,1,  new Charge(), true));  
 		        
 	     
 		        this.getDeck().add( new Serviteur("Chasse maree murloc",this,2,1,2,new InvocationServiteur("Cri de Guerre","Rator de Incocation", 1, 1, 1),false)); 
 	 
 		       this.getDeck().add( new Serviteur("Chef de Raid",this,3,4,2,new Bonus("Bonus de Chef de Raid",1,0), false));  
 	  
 		       this.getDeck().add(  new sort("Choc de flame",this,2, new AttaqueTotal("Attque massive", 5), true)); 
 
		        this.getDeck().add( new sort("Eclaire de givre",this,2,  new AttaqueCible("Attaque du givre", 3), true));   
		      //  this.getDeck().add( new sort("Eclaire de givre",this,2,  new AttaqueCible("Attaque du givre", 3), true));   
		    	 
 		          this.getDeck().add( new sort("Explosion Pyrotechnique",this, 10, new AttaqueCible("Explosion",10), true));   
 		          
 		       this.getDeck().add( new Serviteur("Gonome lepreux",this,1,1,1,new  AttaqueDuLepreux() , true));   
 	
this.getDeck().add( new Serviteur(  "Golem des moissions",this,3,3,2,new Golemisation() , false  ));   

this.getDeck().add( new sort("Image Mirroir",this,1,  new ImageMirroir (), false));   
this.getDeck().add(  new sort("Intelligences des arcanes",this,2,  new Piocher2Carte(2), false));   
this.getDeck().add( new Serviteur("La Missiliere",this,6,5,2, new Charge (), false));   ; 
this.getDeck().add(new Serviteur("Garde de Baie-du-butin",this,5,4,5,new  Provocation(),false) );  
this.getDeck().add( new Serviteur("Logre Magi",this,4,4,4, new AttackMagic (1, "Logre Maigi Bonuns"), false)     );  
   
 	  }
	


	    else if(this.getHeros().getnom().equals("Rexxar")) {
		
  	  
	     
		         this.getDeck().add( new Serviteur("Archimage",this,6,4,7,new AttackMagic(2, "Archimage"), false));  
		           this.getDeck().add( new sort("AttaqueMentale",this,2, new AttaqueHero("AttaqueMentale", 5), true));  
		        this.getDeck().add( new Serviteur("Champion de Hurlevent",this,7,6,6,new Bonus("Bonus de hurlevent",1,1), false));  
		        
		        this.getDeck().add( new sort("Charge",this,1, new Charge(), false));  
		        
		        this.getDeck().add( new Serviteur("Chasse maree murloc",this,2,1,2,new InvocationServiteur("Cri de Guerre","Rator", 1, 1, 1),false));   
	 
		       this.getDeck().add( new Serviteur("Chef de Raid",this,3,4,2,new Bonus("Bonus de Chef de Raid",1,0), false));   
	 
		       this.getDeck().add(   new Serviteur("Busard affame",this,5,3,2,new Piocher2Carte(1), false));   
	
		        this.getDeck().add( new sort("Tir des arcanes",this,1,  new AttaqueCible("Tir des arcanes", 2), true));   
		          this.getDeck().add( new sort("Ordre de tuer",this, 3, new AttaqueCible("Ordre",3), true));   
		          
		       this.getDeck().add( new Serviteur("Gonome lepreux [ CAPACITE DE MORT ] ",this,1,1,1,new AttaqueHero("Attaque du lepreux",2), true));   
		      this.getDeck().add( new Serviteur(  "Golem des moissions [ CAPACITE DE MORT ]",this,3,3,2,new InvocationServiteur("Golem endomage","Golem", 1, 1, 2), false  ));   

            this.getDeck().add( new sort("Lachez les chiens",this,3,  new InvocationChiens(), false));   
	 
this.getDeck().add(  new sort("Marque du Chasseur",this,1,  new MarqueDuChasseur(), true));   
	  
 this.getDeck().add( new Serviteur("La Missiliere",this,6,5,2, new Charge (), false));   
	 
this.getDeck().add( new Serviteur("Logre Magi",this,4,4,4, new AttackMagic (1, "Logre Maigi Bonuns"), false)     );   

this.getDeck().add(new Serviteur("Garde de Baie-du-butin",this,5,4,5,new  Provocation(),false) ); 
} 

		
	
	
	
	
	}
	

/*********************************  set  hero   ************/
	
	public void sethero(Hero hero)throws ExceptionHeathstone {
		if(hero==null) { 
			throw new ExceptionHeathstone("l'hero sur arrgument est null en Sethero dans class joueur ");
		}
		this.hero=hero;
	}
	
	/********************************* set   Nom  ************/
	private void setNom(String nom2) {
		// TODO Auto-generated method stub
		this.nom=nom2;
	}


/*********************************   FIINTOUR  ************/

	@Override
	public void finirTour()throws ExceptionHeathstone {
	
		 Iterator<ICarte> iterator2 = this.getJeu().iterator();
         while (iterator2.hasNext()) {
                   ICarte integer2 = iterator2.next();
               
                   integer2.setjoue(false);
                   
                   
                    }
          }


	/*****************    GET CARTE  EN JEU  ******************/
	@Override
	public ICarte getCarteEnJeu(String nomCarte)   {
	
		 Iterator<ICarte> iterator2 = this.getJeu().iterator();
         while (iterator2.hasNext()) {
                   ICarte integer2 = iterator2.next();
                   boolean c=integer2.getNom().contains(nomCarte);
                   if(c) {
                	  return integer2;
                    }
          }
		return null;
	
	}
	/*****************    GET CARTE  EN MAIN  ******************/
	@Override
	public ICarte getCarteEnMain(String nomCarteMain) {
		 Iterator<ICarte> iterator2 = this.getMain().iterator();
         while (iterator2.hasNext()) {
                   ICarte integer2 = iterator2.next();
                   boolean c=integer2.getNom().contains(nomCarteMain);
                   if(c) {
                	  return integer2;
                    }
          }
		return null;
	}

	
	
	
	/*************************   GET HERO  ************************/
	@Override
	public Hero getHeros() {
	
		return this.hero;
	}
	
	
	/***************************   GET JEU  *************************/

	@Override
	public ArrayList<ICarte> getJeu() {
		// TODO Auto-generated method stub
		return this.CartesEnJeu;
	}

	/************************************   GET MAIN *****************************/
	@Override
	public ArrayList<ICarte> getMain() {
		// TODO Auto-generated method stub
		return this.CartesEnMain;
	}


	/************************************   GET PSEUDO *****************************/

	@Override
	public String getPseudo() {
		
		return this.nom;
	}

	
	/************************************   GET MANA *****************************
	
	@Override
	public int getStockMana() {
	return this.getHeros().getMana();
	}
*/

	
	/************************************   PERDRE CARTE  *****************************/
	
	public void perdreCarte(ICarte carte)throws ExceptionHeathstone {
	if(carte==null) {
		throw new ExceptionHeathstone("null carte dans predre carte en joueur");
	}
	this.getJeu().remove(carte);	
	}

	
	/////////////////////////////
	
	
	/************************************  PIOCHER  
	 * @throws ExceptionHeathstone *****************************/
	@Override
	public void piocher() throws ExceptionHeathstone {
		
		
		
	
	  
		  Random r = new Random();
      	  int i = r.nextInt(15); 
      	  
      	//  System.out.print(this.getDeck().get(i));
      	  System.out.print(this.getDeck().size());
    		  this.getMain().add( (ICarte)this.getDeck().get(i).clone());
      	  
      //	  this.getMain().add((ICarte) (this.getDeck().get(i)).clone() );
      
	
		
	}
	
	
	
	
	
	
	
	
	

	/************************************   GET STOCK MANA1 (Nombre de Mana de chaque Tour) *****************************/
	
	public int getStockMana() {
		return this.StockMana;
	}
	
	/************************************   STOCK MANA *****************************/
	
	public void setStockMana(int a) {
		if(a>MAX_MANA) {
			this.StockMana=MAX_MANA;
		}
		else{this.StockMana=a;}
		
	}
	
	/************************************   PRENDRE TOUR  
	 * @throws ExceptionHeathstone *****************************/
	
	@Override
	public void prendreTour() throws ExceptionHeathstone {
	
	
		this.piocher();
	//	int a =this.getStockMana()+1;
		this.setStockMana(this.getStockMana()+1);
		this.getHeros().setMana(this.getStockMana());
	
		
		
	}

	
	/************************************   UTILISER CARTE  
	 * @throws ExceptionHeathstone *****************************/
	
	@Override
	public void utiliserCarte(ICarte carte, Object cible) throws ExceptionHeathstone {
	
	
		            	if(carte.estsomeille()==false) {
		            	
		            	if(cible == null) {
		            		throw new ExceptionHeathstone("null cible dans utiliser carte");
		            	}	
		            	if(carte==null) {
		            		throw new ExceptionHeathstone("null carte dans utiliser carte ");
		            	}	
		            		
		            		
		        	     if(cible instanceof IJoueur) {
		        	       ((IJoueur) cible).getHeros().setPV(((IJoueur) cible).getHeros().getPV()-carte.getAttaque());
		        	       carte.setjoue(true);
		        		}
		        		
		        	     if(cible instanceof ICarte) {
		        			
		        				((ICarte) cible).setPV(((ICarte) cible).getCount()-carte.getAttaque());
		        				carte.setPV(carte.getCount()-(((ICarte) cible).getAttaque() ));
		        				 carte.setjoue(true);
		        		
		          
		                }
		        		  if ( (cible instanceof Hero ) ){
                        ((Hero) cible).setPV(((Hero) cible).getPV()-carte.getAttaque());
                        carte.setjoue(true);
		        		  
		        		  }
		        		  
		            
		        		  
		        		  
		            	}
		        
		            
	
		
	}
	
	
	
 
	
	/************************************ SET   UTILISER POUVOIR   * @throws ExceptionHeathstone *****************************/
	
	
	public void setutilisepouvoir(boolean c){
	
		this.utilisepouvoir=c;
	}
	
	/************************************ GET   UTILISER POUVOIR   * @throws ExceptionHeathstone *****************************/
	
	
	public boolean getutiliserpouvoir() {
		return this.utilisepouvoir;
	}
	
	/************************************   UTILISER POUVOIR  
	 * @throws ExceptionHeathstone *****************************/
	
	@Override

	public void utiliserPouvoir(Object cible) throws ExceptionHeathstone  {
	
		
		
		
		
		
		if(cible ==null) {
			throw new ExceptionHeathstone("null cible dans Utiliser pouvoir");
		}
		
		if(this.utilisepouvoir==true) {
			throw new ExceptionHeathstone ("deja Utiliser le pouvoir!");
		}
				
		
		
		
		if(this.getutiliserpouvoir()==false) {
	
			
			
			
			
			if(cible instanceof IJoueur) {
			
			
			
			if(this.getHeros().getnom().equals("Jaina")) {
			
				
		if(this.getHeros().getMana()>=1) {
			this.getHeros().getCapacite().executerAction(cible);
		
				this.getHeros().setMana(this.getHeros().getMana()-1);
			
			}
			}
			else {
			if(this.getHeros().getMana()>=2) {
		
				this.getHeros().getCapacite().executerAction(cible);
		
				this.getHeros().setMana(this.getHeros().getMana()-2);
		
			
			}
			}

		
		}
	
	    this.setutilisepouvoir(true);
	    }

	
	}	
	
	public String toString() {
		return  this.getPseudo()+"-->Heros [nom="+this.hero.toString();
			  
	}



	
	
	/************************************   JOUER CARTE  使用手上的卡*****************************/
        
	@Override
	public void jouerCarte(ICarte carte, Object cible) throws ExceptionHeathstone {
		
		
		if(!(carte instanceof ICarte) || (carte ==null)) {
			
			
			throw new ExceptionHeathstone("la carte est invalide");
			}
	
		if((cible ==null)) {
			throw new ExceptionHeathstone("la cible est invalide");
			}
		
	
		carte.executerDebutEffetMisEnJeu(cible);
		carte.executerAction(cible);
	      
        if(!(carte.getCapacite() instanceof Charge)) {
        	
          carte.setsomeille(true); 	
        	
        }
        
		if(carte instanceof Serviteur) {
			
			this.getJeu().add(carte);
			this.getMain().remove(carte);
	    
		}else {
			this.getMain().remove(carte);
			
		}
		
	     this.getHeros().setMana(this.getHeros().getMana()-carte.getMana());
		
		Iterator<ICarte> iterator2 =this.getJeu().iterator();
	      
         while (iterator2.hasNext()) {
                    ICarte integer = iterator2.next();
                   if (integer.disparait()) {
                       iterator2.remove();
                     }
                 }
	
	
         
   
	}

	 
	
	  
	
	
	
	
	/************************************   JOUER CARTE  *****************************/

	@Override
	public void jouerCarte(ICarte carte) throws ExceptionHeathstone {
		
		/* if(this.getStockMana()<carte.getMana()) {
			 System.out.println("N'assez pas mana");
				return ;}
		*/
		
		if(!(carte instanceof ICarte) || (carte ==null)) 
		{
			throw new ExceptionHeathstone("la carte est invalide");
		}
	    
        if(!(carte.getCapacite() instanceof Charge)) {
        	
          carte.setsomeille(true); 	
        	
        }
		this.getJeu().add(carte);
		this.getMain().remove(carte);
			
		
	if(carte instanceof Serviteur) {
		this.getJeu().add(carte);
		this.getMain().remove(carte);
	}
	else {
		this.getMain().remove(carte);
	}
		
	}
	
/**************   equals   ***************/   
	public boolean equals(Object obj) {
		
		if(obj==null) {
			return false;
		}
		
	   if(!(obj instanceof IJoueur  )   ) {
		   return false;
	   }
	   if(obj instanceof IJoueur) {
		   if(((IJoueur) obj).getPseudo().equals(this.getPseudo())  ) 
		   {
			   return true;
		   }
		   else {return false;}
	   }
	   return false;
	}
	
	/**************    clone  ***************/   
  public Object clone() {
	  ICarte c = null;
	  try {
		c=(ICarte)super.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return c;
	  }
  }
	



