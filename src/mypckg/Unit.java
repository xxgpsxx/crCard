package mypckg;

public class Unit extends Card {
    private int hitpoints = 0;
    private int damage = 0;
    private int speed = 0;
    private double hitspeed = 0.0;
    private boolean flying = false;

    public Unit()
    {
    }
    public Unit(String name, int level, int hitpoints, int damage, int speed, double hitspeed, boolean flying)
    {
        super(name, level);
        this.hitpoints = hitpoints;
        this.damage = damage;
        this.speed = speed;
        this.hitspeed = hitspeed;
    }
    public int hitpoints()
    {
        return hitpoints;
    }
    public int damage()
    {
        return damage;
    }
    public int speed()
    {
        return speed;
    }
    public double hitspeed() { return hitspeed; }
    public boolean flying() { return flying; }
    public void setHitpoints(int hitpoints)
    {
        this.hitpoints = hitpoints;
    }
    public void setDamage(int damage)
    {
        this.damage = damage;
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public void setHitspeed(double hitspeed) { this.hitspeed = hitspeed; }
    public void flying(boolean flying) { this.flying = flying; }
    public String toString()
    {
        return super.toString() + "\tHitpoints: " + extend("" + hitpoints) + "\tDamage: " + extend("" + damage ) + "\tSpeed: " + extend("" +speed) + "\tHitspeed: " + extend("" + hitspeed) + "\tFlying: " + extend("" + flying);
    }
}
