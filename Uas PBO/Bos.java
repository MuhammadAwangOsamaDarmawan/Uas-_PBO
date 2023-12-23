import greenfoot.*;

public class Bos extends Enemy{
    int headshot = 5;
    
    public Bos(){
        setRotation(90);
    }
    
    public void act(){
        movementBos();
        hit();
    }
    
    public void hit(){
        //menambahkan objek musuhHard, jika musuhMedium tidak sama dengan null (Hit 2x),
        //maka musuhHard menghilang (Jika tertembak 2x = Hilang)
        Actor musuhBos = getOneIntersectingObject(Fire.class);
        if(musuhBos != null){
            getWorld().removeObject(musuhBos);
            hasil();
            headshot--;
        }
        //hit 5x
        if(headshot == 0){
            getWorld().removeObject(this);
        }
        else{
            bosHilang();
        }
    }
}
