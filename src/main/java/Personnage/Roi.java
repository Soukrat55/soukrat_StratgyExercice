package Personnage;

import Comportement.ComportementPoignard;

public class Roi extends Personnage {
    public Roi(){
        this.comportementArme=new ComportementPoignard();
    }
    @Override
    public void combattre(){
        score+=1;
        System.out.println("=======================");
        System.out.println("Reine");
        this.comportementArme.utiliserArme();
        System.out.println("==================="+score);
    }

}
