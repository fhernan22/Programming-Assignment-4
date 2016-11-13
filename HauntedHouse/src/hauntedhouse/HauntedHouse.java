package hauntedhouse;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author Fidel Hernandez
 * @author Eduardo Morales
 */
public class HauntedHouse {
    private FrontDoor frontDoor;
    private LivingRoom livingRoom;
    private FirstFloorBathroom firstFloorBathroom;
    private DiningRoom diningRoom;
    private Kitchen kitchen;
    private Pantry pantry;
    private Stairs stairs;
    private MasterBedroom masterBedroom;
    private MasterBathroom masterBathroom;
    private BedroomOne bedroomOne;
    private BedroomTwo bedroomTwo;
    private Bathroom secondFloorBathroom;
    private int playerPosition;
    private String roomName;
    private String playerName;
    private List<Integer> roomConnections;
    private List<String> itemsInRoom;
    private ImageIcon icon;
    
    /**
     * Constructs and initialize a haunted house along
     * 
     * Since the game always starts at the front door
     * a frontDoor object would be created.
     * Also, the current position will be stored.
     * @param name player's name 
     */
    public HauntedHouse(String name)
    {
        this.playerName = name;
        frontDoor = new FrontDoor();
        this.playerPosition = frontDoor.getLocation(); 
    }
    
    /**
     * Set the player's name
     * @param name player's name
     */
    public void sePlayerName(String name)
    {
        this.playerName = name;
    }
    
    /**
     * Updates player's position
     * 
     * @param position Current position 
     */
    public void setPlayerPosition(int position)
    {
        this.playerPosition = position;
    }
    
    /**
     * Get the name of a room.
     * 
     * Check the current position and return 
     * a string representation of the room 
     * player is in.
     * 
     * @param position id of the current room
     * @return name of current room
     */
    public String getRoomName(int position)
    {
        switch (position)
        {
            case 10:
                this.roomName = "Front Door";
                break;  
            case 11:
                this.roomName = "Living Room";
                break;
            case 12:
                this.roomName = "First Floor Bathroom";
                break; 
            case 13:
                this.roomName = "Dining Room";
                break; 
            case 14:
                this.roomName = "Kitchen";
                break;
            case 15:
                this.roomName = "Pantry";
                break;
            case 16:
                this.roomName = "Stairs";
                break;   
            case 20:
                this.roomName = "Master Bedroom";
                break;   
            case 21:
                this.roomName = "Master Bathroom";
                break;  
            case 22:
                this.roomName = "Bedroom One";
                break; 
            case 23:
                this.roomName = "Bedroom Two";
                break;
            case 24:
                this.roomName = "Second Floor Bathroom";
                break;    
            default:
                this.roomName = "NA";
        }
        
        return this.roomName;
    }
    
    /**
     * Prints a welcome message and display the initial position
     */
    public void WelcomeMessage()
    {
        JOptionPane.showMessageDialog(null,
                "Hello " + this.playerName + ".\n Welcome to COP2210 Haunted House!");
        
        displayPosition();
    }
    
    /**
     * Display an image of the current position the
     * player is in
     */
    public void displayPosition()
    {   
        if (this.playerPosition == 10)
        {
            icon = new ImageIcon(HauntedHouse.class.getResource("../images/frontDoor.png"));
        }
        else if (this.playerPosition == 11)
        {
            icon = new ImageIcon(HauntedHouse.class.getResource("../images/livingRoom.png"));
        }
        else if (this.playerPosition == 12)
        {
            icon = new ImageIcon(HauntedHouse.class.getResource("../images/firstFloorBathroom.png"));
        }
        else if (this.playerPosition == 13)
        {
            icon = new ImageIcon(HauntedHouse.class.getResource("../images/diningRoom.png"));
        }
        else if (this.playerPosition == 14)
        {
            icon = new ImageIcon(HauntedHouse.class.getResource("../images/kitchen.png"));
        }
        else if (this.playerPosition == 15)
        {
            icon = new ImageIcon(HauntedHouse.class.getResource("../images/pantry.png"));
        }
        else if (this.playerPosition == 16)
        {
            icon = new ImageIcon(HauntedHouse.class.getResource("../images/stairs.png"));
        }
        else if (this.playerPosition == 20)
        {
            icon = new ImageIcon(HauntedHouse.class.getResource("../images/masterBedroom.png"));
        }
        else if (this.playerPosition == 21)
        {
            icon = new ImageIcon(HauntedHouse.class.getResource("../images/masterBathroom.png"));
        }
        else if (this.playerPosition == 22)
        {
            icon = new ImageIcon(HauntedHouse.class.getResource("../images/bedroomOne.png"));
        }
        else if (this.playerPosition == 23)
        {
            icon = new ImageIcon(HauntedHouse.class.getResource("../images/bedroomTwo.png"));
        }
        else
            icon = new ImageIcon(HauntedHouse.class.getResource("../images/secondFloorBathroom.png"));
        
        JOptionPane.showMessageDialog(null,
                "<html><h2>Your Current position: " +
                getRoomName(this.playerPosition) + "</h2></html>" +
                '\n',
                "",
                JOptionPane.PLAIN_MESSAGE,
                icon);
    }
    
    /**
     * Check for all possible places the 
     * player can go to from a specific room
     * 
     * @param possibleDestinations rooms player can visit
     * @return list of possible destinations
     */
    public List<Integer> getConnections(int[] possibleDestinations)
    {
        this.roomConnections = new ArrayList<>();
        
        for (int i=0; i<possibleDestinations.length; i++)
        {
            this.roomConnections.add(possibleDestinations[i]);
        }
        
        return this.roomConnections;
    }
    
    /**
     * Get all the items in  a room and
     * store them in a list
     * 
     * @param items all items in a room
     * @return  List of items
     */
    public List<String> getItemsinRoom(String[] items)
    {
        this.itemsInRoom = new ArrayList<>();
        
        for (int i=0; i<items.length; i++)
        {
            this.itemsInRoom.add(items[i]);
        }
        
        return this.itemsInRoom;
    }
    
    /**
     * Initialize a room object given its position
     * 
     * @param roomPosition position of a given room 
     */
    public void openDoor(int roomPosition)
    {
        if (roomPosition == 11)
            this.livingRoom = new LivingRoom();
        else if (roomPosition == 12)
            this.firstFloorBathroom = new FirstFloorBathroom();
        else if (roomPosition == 13)
            this.diningRoom = new DiningRoom();
        else if (roomPosition == 14)
            this.kitchen = new Kitchen();
        else if (roomPosition == 15)
            this.pantry = new Pantry();
        else if (roomPosition == 16)
            this.stairs = new Stairs();
        else if (roomPosition == 20)
            this.masterBedroom = new MasterBedroom();
        else if (roomPosition == 21)
            this.masterBathroom = new MasterBathroom();
        else if (roomPosition == 22)
            this.bedroomOne = new BedroomOne();
        else if (roomPosition == 23)
            this.bedroomTwo = new BedroomTwo();
        else 
            this.secondFloorBathroom = new Bathroom();
        
       
    }
    
    /**
     * Get information about a room
     * 
     * Takes as input the player's current position
     * and do the following:
     * <ul>
     * <li>Initialize the corresponding room object</li>
     * <li>Get all possible destinations the player can choose</li>
     * <li>Get all possible items in the room</li>
     * <li>Set the player's position to the current room</li>
     * <li>Display the current position</li>
     * </ul>
     * @param currentPosition player's current position
     */
    public void openRoom(int currentPosition)
    {
        switch (currentPosition)
        {
            case 10:
                openDoor(10);
                getConnections(frontDoor.getPossibleDestinations());
                getItemsinRoom(frontDoor.getObjectsInRoom());
                setPlayerPosition(10);
                displayPosition();
                break;  
            case 11:
                openDoor(11);
                getConnections(livingRoom.getPossibleDestinations());
                getItemsinRoom(livingRoom.getObjectsInRoom());
                setPlayerPosition(11);
                displayPosition();
                break;
            case 12:
                openDoor(12);
                getConnections(firstFloorBathroom.getPossibleDestinations());
                getItemsinRoom(firstFloorBathroom.getObjectsInRoom());
                setPlayerPosition(12);
                displayPosition();
                break; 
            case 13:
                openDoor(13);
                getConnections(diningRoom.getPossibleDestinations());
                getItemsinRoom(diningRoom.getObjectsInRoom());
                setPlayerPosition(13);
                displayPosition();
                break; 
            case 14:
                openDoor(14);
                getConnections(kitchen.getPossibleDestinations());
                getItemsinRoom(kitchen.getObjectsInRoom());
                setPlayerPosition(14);
                displayPosition();
                break;
            case 15:
                openDoor(15);
                getConnections(pantry.getPossibleDestinations());
                getItemsinRoom(pantry.getObjectsInRoom());
                setPlayerPosition(15);
                displayPosition();
                break;
            case 16:
                openDoor(16);
                getConnections(stairs.getPossibleDestinations());
                getItemsinRoom(stairs.getObjectsInRoom());
                setPlayerPosition(16);
                displayPosition();
                break;   
            case 20:
                openDoor(20);
                getConnections(masterBedroom.getPossibleDestinations());
                getItemsinRoom(masterBedroom.getObjectsInRoom());
                setPlayerPosition(20);
                displayPosition();
                break;   
            case 21:
                openDoor(21);
                getConnections(masterBathroom.getPossibleDestinations());
                getItemsinRoom(masterBathroom.getObjectsInRoom());
                setPlayerPosition(21);
                displayPosition();
                break;  
            case 22:
                openDoor(22);
                getConnections(bedroomOne.getPossibleDestinations());
                getItemsinRoom(bedroomOne.getObjectsInRoom());
                setPlayerPosition(22);
                displayPosition();
                break; 
            case 23:
                openDoor(23);
                getConnections(bedroomTwo.getPossibleDestinations());
                getItemsinRoom(bedroomTwo.getObjectsInRoom());
                setPlayerPosition(23);
                displayPosition();
                break;
            case 24:
                openDoor(24);
                getConnections(secondFloorBathroom.getPossibleDestinations());
                getItemsinRoom(secondFloorBathroom.getObjectsInRoom());
                setPlayerPosition(24);
                displayPosition();
                break;    
            default:
                this.roomName = "NA";
        }
    }
    
    /**
     * Ask player if they want to move to another room
     * or stay in the current room
     * 
     * if the player wants to move to another room choice = 0,
     * otherwise choice = 1
     * @param options array of options
     * @return  player's choice
     */
    public int displayOptions(Object[] options)
    {
        int choice;
        int i = 0;
        
        options = new Object[2];
            
        options[0] = "Move";
        options[1] = "Stay";

        choice = JOptionPane.showOptionDialog(null,
                            "Would you like to move to another room or stay?",
                            "",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[0]);
        
        return choice;
    }
    
    /**
     * Display all possible rooms player can move to.
     * @return room player chooses to go to.
     */
    public int switchRooms()
    {
        Object[] options = new Object[this.roomConnections.size()];
        int i = 0;
        int choice;
                
        for (Integer connection: this.roomConnections)
        {
            options[i] = getRoomName(connection);
            i++;
        }

        choice = JOptionPane.showOptionDialog(null,
                            "Wich room would you like to visit?",
                            "",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[0]);

        return choice;
    }
    
    /**
     * Display all items the player can pick.
     * @return item player chooses to pick.
     */
    public int pickItemsInRoom()
    {
        Object[] options = new Object[this.itemsInRoom.size()];
        int i = 0;
        int choice;
                
        for (String item: this.itemsInRoom)
        {
            options[i] = item;
            i++;
        }

        choice = JOptionPane.showOptionDialog(null,
                            "Wich item would you like to pick?",
                            "",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[0]);
            
        return choice;
    }
    
    /**
     * Display the effect of selecting a particular object in
     * a room.
     * @param currentPosition player's current position
     * @param choice item player chose to pick
     */
    public void showItem(int currentPosition, int choice)
    {
        switch (currentPosition)
        {
            case 10:
                JOptionPane.showMessageDialog(null,
                        "<html><h2>"+frontDoor.objectEffect(choice) + "</h2></html>" +
                        '\n',
                        "",
                        JOptionPane.PLAIN_MESSAGE,
                        icon);
                break;  
            case 11:
                JOptionPane.showMessageDialog(null,
                        "<html><h2>"+livingRoom.objectEffect(choice) + "</h2></html>" +
                        '\n',
                        "",
                        JOptionPane.PLAIN_MESSAGE,
                        icon);
                break;
            case 12:
                JOptionPane.showMessageDialog(null,
                        "<html><h2>"+firstFloorBathroom.objectEffect(choice) + "</h2></html>" +
                        '\n',
                        "",
                        JOptionPane.PLAIN_MESSAGE,
                        icon);
                break; 
            case 13:
                JOptionPane.showMessageDialog(null,
                        "<html><h2>"+diningRoom.objectEffect(choice) + "</h2></html>" +
                        '\n',
                        "",
                        JOptionPane.PLAIN_MESSAGE,
                        icon);
                break; 
            case 14:
                JOptionPane.showMessageDialog(null,
                        "<html><h2>"+kitchen.objectEffect(choice) + "</h2></html>" +
                        '\n',
                        "",
                        JOptionPane.PLAIN_MESSAGE,
                        icon);
                break;
            case 15:
                JOptionPane.showMessageDialog(null,
                        "<html><h2>"+pantry.objectEffect(choice) + "</h2></html>" +
                        '\n',
                        "",
                        JOptionPane.PLAIN_MESSAGE,
                        icon);
                break;
            case 16:
                JOptionPane.showMessageDialog(null,
                        "<html><h2>"+stairs.objectEffect(choice) + "</h2></html>" +
                        '\n',
                        "",
                        JOptionPane.PLAIN_MESSAGE,
                        icon);
                break;   
            case 20:
                JOptionPane.showMessageDialog(null,
                        "<html><h2>"+masterBedroom.objectEffect(choice) + "</h2></html>" +
                        '\n',
                        "",
                        JOptionPane.PLAIN_MESSAGE,
                        icon);
                break;   
            case 21:
                JOptionPane.showMessageDialog(null,
                        "<html><h2>"+masterBathroom.objectEffect(choice) + "</h2></html>" +
                        '\n',
                        "",
                        JOptionPane.PLAIN_MESSAGE,
                        icon);
                break;  
            case 22:
                JOptionPane.showMessageDialog(null,
                        "<html><h2>"+bedroomOne.objectEffect(choice) + "</h2></html>" +
                        '\n',
                        "",
                        JOptionPane.PLAIN_MESSAGE,
                        icon);
                break; 
            case 23:
                JOptionPane.showMessageDialog(null,
                        "<html><h2>"+bedroomTwo.objectEffect(choice) + "</h2></html>" +
                        '\n',
                        "",
                        JOptionPane.PLAIN_MESSAGE,
                        icon);
                break;
            case 24:
                JOptionPane.showMessageDialog(null,
                        "<html><h2>"+secondFloorBathroom.objectEffect(choice) + "</h2></html>" +
                        '\n',
                        "",
                        JOptionPane.PLAIN_MESSAGE,
                        icon);
                break;    
            default:
                this.roomName = "NA";
        }
    }
    
    /**
     * Main game loop
     */
    public void game()
    {
        boolean changeRoom = false;
        boolean hasKey = false;
        Object[] options = null;
        int choice;
        
        WelcomeMessage();
       
        choice = displayOptions(options);
        getConnections(frontDoor.getPossibleDestinations());
        getItemsinRoom(frontDoor.getObjectsInRoom());
        
        if (choice == 0)
        {
            changeRoom = true;
        }
        
        else
        {
            showItem(this.playerPosition, choice);
            hasKey = true;
        }
        
        while (true)
        {   
            if (changeRoom == true)
            {
                choice = switchRooms();
                openRoom(this.roomConnections.get(choice));
                changeRoom = false;
            }
            
            else
            {
                if (hasKey == true)
                    break;
                
                choice = pickItemsInRoom();
                
                showItem(this.playerPosition, choice);
                changeRoom = false;
                
                if (this.itemsInRoom.get(choice).equals("key") || this.itemsInRoom.get(choice).equals("TNT"))
                    break;
            }
            
            choice = displayOptions(options);
            
            if (choice == 0)
                changeRoom = true;  
        }
    } 
}
