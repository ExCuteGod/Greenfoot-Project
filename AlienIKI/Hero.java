import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the MC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        move(5);
        if(isAtEdge()){
            setLocation(0,getY());
        }
        if(Greenfoot.isKeyDown("up")){
            Laser laser = new Laser();
            getWorld().addObject(laser,getX(),getY());
            laser.turnTowards(getX(),getY());
        }
        }
    }
