package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Radar ra;
    Weather w;
    Room ro;

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
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        ra = new Radar(this, width / 5, height / 5, 100);
        w = new Weather(this, 700, 100, width / 8);
        ro = new Room(this, width /2, height / 2);
    }

    public void draw()
    {
        background(0);
        b.render();
        //b.drawPieChart();

        //mc.update();
        //mc.render();

        //r.render();
        //r.reset();
        //r.update();

        ro.render();


        if (checkKey(LEFT))
        {
            w.drawPieChart();
        }

        if (checkKey(RIGHT))
        {
            ra.render();
            ra.reset();
            ra.update();
        }

        if (checkKey(UP))
        {

        }
    }

}

