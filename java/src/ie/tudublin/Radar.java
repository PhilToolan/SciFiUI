package ie.tudublin;

import processing.core.PApplet;

public class Radar
{
    private float x;
    private float dx = 1;
    private float y;
    private float diameter;
    private float radius;
    private float x1;
    private float y1;
    private float speed = .3f;
    private float angle = 1;
    UI ui;

    public Radar(UI ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        radius = diameter / 2;
        x1 = x;
        y1 = y;
    }
    
    public void render()
    {
        ui.stroke(255);
        ui.noFill();
        ui.ellipse(x, y, diameter, diameter);
        ui.fill(255);
        ui.line(x, y, x1 , y1);

    }

    public void update()
    {
        angle += 1;
        x1 += (float) (Math.sin(speed * angle));
        y1 += (float) (Math.cos(speed * angle));
 
    }
}