package bossacorp.virtualsceneperformer.fx.basics;

import java.util.logging.Level;

import bossacorp.virtualsceneperformer.utils.VSPSystemLogger;
import processing.core.PApplet;
import processing.core.PImage;
import rwmidi.*;

public class Sketch {

	PApplet parent;
	PImage image;
	String deviceName;
	MidiInput input;
	
	public Sketch(PApplet parent, String img, String deviceName){
		this.parent = parent;
		image = parent.loadImage(img);
		this.deviceName = deviceName;
		
		if(!this.deviceName.equals("NONE"))
			initMIDI(deviceName);
	}
	
	public void draw(){
		image.resize(parent.width, parent.height);
		parent.image(image, 0, 0);
	}
	
	public void initMIDI(String deviceName){
		for(int i=0; i < RWMidi.getInputDevices().length; i++){
			
			if(RWMidi.getInputDeviceNames()[i].contains(deviceName))
			{
				input = RWMidi.getInputDevices()[i].createInput(this);
				VSPSystemLogger.getLogger().log(Level.INFO,"Midi Device Asignado a -> : " + input.getName() );
				return;
			}
			
		}	
	}
	
	public void noteOnReceived(Note note){
		System.out.println("Note: " + note.getPitch());
	}
}
