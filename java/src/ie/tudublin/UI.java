package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    Button2 b2;
    MovingCircle mc;
    Orbit o;
    Weather w;
    Room r;
    Console c;

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
        size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "Blinds");
        b2 = new Button2(this, 200, 50, 100, 50, "Travel");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        o = new Orbit(this, width / 8, height - 100, 100);
        w = new Weather(this, 300, height - 100, 100);
        r = new Room(this, width /2, height / 2);
        c = new Console(this, 450, 600, 25, 50);
    }

    public void draw()
    {
        background(0);
        b.render();
        b.update();
        //b.drawPieChart();

        //mc.update();
        //mc.render();

        //r.render();
        //r.reset();
        //r.update();


        b2.render();

        r.render();

        c.render();



        if (checkKey(LEFT))
        {
            w.drawPieChart();
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
    }

}

