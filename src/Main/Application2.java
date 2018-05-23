package Main;

//import java.util.InputMismatchException;
import java.util.Iterator;
import io.Console;
import ExceptionHeathstone.ExceptionHeathstone;


 import ICapacite.AttackMagic;
 import ICapacite.AttaqueCible;
 import ICapacite.AttackMagic;
 import ICapacite.AttaqueCible;
 import ICapacite.Bonus;
 import ICapacite.Bonus;
 import ICapacite.CapaciteVide;
 import ICapacite.Charge;
 import ICapacite.Charge;
 import ICapacite.ImageMirroir;
 import ICapacite.InvocationChiens;
 import ICapacite.InvocationServiteur;
 import ICapacite.InvocationChiens;
 import ICapacite.InvocationServiteur;
 import ICapacite.MarqueDuChasseur;
 import ICapacite.Piocher2Carte;
 import ICapacite.Provocation;
 import ICapacite.Charge;
 import ICapacite.Provocation;


import ICapacite.AttaqueDuLepreux;
import ICapacite.AttaqueHero;
import ICapacite.AttaqueTotal;
 import ICapacite.BouDeFeu;
import ICapacite.Golemisation;
import ICapacite.MarqueDuChasseur;
import ICapacite.SteadyShot;
import ICarte.ICarte;
import IJoueur.IJoueur;
import IJoueur.Joueur;
import IPlateau.Plateau;
import jeu.Hero;
import ICarte.Serviteur;
import ICarte.sort;
public class Application2 {

	
	
	
	/*************************************	 * main	 * @throws ExceptionHeathstone 
	 *************************************/

	public static void main(String[] args) throws ExceptionHeathstone {

		Plateau plateau = Plateau.newInstance();

		IJoueur jouer1 = new Joueur("player1", new Hero("Jaina", new BouDeFeu()));
		IJoueur jouer2 = new Joueur("player2", new Hero("Rexxar", new SteadyShot()));


		try {
			plateau.ajouterJoueur(jouer1);
		} catch (ExceptionHeathstone e3) {
			System.out.println("Null cible ou Carte en Application Ligne 57");
		///	e3.printStackTrace();
		}
		try {
			plateau.ajouterJoueur(jouer2);
		} catch (ExceptionHeathstone e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		plateau.demarrerPartie();
		if(plateau.estDemarree()) {
		plateau.getJoueurCourant().prendreTour();
		}else {
			System.out.println("False Demarrer\n");
		}
	 ////////////////	
	
	
		
	
		
		plateau.getJoueurCourant().getMain().add( new Serviteur("Chasse maree murloc",plateau.getJoueurCourant(),2,1,2,new InvocationServiteur("Cri de Guerre","Rator", 1, 1, 1),false));

		plateau.getJoueurCourant().getMain().add(new Serviteur("Chef de Raid",plateau.getJoueurCourant(),3,4,2,new Bonus("Bonus de Chef de Raid",1,0), false));
		plateau.getJoueurCourant().getMain().add(new sort("Charge",plateau.getJoueurCourant(),1,  new Charge(), true));
		plateau.getJoueurCourant().getMain().add(new sort("AttaqueMentale",plateau.getJoueurCourant(),2, new AttaqueHero("AttaqueMentale", 5), true));
		plateau.getJoueurCourant().getMain().add(new Serviteur("Champion de Hurlevent",plateau.getJoueurCourant(),7,6,6, new Bonus("Bonus de hurlevent",1,1), false));
		plateau.getJoueurCourant().getMain().add(new Serviteur("Chef de Raid",plateau.getJoueurCourant(),3,4,2,new Bonus("Bonus de Chef de Raid",1,0), false));
		plateau.getJoueurCourant().getMain().add(new Serviteur("Garde de Baie-du-butin",plateau.getJoueurCourant(),5,4,5,new  Provocation(),false));
		plateau.getJoueurCourant().getMain().add( new Serviteur("La Missiliere",plateau.getJoueurCourant(),6,5,2, new Charge (), false));
		plateau.getJoueurCourant().getMain().add( new Serviteur("Logre Magi",plateau.getJoueurCourant(),4,4,4, new AttackMagic (1, "Logre Maigi Bonuns"), false)   );
		plateau.getJoueurCourant().getMain().add(new Serviteur("Archimage",plateau.getJoueurCourant(),6,4,7,new AttackMagic(2, "Archimage"), false)  );
		plateau.getJoueurCourant().getMain().add(new Serviteur("Gonome lepreux",plateau.getJoueurCourant(),1,1,1,new  AttaqueDuLepreux() , true));
		plateau.getJoueurCourant().getMain().add(new Serviteur(  "Golem des moissions",plateau.getJoueurCourant(),3,3,2,new Golemisation() , false  ));
		plateau.getJoueurCourant().getMain().add( new sort("Choc de flame",plateau.getJoueurCourant(),2, new AttaqueTotal("Attque massive", 5), true));
		plateau.getJoueurCourant().getMain().add(  new sort("Eclaire de givre",plateau.getJoueurCourant(),2,  new AttaqueCible("Attaque du givre", 3), true));
		plateau.getJoueurCourant().getMain().add(  new sort("Intelligences des arcanes",plateau.getJoueurCourant(),2,  new Piocher2Carte(2), false));
		plateau.getJoueurCourant().getMain().add(  new sort("Image Mirroir",plateau.getJoueurCourant(),1,  new ImageMirroir (), false));
		plateau.getJoueurCourant().getMain().add(  new sort("Explosion Pyrotechnique",plateau.getJoueurCourant(), 10, new AttaqueCible("Explosion",10), true));
		
		
		
		
		
		plateau.getAdversaire().getMain().add(  new Serviteur("Busard affame",plateau.getAdversaire(),5,3,2,new Piocher2Carte(1), false)    );
		plateau.getAdversaire().getMain().add(new Serviteur("Chef de Raid",plateau.getAdversaire(),3,4,2,new Bonus("Bonus de Chef de Raid",1,0), false));
		plateau.getAdversaire().getMain().add(new sort("Charge",plateau.getAdversaire(),1,  new Charge(), false));
		plateau.getAdversaire().getMain().add(new sort("AttaqueMentale",plateau.getAdversaire(),2, new AttaqueHero("AttaqueMentale", 5), true));
		plateau.getAdversaire().getMain().add(new Serviteur("Champion de Hurlevent",plateau.getAdversaire(),7,6,6, new Bonus("Bonus de hurlevent",1,1), false));
		plateau.getAdversaire().getMain().add(new Serviteur("Chef de Raid",plateau.getAdversaire(),3,4,2,new Bonus("Bonus de Chef de Raid",1,0), false));
		plateau.getAdversaire().getMain().add(new Serviteur("Garde de Baie-du-butin",plateau.getAdversaire(),5,4,5,new  Provocation(),false));
		plateau.getAdversaire().getMain().add( new Serviteur("La Missiliere",plateau.getAdversaire(),6,5,2, new Charge (), false));
		plateau.getAdversaire().getMain().add( new Serviteur("Logre Magi",plateau.getAdversaire(),4,4,4, new AttackMagic (1, "Logre Maigi Bonuns"), false)   );
		plateau.getAdversaire().getMain().add(new Serviteur("Archimage",plateau.getAdversaire(),6,4,7,new AttackMagic(2, "Archimage"), false)  );
		plateau.getAdversaire().getMain().add(new Serviteur("Gonome lepreux",plateau.getAdversaire(),1,1,1,new  AttaqueDuLepreux() , true));
		plateau.getAdversaire().getMain().add(new Serviteur(  "Golem des moissions",plateau.getAdversaire(),3,3,2,new Golemisation() , false  ));
		plateau.getAdversaire().getMain().add( new sort("Marque du Chasseur",plateau.getAdversaire(),1,  new MarqueDuChasseur(), true) );
		plateau.getAdversaire().getMain().add( new sort("Tir des arcanes",plateau.getAdversaire(),1,  new AttaqueCible("Tir des arcanes", 2), true) );
		plateau.getAdversaire().getMain().add(new sort("Lachez les chiens",plateau.getAdversaire(),3,  new InvocationChiens(), false));
		plateau.getAdversaire().getMain().add( new sort("Ordre de tuer",plateau.getAdversaire(), 3, new AttaqueCible("Ordre",3), true));
		
		

		
		
		
	////////////////	
		
		
		// ************************************ Cmmancer le Tour *********************
		// ****/
		//int i = 0;

		while (plateau.getAdversaire().getHeros().getPV() != 0 && plateau.getJoueurCourant().getHeros().getPV() != 0) {

		
			
			
			System.out.println(plateau.getlesJoueur().get(0));
	
			if( plateau.getlesJoueur().get(0).equals(plateau.getJoueurCourant()) ) {
				System.out.println(">>>> TOUR <<<<\n"+
						"### Ta main ###\n"+
						"###############\n"+
						"### \n"+plateau.getJoueurCourant().getMain()+
					    "\n"+
						"###############\n"+
		                  "********************************\n");
			}
			
			
			System.out.println("==================================\n" + 
					"==================================\n" + 
					
					
					 
					 
					 
					 (plateau.getlesJoueur().get(0).getJeu())+
					
					"\n----------------------------------\n" + 
					 (plateau.getlesJoueur().get(1).getJeu())+
					"\n==================================\n" + 
					
					"==================================");
			
			
			System.out.println(plateau.getlesJoueur().get(1));
			
			if( plateau.getlesJoueur().get(1).equals(plateau.getJoueurCourant()) ) {
				System.out.println( "\n>>>> TOUR <<<<\n"+
						"### Ta main ###\n"+
						"###############\n"+
						"### \n"+plateau.getJoueurCourant().getMain()+
					    "\n"+
						"###############\n"+
		                  "********************************\n");
			}
			System.out.println("\n");

			
			
			
			
			
			
			System.out.println(
					"Tapper \n1 :Finir le Tour\n2:Jeu tes carte en main\n3:Utilise tes cartes sur board\n4:Utiliser la pouvoir de Hero");
			int choose = 0;		
			
			boolean bonreponse = false;

			// 如何防止匹配错误？？？？？？

			     Console s = new Console();
			      choose = s.readInt();
		          
			

			//////////////////////////////////////////////////////////////

			while (choose != 1 && choose != 2 && choose != 3 && choose != 4) {
				System.out.println("Null Commande ,Tapper entre 1-4");
				choose = s.readInt();

			}

			switch (choose) {

			case 1:
				try {
					plateau.getJoueurCourant().finirTour();
				} catch (ExceptionHeathstone e1) {
					//e1.printStackTrace();
					System.out.print("Eurreur en L217 de Application");
				}
				plateau.finTour(plateau.getJoueurCourant());
				plateau.getJoueurCourant().prendreTour();

			//	i++;
				break;

			case 2:
				JeuCartes(plateau);
				break;
			case 3:
				UtiliserCarte(plateau);
				break;
			case 4:
			   
				  if(  (plateau.getJoueurCourant().getHeros().getnom().equals("Jaina") && plateau.getJoueurCourant().getHeros().getMana()>=1) 
						|| (plateau.getJoueurCourant().getHeros().getnom().equals("Rexxar") && plateau.getJoueurCourant().getHeros().getMana()>=2)   )
				  {		
				try {
					plateau.getJoueurCourant().utiliserPouvoir(plateau.getAdversaire());
					
				} catch (ExceptionHeathstone e) {
					System.out.println("Deja utiliser!\n");
				    
					break;
				//	e.printStackTrace(); 
				}
				  }
				  else if(plateau.getJoueurCourant().getHeros().getnom().equals("Jaina") && plateau.getJoueurCourant().getHeros().getMana()<1) {
						System.out.println("Mana n'assez pas!");
						break;
				  }  
				   
				  else if(plateau.getJoueurCourant().getHeros().getnom().equals("Rexxar") && plateau.getJoueurCourant().getHeros().getMana()<2) {
						System.out.println("Mana n'assez pas!");
				         break;
				  }
					
				
			
			
			}

			

			if (plateau.getAdversaire().getHeros().getPV() == 0) {
				plateau.gagnePartie(plateau.getAdversaire());
			}

			if (plateau.getJoueurCourant().getHeros().getPV() == 0) {
				plateau.gagnePartie(plateau.getJoueurCourant());
			}

		}
		
	}

	/************************************* *************************************/

   
	
	/************************************    JEUER VOTRE CARTES EN MAIN ****************************/
	

	public static void JeuCartes(Plateau plt) {

		// 选自己的卡 ／／／／／／／／／／／

		System.out.println("#############\nTes carde en main:\n######################");
		System.out.println("===== CARTES       SORT : =====  ");

		Iterator<ICarte> iterator2 = plt.getJoueurCourant().getMain().iterator();

		while (iterator2.hasNext()) {
			ICarte integer = iterator2.next();
			if (integer instanceof sort) {
				System.out.print("#"+integer+"\n");


			}
		}

		System.out.println("\n=========== ============  =========  ");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("=========== CARTES   SERVITEUR : =========  ");

		iterator2 = plt.getJoueurCourant().getMain().iterator();

		while (iterator2.hasNext()) {
			ICarte integer = iterator2.next();
			if (integer instanceof Serviteur) {
				System.out.print("#"+integer+"\n");
			
			}
		}
		System.out.println("=========== ============  =========  ");
		System.out.println("=========== ============  =========  ");

		System.out.println("Tapper le nom complement de serviteur: \n");
	
		System.out.println("Tapper le nom pour presenter,quitter pour abendenne\n");

		///////////////////////
		String choix=  VerifierLachoix(plt);
		if(choix.equals("quitter")) {
			return ;
		}
        //////////////////////
		
		
		 // CAPACITE ATTAQUE HERO ????

		if( (plt.getJoueurCourant().getCarteEnMain(choix).getCapacite() instanceof AttaqueHero) 
			||(plt.getJoueurCourant().getCarteEnMain(choix).getCapacite() instanceof AttaqueDuLepreux)){
        
	    ////////////////////
			AttaqueHero(plt,choix);
		///////////////////////
		
		}

		// CAPACITE AOE ?????

		else if (plt.getJoueurCourant().getCarteEnMain(choix).getCapacite() instanceof AttaqueTotal) {
	 
			//////////////
			CapaciteAOE(plt,choix);
			return;
			/////////////

		}

		// CAPACITE BONUS?? AJOUTER DES POINTS DE MANA ???? INVOCATION ???? CHARGE
		// ?????? PROVOCATION ??????

		else if (!(plt.getJoueurCourant().getCarteEnMain(choix).CibleAdversaire())) {
		
			////////////////////////
			CapaciteNoncibleAdversaire(plt,choix);
		    ///////////////////////
		
		}

		else if (plt.getJoueurCourant().getCarteEnMain(choix).getCapacite() instanceof MarqueDuChasseur) {
		
			
			MarqueDuChasseur(plt, choix);
		}
		
		
		
		// CAPACITE CIBLE ?????? 
		
		    else 
		
			
			
			
			if (plt.getJoueurCourant().getCarteEnMain(choix).getCapacite() instanceof ICapacite.AttaqueCible || 
					plt.getJoueurCourant().getCarteEnMain(choix).getCapacite() instanceof ICapacite.Charge) {
		
				if(plt.getJoueurCourant().getCarteEnMain(choix).getCapacite() instanceof ICapacite.Charge)
				{
					/////////////////////////////
					
					 CapaciteCharge(plt,choix);
					 return ;
				    ///////////////////////////
				
				}
					
				
			System.out.println("\n des carde ADEVERSAIRE en JEU: " + plt.getAdversaire().getJeu());
			System.out.println("Tapper le nom complement de serviteur: \n");
			System.out.println("Tapper le nom pour presenter,hero pour attacker hero,quitter pour abendenne\n");
        
			Console c = new Console();
			String choix2 = c.readLine();

			if (choix2.equals("quitter")) {
				return;
			}
			//String CarteProvo = "";
			boolean trouver = false;

			
			
			
			if (choix2.equals("hero")) {
				
        ////////////////////////////////
			 trouver=EstEnProvovation(plt);
       //////////////////////////////
				
			

				if (trouver != true) {
			  ///////////////////////////////////
					CarteAttqueHero(plt, choix);
					return;
			 ////////////////////////////////////	
				}
				
           /////////////////////// IF HERO EN PROVOCATION ET CHOIX2 == HERO ///////////////////////////
				
				choix2 = WhileChoix2(c, choix2, trouver);
				if(choix2.equals("quitter")) {
					return;
				}
				
          ///////////////////////////////////////////////
				
			}
				
				//Attackere un carde 
				
				choix2 = whilechoix2Null(plt, c, choix2);
				if(choix2.equals("quitter")) {
					return ;
				}

				AttaqueCarte2(plt, choix, choix2);
	
			}
	
		/***************
		 * VERIFIER SI Y A DES CARTES MORT DANS LE JEU DE JOUEUR CADVERSAIRE
		 *************/

		EffacerCarteMort(plt);
	}

	 
	
	
	
	
/*=============================================  PETITE METHODES  ==========================================================*/	


	/*************************************   MarqueDuChasseur   *****************************/
	
	public static void MarqueDuChasseur(Plateau plt, String choix) {
		try {
			if(plt.getAdversaire().getMain().size()>0) {
			plt.getJoueurCourant().jouerCarte(plt.getJoueurCourant().getCarteEnMain(choix), plt.getAdversaire());
			}
			else {
				System.out.println("Y a pas des cartes en main de adverse\n");
			}
		} catch (ExceptionHeathstone e) {
			System.out.println("Null cible ou Carte en Application Ligne 532");
		}
	}

	
	
	/*************************************   VERIFICATION DE CHOIX *****************************/
	public static String VerifierLachoix(Plateau plt) {
		String choix = "";
//		Scanner c = new Scanner(System.in);
//		choix = c.nextLine();
		
		Console c = new Console();
		choix = c.readLine();

		/******* VERIFIER LA CHOISI **********/

		if (choix.equals("quitter")) {
			return "quitter";
		} else {

			while ((plt.getJoueurCourant().getCarteEnMain(choix) == null) || (plt.getJoueurCourant()
					.getCarteEnMain(choix).getMana() > plt.getJoueurCourant().getStockMana())) {

				if (plt.getJoueurCourant().getCarteEnMain(choix) == null)

				{
					System.out.println("Null Choix de votre carte en main,trapper 2e fois,quitter pour abondonne\n");
				} else {

					System.out.println("Mana n'assez pas,trapper 2e fois,quitter pour abondonne\n");
				}
				choix = c.readLine();
				if (choix.equals("quitter")) {
					return "quitter";
				}
			}
		}
		
		System.out.println("votre choix:" + plt.getJoueurCourant().getCarteEnMain(choix));
		return choix;
 	}
	
	/************************************* *************************************/

	
	
	
	/************************CAPACITE  ATTAQUE HERO  *****************************/
   public static void AttaqueHero(Plateau plt,String choix) {
		try {
			plt.getJoueurCourant().jouerCarte(plt.getJoueurCourant().getCarteEnMain(choix),
					plt.getAdversaire().getHeros());
		} catch (ExceptionHeathstone e) {
			System.out.println("Null cible ou Carte en Application Ligne 354");
			//e.printStackTrace();
		}
   }
	
	
	
	
	/*************************************************************/
	
   
   
   /*********************************  ATTAQUE AOE ****************************/
   
  public static void CapaciteAOE(Plateau plt,String choix)
  {
	  if (plt.getAdversaire().getJeu().size() > 0) {
			try {
				plt.getJoueurCourant().jouerCarte(plt.getJoueurCourant().getCarteEnMain(choix),
						plt.getAdversaire());
			} catch (ExceptionHeathstone e) {
				System.out.println("Null  Carte en Application Ligne 367");
				//e.printStackTrace();
			}
		} else {
			System.out.println("y a aucun cartes en le Jeu de adverse");
		}
	  
	  
  }
   
   
   
   
   /*****************************************************************/
   
  
  /*******************************   CAPACITE CIBLE NON ADVERSAIRE ******************/
  public static void CapaciteNoncibleAdversaire(Plateau plt,String choix) {
	  try {
			plt.getJoueurCourant().jouerCarte(plt.getJoueurCourant().getCarteEnMain(choix), plt.getJoueurCourant());
		} catch (ExceptionHeathstone e) {
			System.out.println("Null cible  en Application Ligne 384");
			//e.printStackTrace();
		}
  } 
  
  
  
  /************************************/
   
  
  /***************************************CAPACITE CHARGE *********************************/
  
   public static void CapaciteCharge(Plateau plt,String choix){
	  System.out.println("\n des carde en JEU: " + plt.getJoueurCourant().getJeu());
		System.out.println("Tapper le nom complement de serviteur: \n");
        Console c = new Console();
		String choix2 = c.readLine();
		
		while( plt.getJoueurCourant().getCarteEnJeu(choix2)==null  ) {
			System.out.println("NULL COMMANDE\nTapper le nom complement de serviteur: \n");
			System.out.println("Tapper le nom pour presenter,hero pour attacker hero,quitter pour abendenne\n");

			choix2 = c.readLine();
			if (choix2.equals("quitter")) {
				return;
			}

		}
		try {
			plt.getJoueurCourant().jouerCarte(plt.getJoueurCourant().getCarteEnMain(choix),plt.getJoueurCourant().getCarteEnJeu(choix2) );
		} catch (ExceptionHeathstone e) {
			System.out.println("Null cible ou Carte en Application Ligne 436");
			//	e.printStackTrace();
		}
  }
  
  /*************************************************************/
   
   
   /******************************* EN PROVOCATION ********************************/
   
public static boolean EstEnProvovation(Plateau plt) {
	if (plt.getAdversaire().getJeu().size() > 0) {

		Iterator<ICarte> iterator2 = plt.getAdversaire().getJeu().iterator();
		while (iterator2.hasNext()) {
			ICarte integer2 = iterator2.next();
			if (integer2.getCapacite().getNom().equals("Provocation")) {
				System.out.println("Hero adversaire est en Provocation;");
				return true;
			}
		}   
}
	 return false;
}  
 


/*********************************************************************/
  
  
  
public static void AttaqueCarte2(Plateau plt, String choix, String choix2) {
	try {
		plt.getJoueurCourant().jouerCarte(plt.getJoueurCourant().getCarteEnMain(choix),
				plt.getAdversaire().getCarteEnJeu(choix2));
	} catch (ExceptionHeathstone e) {
		System.out.println("Null cible ou Carte en Application Ligne 509");
		//e.printStackTrace();
	}
}

public static String whilechoix2Null(Plateau plt, Console c, String choix2) {
	while (plt.getAdversaire().getCarteEnJeu(choix2) == null) {
		System.out.println("null choisir pour l'adversaire,trpper 2e fois , quitter pour quitter\n");
		choix2 = c.readLine();
		if (choix2.equals("quitter")) {
			return "quitter";
		}
	}
	return choix2;
}
	
	
	
/////////////////////////////////
	
public static String WhileChoix2(Console c, String choix2, boolean trouver) {
	while (trouver == true && choix2.equals("hero")) {
		System.out.println("Hero est en provocation , tapper les autres,quitter pour quitter\n");
		choix2 = c.readLine();
		if (choix2.equals("quitter")) {
			return "quitter";
		}
	}
	return choix2;
}

	public static void CarteAttqueHero(Plateau plt, String choix) {
		try {
			plt.getJoueurCourant().jouerCarte(plt.getJoueurCourant().getCarteEnMain(choix),
					plt.getAdversaire().getHeros());
		} catch (ExceptionHeathstone e) {
			System.out.println("Null cible ou Carte en Application Ligne 613");
			//e.printStackTrace();
		}
	}
	
	
	
	
/*=======================================================================================================*/	

	
/********************************************/
	
	
	
	

	///////////////////////////////////////////////////////////////

	
	
	/***************************************
	 * UTILISER DES CARDES SUR BORAD
	 ********************************************/

	public static void UtiliserCarte(Plateau plateau) {
		
// AfficherJeuCourant 
		AfficherJeuCourant(plateau);

		String choix = "";
		Console c = new Console();
		choix = c.readLine();
		
		
		
		System.out.println("Votre choix:" + choix);

		if (choix.equals("quitter")) {
			return;
		}

		choix = whilechoixNull(plateau, choix, c);
        
		if (choix.equals("quitter")) {
			return;
		}

		
		
		
		/////////////////////////
		choix = CartedejajoueOuSomeille(plateau, choix, c);
        ///////////////////////
		
		/**************************/

		System.out.println("Vous Voulez Attacker des cartes adversaire sur tableau\n");
		System.out.println(plateau.getAdversaire().getJeu());

		/*************************************
		 * EN PROVOCATION ?
		 ***************************************/

		boolean trouver = false;
		String CarteProvo = "";
		Iterator<ICarte> iterator2 = plateau.getAdversaire().getJeu().iterator();
		while (iterator2.hasNext()) {
			ICarte integer2 = iterator2.next();
			if (integer2.getCapacite().getNom().equals("Provocation")) {
				System.out.println("Hero adversaire est en Provocation;");
				CarteProvo = integer2.getNom();

				trouver = true;

			}

		}
		/*****************************************************/

		Console c2;
	////////////////////////////////
		String choix2 = AtaaqueAdversaire();
    ///////////////////////////////
		
		if (choix2.equals("quitter")) {
			return;
		}

		/************ choix2 est null??? **************/

		choix2 = WhileChoix2Null2(plateau, choix2);
	
		if (choix2.equals("quitter")) {
			return;
		}

	
		
		choix2 = AttaqueHero(trouver, choix2);
	
		
		
		UtilierCartes(plateau, choix, choix2);

		/****************
		 * VERIFIER SI Y A DES CARTES MORTS EN JEU DE ADVERSE
		 *****************/

		EffacerCarteMort(plateau);

	}

	
	public static void EffacerCarteMort(Plateau plateau) {
		Iterator<ICarte> iterator3 = plateau.getAdversaire().getJeu().iterator();

		while (iterator3.hasNext()) {
			ICarte integer = iterator3.next();

			if (integer.disparait()) {
				if (integer.getCapacite() instanceof AttaqueDuLepreux) { // Utiliser des Capacites de Disparition
					try {
					
						integer.executerEffetDisparition(plateau.getJoueurCourant());
					} catch (ExceptionHeathstone e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (integer.getCapacite() instanceof Golemisation) {
					try {
					
						integer.executerEffetDisparition(plateau.getAdversaire());
					} catch (ExceptionHeathstone e) {
						System.out.println("Null cible ou Carte en Application Ligne 777");
					//	e.printStackTrace();
					}

				}
				// iterator3.remove();
			}
			iterator3 = plateau.getAdversaire().getJeu().iterator();
			while (iterator3.hasNext()) {
				integer = iterator3.next();
				if (integer.disparait()) {
					iterator3.remove();
				}
			}

		}

		/****************
		 * VERIFIER SI Y A DES CARTES MORTS EN JEU DE JOUEUR COURANT
		 *****************/
		Iterator<ICarte> iterator4 = plateau.getJoueurCourant().getJeu().iterator();

		while (iterator4.hasNext()) {
			ICarte integer = iterator4.next();

			if (integer.disparait()) {

				if (integer.getCapacite() instanceof AttaqueDuLepreux) { // Utiliser des Capacites de Disparition
					try {
						integer.executerEffetDisparition(plateau.getJoueurCourant());
					} catch (ExceptionHeathstone e) {
						System.out.println("Null cible ou Carte en Application Ligne 808");
						//e.printStackTrace();
					}
				}
				if (integer.getCapacite() instanceof Golemisation) {
					try {
						integer.executerEffetDisparition(plateau.getAdversaire());
					} catch (ExceptionHeathstone e) {
						System.out.println("Null cible ou Carte en Application Ligne 816");
					//	e.printStackTrace();
					}

					// iterator4.remove();
				}
			}

		}

		iterator4 = plateau.getJoueurCourant().getJeu().iterator();
		while (iterator4.hasNext()) {
			ICarte integer = iterator4.next();
			if (integer.disparait()) {
				iterator4.remove();
			}
		}
	}

	public static void UtilierCartes(Plateau plateau, String choix, String choix2) {
		try {
			if (choix2.equals("hero")) {

				plateau.getJoueurCourant().utiliserCarte(plateau.getJoueurCourant().getCarteEnJeu(choix),
						plateau.getAdversaire().getHeros());
			} else {

				plateau.getJoueurCourant().utiliserCarte(plateau.getJoueurCourant().getCarteEnJeu(choix),
						plateau.getAdversaire().getCarteEnJeu(choix2));
			}
		} catch (ExceptionHeathstone e1) {
			System.out.println("Null cible ou Carte en Application Ligne 749");
		//	e1.printStackTrace();
		}
	}

public static String AttaqueHero(boolean trouver, String choix2) {
	Console c2;
	while ((trouver == true && choix2.equals("hero")) /*|| (trouver == true && !choix2.contains(CarteProvo))*/) {
		System.out.println("Hero adversaire est en Provocation;"
				+ ",Trapper 2e fois,quitter pour quitter");
		//c2 = new Scanner(System.in);
		 c2 = new Console();
		choix2 = c2.readLine();
		if (choix2.equals("quitter")) {
			return "";
		}
	}
	return choix2;
}

public static String WhileChoix2Null2(Plateau plateau, String choix2) {
	Console c2;
	while (!(choix2.equals("hero")) && (plateau.getAdversaire().getCarteEnJeu(choix2) == null))

	{

		System.out.println(
				"Null Commande\n Vous pouvez attacker "  + ",Trapper 2e fois,quitter pour quitter");
		//c2 = new Scanner(System.in);
		c2 = new Console(); 
		choix2 = c2.readLine();
		if (choix2.equals("quitter")) {
			return "quitter";

		}
	}
	return choix2;
}

	public static String AtaaqueAdversaire() {
		System.out.println("Tapper le nom complement de serviteur: \n");
		System.out.println("Tapper le nom pour presenter,hero pour attacker la hero,quitter pour abendenne\n");

		String choix2 = "";
		//Scanner c2 = new Scanner(System.in);
	    Console c2=new Console();
		
		choix2 = c2.readLine();

		System.out.println("Votre choix:" + choix2);
		return choix2;
	}

	public static String CartedejajoueOuSomeille(Plateau plateau, String choix, Console c) {
	
		while (plateau.getJoueurCourant().getCarteEnJeu(choix).estjoue() || (plateau.getJoueurCourant().getCarteEnJeu(choix).estsomeille()==true)   ) {
		
			if(plateau.getJoueurCourant().getCarteEnJeu(choix).estjoue() ) {
			System.out.println("Cette carte est deja joue\n ,Trapper 2e fois,quitter pour quitter");
			choix = c.readLine();
			}
			if( (plateau.getJoueurCourant().getCarteEnJeu(choix).estsomeille()==true)) {
				System.out.println("Il faut attendre\nTapper 2 e fois");
		      //  return "quitter" ;
				choix = c.readLine();
			}
			
			
			if (choix.equals("quitter")) {
				
				return "quitter";
			}

		}
		return choix;
	}

public static String whilechoixNull(Plateau plateau, String choix, Console c) {
	while (plateau.getJoueurCourant().getCarteEnJeu(choix) == null) {
		if (plateau.getJoueurCourant().getCarteEnJeu(choix) == null) {
			System.out.println("Null Commande\n ,Trapper 2e fois,quitter pour quitter");
		}
		// c=new Scanner(System.in);
		choix = c.readLine();
		if (choix.equals("quitter")) {
			break;
		}

	}
	return choix;
}

	public static void AfficherJeuCourant(Plateau plateau) {
		System.out.println("Vous Voulez Utiliser des cartes sur tableau\n");
		System.out.println(plateau.getJoueurCourant().getJeu());
		System.out.println("Tapper le nom complement de serviteur: \n");
		System.out.println("Tapper le nombre pour presenter,quitter pour abendenne\n");
	}

}
