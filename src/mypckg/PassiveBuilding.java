package mypckg;

public class PassiveBuilding extends Building
{
    private String product = "";
    public PassiveBuilding()
    {
    }
    public PassiveBuilding(String name, int level, int hitpoints, int lifespan, String product)
    {
        super(name, level, hitpoints, lifespan);
        this.product = product;
    }
    public String product()
    {
        return product;
    }
    public void setProduct(String product)
    {
        this.product = product;
    }
    public String toString()
    {
        return super.toString() + " \tProduces: " + extend(product);
    }
}
