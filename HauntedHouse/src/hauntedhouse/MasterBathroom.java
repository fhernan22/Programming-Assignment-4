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
public class MasterBathroom {
    private int location = 21;
    private int[] destinations = {20};
    private String[] objectsInRoom = {"Intricate Oil Lamp", "Shower", "TNT"};
    
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
            return "A genie pops out who will grant you 3 wishes!";
        else if (selection == 1)
            return "Suddenly you hear singing in the shower, but no one is there!";
        return "You decided this house was too scary and blew yourself up!";
    }
}
