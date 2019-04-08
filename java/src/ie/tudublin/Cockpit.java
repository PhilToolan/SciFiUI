package ie.tudublin;

import processing.core.PApplet;

public class Cockpit
{
    UI ui;
    private float width;
    private float height;
	private float fat = 3;
	private float tall = 3;
	private float[] xl = new float [600];
	private float[] yl = new float [600];
	private float[] xul = new float [600];
	private float[] yul = new float [600];
	private float[] xr = new float [600];
	private float[] yr = new float [600];
	private float[] xur = new float [600];
	private float[] yur = new float [600];
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
		ui.stroke(255);
        ui.rect(400, 0, width / 2, height);
		ui.fill(255);
		while(i < 600)
		{
			
			xl[i] = ui.random(415, 400 + (width / 2) / 2);
			yl[i] = ui.random(height / 2, height - 15);
			xr[i] = ui.random(400 + (width / 2) / 2, 400 + (width / 2));
			yr[i] = ui.random(height / 2, height - 15);
			xul[i] = ui.random(415, 400 + (width / 2) / 2);
			yul[i] = ui.random(15, height / 2);
			xur[i] = ui.random(400 + (width / 2) / 2, 400 + (width / 2));
			yur[i] = ui.random(15, height / 2);
			i += 1;
		}
		i = 0;
		while(i < 600)
		{
			ui.ellipse(xl[i], yl[i], fat, tall);
			ui.ellipse(xr[i], yr[i], fat, tall);
			ui.ellipse(xul[i], yul[i], fat, tall);
			ui.ellipse(xur[i], yur[i], fat, tall);
			i += 1;
		}
		
		ui.fill(192,192,192);
		ui.rect(400, height - (height / 4), width / 2, height / 3.5f);
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
		while(i < 600)
		{
			if(xl[i] <= 415 || yl[i] >= height + 15)
			{
				xl[i] = ui.random(415, 400 + (width / 2) / 2);
				yl[i] = ui.random(height / 2, height - 15);
			}
			xl[i] -= 3;
			yl[i] += 3;
			
			if(xr[i] >= 400 + (width / 2) || yr[i] >= height + 15)
			{
				xr[i] = ui.random(400 + (width / 2) / 2, 400 + (width / 2) - 15);
				yr[i] = ui.random(height / 2, height - 15);
			}
			xr[i] += 1;
			yr[i] += 1;
			if(xul[i] <= 415 || yul[i] <= 0)
			{
				xul[i] = ui.random(415, 400 + (width / 2) / 2);
				yul[i] = ui.random(15, height / 2);
			}
			xul[i] -= 3;
			yul[i] -= 3;
			
			
			if(xur[i] >= 400 + (width / 2)  || yur[i] <= 0)
			{
				xur[i] = ui.random(400 + (width / 2) / 2, 400 + (width / 2) - 15);
				yur[i] = ui.random(15, height / 2);
			}
			xur[i] += 1;
			yur[i] -= 1;
			i++;
		}
	}
}