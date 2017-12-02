package mypckg;
import java.util.ArrayList;
public class crCardTesting
{
    public crCardTesting()
    {
        ArrayList <Card> deck = new ArrayList<Card>();
        deck.add(new Unit("Golem", 4, 284, 4256, -2, 2.5, false));
        deck.add(new PassiveBuilding("Elixir Pump", 7, 1020, 70, "Elixir"));
        deck.add(new Unit("Night Witch", 750, 260, 1, -1, 1.0, false));
        deck.add(new Spell("Lightning", 4, 837, 335, 3.0));
        deck.add(new Unit("Baby Dragon", 4, 1064, 133, 0, 1.6, true));
        deck.add(new Spell("Zap", 9, 159, 64, 2.5));
        deck.add(new Unit("Mega Minion", 7, 695, 258, 0, 1.5, true));
        deck.add(new Unit("Skeletons", 9, 67, 67, 1, 1, false));
        print(deck);
        ArrayList <Card> spellBait = new ArrayList <Card>();
        spellBait.add(new Unit("Princess", 1, 247, 140, -1, 3.0, false));
        Unit minion = new Unit("Minion", 9, 190, 84, 1, 2.0, true);
        MultiUnit minionHorde = new MultiUnit("Minion Horde", 6, minion);
        System.out.println(minionHorde);
        Unit goblin = new Unit("Goblin", 9, 169, 106, 2, 1.1, false);
        Unit spearGoblin = new Unit("Spear Goblin", 9, 110, 50, 2, 1.1, false);
        spellBait.add(new VariedMultiUnit("Goblin Gang", 3, goblin, 2, spearGoblin));
        System.out.println(spellBait.get(1));
    }
    public void print(ArrayList <Card> list)
    {
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
    public static void main (String args[])
    {
        crCardTesting app = new crCardTesting();
    }

}
