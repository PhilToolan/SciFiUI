package ie.tudublin;

import processing.core.PApplet;

public class Console
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;

    public Console(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void render()
    {
        ui.fill(128, 111, 111);
        ui.rect(x, y, width, height);
        ui.fill(0);
        ui.rect(x + 3, y + 10, width / 3, height / 6);
        ui.rect(x + 14, y + 10, width / 3, height / 6);
        ui.rect(x + 3, y + 25, width - 5, height / 6);
        ui.rect(x + 3, y + 38, width - 5, height / 6);
    }
}