package ICapacite;

import ExceptionHeathstone.ExceptionHeathstone;

public interface ICapacite {

	public void executerAction(java.lang.Object cible) throws ExceptionHeathstone;//有些能力在被要求时发挥作用，并可能在目标上作用...
	public void executerEffetDebutTour()throws ExceptionHeathstone;//在回合开始时有一些异能（我没有例子，但你永远不知道）
	public void executerEffetDisparition(java.lang.Object cible)throws ExceptionHeathstone;//当牌从游戏中消失时（比如死亡之声......），一些异能会发挥作用。
    public void executerEffetFinTour()throws ExceptionHeathstone;//在回合结束时有一些异能（我没有例子，但你永远不知道）
    public void executerEffetMisEnJeu(java.lang.Object cible) throws ExceptionHeathstone ;//一些能力在游戏开始的时候起作用。
    public java.lang.String getDescription();//能力描述（“对目标英雄造成+1点伤害”
    public java.lang.String getNom();
    public boolean equals(Object obj);
	public void setattaque(int a);
	public int getattaque();
	
}
