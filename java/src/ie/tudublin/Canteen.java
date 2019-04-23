package ie.tudublin;

import processing.core.PApplet;

public class Canteen
{
    UI ui;
    private float width;
    private float height;
    

    public Canteen(UI ui, float width, float height)
    {
        this.ui = ui;
        this.width = width;
        this.height = height;
    }

    public void render()
    {
        ui.fill(105,105,105);
        ui.strokeWeight(1);
        ui.stroke(192,192,192);
        ui.rect(400, height, width / 2, height * 2);

        ui.fill(255);
        ui.rect(500, ((height * 2) - 100), ((width / 2) - 200), 50);
    }
}