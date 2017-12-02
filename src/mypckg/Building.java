package mypckg;

public class Building extends Card
{
    private int hitpoints = 0;
    private int lifespan = 0;
    public Building()
    {
    }
    public Building(String name, int level, int hitpoints, int lifespan)
    {
        super(name, level);
        this.hitpoints = hitpoints;
        this.lifespan = lifespan;
    }
    public int hitpoints()
    {
        return hitpoints;
    }
    public int lifespan()
    {
        return lifespan;
    }
    public void setHitpoints(int hitpoints)
    {
        this.hitpoints = hitpoints;
    }
    public void setLifespan(int lifespan)
    {
        this.lifespan = lifespan;
    }
    public String toString()
    {
        return super.toString() + "\tHitpoints: " + extend("" + hitpoints) + "\tLifespan: " + extend("" + lifespan);
    }
}
