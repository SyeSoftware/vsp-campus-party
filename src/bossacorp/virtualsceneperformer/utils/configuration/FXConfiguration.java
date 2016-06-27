package bossacorp.virtualsceneperformer.utils.configuration;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

import bossacorp.virtualsceneperformer.utils.GlobalSettings;
import bossacorp.virtualsceneperformer.utils.GlobalSettings.ImageEffectType;
import bossacorp.virtualsceneperformer.utils.GlobalSettings.InterfaceType;
import bossacorp.virtualsceneperformer.utils.GlobalSettings.MidiTypes;

@Root(name="effect")
public class FXConfiguration {

	@Attribute
	private String type;
	
	@Attribute
	private String interfaz;
	
	@Attribute
	private String controller;
	
	@Attribute
	private String port;
	
	public String getType(){
		return type;
	}
	
	public String getInterfaz(){
		return interfaz;
	}
	
	public String getController(){
		return controller;
	}
	
	public String getControllerName(){
		return port;
	}
	
	public ImageEffectType getImageFxType(){
		if(type.equals("FALLOW")) return ImageEffectType.FALLOW;
		if(type.equals("DESTRUCT")) return ImageEffectType.DESTRUCT;
		if(type.equals("SEEDS")) return ImageEffectType.SEEDS;
		if(type.equals("TREE")) return ImageEffectType.TREE;
		if(type.equals("VIDEO")) return ImageEffectType.VIDEO;
		if(type.equals("BACKGROUND")) return ImageEffectType.BACKGROUND;
		if(type.equals("FIELD")) return ImageEffectType.FIELD;
		
		return ImageEffectType.NONE;
			
	}
	
	public InterfaceType getInterfaceType(){
		if(interfaz.equals("MIDI")) return InterfaceType.MIDI;
		if(interfaz.equals("CAMERAS")) return InterfaceType.CAMERAS;
		if(interfaz.equals("OSC")) return InterfaceType.OSC;
		
		return InterfaceType.NONE;
	}

	public MidiTypes getMidiDevice() {
		if(controller.equals("ORGAN")) return MidiTypes.ORGAN;
		if(controller.equals("OCTAPAD")) return MidiTypes.OCTAPAD;
		
		return MidiTypes.NONE;
	}
	
	public String getMidiName(){
		if(port.equals("UM-ONE")) return GlobalSettings.UM_ONE;
		if(port.equals("USB MIDI Interface")) return GlobalSettings.Roland;
		
		return "";
	}

}
