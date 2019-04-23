package ie.tudublin;

import processing.core.PApplet;

public class Hangar
{
    UI ui;
    private float width;
    private float height;
    

    public Hangar(UI ui, float width, float height)
    {
        this.ui = ui;
        this.width = width;
        this.height = height;
    }

    public void render()
    {
        ui.fill(0);
        ui.strokeWeight(1);
        ui.stroke(192,192,192);
        ui.rect(400, height, width / 2, height * 2);

        ui.rect(450, height + 50, ((width / 2) - 100), ((height * 2) - 100));
    }
}