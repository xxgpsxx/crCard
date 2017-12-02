package mypckg;
public class Card
{
    private String name = "";
    private int level = 1;
    public Card()
    {
    }
    public Card(String name, int level)
    {
        this.name = name;
        this.level = level;
    }
    public String name()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int level()
    {
        return level;
    }
    public void setLevel(int level)
    {
        this.level = level;
    }
    public String toString()
    {
        return "Name: " + extend(name) + "\tLevel: " + extend("" + level);
    }
    public String extend(String word)
    {
        String output = word;
        int length = word.length();
        if(length >= 12)
        {
            for (int i = 0; i < 4 - length % 4; i++)
                output += " ";
            return output;
        }
        else if(length >= 8)
        {
            for (int i = 0; i < 8 - length % 4; i++)
                output += " ";
            return output;
        }
        else if(length > 4)
        {
            for (int i = 0; i < 12 - length % 4; i++)
                output += " ";
            return output;
        }
        else
        {
            for (int i = 0; i < 16 - length; i++)
                output += " ";
            return output;
        }
    }
}
