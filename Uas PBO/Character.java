import greenfoot.*;

public class Character extends Actor{
    boolean peluru = true;
    public Character(){
        setRotation(270);//rotasi kapal
    }
    
    public void act(){
        movement();
        shoot();
    }
    
    public void movement(){
        //gerak kanan-kiri dan sensitivitas
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + 7, getY());
        }
        
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - 7, getY());
        }
    }
    
    public void shoot(){
        //tembakan
        if(Greenfoot.isKeyDown("space") && peluru == true){
            getWorld().addObject(new Fire(), getX(), getY() - 30);
            peluru = false;
        }else if (!Greenfoot.isKeyDown("space")){
            peluru = true;
        }
    }
}
