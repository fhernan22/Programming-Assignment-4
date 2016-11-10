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
public class LivingRoom {
    private int location = 11;
    private int[] destinations = {10, 12};
    private String[] objectsInRoom = {"Chest", "TNT"};
    
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
            return "Ghost escapes and scares you to death!";
        return "You decided this house was too scary and blew yourself up!";
    }
}
