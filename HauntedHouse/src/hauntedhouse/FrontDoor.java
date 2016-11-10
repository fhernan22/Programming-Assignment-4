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
public class FrontDoor {
    private int location = 10;
    private int[] destinations = {11, 13, 16};
    private String[] objectsInRoom = {"key"};
    
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
        return "Key to exit!";
    }
}
