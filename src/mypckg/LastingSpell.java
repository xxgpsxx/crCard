package mypckg;

public class LastingSpell extends Spell
{
    private int duration = 0;
    private String effect = "";
    public LastingSpell()
    {
    }
    public LastingSpell(String name, int level, int damage, int towerDamage, double radius, int duration, String effect)
    {
        super(name, level, damage, towerDamage, radius);
        this.duration = duration;
        this.effect = effect;
    }
    public int duration()
    {
        return duration;
    }
    public String effect()
    {
        return effect;
    }
    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    public void setEffect(String effect)
    {
        this.effect = effect;
    }
    public String toString()
    {
        return super.toString() + "\tDuration: " + extend("" + duration) + "\tEffect" + extend(effect);
    }
}
