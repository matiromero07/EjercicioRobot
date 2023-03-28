import bodys.anotherBodys.AnotherBody;
import bodys.combatBodys.Aerial;
import bodys.combatBodys.Aquatic;
import bodys.combatBodys.CombatBody;
import bodys.combatBodys.Land;
import bodys.domesticBodys.DomesticBody;

public class Main {
    public static void main(String[] args) {

        //DOMESTIC BODY
        DomesticBody domesticBody = new DomesticBody();

        domesticBody.move("Move to the right");
        domesticBody.clean("Clean kitchen");
        domesticBody.cook("Cook chicken");

        //COMBAT BODY
        CombatBody combatBody = new CombatBody();
        Aerial aerial = new Aerial();
        Aquatic aquatic = new Aquatic();
        Land land = new Land();

        combatBody.move("Move left");
        combatBody.fight("Fight hard");
        combatBody.getOut("Get out!");
        combatBody.anotherTask("Fly");

        aerial.move("Move to the left");
        aerial.fight("Fight hard");
        aerial.getOut("Get out!");

        aquatic.move("Move down");
        aquatic.fight("Fight hard");
        aquatic.getOut("Get out!");

        land.move("Move up");
        land.fight("Fight hard");
        land.getOut("Get out!");

        //ANOTHER BODY
        AnotherBody anotherBody = new AnotherBody();

        anotherBody.move("Move right");
    }
}
