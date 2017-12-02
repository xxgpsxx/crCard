package mypckg;

public class VariedMultiUnit extends MultiUnit
{
    private Unit unit2 = new Unit();
    private int number2 = 0;
    private String name = "";
    public VariedMultiUnit()
    {
    }
    public VariedMultiUnit(String name, int number1, Unit unit1, int number2, Unit unit2)
    {
        super(name, number1, unit1);
        this.name = name;
        this.unit2 = unit2;
        this.number2 = number2;
    }
    public Unit unit2() { return unit2; }
    public int number2() { return number2; }
    public void setUnit2(Unit unit2) { this.unit2 = unit2; }
    public void setNumber2(int number2) { this.number2 = number(); }
    public String toString() { return "Name: " + extend(name) + "\tContains: " + number() + " " + unit().name() + "s and " + number2 + " " + unit2.name() + "s\n\t\t" + unit() + "\n\t\t" + unit2; }
}
