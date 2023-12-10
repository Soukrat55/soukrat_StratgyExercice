package Personnage;

import Comportement.ComportementArcEtFleches;
import Comportement.ComportementHache;

public class Chevalier extends Personnage {
    public Chevalier(){
        this.comportementArme=new ComportementHache();
    }
    @Override
    public void combattre(){
        score+=3;
        System.out.println("=======================");
        System.out.println("Chevalier");
        this.comportementArme.utiliserArme();
        System.out.println("==================="+score);
    }

}
