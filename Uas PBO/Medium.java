import greenfoot.*;
//musuh Medium bernilai 2 poin dan 2x hit
public class Medium extends Enemy{
    int duaHit = 2;
    
    public Medium(){
        setRotation(90);
    }
    
    public void act(){
        movementMusuhSedang();
        hit();
    }
    
    public void hit(){
        //menambahkan objek musuhMedium, jika musuhMedium tidak sama dengan null (Hit 2x),
        //maka musuhMedium menghilang (Jika tertembak 2x = Hilang)
        Actor musuhMedium = getOneIntersectingObject(Fire.class);
        if(musuhMedium != null){
            getWorld().removeObject(musuhMedium);
            hasil();
            duaHit--;
        }
        //hit 2x
        if(duaHit == 0){
            getWorld().removeObject(this);
        }
        else{
            musuhHilangMedium();
        }
    }
}
