import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    public int speed = 10;
    
    public Bullet(int rotation)
    {
        setRotation(rotation);
    }
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(speed);
        remove();
    }
    
    public void remove()
    {
        if(getX() >= getWorld().getWidth() -1)
        {
            getWorld().removeObject(this);
        }
        else if(getX() < 1)
        {
            getWorld().removeObject(this);
        }
        else if(getY() >= getWorld().getHeight() -1)
        {
            getWorld().removeObject(this);
        }
        else if(getY() < 1)
        {
            getWorld().removeObject(this);
        } 
        else if(getOneIntersectingObject(Fels.class) != null)
        {
            getWorld().removeObject(this);
        }
    }
}
