//Creates Material object that is used to store info about a material that is needed for a specific Craft
public class Material
{
    private String matName; //name of material
    private int amount; //amount of that material needed for specific craft

    //Constructor 
    public Material(String m, int amt)
    {
        matName = m;
        amount = amt;
    }

    //accessor methods 
    public int getAmount() {
        return amount;
    }
    public String getName() {
        return matName;
    }

    //helper methods 
    public boolean hasEnough(int amt) {
        if(amount > amt) {
            return true;
        }
        return false;
    } 
    public int computeDiff(int q) {
        return Math.abs(q-amount);
    }
}
