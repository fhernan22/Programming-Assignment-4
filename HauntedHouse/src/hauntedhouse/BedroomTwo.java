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
public class BedroomTwo {
    private int location = 23;
    private int[] destinations = {16,20,24};
    private String[] objectsInRoom = {"Dresser", "Doll House", "TNT"};
    
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
            return "The dolls start dancing on their own!";
        else if (selection == 1)
            return "A ghost flies out of the dresser and goes right though your body!";
        return "You decided this house was too scary and blew yourself up!";
    }
}
