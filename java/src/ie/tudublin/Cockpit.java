package ie.tudublin;

import processing.core.PApplet;

public class Cockpit
{
    UI ui;
    private float width;
    private float height;
	private float fat = 3;
	private float tall = 3;
	private float[] xl = new float [500];
	private float[] yl = new float [500];
	private float[] xul = new float [500];
	private float[] yul = new float [500];
	private float[] xr = new float [500];
	private float[] yr = new float [500];
	private float[] xur = new float [500];
	private float[] yur = new float [500];
	private int i = 0;

    public Cockpit(UI ui, float width, float height)
    {
        this.ui = ui;
        this.width = width;
        this.height = height;
    }

    public void render()
    {
        ui.fill(0);
        ui.rect(400, 0, width / 2, height);
		ui.fill(255);
		while(i < 500)
		{
			
			xl[i] = ui.random(415, 400 + (width / 4));
			yl[i] = ui.random(15, height - 15);
			xr[i] = ui.random(400 + (width / 4), 400 + (width / 2) - 15);
			yr[i] = ui.random(15, height - 15);
			xl[i] = ui.random(415, 400 + (width / 4));
			yl[i] = ui.random(15, height - 15);
			xr[i] = ui.random(400 + (width / 4), 400 + (width / 2) - 15);
			yr[i] = ui.random(15, height - 15);
			i += 1;
		}
		i = 0;
		while(i < 500)
		{
			ui.ellipse(xl[i], yl[i], fat, tall);
			ui.ellipse(xr[i], yr[i], fat, tall);
			i += 1;
		}
	}

	public void update()
	{
		
		/*
		if(fat == 10)
		{
			fat = 1;
			tall = 1;
		}
		
		if(fat1 == 10)
		{
			fat1 = 1;
			tall1 = 1;
		}
		*/
		i = 0;
		while(i < 500)
		{
			if(xl[i] <= 400)
			{
				xl[i] = ui.random(350 + (width / 4), 400 + (width / 4));
			}
			xl[i] -= 1;
			
			
			if(xr[i] >= 815 + (width / 4))
			{
				xr[i] = ui.random(400 + (width / 4), 450 + (width / 4));
			}
			xr[i] += 1;
			i++;
		}
	}
}