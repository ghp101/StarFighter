//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde {

    private List<Alien> aliens;

    public AlienHorde(int size) {
        aliens = new ArrayList<Alien>();
        for (int i = 0; i < size; i++) {
            aliens.add(new Alien(i*50, 0, 50, 50, 2));
        }
    }

    public void add(Alien al) {
        aliens.add(al);
    }

    public void drawEmAll(Graphics window) {
        for (Alien a : aliens) {
            a.draw(window);
        }
    }

    public void moveEmAll() {
        for (Alien a : aliens) {
            if (!(a.getX() >= 10 && a.getX() <= 700)) {
                a.setSpeed(-a.getSpeed());
                a.setY(a.getY() + 20);
            }
            
            a.move("RIGHT");
        }
    }

    public void removeDeadOnes(List<Ammo> al) {
        if(aliens.size() > 0){
            for(Alien a: aliens){
                for(Ammo i : al){
                    if(i.didCollideBottom(a) && i.didCollideLeft(a) && i.didCollideRight(a)){
                        a.setHeight(0);
                        a.setWidth(0);
                    }
                }  
            }
        }  
    }

    public String toString() {
        return "";
    }
}
