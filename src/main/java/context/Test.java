package context;


import Comportement.ComportementPoignard;
import Personnage.Reine;
import Personnage.Personnage;
import Personnage.Roi;
import Personnage.Troll;
import Personnage.Chevalier;



public class Test {
    public static void main(String[] args){
       Personnage reine=new Reine();
       reine.combattre();
       Personnage roi=new Roi();
       roi.combattre();
       System.out.println("**************");
       reine.setComportementArme(new ComportementPoignard());//por utliser les class de intraface strategu comportementArme
        reine.combattre();


       /*Personnage troll=new Troll();
       troll.combattre();
       Personnage chevalier=new Chevalier();
       chevalier.combattre();*/


    }
}
