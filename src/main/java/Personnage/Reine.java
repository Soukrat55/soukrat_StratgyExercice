package Personnage;

import Comportement.ComportementArcEtFleches;

public class Reine extends Personnage {

    public Reine(){
        this.comportementArme=new ComportementArcEtFleches();
    }
    @Override
    public void combattre(){
        score+=4;
        System.out.println("=======================");
        System.out.println("Reine");
        this.comportementArme.utiliserArme();
        System.out.println("==================="+score);
    }


}
