package ie.tudublin;

import processing.core.PApplet;

public class Cockpit
{
    UI ui;
    private float width;
    private float height;
	private float fat = 10;
	private float tall = 10;
	private float x = 500;
	private float y = 100;

    public Cockpit(UI ui, float width, float height)
    {
        this.ui = ui;
        this.width = width;
        this.height = height;
    }

    public void render()
    {
        ui.fill(255);
        ui.rect(400, 0, width / 2, height);
		ui.fill(0);
		for(int i = 0; i < 100; i++)
		{
			ui.ellipse(x, y, fat, tall);
		}
		fat += 1;
		tall += 1;
		
		if(fat == 100)
		{
			fat = 10;
			tall = 10;
			x = ui.random(500, (width / 2) - 100);
			y = ui.random(100, height - 100);
		}
	}

}