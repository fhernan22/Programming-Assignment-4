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
public class BedroomOne {
    private int location = 22;
    private int[] destinations = {16, 20, 24};
    private String[] objectsInRoom = {"Rocking Chair", "Window", "TNT"};
    
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
            return "Chair starts rocking by itself with no one in it!";
        else if (selection == 1)
            return "There is a child outside on a swing who suddenly disappears!";
        return "You decided this house was too scary and blew yourself up!";
    }
}
