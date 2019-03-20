package ie.tudublin;

import processing.core.PApplet;

public class Button
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;
    private float border = 20;
    private float buttonWidth = 200;
    private float buttonHeight = 50;
    private float gap = 20;

    public Button(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public void render()
    {
        /*ui.noFill();
        ui.stroke(255);
        ui.rect(x, y, width, height);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text, x + width * 0.5f, y + height * 0.5f);*/
        float y = border + (buttonHeight + gap);
        float x = border;
        ui.noFill();
        ui.stroke(255);
        ui.rect(x, y, buttonWidth, buttonHeight);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.fill(0);
    }

    public void mouseClicked()
    {
        boolean mouse;
        // The best way!!
        if ((ui.mouseX > border && ui.mouseX < border + buttonWidth))
        {
            if ((ui.mouseY - border) % (buttonHeight + gap) < buttonHeight)
            {
                mouse = true;
            }
        }
    }

}