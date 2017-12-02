package mypckg;

public class RangedUnit extends Unit
{
    private double range = 0;
    public RangedUnit()
    {
    }
    public RangedUnit(String name, int level, int hitpoints, int damage, int speed, double hitspeed, boolean flying, double range)
    {
        super(name, level, hitpoints, damage, speed, hitspeed, flying);
        this.range = range;
    }
    public double range()
    {
        return range;
    }
    public void setRange(double range)
    {
        this.range = range;
    }
    public String toString()
    {
        return super.toString() + "\tRange: " + extend("" + range);
    }
}
