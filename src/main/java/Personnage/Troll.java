package Personnage;

import Comportement.ComportementArcEtFleches;
import Comportement.ComportementHache;

public class Troll extends Personnage {
    public Troll(){
        this.comportementArme=new ComportementArcEtFleches();
    }
    @Override
    public void combattre(){
        score+=2;
        System.out.println("=======================");
        System.out.println("Roi");
        this.comportementArme.utiliserArme();
        System.out.println("==========Score========="+score);
        if(score>13) this.setComportementArme(new ComportementHache());
    }

}
