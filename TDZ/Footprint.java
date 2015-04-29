import greenfoot.*;

/**
 * Write a description of class Footprint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Footprint extends Actor
{
    int animationcounter = 0;

    /**
     * Act - do whatever the Footprint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Footprint(int rotation)
    {
        setRotation(rotation);
    }
    /**
     * Act Methode, wird kontinuierlich aufgerufen. Bei jedem Aufruf wird ein Counter hochgezaehlt,
     * ueber den bestimmt wird, wann der Fussabdruck wieder entfernt wird.
     * Um einen zeitlichen Abstand zu erhalten, wird ein Modulo auf den Counter verwendet. Ergibt 
     * dieser 0, wird das entsprechende Objekt aus der Welt geloescht.
     */
    public void act() 
    {
        this.animationcounter++;
        if (this.animationcounter % 360 == 0){
            getWorld().removeObject(this);
        }
        if (this.animationcounter >= 100000){
            this.animationcounter = 0;
        }
    }    
}
