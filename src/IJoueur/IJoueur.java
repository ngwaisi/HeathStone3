package IJoueur;

//import java.util.ArrayList;
import ICarte.ICarte;
import jeu.Hero;
//import jeu.Heros;
//import jeu.Rexxar;
import ExceptionHeathstone.ExceptionHeathstone;
public interface IJoueur {
	public static final int MAX_MANA=10 ;   //////////  记得用 ///////
	public static final int TAILLE_DECK=15;   /////////  记得用 ///////

	//public static final Object CartesEnJeu = null;

	
	
	public void finirTour()throws ExceptionHeathstone;
	public ICarte getCarteEnJeu(java.lang.String nomCarte) ;//允许您在名称的一端搜索正在使用的卡片（感谢String类别的包含功能）。
	public ICarte getCarteEnMain(java.lang.String nomCarteMain);
	public Hero getHeros();
    public java.util.ArrayList<ICarte> getJeu(); //玩家的游戏由放在棋盘上的牌组成 
    public java.util.ArrayList<ICarte> getMain();
    public java.lang.String getPseudo();//这是玩家的昵称
    public int getStockMana();

    public void jouerCarte(ICarte carte)throws ExceptionHeathstone;//在回合中，玩家可能试图从他的手中拿走一张牌并将其放置在棋盘上。
    public void jouerCarte(ICarte carte , java.lang.Object cible)throws ExceptionHeathstone;
 
    public void perdreCarte(ICarte carte) throws ExceptionHeathstone;//刪卡；当一张卡完成其生命（一名移动的仆人，一个刚刚使用过的咒语......）时，你必须管理游戏（一张卡少于......），以及相关的效果 地图的消失（例如Rale d'agonie）。
    public void piocher() throws ExceptionHeathstone;
    public void prendreTour() throws ExceptionHeathstone;//輪到你了，選擇你要幹嘛；玩家轮到时会发生很多事情。
    public void utiliserCarte(ICarte carte,java.lang.Object cible) throws ExceptionHeathstone;
    public void utiliserPouvoir(java.lang.Object cible) throws ExceptionHeathstone;// 打人／打隨從；
    public void setStockMana(int a);
    public void setutilisepouvoir(boolean c) ;
}
