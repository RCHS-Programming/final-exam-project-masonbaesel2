import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(560, 560, 1); 
        showText( "Score: 0", 50,500);
        addStrawberry();
        
        addObject (new Rock(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
        addObject (new Rock(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
        addObject (new Rock(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
        addObject (new Rock(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
        addObject (new Car(), 280, 500);
        
    }
    public void addStrawberry()
    {
        addObject (new Strawberry(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
        addObject (new Strawberry(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
        addObject (new Strawberry(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
        addObject (new Strawberry(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
        addObject (new Strawberry(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
        addObject (new Strawberry(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
        addObject (new Strawberry(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
        addObject (new Strawberry(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
        addObject (new Strawberry(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
        addObject (new Strawberry(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
        addObject (new Rock(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(400));
    }
   
}
