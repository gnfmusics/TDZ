import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Survivor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Survivor extends Actor
{
    public int speed = 3;
    public int mouseX, mouseY;
    public int frame = 1;
    public int animationCounter = 0;
    public int survivorRotation;
    public int coolRange = 100;
    public int neuX;
    public int neuY;
    
    public static int survivorX, survivorY;
    
    
    GreenfootImage sur1 = new GreenfootImage("sur1.png");
    GreenfootImage sur2 = new GreenfootImage("sur2.png");
    GreenfootImage sur3 = new GreenfootImage("sur3.png");
    GreenfootImage sur4 = new GreenfootImage("sur4.png");
    GreenfootImage sur5 = new GreenfootImage("sur5.png");
    GreenfootImage sur6 = new GreenfootImage("sur6.png");
    GreenfootImage sur7 = new GreenfootImage("sur7.png");
    GreenfootImage sur8 = new GreenfootImage("sur8.png");
    GreenfootImage sur9 = new GreenfootImage("sur9.png");
    GreenfootImage sur10 = new GreenfootImage("sur10.png");
    
    
    
    
    /**
     * Act - do whatever the Survivor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
        move();
        mouse();
        shoot();
        weltWechseln();
        
        
        survivorX = getX();
        survivorY = getY();
        survivorRotation = getRotation();
        
        animationCounter += 1;
       
    }    
    
    public void move()
    {
        if(Greenfoot.isKeyDown("W"))
        {
            move(speed);
            
            if(animationCounter % 6 == 0)
            {
                animate();
            }
            
            if(animationCounter >= 1000)
            {
                animationCounter = 1;
            }
        }
        if (getOneIntersectingObject(Fels.class) != null)
        {
            setLocation(survivorX, survivorY);
        }
    }
    
    public void animate()
    {
        if(frame == 1)
        {
            setImage(sur1);
            frame = 2;
        }
        else if(frame == 2)
        {
            setImage(sur2);
            frame = 3;
            
        }
        else if(frame == 3)
        {
            setImage(sur3);
            frame = 4;
            
        }
        else if(frame == 4)
        {
            setImage(sur4);
            frame = 5;
            
        }
        else if(frame == 5)
        {
            setImage(sur5);
            frame = 6;
            
        }
        else if(frame == 6)
        {
            setImage(sur6);
            frame = 7;
            
        }
        else if(frame == 7)
        {
            setImage(sur7);
            frame = 8;
            
        }
        else if(frame == 8)
        {
            setImage(sur8);
            frame = 9;
            
        }
        else if(frame == 9)
        {
            setImage(sur9);
            frame = 10;
            
        }
        else if(frame == 10)
        {
            setImage(sur10);
            frame = 1;
            
        }
        
       
       
      
    }
    
    public void mouse()
    {
        if(Greenfoot.getMouseInfo() != null)
        {
            
            mouseX = Greenfoot.getMouseInfo().getX();
            mouseY = Greenfoot.getMouseInfo().getY();
        
            turnTowards(mouseX, mouseY);
        }
        
    }
    
    public void shoot()
    {
        if(Greenfoot.getMouseInfo() != null)
        {
            if(Greenfoot.getMouseInfo().getButton() == 1 && getObjectsInRange(coolRange, Bullet.class).isEmpty())
            {
                getWorld().addObject(new Bullet(survivorRotation), getX(), getY());
                
            }
        }
    }
    
    public void weltWechseln()
    {
        if(getY() < 40 )
        {
            neuX = survivorX;
            neuY = getWorld().getHeight() - 50;
            setLocation(neuX, neuY);
            ((Welten) getWorld()).welt2();
        }
    }
}
