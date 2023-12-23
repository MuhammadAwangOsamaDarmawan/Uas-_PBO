import greenfoot.*;
import java.awt.*; //import color dari java
import greenfoot.Color; //import color ke greenfoot

public class Health extends Actor{
    int darah = 20;
    int darahbarLebar = 80;
    int darahbarTinggi = 10;
    int pixelsPerDarahPoin = (int) darahbarLebar/darah;
    
    public Health(){
        blood();
    }
    
    public void act()
    {
        blood();
    }
    
    public void blood(){
        setImage(new GreenfootImage(darahbarLebar + 2, darahbarTinggi + 2));
        getImage().setColor(Color.BLACK);
        getImage().drawRect(0, 0, darahbarLebar + 1, darahbarTinggi + 1);
        getImage().setColor(Color.RED);
        getImage().fillRect(1, 1, darah*pixelsPerDarahPoin, darahbarLebar);
    }
    
    public void loseBlood(){
        darah--;
        kalah();
    }
    
    public void kalah(){
        if(darah == 0){
            getWorld().addObject(new GameOver(), 300, 300);
            Greenfoot.playSound("gameover1.mp3");
            Greenfoot.stop();
        }
    }
}
