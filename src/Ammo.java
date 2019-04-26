//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing {

    private int speed;

    public Ammo() {
        this(0, 0, 0);
    }

    public Ammo(int x, int y) {
        //add code
        super(x, y, 5, 5);
        speed = 5;
    }

    public Ammo(int x, int y, int s) {
        //add code
        super(x, y, 5, 5);
        speed = s;
    }

    public void setSpeed(int s) {
        //add code
        speed = s;
    }

    public int getSpeed() {
        return speed;
    }

    public void draw(Graphics window) {
        //add code to draw the ammo
        window.setColor(Color.YELLOW);
        window.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    public void move(String direction) {
        //add code to draw the ammo
        if(direction.equals("UP"))
           super.setY(super.getY() - getSpeed()); 
    }
    
    boolean didCollideLeft(Object obj)
    {
        Alien a = (Alien) obj;
        if(getX() >= a.getX())
            return true;
        return false;
    }
    
    boolean didCollideRight(Object obj)
    {
        Alien a = (Alien) obj;
        if(getX()+getWidth() <= a.getX()+a.getWidth())
            return true;
        return false;
    }
    
    boolean didCollideBottom(Object obj)
    {
        Alien a = (Alien) obj;
        if(getY() <= a.getY()+a.getHeight())
            return true;
        return false;
    }

    public String toString() {
        return "";
    }
}
