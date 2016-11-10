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
public class Pantry {
    private int location = 15;
    private int[] destinations = {14};
    private String[] objectsInRoom = {"Dusty Recipe Box", "Broom", "TNT"};
    
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
            return "A recipe for chocolate devils food cake appeared our of no where!";
        else if (selection == 1)
            return "The broom flies up in the air as soon as you touch it!";
        return "You decided this house was too scary and blew yourself up!";
    }
}
