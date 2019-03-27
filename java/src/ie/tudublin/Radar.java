package ie.tudublin;

import processing.core.PApplet;

public class Radar
{
    private float x;
    private float y;
    private float diameter;
    private float radius;
    private float x1;
    private float y1;
    private float angle = 0;
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

    public void update()
    {
        angle += 0.01;
        y1 += (radius * (Math.sin(angle)));
        x1 += (radius * (Math.cos(angle)));
       /* System.out.println((radius * (Math.sin(angle))));
        System.out.println((radius * (Math.cos(angle))));
        System.out.println(x1);
        System.out.println(y1);*/
    }

    public void render()
    {
        ui.stroke(0, 204, 0);
        ui.noFill();
        ui.ellipse(x, y, diameter, diameter);
        ui.fill(0, 204, 0);
        ui.line(x, y, x1, y1);

    }

    public void reset()
    {
        x1 = x;
        y1 = y;
    }
}