import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Toolkit;

/**
 * Write a description of class Welten here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Welten extends World
{
    
    public static int screenW = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    public static int screenH = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    public static int weltW = (int) (screenW*0.75);
    public static int weltH = (int) (screenH*0.75);
    private HealthBar healthbar;
    private AmmoBar ammobar;
    private Info info;
    public int abstand = 27; //muss 27

    
   
    
    /**
     * Größe des Bildschirms * 0.75.
     * Welten werden in 500*500 designt und dann hochskaliert.
     * Aber wie?
     * 
     * Barsaumo:    Verrechnung der Koordinaten mit dem Skalierungsfaktor:
     *              500x500 -> 1000x1000 = Faktor 2
     *              -> Urpsrungskoordinate mit Faktor 2 multiplizieren
     *              
     *              
     * 
     */

    /**
     * Constructor for objects of class Welten.
     * 
     */
    
    
    public Welten()
    {    
        // Create a new world
        super(weltW, weltH, 1); 

        prepare();
    }
    
    public void subtractHealth(int num)
    {
        int health = healthbar.updateHealthBar(num);
        if( health <= 0 )
        {
            
            
            Greenfoot.stop();
            removeObjects(getObjects(Survivor.class));
            removeObjects(getObjects(Bullet.class));
            removeObjects(getObjects(Zombie.class));
            removeObjects(getObjects(Fels.class));
            removeObjects(getObjects(HealthBar.class));
            removeObjects(getObjects(Munition.class));
            removeObjects(getObjects(AmmoBar.class));
            removeObjects(getObjects(Footprint.class));
            
            
            
            this.setBackground("game_over.png");
            
        }
    }
    
    public void addHealth(int num)
    {
        healthbar.updateHealthBar(-num);
    }
    
    public void testWelt0()
    {
        for(int w = (weltW-abstand); w > -abstand; w = w - 55) 
        {
            addObject(new Fels(), w, abstand);
            
        }
        for(int h = (weltH-abstand); h > -abstand; h = h - 55) 
        {
            addObject(new Fels(), abstand, h);
            
        }
    }
    
    public void welt1()
    {
        //Welt oben links
        
        //Objekte löschen
        removeObjects(getObjects(Bullet.class)); 
        removeObjects(getObjects(Zombie.class));
        removeObjects(getObjects(Fels.class));
        removeObjects(getObjects(HealthBar.class));
        removeObjects(getObjects(Munition.class));
        removeObjects(getObjects(AmmoBar.class));
        removeObjects(getObjects(Footprint.class));
        //Objekte löschen
        
        
        //HIER OBJEKTE FÜR WELT
        //Fels fels = new Fels();
        //addObject(fels, 120, 100);
        
        for(int w = (weltW-abstand); w > -abstand; w = w - 55) 
        {
            addObject(new Fels(), w, abstand);
            
        }
        for(int h = (weltH-abstand); h > -abstand; h = h - 55) 
        {
            addObject(new Fels(), abstand, h);
            
        }
        //HIER OBJEKTE FÜR WELT
        
        //muss als letztes (Vordergrund)
        healthbar = new HealthBar();
        addObject(healthbar, 40, 40);
        
        ammobar = new AmmoBar();
        addObject(ammobar, 100, 70);
        ammobar.schreibeAmmo();
        //muss als letztes (Vordergrund)

    }

    public void welt2()
    {
        //Welt oben mitte
        
       //Objekte löschen
        removeObjects(getObjects(Bullet.class)); 
        removeObjects(getObjects(Zombie.class));
        removeObjects(getObjects(Fels.class));
        removeObjects(getObjects(HealthBar.class));
        removeObjects(getObjects(Munition.class));
        removeObjects(getObjects(AmmoBar.class));
        removeObjects(getObjects(Footprint.class));
        //Objekte löschen
        
        
        //HIER OBJEKTE FÜR WELT
        //Fels fels = new Fels();
        //addObject(fels, 725, 44);
        
        for(int w = (weltW-abstand); w > -abstand; w = w - 55) 
        {
            addObject(new Fels(), w, abstand);
            
        }
        
        //HIER OBJEKTE FÜR WELT
        
        //muss als letztes (Vordergrund)
        healthbar = new HealthBar();
        addObject(healthbar, 40, 40);
        
        ammobar = new AmmoBar();
        addObject(ammobar, 100, 70);
        ammobar.schreibeAmmo();
        //muss als letztes (Vordergrund)
    }

    public void welt3()
    {
        //Welt oben rechts
        
        //Objekte löschen
        removeObjects(getObjects(Bullet.class)); 
        removeObjects(getObjects(Zombie.class));
        removeObjects(getObjects(Fels.class));
        removeObjects(getObjects(HealthBar.class));
        removeObjects(getObjects(Munition.class));
        removeObjects(getObjects(AmmoBar.class));
        removeObjects(getObjects(Footprint.class));
        //Objekte löschen
        
        
        //HIER OBJEKTE FÜR WELT
        for(int w = (weltW-abstand); w > -abstand; w = w - 55) 
        {
            addObject(new Fels(), w, abstand);
            
        }
        for(int h = (weltH-abstand); h > -abstand; h = h - 55) 
        {
            addObject(new Fels(), weltW-abstand, h);
            
        }
        //HIER OBJEKTE FÜR WELT
        
        //muss als letztes (Vordergrund)
        healthbar = new HealthBar();
        addObject(healthbar, 40, 40);
        
        ammobar = new AmmoBar();
        addObject(ammobar, 100, 70);
        ammobar.schreibeAmmo();
        //muss als letztes (Vordergrund)

    }

    public void welt4()
    {
        //Welt mitte links
        
        //Objekte löschen
        removeObjects(getObjects(Bullet.class)); 
        removeObjects(getObjects(Zombie.class));
        removeObjects(getObjects(Fels.class));
        removeObjects(getObjects(HealthBar.class));
        removeObjects(getObjects(Munition.class));
        removeObjects(getObjects(AmmoBar.class));
        removeObjects(getObjects(Footprint.class));
        //Objekte löschen
        
        
        //HIER OBJEKTE FÜR WELT
        Fels fels = new Fels();
        addObject(fels, 100, 402);
        //HIER OBJEKTE FÜR WELT
        
        //muss als letztes (Vordergrund)
        healthbar = new HealthBar();
        addObject(healthbar, 40, 40);
        
        ammobar = new AmmoBar();
        addObject(ammobar, 100, 70);
        ammobar.schreibeAmmo();
        //muss als letztes (Vordergrund)
    }

    public void welt5()
    {
        //Welt mitte mitte
        
        //Objekte löschen
        removeObjects(getObjects(Bullet.class)); 
        removeObjects(getObjects(Zombie.class));
        removeObjects(getObjects(Fels.class));
        removeObjects(getObjects(HealthBar.class));
        removeObjects(getObjects(Munition.class));
        removeObjects(getObjects(AmmoBar.class));
        removeObjects(getObjects(Footprint.class));
        //Objekte löschen
        
        
        //HIER OBJEKTE FÜR WELT
        Fels fels = new Fels();
        addObject(fels, 842, 409);
        fels.setLocation(721, 294);
        Fels fels2 = new Fels();
        addObject(fels2, 601, 403);
        Fels fels3 = new Fels();
        addObject(fels3, 727, 513);
        Fels fels4 = new Fels();
        addObject(fels4, 921, 411);
        //HIER OBJEKTE FÜR WELT
        
        //muss als letztes (Vordergrund)
        healthbar = new HealthBar();
        addObject(healthbar, 40, 40);
        
        
        ammobar = new AmmoBar();
        addObject(ammobar, 100, 70);
        ammobar.schreibeAmmo();
        //muss als letztes (Vordergrund)

    }

    public void welt6()
    {
        //Welt mitte rechts
        
        //Objekte löschen
        removeObjects(getObjects(Bullet.class)); 
        removeObjects(getObjects(Zombie.class));
        removeObjects(getObjects(Fels.class));
        removeObjects(getObjects(HealthBar.class));
        removeObjects(getObjects(Munition.class));
        removeObjects(getObjects(AmmoBar.class));
        removeObjects(getObjects(Footprint.class));
        //Objekte löschen
        
        
        //HIER OBJEKTE FÜR WELT
        Fels fels = new Fels();
        addObject(fels, 1327, 396);
        //HIER OBJEKTE FÜR WELT
        
        //muss als letztes (Vordergrund)
        healthbar = new HealthBar();
        addObject(healthbar, 40, 40);
        
        ammobar = new AmmoBar();
        addObject(ammobar, 100, 70);
        ammobar.schreibeAmmo();
        //muss als letztes (Vordergrund)
    }

    public void welt7()
    {
        //Welt unten links
        
        //Objekte löschen
        removeObjects(getObjects(Bullet.class)); 
        removeObjects(getObjects(Zombie.class));
        removeObjects(getObjects(Fels.class));
        removeObjects(getObjects(HealthBar.class));
        removeObjects(getObjects(Munition.class));
        removeObjects(getObjects(AmmoBar.class));
        removeObjects(getObjects(Footprint.class));
        //Objekte löschen
        
        
        //HIER OBJEKTE FÜR WELT
        for(int w = (weltW-abstand); w > -abstand; w = w - 55) 
        {
            addObject(new Fels(), w, weltH-abstand);
            
        }
        for(int h = (weltH-abstand); h > -abstand; h = h - 55) 
        {
            addObject(new Fels(), abstand, h);
            
        }
        //HIER OBJEKTE FÜR WELT
        
        //muss als letztes (Vordergrund)
        healthbar = new HealthBar();
        addObject(healthbar, 40, 40);
        
        ammobar = new AmmoBar();
        addObject(ammobar, 100, 70);
        ammobar.schreibeAmmo();
        //muss als letztes (Vordergrund)
    }

    public void welt8()
    {
        //Welt unten mitte
        
        //Objekte löschen
        removeObjects(getObjects(Bullet.class)); 
        removeObjects(getObjects(Zombie.class));
        removeObjects(getObjects(Fels.class));
        removeObjects(getObjects(HealthBar.class));
        removeObjects(getObjects(Munition.class));
        removeObjects(getObjects(AmmoBar.class));
        removeObjects(getObjects(Footprint.class));
        //Objekte löschen
        
        
        //HIER OBJEKTE FÜR WELT
        Fels fels2 = new Fels();
        addObject(fels2, 709, 729);
        //HIER OBJEKTE FÜR WELT
        
        //muss als letztes (Vordergrund)
        healthbar = new HealthBar();
        addObject(healthbar, 40, 40);
        
        ammobar = new AmmoBar();
        addObject(ammobar, 100, 70);
        ammobar.schreibeAmmo();
        //muss als letztes (Vordergrund)
    }

    public void welt9()
    {
        //Welt unten rechts
        
        //Objekte löschen
        removeObjects(getObjects(Bullet.class)); 
        removeObjects(getObjects(Zombie.class));
        removeObjects(getObjects(Fels.class));
        removeObjects(getObjects(HealthBar.class));
        removeObjects(getObjects(Munition.class));
        removeObjects(getObjects(AmmoBar.class));
        removeObjects(getObjects(Footprint.class));
        //Objekte löschen
        
        
        //HIER OBJEKTE FÜR WELT
        for(int w = (weltW-abstand); w > -abstand; w = w - 55) 
        {
            addObject(new Fels(), w, weltH-abstand);
            
        }
        for(int h = (weltH-abstand); h > -abstand; h = h - 55) 
        {
            addObject(new Fels(), weltW-abstand, h);
            
        }
        //HIER OBJEKTE FÜR WELT
        
        //muss als letztes (Vordergrund)
        healthbar = new HealthBar();
        addObject(healthbar, 40, 40);
        
        ammobar = new AmmoBar();
        addObject(ammobar, 100, 70);
        ammobar.schreibeAmmo();
        //muss als letztes (Vordergrund)
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        Survivor survivor = new Survivor();
        addObject(survivor, (weltW/2), (weltH/2));

        healthbar = new HealthBar();
        addObject(healthbar, 40, 40);

        ammobar = new AmmoBar();
        addObject(ammobar, 100, 70);
        ammobar.schreibeAmmo();

        info = new Info();
        addObject(info, 300, 200);
        info.schreibeInfo();
        
        setPaintOrder(Survivor.class, Zombie.class, Bullet.class);
    }
    
    public void updateAmmo(int a, int b)
    {
        ammobar.setAmmo(a);
        ammobar.setBullets(b);
        ammobar.schreibeAmmo();
    }
  
}
