package hauntedhouse;

import javax.swing.JOptionPane;
/**
 *
 * @author Fidel Hernandez
 */
public class HauntedHouseTester {
    public static void main(String[] args)
    {   
        String name;
        
        do
        {
            name = (String) JOptionPane.showInputDialog("Please enter your name!");
        }
        while (name.isEmpty());
        
        
        HauntedHouse house = new HauntedHouse(name);
        house.game();
        
    }
}
