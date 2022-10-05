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
    
    public void act(){
        moveHero();
        shoot();
    }
    public void moveHero()
    {
        if(Greenfoot.isKeyDown("d")||Greenfoot.isKeyDown("right")){
            move(5);
        }
        if(Greenfoot.isKeyDown("a")||Greenfoot.isKeyDown("left")){
            move(-5);
        }
        if(Greenfoot.isKeyDown("w")||Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("s")||Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+5);
        }
    }
    public void shoot(){
        if(Greenfoot.getMouseInfo() != null){
                if(Greenfoot.mousePressed(null) == true){
                    getWorld().addObject(new Laser(),getX(),getY());
                }
        }
    }  
}
    /*public void shoot()
    {
        if(Greenfoot.mouseClicked(getWorld())){
            Laser laser = new Laser();
            getWorld().addObject(laser,getX(),getY());
        }
    }
    */    
    
