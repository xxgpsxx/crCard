package mypckg;

public class Spell extends Card
{
    private int damage = 0;
    private double radius = 0.0;
    private int towerDamage = 0;
    public Spell()
    {
    }
    public Spell(String name, int level, int damage, int towerDamage, double radius)
    {
        super(name, level);
        this.damage = damage;
        this.radius = radius;
        this.towerDamage = towerDamage;
    }
    public int damage()
    {
        return damage;
    }
    public int towerDamage()
    {
        return towerDamage;
    }
    public double radius()
    {
        return radius;
    }
    public void setDamage(int damage)
    {
        this.damage = damage;
    }
    public void setTowerDamage(int towerDamage)
    {
        this.towerDamage = towerDamage;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public String toString()
    {
        return super.toString() + "\tDamage: " + extend("" + damage) + "\tRadius: " + extend("" + radius);
    }
}
