//Craft object class. Stores information about a single craft. 
import java.util.*;
public class Craft
{
    //instance variables
    private String name; //name of craft
    private String diffLevel; //difficulty level of craft
    private ArrayList<Material> materials; //list of materials required for craft
    private String subcategory;//subcategory the craft falls under
    private String category; //category the craft falls under
    private String link; //link to get more information about the craft

    //constructor
    public Craft(String n, String d, ArrayList<Material> m, String s, String sc, String l)
    {
        name = n;
        diffLevel = d;
        materials = m;
        category = s;
        subcategory = sc;
        this.link = l;
    }

    //Accessor methods
    public String getName() {
        return name;
    }
    public String getDiffLevel()
    {
        return diffLevel;
    }
    public ArrayList<Material> getMaterial() {
        return materials;
    }
    public String getCategories()
    {
        return subcategory;
    }
    
     public String getLink() {
        return link;
    }

    //Modifier method 
    public void setLink(String l) {
        this.link = link;
    }
   

}
