import greenfoot.*;

public class Enemy extends Actor{
    public void act(){
        
    }
    
    public void movementMusuhMudah(){
        //kecepatan musuh + 2
        setLocation(getX(), getY() + 2);
    }
    
    public void movementMusuhSedang(){
        //kecepatan musuh + 4
        setLocation(getX(), getY() + 4);
    }
    
    public void movementMusuhSusah(){
        //kecepatan musuh + 3
        setLocation(getX(), getY() + 3);
    }

    public void movementBos(){
        //kecepatan musuh + 5
        setLocation(getX(), getY() + 5);
    }
    
    public void musuhHilangEasy(){
        //jika musuh melewati getY = 599 maka hilang
        if(getY() == 599 ){
            World beranda = getWorld();
            MyWorld utama = (MyWorld)beranda;
            Health darahbar = utama.getHealth();
            darahbar.loseBlood();
            getWorld().removeObject(this);
        }
    }
    
    public void musuhHilangMedium(){
        //jika musuh melewati getY = 599 maka hilang
        if(getY() == 599 ){
            World beranda = getWorld();
            MyWorld utama = (MyWorld)beranda;
            Health darahbar = utama.getHealth();
            darahbar.loseBlood();
            darahbar.loseBlood();
            getWorld().removeObject(this);
        }
    }
    
    public void musuhHilangHard(){
        //jika musuh melewati getY = 599 maka hilang
        if(getY() == 599 ){
            World beranda = getWorld();
            MyWorld utama = (MyWorld)beranda;
            Health darahbar = utama.getHealth();
            darahbar.loseBlood();
            darahbar.loseBlood();
            darahbar.loseBlood();
            getWorld().removeObject(this);
        }
    }
    
    public void bosHilang(){
        if(getY() == 599 ){
            World beranda = getWorld();
            MyWorld utama = (MyWorld)beranda;
            Health darahbar = utama.getHealth();
            darahbar.loseBlood();
            darahbar.loseBlood();
            darahbar.loseBlood();
            darahbar.loseBlood();
            darahbar.loseBlood();
            darahbar.loseBlood();
            darahbar.loseBlood();
            darahbar.loseBlood();
            darahbar.loseBlood();
            darahbar.loseBlood();
            darahbar.loseBlood();
            darahbar.loseBlood();
            darahbar.loseBlood();
            darahbar.loseBlood();
            darahbar.loseBlood();
            getWorld().removeObject(this);
        }
    }
    
    public void hasil(){
        World beranda = getWorld();
        MyWorld utama = (MyWorld)beranda;
        Point nilai = utama.getPoint();
        nilai.tambahNilai();
    }
}
