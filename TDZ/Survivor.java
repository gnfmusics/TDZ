import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Survivor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Survivor extends Actor
{
    public int speed = 10;
    public int mouseX, mouseY;
    public int frame = 1;
    public int animationCounter = 0;
    public int survivorRotation;
    public int coolRange = 100;
    public int neuX;
    public int neuY;
    public int ammo = 0;
    public int bullets = 0;
    public int aktuelleWelt = 5;
    public boolean fire = false;
    
    
    
    public static int survivorX, survivorY;
    
    int collisionCountdown = 0;
    
    
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
        footprint();
        reload();
        
        
        survivorX = getX();
        survivorY = getY();
        survivorRotation = getRotation();
        
        animationCounter += 1;
        

        
        if( collisionCountdown > 0 )
        {
            collisionCountdown--;
        }
        else
        {
            handleCollisions();
        }
       
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
                if (bullets > 0)
                {
                    if(Greenfoot.mousePressed(null) == true)
                    {
                        fire = true;
                    }else if((Greenfoot.mouseClicked(null) == true))
                    {
                        fire = false;
                    }
                    if (fire == true)
                    {
                        getWorld().addObject(new Bullet(survivorRotation), getX(), getY());
                        bullets = bullets - 1;
                        ((Welten) getWorld()).updateAmmo(ammo, bullets);
                    }
                } else {
                    //leer-sound abspielen
                }
                
            }
        }
    }
    
    public void weltWechseln()
    {
        switch (aktuelleWelt)
        {
            case 1:
                //code hier
                
                if (getY() > (getWorld().getHeight() - 40)) //UNTEN
                {
                    neuX = survivorX;
                    neuY = 50;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt4();
                    aktuelleWelt = 4;
                } else if (getX() > (getWorld().getWidth() - 40)) //RECHTS
                {
                    neuX = 50;
                    neuY = survivorY;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt2();
                    aktuelleWelt = 2;
                }
                
                break;
            case 2:
                //code hier
                
                if (getY() > (getWorld().getHeight() - 40)) //UNTEN
                {
                    neuX = survivorX;
                    neuY = 50;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt5();
                    aktuelleWelt = 5;
                } else if (getX() < 40) //LINKS
                {
                    neuX = getWorld().getWidth() - 50;
                    neuY = survivorY;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt1();
                    aktuelleWelt = 1;
                } else if (getX() > (getWorld().getWidth() - 40)) //RECHTS
                {
                    neuX = 50;
                    neuY = survivorY;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt3();
                    aktuelleWelt = 3;
                }
                
                break;
            case 3:
                //code hier
                
                if (getY() > (getWorld().getHeight() - 40)) //UNTEN
                {
                    neuX = survivorX;
                    neuY = 50;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt6();
                    aktuelleWelt = 6;
                } else if (getX() < 40) //LINKS
                {
                    neuX = getWorld().getWidth() - 50;
                    neuY = survivorY;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt2();
                    aktuelleWelt = 2;
                }
                
                break;
            case 4:
                //code hier
                if(getY() < 40 ) //OBEN
                {
                    neuX = survivorX;
                    neuY = getWorld().getHeight() - 50;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt1();
                    aktuelleWelt = 1;
                } else if (getY() > (getWorld().getHeight() - 40)) //UNTEN
                {
                    neuX = survivorX;
                    neuY = 50;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt7();
                    aktuelleWelt = 7;
                } else if (getX() > (getWorld().getWidth() - 40)) //RECHTS
                {
                    neuX = 50;
                    neuY = survivorY;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt5();
                    aktuelleWelt = 5;
                }
                
                break;
            case 5:
                //code hier
                if(getY() < 40 ) //OBEN
                {
                    neuX = survivorX;
                    neuY = getWorld().getHeight() - 50;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt2();
                    aktuelleWelt = 2;
                } else if (getY() > (getWorld().getHeight() - 40)) //UNTEN
                {
                    neuX = survivorX;
                    neuY = 50;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt8();
                    aktuelleWelt = 8;
                } else if (getX() < 40) //LINKS
                {
                    neuX = getWorld().getWidth() - 50;
                    neuY = survivorY;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt4();
                    aktuelleWelt = 4;
                } else if (getX() > (getWorld().getWidth() - 40)) //RECHTS
                {
                    neuX = 50;
                    neuY = survivorY;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt6();
                    aktuelleWelt = 6;
                }
                
                
                
                break;
            case 6:
                //code hier
                
                if(getY() < 40 ) //OBEN
                {
                    neuX = survivorX;
                    neuY = getWorld().getHeight() - 50;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt3();
                    aktuelleWelt = 3;
                } else if (getY() > (getWorld().getHeight() - 40)) //UNTEN
                {
                    neuX = survivorX;
                    neuY = 50;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt9();
                    aktuelleWelt = 9;
                } else if (getX() < 40) //LINKS
                {
                    neuX = getWorld().getWidth() - 50;
                    neuY = survivorY;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt5();
                    aktuelleWelt = 5;
                }
                
                break;
            case 7:
                //code hier
                
                if(getY() < 40 ) //OBEN
                {
                    neuX = survivorX;
                    neuY = getWorld().getHeight() - 50;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt4();
                    aktuelleWelt = 4;
                } else if (getX() > (getWorld().getWidth() - 40)) //RECHTS
                {
                    neuX = 50;
                    neuY = survivorY;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt8();
                    aktuelleWelt = 8;
                }
                
                break;
            case 8:
                //code hier
                
                if(getY() < 40 ) //OBEN
                {
                    neuX = survivorX;
                    neuY = getWorld().getHeight() - 50;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt5();
                    aktuelleWelt = 5;
                } else if (getX() < 40) //LINKS
                {
                    neuX = getWorld().getWidth() - 50;
                    neuY = survivorY;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt7();
                    aktuelleWelt = 7;
                } else if (getX() > (getWorld().getWidth() - 40)) //RECHTS
                {
                    neuX = 50;
                    neuY = survivorY;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt9();
                    aktuelleWelt = 9;
                }
                
                break;
            case 9:
                //code hier
                
                if(getY() < 40 ) //OBEN
                {
                    neuX = survivorX;
                    neuY = getWorld().getHeight() - 50;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt6();
                    aktuelleWelt = 6;
                } else if (getX() < 40) //LINKS
                {
                    neuX = getWorld().getWidth() - 50;
                    neuY = survivorY;
                    setLocation(neuX, neuY);
                    ((Welten) getWorld()).welt8();
                    aktuelleWelt = 8;
                }
                
                break;
            default:
                //nur ausgeführt wenn es probleme mit aktuelleWelt gibt
                System.out.println("PROBLEM MIT aktuelleWelt");
        }
        
        
        
        /* test Code zum oben rauslaufen
        if(getY() < 40 )
        {
            neuX = survivorX;
            neuY = getWorld().getHeight() - 50;
            setLocation(neuX, neuY);
            ((Welten) getWorld()).welt2();
        }
        */
    }
    
    private void handleCollisions()
    {
        Actor enemy = getOneIntersectingObject(Zombie.class);
        if(getWorld() != null && enemy != null )
        {
            Welten w = (Welten) getWorld();
            w.subtractHealth(10);
            collisionCountdown = 20;
        }
        Actor mun = getOneIntersectingObject(Munition.class);
        if (getWorld() != null && mun != null)
        {
            ammo = ammo + 1;
            getWorld().removeObject(mun);
            ((Welten) getWorld()).updateAmmo(ammo, bullets);
        }
       
    }
    
    public void footprint()
    {
        if (animationCounter % 6 == 0) 
        {
            getWorld().addObject(new Footprint(survivorRotation), getX(), getY());
        }
    }
    
    public void reload()
    {
        if(Greenfoot.isKeyDown("R") && ammo > 0 && bullets < 10)
        {
            ammo = ammo - 1;
            bullets = 10;
            ((Welten) getWorld()).updateAmmo(ammo, bullets);
            getWorld().addObject(new LeeresMagazin(survivorRotation), getX(), getY());
        }
    }
    
    public void setSpeed(int i)
    {
        speed = i;
    }
}
