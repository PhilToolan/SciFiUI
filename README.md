# SciFi UI Project

Name: Philip Toolan

Student Number: C17433026



# Description of the assignment

My assingment is the ui of a full spaceship including all these rooms (Cockpit, bedroom, engine room and lab). It consists of each room 
being displayed simultaneously aswell as a life size version of the console command panel that is on the bedroom wall.  In the cockpit 
you can travel from planet to planet using a warp drive, the bedroom houses a window and white board, the engine room reacts to the use 
of the warp drive and the in the lab you can operate a laser. 

# Instructions

The UI consists of buttons which can be pressed. You can also click and drag your mouse on the white board to draw lines. All the other 
instructions for use, are on the UI itself like pressing RIGHT for an orbit of the planet.

# How it works

All the drawing is done relative to each other segment as to allow equal size for each room. All rooms have their own seperate class apart from the engine room which is in the cockpit class. 

# What I am most proud of in the assignment

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item



# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```



This is the youtube video:

https://youtu.be/nSGlqEqQKaU


