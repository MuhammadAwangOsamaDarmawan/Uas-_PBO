import greenfoot.*;
//musuh Easy bernilai 1 poin dan hanya 1 hit
public class Easy extends Enemy{
    public Easy(){
        setRotation(90);
    }
    
    public void act(){
        movementMusuhMudah();
        hitEasy();
    }
    
    public void hitEasy(){
        //menambahkan objek musuhEasy, jika musuhEasy tidak sama dengan null,
        //maka musuhEasy menghilang (Jika tertembak = Hilang)
        Actor musuhEasy = getOneIntersectingObject(Fire.class);
        if(musuhEasy != null){
            getWorld().removeObject(musuhEasy);
            hasil();
            getWorld().removeObject(this);
        }
        //jika musuhEasy tidak tertembak sama dengan null,
        //maka akan menjalankan perintah musuhHilang
        else{
            musuhHilangEasy();
        }
    }
}
