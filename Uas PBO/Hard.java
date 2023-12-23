import greenfoot.*;
//musuh Medium bernilai 3 poin dan 3x hit
public class Hard extends Enemy{
    int tigaHit = 3;
    
    public Hard(){
        setRotation(90);
    }
    
    public void act(){
        movementMusuhSusah();
        hit();
    }
    
    public void hit(){
        //menambahkan objek musuhHard, jika musuhMedium tidak sama dengan null (Hit 2x),
        //maka musuhHard menghilang (Jika tertembak 2x = Hilang)
        Actor musuhHard = getOneIntersectingObject(Fire.class);
        if(musuhHard != null){
            getWorld().removeObject(musuhHard);
            hasil();            
            tigaHit--;
        }
        //hit 3x
        if(tigaHit == 0){
            getWorld().removeObject(this);
        }
        else{
            musuhHilangHard();
        }
    }
}
