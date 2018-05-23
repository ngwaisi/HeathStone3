package IPlateau;

import java.util.ArrayList;

import ExceptionHeathstone.ExceptionHeathstone;
import IJoueur.IJoueur;

public interface IPlateau {
public void ajouterJoueur(IJoueur joueur) throws ExceptionHeathstone;
public void demarrerPartie() throws ExceptionHeathstone;
public boolean estDemarree();
public void finTour(IJoueur joueur) throws ExceptionHeathstone;
public void gagnePartie( IJoueur joueur) throws ExceptionHeathstone;
public IJoueur  getAdversaire();
public void setAdversaire(IJoueur joueur)throws ExceptionHeathstone;
public IJoueur getJoueurCourant();
public void setJoueurCourant(IJoueur joueur) throws ExceptionHeathstone;
public ArrayList<IJoueur> getlesJoueur() ;
}
