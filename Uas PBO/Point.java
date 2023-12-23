import greenfoot.*;
import java.awt.*; //import color dari java
import greenfoot.Color; //import color ke greenfoot

public class Point extends Actor{
    int poin = 0;
    public Point(){
        setImage(new GreenfootImage("Score : " + poin, 30, Color.RED, Color.LIGHT_GRAY));
    }
    
    public void act()
    {
        setImage(new GreenfootImage("Score : " + poin, 30, Color.RED, Color.LIGHT_GRAY));
        menang();
    }
    
    public void tambahNilai(){
        poin++;
    }
    
    public void menang(){
        if(poin >= 20 || poin == 21){
            getWorld().addObject(new Winner(), 300, 300);
            Greenfoot.playSound("winner.wav");
            Greenfoot.stop();
        }
    }
}
