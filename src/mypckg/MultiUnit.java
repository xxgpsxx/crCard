package mypckg;

public class MultiUnit extends Unit
{
    private int number = 0;
    private Unit unit = new Unit();
    private String name = "";
    public MultiUnit()
    {
    }
    public MultiUnit(String name, int number, Unit unit)
    {
        super(name, unit.level(), unit.hitpoints(), unit.damage(), unit.speed(), unit.hitspeed(), unit.flying());
        this.name = name;
        this.number = number;
        this.unit = unit;
    }
    public String superToString()
    {
        return super.toString();
    }
    public int number() { return number; }
    public Unit unit() { return unit; }
    public void setNumber(int number) { this.number =  number; }
    public void setUnit(Unit unit) { this.unit = unit; }
    public String toString()
    {
        return "Name: " + extend(name)+ "\tContains: " + number + " " + unit.name() + "s\n\t\t" + unit;
    }
}
