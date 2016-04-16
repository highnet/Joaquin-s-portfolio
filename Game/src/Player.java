/**
 * Created by bokense on 25-Mar-16.
 */
import java.awt.Color;

public class Player extends Entity {


    public String orientation = "EAST";
    public Float HP;
    Inventory playerInventory;
    CraftingInterface playerCrafter;
    PlayerGearInterface gearInterface;

    public Player(int setID,int setxPos, int setyPos, int setInventorySize, float setHP, Color setColor){

        super(setID,setxPos,setyPos,setColor);
        this.HP = setHP;

        playerInventory = new Inventory(setInventorySize);
        playerCrafter = new CraftingInterface(10);
        gearInterface = new PlayerGearInterface();

    }



}