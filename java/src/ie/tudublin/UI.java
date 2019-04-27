package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    Button2 b2;
    MovingCircle mc;
    Orbit o;
    Room r;
    Cockpit cp;

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
        b2 = new Button2(this, 200, 50, 100, 50, "Travel");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        o = new Orbit(this, width / 8, height - 100, 100);
        r = new Room(this, width, height / 2);
        cp = new Cockpit(this, width - 400, height / 2);
       
    }

    public void draw()
    {
        background(0);

        b2.render();
        b2.update();

        cp.render();
        cp.update();

        b.render();
        b.update();

        //mc.update();
        //mc.render();


        r.render();

       

        if (checkKey(LEFT))
        {
        
        }

        if (checkKey(RIGHT))
        {
            o.render();
            o.reset();
            o.update();
        }

        if (checkKey(UP))
        {
           
        }

        if(checkKey(DOWN))
        {

        }
    }

}

