import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Actor
{
    
    public int speed = 1;
    public int leben = 2; //wie oft getroffen werden muss
    public int coolRange = 50;
    public boolean lebenAbziehen = true;
    
    
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        chaseSurvivor();
        die();
    }
    
    public void chaseSurvivor()
    {
        turnTowards(Survivor.survivorX, Survivor.survivorY);
        move(speed);
    }
    
    public void die()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        
        if(bullet != null )
        {
            if (leben <= 1)
            {
                getWorld().removeObject(bullet);
                getWorld().removeObject(this); //
                lebenAbziehen = true;
            } else {
                getWorld().removeObject(bullet);
                leben = leben - 1;
            }
        }
    }
}
