import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class AmmoBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AmmoBar extends Actor
{
    public static int ammo = 0;
    public static int bullets = 0;
    /**
     * Act - do whatever the AmmoBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    }    
    
    public void setAmmo(int a)
    {
        ammo = a;
    }
    
    public void setBullets(int b)
    {
        bullets = b;
    }
    
    public void schreibeAmmo()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.setColor(Color.RED);
        image.drawString("Mags: " + ammo + " Bullets: " + bullets, 10, 10);
    }
}
