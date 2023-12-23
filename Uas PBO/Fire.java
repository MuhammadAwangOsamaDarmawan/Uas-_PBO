import greenfoot.*;

public class Fire extends Actor{
    public void act(){
        moveShoot();
        disappear();
    }
    
    public void moveShoot(){
        //arah tembak
        setLocation(getX(), getY() - 5);
    }
    
    public void disappear(){
        //peluru hilang jika melewati batas
        if(getY() == 0 ){
            getWorld().removeObject(this);
        }
    }
}
