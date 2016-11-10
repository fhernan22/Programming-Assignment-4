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
public class Stairs {
    private int location = 16;
    private int[] destinations = {10, 20, 22, 23};
    private String[] objectsInRoom = {"TNT"};
    
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
        return "You decided this house was too scary and blew yourself up!";
    }
}
