package ICarte;

import IJoueur.IJoueur;
import ExceptionHeathstone.ExceptionHeathstone;
import ICapacite.ICapacite;
public interface ICarte {
	
 public boolean disparait();
 public boolean estjoue();
 public void setjoue(boolean a);
public void executerAction(java.lang.Object cible) throws ExceptionHeathstone;//一张牌可以有一个动作，可以在回合中的任何时候在任何时候点牌;
public void executerEffetDisparition(java.lang.Object cible) throws ExceptionHeathstone;//一张卡从游戏中消失时可以产生效果
public boolean estsomeille();
public void setsomeille(boolean a);
public void executerDebutEffetMisEnJeu(java.lang.Object cible) throws ExceptionHeathstone;//一张卡牌可以在游戏开始时产生效果
public int getCount();
public void setPV(int pv) throws ExceptionHeathstone;
public java.lang.String getNom();
public IJoueur getProprietaire();
public void setAttaque(int a)  throws ExceptionHeathstone;
public ICapacite getCapacite() ;
public int getAttaque();
public int getMana();
public boolean CibleAdversaire();
public void setCibleadversaire(boolean a );

public void setNom(String nom) throws ExceptionHeathstone;
public void setprioritaire(IJoueur jouer) throws ExceptionHeathstone;
public void  setMana(int mana) throws ExceptionHeathstone;
public void setCapacite(ICapacite capacite) throws ExceptionHeathstone;
void executerEffetFinTour(Object cible) throws ExceptionHeathstone;
public boolean equals(Object obj);
public ICarte clone();


}
