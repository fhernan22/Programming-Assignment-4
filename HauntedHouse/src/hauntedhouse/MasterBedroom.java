/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hauntedhouse;

/**
 *
 * @author Fidel
 */
public class MasterBedroom {
    private int location = 20;
    private int[] destinations = {16, 21};
    private String[] objectsInRoom = {"Jewerly Box", "TNT"};
    
    public int getLocation()
    {
        return this.location;
    }
    
    public int[] getPossibleDestinations()
    {
        return this.destinations;
    }
    
    public String[] getObjectsInRoom()
    {
        return this.objectsInRoom;
    }
    
    public String objectEffect(int selection)
    {   
        if (selection == 0)
            return "You found the cursed Hope Diamond and feel your doom!";
        return "You decided this house was too scary and blew yourself up!";
    }
}
