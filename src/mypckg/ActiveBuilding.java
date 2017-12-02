package mypckg;

public class ActiveBuilding extends Building
{
    private double range = 0.0;
    private int damage = 0;
    private double hitspeed = 0;
    public ActiveBuilding()
    {
    }
    public ActiveBuilding(String name, int level, int hitpoints, int lifespan, int damage, double range, double hitspeed)
    {
        super(name, level, hitpoints, lifespan);
        this.range = range;
        this.damage = damage;
        this.hitspeed = hitspeed;
    }
    public double range() { return range; }
    public int damage() { return damage; }
    public double hitspeed() { return hitspeed; }
    public void setRange(double range) { this.range = range; }
    public void setDamage(int damage) { this.damage = damage;}
    public void setHitspeed(double hitspeed) { this.hitspeed = hitspeed; }
    public String toString()
    {
        return super.toString() + "\tRange: " + extend("" + range) + "\tDamage: " + extend("" + damage) + "\tHitspeed: " + extend("" + hitspeed);
    }

}
