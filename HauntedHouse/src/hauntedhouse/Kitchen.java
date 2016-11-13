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
public class Kitchen {
    private int location = 14;
    private int[] destinations = {13, 15};
    private String[] objectsInRoom = {"Refrigerator", "Cabinet", "TNT"};
    
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
            return "You found some delicious soul food!";
        else if (selection == 1)
            return "The dishes and glasses started flying at you! " +
                    "You get hit in the head and feel you start moving towards a light!";
        return "You decided this house was too scary and blew yourself up!";
    }
}
