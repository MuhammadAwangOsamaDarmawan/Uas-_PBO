import greenfoot.*;

public class MyWorld extends World{
    Point nilai = new Point();
    Health darahbar = new Health();
    boolean levelBos = false;
    
    public MyWorld(){    
        super(600, 600, 1); 
        prepare();
    }
    
    public Point getPoint(){
        return nilai;
    }
    
    public Health getHealth(){
        return darahbar;
    }

    public void act(){
        tambahMusuhMudah();
        tambahMusuhMedium();
        tambahMusuhSusah();
        bos();
    }
    
    public void tambahMusuhMudah(){
        if(Greenfoot.getRandomNumber(150) < 1){
            addObject(new Easy(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    
    public void tambahMusuhMedium(){
        if(Greenfoot.getRandomNumber(250) < 1){
            addObject(new Medium(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    
    public void tambahMusuhSusah(){
        if(Greenfoot.getRandomNumber(400) < 1){
            addObject(new Hard(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    
    public void bos(){
        if(nilai.poin == 10 || nilai.poin == 11){
            if(levelBos == false){
                addObject(new Bos(), 300, 0);
                levelBos = true;
            }
        }
    }

    private void prepare(){
        addObject(nilai, 60, 20);
        addObject(darahbar, 55, 50);
        Character mainCharacter = new Character();//menambahkan pemain
        addObject(mainCharacter,252,510);
        mainCharacter.setLocation(279,543);
    }
}