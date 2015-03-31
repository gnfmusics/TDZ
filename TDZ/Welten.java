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
    
    /**
     * Größe des Bildschirms * 0.75.
     * Welten werden in 500*500 designt und dann hochskaliert.
     * Aber wie?
     * 
     * Barsaumo:    Verrechnung der Koordinaten mit dem Skalierungsfaktor:
     *              500x500 -> 1000x1000 = Faktor 2
     *              -> Urpsrungskoordinate mit Faktor 2 multiplizieren
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

    public void welt1(int a, int b)
    {
        //Welt oben links
        
        Fels fels = new Fels();
        addObject(fels, 30, 30);
        Fels fels2 = new Fels();
        addObject(fels2, 90, 30);
        Fels fels3 = new Fels();
        addObject(fels3, 150, 30);
        Fels fels4 = new Fels();
        addObject(fels4, 210, 30);
        Fels fels5 = new Fels();
        addObject(fels5, 270, 30);
        Fels fels6 = new Fels();
        addObject(fels6, 330, 30);
        Fels fels7 = new Fels();
        addObject(fels7, 390, 30);
        Fels fels8 = new Fels();
        addObject(fels8, 450, 30);
        Fels fels9 = new Fels();
        addObject(fels9, 510, 30);
        Fels fels10 = new Fels();
        addObject(fels10, 570, 30);
        Fels fels11 = new Fels();
        addObject(fels11, 30, 90);
        Fels fels12 = new Fels();
        addObject(fels12, 30, 150);
        Fels fels13 = new Fels();
        addObject(fels13, 30, 210);
        Fels fels14 = new Fels();
        addObject(fels14, 30, 270);
        Fels fels15 = new Fels();
        addObject(fels15, 30, 330);
        Fels fels16 = new Fels();
        addObject(fels16, 30, 390);
        Fels fels17 = new Fels();
        addObject(fels17, 30, 450);
        Fels fels18 = new Fels();
        addObject(fels18, 30, 510);
        Fels fels19 = new Fels();
        addObject(fels19, 30, 570);

    }

    public void welt2()
    {
        //Welt oben mitte
        removeObjects(getObjects(Fels.class));
        removeObjects(getObjects(Zombie.class));
        
        
        
        Fels fels = new Fels();
        addObject(fels, 30, 30);
        Fels fels2 = new Fels();
        addObject(fels2, 90, 30);
        Fels fels3 = new Fels();
        addObject(fels3, 150, 30);
        Fels fels4 = new Fels();
        addObject(fels4, 210, 30);
        Fels fels5 = new Fels();
        addObject(fels5, 270, 30);
        Fels fels6 = new Fels();
        addObject(fels6, 330, 30);
        Fels fels7 = new Fels();
        addObject(fels7, 390, 30);
        Fels fels8 = new Fels();
        addObject(fels8, 450, 30);
        Fels fels9 = new Fels();
        addObject(fels9, 510, 30);
        Fels fels10 = new Fels();
        addObject(fels10, 570, 30);
    }

    public void welt3(int a, int b)
    {
        //Welt oben rechts
        Fels fels = new Fels();
        addObject(fels, 30, 30);
        Fels fels2 = new Fels();
        addObject(fels2, 90, 30);
        Fels fels3 = new Fels();
        addObject(fels3, 150, 30);
        Fels fels4 = new Fels();
        addObject(fels4, 210, 30);
        Fels fels5 = new Fels();
        addObject(fels5, 270, 30);
        Fels fels6 = new Fels();
        addObject(fels6, 330, 30);
        Fels fels7 = new Fels();
        addObject(fels7, 390, 30);
        Fels fels8 = new Fels();
        addObject(fels8, 450, 30);
        Fels fels9 = new Fels();
        addObject(fels9, 510, 30);
        Fels fels10 = new Fels();
        addObject(fels10, 570, 30);
        Fels fels11 = new Fels();
        addObject(fels11, 570, 90);
        Fels fels12 = new Fels();
        addObject(fels12, 570, 150);
        Fels fels13 = new Fels();
        addObject(fels13, 570, 210);
        Fels fels14 = new Fels();
        addObject(fels14, 570, 270);
        Fels fels15 = new Fels();
        addObject(fels15, 570, 330);
        Fels fels16 = new Fels();
        addObject(fels16, 570, 390);
        Fels fels17 = new Fels();
        addObject(fels17, 570, 450);
        Fels fels18 = new Fels();
        addObject(fels18, 570, 510);
        Fels fels19 = new Fels();
        addObject(fels19, 570, 570);

    }

    public void welt4(int a, int b)
    {
        //Welt mitte links
        Fels fels = new Fels();
        addObject(fels, 30, 570);
        Fels fels10 = new Fels();
        addObject(fels10, 30, 30);
        Fels fels11 = new Fels();
        addObject(fels11, 30, 90);
        Fels fels12 = new Fels();
        addObject(fels12, 30, 150);
        Fels fels13 = new Fels();
        addObject(fels13, 30, 210);
        Fels fels14 = new Fels();
        addObject(fels14, 30, 270);
        Fels fels15 = new Fels();
        addObject(fels15, 30, 330);
        Fels fels16 = new Fels();
        addObject(fels16, 30, 390);
        Fels fels17 = new Fels();
        addObject(fels17, 30, 450);
        Fels fels18 = new Fels();
        addObject(fels18, 30, 510);
    }

    public void welt5(int a, int b)
    {
        //Welt mitte mitte

    }

    public void welt6(int a, int b)
    {
        //Welt mitte rechts
        Fels fels = new Fels();
        addObject(fels, 570, 570);
        Fels fels10 = new Fels();
        addObject(fels10, 570, 30);
        Fels fels11 = new Fels();
        addObject(fels11, 570, 90);
        Fels fels12 = new Fels();
        addObject(fels12, 570, 150);
        Fels fels13 = new Fels();
        addObject(fels13, 570, 210);
        Fels fels14 = new Fels();
        addObject(fels14, 570, 270);
        Fels fels15 = new Fels();
        addObject(fels15, 570, 330);
        Fels fels16 = new Fels();
        addObject(fels16, 570, 390);
        Fels fels17 = new Fels();
        addObject(fels17, 570, 450);
        Fels fels18 = new Fels();
        addObject(fels18, 570, 510);
    }

    public void welt7(int a, int b)
    {
        //Welt unten links
        Fels fels = new Fels();
        addObject(fels, 30, 570);
        Fels fels2 = new Fels();
        addObject(fels2, 90, 570);
        Fels fels3 = new Fels();
        addObject(fels3, 150, 570);
        Fels fels4 = new Fels();
        addObject(fels4, 210, 570);
        Fels fels5 = new Fels();
        addObject(fels5, 270, 570);
        Fels fels6 = new Fels();
        addObject(fels6, 330, 570);
        Fels fels7 = new Fels();
        addObject(fels7, 390, 570);
        Fels fels8 = new Fels();
        addObject(fels8, 450, 570);
        Fels fels9 = new Fels();
        addObject(fels9, 510, 570);
        Fels fels10 = new Fels();
        addObject(fels10, 30, 30);
        Fels fels11 = new Fels();
        addObject(fels11, 30, 90);
        Fels fels12 = new Fels();
        addObject(fels12, 30, 150);
        Fels fels13 = new Fels();
        addObject(fels13, 30, 210);
        Fels fels14 = new Fels();
        addObject(fels14, 30, 270);
        Fels fels15 = new Fels();
        addObject(fels15, 30, 330);
        Fels fels16 = new Fels();
        addObject(fels16, 30, 390);
        Fels fels17 = new Fels();
        addObject(fels17, 30, 450);
        Fels fels18 = new Fels();
        addObject(fels18, 30, 510);
        Fels fels19 = new Fels();
        addObject(fels19, 570, 570);
    }

    public void welt8(int a, int b)
    {
        //Welt unten mitte
        Fels fels = new Fels();
        addObject(fels, 30, 570);
        Fels fels2 = new Fels();
        addObject(fels2, 90, 570);
        Fels fels3 = new Fels();
        addObject(fels3, 150, 570);
        Fels fels4 = new Fels();
        addObject(fels4, 210, 570);
        Fels fels5 = new Fels();
        addObject(fels5, 270, 570);
        Fels fels6 = new Fels();
        addObject(fels6, 330, 570);
        Fels fels7 = new Fels();
        addObject(fels7, 390, 570);
        Fels fels8 = new Fels();
        addObject(fels8, 450, 570);
        Fels fels9 = new Fels();
        addObject(fels9, 510, 570);
        Fels fels10 = new Fels();
        addObject(fels10, 570, 570);
    }

    public void welt9(int a, int b)
    {
        //Welt unten rechts
        Fels fels = new Fels();
        addObject(fels, 30, 570);
        Fels fels2 = new Fels();
        addObject(fels2, 90, 570);
        Fels fels3 = new Fels();
        addObject(fels3, 150, 570);
        Fels fels4 = new Fels();
        addObject(fels4, 210, 570);
        Fels fels5 = new Fels();
        addObject(fels5, 270, 570);
        Fels fels6 = new Fels();
        addObject(fels6, 330, 570);
        Fels fels7 = new Fels();
        addObject(fels7, 390, 570);
        Fels fels8 = new Fels();
        addObject(fels8, 450, 570);
        Fels fels9 = new Fels();
        addObject(fels9, 510, 570);
        Fels fels10 = new Fels();
        addObject(fels10, 570, 30);
        Fels fels11 = new Fels();
        addObject(fels11, 570, 90);
        Fels fels12 = new Fels();
        addObject(fels12, 570, 150);
        Fels fels13 = new Fels();
        addObject(fels13, 570, 210);
        Fels fels14 = new Fels();
        addObject(fels14, 570, 270);
        Fels fels15 = new Fels();
        addObject(fels15, 570, 330);
        Fels fels16 = new Fels();
        addObject(fels16, 570, 390);
        Fels fels17 = new Fels();
        addObject(fels17, 570, 450);
        Fels fels18 = new Fels();
        addObject(fels18, 570, 510);
        Fels fels19 = new Fels();
        addObject(fels19, 570, 570);
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        Survivor survivor = new Survivor();
        addObject(survivor, (weltW/2), (weltH/2));
    }
}
