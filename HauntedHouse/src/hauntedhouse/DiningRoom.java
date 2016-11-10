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
public class DiningRoom {
    private int location = 13;
    private int[] destinations = {10, 14};
    private String[] objectsInRoom = {"Candelabra", "TNT"};
    
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
            return "The candelabra light up by themselves and you see a death shadow!";
        return "You decided this house was too scary and blew yourself up!";
    }
}
