package ie.tudublin;

//import processing.core.PApplet;

public class Orbit
{
    private float x;
    private float y;
    private float diameter;
    private float radius;
    private float x1;
    private float y1;
    private float angle = 0;
    UI ui;

    public Orbit(UI ui, float x, float y, float diameter)
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
        angle += 0.01;//determines the speed of the orbit
        x1 += ((radius + 10) * (Math.cos(angle)));//to change the point around the circle of the planet
        y1 += ((radius + 10) * (Math.sin(angle)));
       /* System.out.println((radius * (Math.sin(angle))));
        System.out.println((radius * (Math.cos(angle))));
        System.out.println(x1);
        System.out.println(y1);*/
    }

    public void render()
    {
        ui.strokeWeight(1);
        ui.fill(0, 204, 0);
        ui.ellipse(x1, y1, 10, 10);//Shape that rotates aroud the centre of the planet

    }

    public void reset()
    {
        x1 = x;//resets x1 and y1 so that the line does not grow bigger than the desired orbit
        y1 = y;
    }
}
