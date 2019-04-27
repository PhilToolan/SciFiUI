package ie.tudublin;

import processing.core.PApplet;

public class Cockpit
{
    UI ui;
    private float width;
    private float height;
	private float fat = 1;
	private float tall = 1;
	private float[] xl = new float [200];
	private float[] yl = new float [200];
	private float[] xul = new float [200];
	private float[] yul = new float [200];
	private float[] xr = new float [200];
	private float[] yr = new float [200];
	private float[] xur = new float [200];
	private float[] yur = new float [200];
	private int i = 0;
	private int counter = 5;
	private float location = 0;
	public float y = height;
	public float y2 = height;
	private float engineball = 255;
	private float engineball2 = 255;
	private float engineball3 = 255;
	private float exhaustflame = 0;
	private float exhaustflame2 = 0;
	private float secexhaustflame = 0;
	private float exhaustflameheight;
	private float secexhaustflameheight;


    public Cockpit(UI ui, float width, float height)
    {
        this.ui = ui;
        this.width = width;
		this.height = height;
		exhaustflameheight = height - 25;
		secexhaustflameheight = height - 15;
    }

    public void render()
    {
		ui.strokeWeight(1);
        ui.fill(0);
		ui.stroke(255);
        ui.rect(400, 0, width / 2, height);//Cockpit section
		ui.fill(105,105,105);
        ui.stroke(192,192,192);
        ui.rect(400, height, width / 2, height);//Engine Room

		//Engine 
        ui.fill(255);
        ui.rect((400 + (width / 2) / 2) - 100, height + (height / 2) + 50, 200, height / 2);
		ui.rect((400 + (width / 2) / 2) - 100, height, 200, (height / 2) - 50);
		ui.stroke(0);
		//moving lines in engine
		ui.line((400 + (width / 2) / 2) - 100, y, (400 + (width / 2) / 2) + 100, y);
		ui.line((400 + (width / 2) / 2) - 100, y2, (400 + (width / 2) / 2) + 100, y2);
		//lines connecting ball to engine
		ui.line((400 + (width / 2) / 2) - 100, height + (height / 2) + 50, (400 + (width / 2) / 2),  height + (height / 2));
		ui.line((400 + (width / 2) / 2) + 100, height + (height / 2) + 50, (400 + (width / 2) / 2),  height + (height / 2));
		ui.line((400 + (width / 2) / 2) - 100, height + (height / 2) - 50, (400 + (width / 2) / 2),  height + (height / 2));
		ui.line((400 + (width / 2) / 2) + 100, height + (height / 2) - 50, (400 + (width / 2) / 2),  height + (height / 2));
		ui.noStroke();
		ui.fill(engineball, engineball2, engineball3);
		ui.ellipse((400 + (width / 2) / 2), height + (height / 2), 50, 50);//Engine ball
		ui.stroke(255);
		while(i < 200)
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
		while(i < 200)
		{
			ui.ellipse(xl[i], yl[i], fat, tall);
			ui.ellipse(xr[i], yr[i], fat, tall);
			ui.ellipse(xul[i], yul[i], fat, tall);
			ui.ellipse(xur[i], yur[i], fat, tall);
			i += 1;
		}
		
		//cockpit ui section
		ui.fill(192,192,192);
		ui.rect(400, height - 100, width / 2, 100);//cockpit console
		ui.fill(0);
		ui.rect(400, height - (height / 6), (width / 2) / 4, height / 10);//warp drive
		ui.fill(255);
		ui.text("Warp Drive", 400 + ((width/2)/4) * 0.5f, (height - (height / 6)) + (height / 10) * 0.5f);
		//glass frames
		ui.strokeWeight(3);
		ui.line(500, 0, 500, (height - 100) / 2);
		ui.line(500, (height - 100) / 2, 480, ((height - 100) / 2) + 20);
		ui.line(480, ((height - 100) / 2) + 20, 480, height - 100);
		ui.line((width / 2)  + 300, 0, (width / 2) + 300, (height - 100) / 2);
		ui.line((width / 2)  + 300, (height - 100) / 2, (width / 2)  + 320, ((height - 100) / 2) + 20);
		ui.line((width / 2)  + 320, ((height - 100) / 2) + 20, (width / 2)  + 320, height - 100);
		//spaceship diagram 
		ui.fill(0);
		ui.ellipse((width / 2) + 300, height - 50, 80, 80);
		ui.strokeWeight(1);
		ui.rect((width / 2) + 290, height - 75, 20, 40);
		ui.triangle((width / 2) + 290, height - 75, (width / 2) + 290, height - 35, (width / 2) + 270, height - 35);
		ui.triangle((width / 2) + 310, height - 75, (width / 2) + 310, height - 35, (width / 2) + 330, height - 35);
		ui.triangle((width / 2) + 310, height - 75, (width / 2) + 290, height - 75, (width / 2) + 300, height - 85);
		ui.noStroke();
		ui.fill(secexhaustflame, 0, 0);
		ui.triangle((width / 2) + 313, height - 34, (width / 2) + 287, height - 34, (width / 2) + 300, secexhaustflameheight);
		ui.fill(exhaustflame, exhaustflame2, 0);
		ui.triangle((width / 2) + 310, height - 34, (width / 2) + 290, height - 34, (width / 2) + 300, exhaustflameheight);

		if(ui.mousePressed)
        {
            if(ui.mouseX > 400 && ui.mouseX < 400 + ((width / 2) / 4) && ui.mouseY > height - (height / 6) && ui.mouseY < (height - (height / 6))+ (height / 10))
            {
				counter += 1;
				location += 0.5;
                //System.out.println(i);
				ui.delay(200);//delays the button so that it cannot increment by more than one
				//System.out.print(counter);
				if (location == 4)
				{
					location = 0;
				}
            }
        } 
	}

	public void update()
	{
		i = 0;
		if((counter % 2) == 0)
		{
			while(i < 200)
		{
			if(xl[i] <= 405 || yl[i] >= height - 15)
			{
				xl[i] = ui.random(415, 400 + (width / 2) / 2);
				yl[i] = ui.random(height / 2, height - 15);
			}
			xl[i] -= 3;
			yl[i] += 3;
			
			if(xr[i] >= 400 + (width / 2) - 5 || yr[i] >= height - 15)
			{
				xr[i] = ui.random(400 + (width / 2) / 2, 400 + (width / 2) - 15);
				yr[i] = ui.random(height / 2, height - 15);
			}
			xr[i] += 3;
			yr[i] += 3;
			if(xul[i] <= 405 || yul[i] <= 0)
			{
				xul[i] = ui.random(415, 400 + (width / 2) / 2);
				yul[i] = ui.random(15, height / 2);
			}
			xul[i] -= 3;
			yul[i] -= 3;
			
			
			if(xur[i] >= 400 + (width / 2) - 5 || yur[i] <= 0)
			{
				xur[i] = ui.random(400 + (width / 2) / 2, 400 + (width / 2) - 15);
				yur[i] = ui.random(15, height / 2);
			}
			xur[i] += 3;
			yur[i] -= 3;
			i++;
			ui.noStroke();
			ui.fill(124,252,0);
			ui.ellipse((385 + (width / 2) / 4), height - (height / 6) + 10, 5, 5);//Light on button
		}
			y = y - 3; 
			if (y < height + (height / 2) + 50)
			{ 
				y = ui.height; 
			}//Engine
			y2 = y2 + 3; 
			if (y2 > height + (height / 2) - 50)
			{ 
				y2 = height; 
			}//Engine
			engineball = engineball - 5;
			if (engineball < 0)
			{
				engineball = 255;
			}
			engineball2 = engineball2 - 3;
			if (engineball2 < 0)
			{
				engineball2 = 255;
			}
			engineball3 = engineball3 - 1;
			if (engineball3 < 0)
			{
				engineball3 = 255;
			}
			exhaustflame += 10;
			if (exhaustflame > 255)
			{
				exhaustflame -=10;
				exhaustflame2 = 69;
				secexhaustflame += 10;
			}
			if (secexhaustflame > 255)
			{
				secexhaustflame -= 10;
			}
			
		}

		if((counter % 2 != 0))
		{
			while(i < 200)
			{
				if(xl[i] <= 405 || yl[i] >= height - 15)
				{
					xl[i] = ui.random(415, 400 + (width / 2) / 2);
					yl[i] = ui.random(height / 2, height - 15);
				}
				xl[i] -= 0.005f;
				yl[i] += 0.005f;
				
				if(xr[i] >= 400 + (width / 2) || yr[i] >= height - 15)
				{
					xr[i] = ui.random(400 + (width / 2) / 2, 400 + (width / 2) - 15);
					yr[i] = ui.random(height / 2, height - 15);
				}
				xr[i] += 0.005f;
				yr[i] += 0.005f;
				if(xul[i] <= 405 || yul[i] <= 0)
				{
					xul[i] = ui.random(415, 400 + (width / 2) / 2);
					yul[i] = ui.random(15, height / 2);
				}
				xul[i] -= 0.005f;
				yul[i] -= 0.005f;
				
				
				if(xur[i] >= 400 + (width / 2)  || yur[i] <= 0)
				{
					xur[i] = ui.random(400 + (width / 2) / 2, 400 + (width / 2) - 15);
					yur[i] = ui.random(15, height / 2);
				}
				xur[i] += 0.005f;
				yur[i] -= 0.005f;
				i++;
				ui.noStroke();
				 //Planets
				 if(location == 0)
				 {
					 ui.fill(19, 77, 164);
					 ui.ellipse(ui.width / 20, ui.height - 100, 100, 100);//diagram
					 ui.fill(19, 77, 164);
					 ui.ellipse(ui.width - ((ui.width - 400) / 4) + 100,(ui.height / 2) + 50, 50, 50);//window
				 } else 
				 if(location == 1)
				 {
					 ui.fill(44, 158, 74);
					 ui.ellipse(ui.width / 20, ui.height - 100, 100, 100);//diagram
					 ui.fill(44, 158, 74);
					 ui.ellipse(ui.width - ((ui.width - 400) / 4) + 100,(ui.height / 2) + 50, 50, 50);//window
				 } else
				 if(location == 2)
				 {
					 ui.fill(215, 169, 78);
					 ui.ellipse(ui.width / 20, ui.height - 100, 100, 100);//diagram
					 ui.fill(215, 169, 78);
					 ui.ellipse(ui.width - ((ui.width - 400) / 4) + 100,(ui.height / 2) + 50, 50, 50);//window
				 } else
				 if(location == 3)
				 {
					 ui.fill(242, 66, 54);
					 ui.ellipse(ui.width / 20, ui.height - 100, 100, 100);//diagram
					 ui.fill(242, 66, 54);
					 ui.ellipse(ui.width - ((ui.width - 400) / 4) + 100,(ui.height / 2) + 50, 50, 50);//window
				 }
				ui.noStroke();
				ui.fill(255,0,0);
				ui.ellipse((385 + (width / 2) / 4), height - (height / 6) + 10, 5, 5);//Light on button
			}

			y = y - 1; 
			if (y < height + (height / 2) + 50)
			{ 
				y = ui.height; 
			}//Engine
			y2 = y2 + 1; 
			if (y2 > height + (height / 2) - 50)
			{ 
				y2 = height; 
			}//Engine
			engineball = 255;
			engineball2 = 255;
			engineball3 = 255;
			exhaustflame2 -= 5;
			secexhaustflame -= 5;
			if (secexhaustflame < 0)
			{
				secexhaustflame +=5;
				exhaustflame -= 5;
				exhaustflame2 += 5;
			}
			if (exhaustflame < 0)
			{
				exhaustflame += 5;
			}
		}
		
	}
}