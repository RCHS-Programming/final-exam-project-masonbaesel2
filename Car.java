import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private int StrawberryEaten;
    private int speed;
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
        lookForStrawberry();
        checkCollision();
    }    
    public void move()
    {
        move(5);
        lookForStrawberry();
    }
     public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn (-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn (4);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            move (4);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move (-4);
        }
    }
    public void lookForStrawberry()
    {
        if (isTouching (Strawberry.class))
        {
            removeTouching(Strawberry.class);
            
            StrawberryEaten += 1;
            
            getWorld().showText("Score: " + StrawberryEaten, 50, 500);
            if (StrawberryEaten == 10)
            {
            Greenfoot.stop();
            }
        }
    }
    public void checkCollision()
    {
        if(isTouching(Rock.class))
        {
            setLocation(370, 510);
        }
    }
}
