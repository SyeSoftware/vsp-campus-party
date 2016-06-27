package bossacorp.virtualsceneperformer.projection;

import java.util.logging.Level;

import bossacorp.virtualsceneperformer.projection.scenes.SceneManager;
import bossacorp.virtualsceneperformer.utils.VSPSystemLogger;
import processing.core.PApplet;
import processing.core.PImage;

public class MainScreen extends PApplet{
	PApplet applet;
	SceneManager sceneManager;
	PImage img;	
	
	public static void main(String[] args) {
		VSPSystemLogger.getLogger().log(Level.INFO,"Bienvenido a VSP - Virtual Scene Performer");
        PApplet.main("bossacorp.virtualsceneperformer.projection.MainScreen");
    }
	
	
	public void settings(){
		size(1000,500);//Por ahorita estoy dejando este tama�o para poder ver el log 
		//fullScreen();
	}
	
	public void setup() {
		  noStroke();  
		  sceneManager = new SceneManager(this);
	}
	
	public void draw() { 
		 background(255);
		 sceneManager.getCurrentScene().drawScene();;
		 
	}
	
}