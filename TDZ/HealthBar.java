import greenfoot.*;
import java.awt.Color;  // Need to for fill color of health bar

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    private int health = 100;  // Say, they start with 100 health
    
    public HealthBar()
    {
    }
    
    protected void addedToWorld(World w)
    {
        updateHealthBar(0);        
    }
    
    public int updateHealthBar(int healthChange)
    {
        health = health - healthChange;  // Note: you can add health by passing in a negative change
        if( health <= 0 )
        {
            return 0;  // Let's caller know we died
        } else if( health > 100 )
        {
            health = 100;  // can't have more than the max health
        }
        
        // Redraw health bar to match current health
        GreenfootImage hb = new GreenfootImage(health, 20);
        hb.setColor(Color.RED);
        hb.fill();
        setImage(hb);
        setLocation(getImage().getWidth()/2 + 40, getY());
        
        return health;
    }
}
