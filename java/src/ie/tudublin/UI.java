package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    Button2 b2;
    Orbit o;
    Room r;
    Cockpit cp;
    Lab l;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        //size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        fullScreen(); 
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "Blinds");
        b2 = new Button2(this, 200, 50, 100, 50, "Planets");
        o = new Orbit(this, width / 20, height - 100, 100);
        r = new Room(this, width, height / 2);
        cp = new Cockpit(this, width - 400, height / 2);
        l = new Lab(this, width - 400, height / 2);
    }

    public void draw()
    {
        background(0);

        b2.render();
        b2.update();


        r.render();
        
        cp.render();
        cp.update();

        b.render();
        b.update();

        l.render();
        l.update();

        if (checkKey(RIGHT))
        {
            o.render();
            o.reset();
            o.update();
        }
    }

}

