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
        angle += 0.01;//determines the speed of the radar
        x1 += (radius * (Math.cos(angle)));//to change the point around the circle of the radar
        y1 += (radius * (Math.sin(angle)));
       /* System.out.println((radius * (Math.sin(angle))));
        System.out.println((radius * (Math.cos(angle))));
        System.out.println(x1);
        System.out.println(y1);*/
    }

    public void render()
    {
        ui.strokeWeight(1);
        ui.stroke(0, 204, 0);//Green colour for the radar
        ui.noFill();
        ui.ellipse(x, y, diameter, diameter);//original circle for the radar
        ui.ellipse(x, y, radius, radius);//additional circles for the radar
        ui.ellipse(x, y, radius * (float) 1.5, radius * (float) 1.5);
        ui.ellipse(x, y, radius * (float) 0.5, radius * (float) 0.5);
        ui.fill(0, 204, 0);
        ui.line(x, y, x1, y1);//line that rotates about the centre of the radar
        //ui.line(x + 20, y + 20, x + 20, y + 20 );

    }

    public void reset()
    {
        x1 = x;//resets x1 and y1 so that the line does not grow bigger than the radar
        y1 = y;
    }
}