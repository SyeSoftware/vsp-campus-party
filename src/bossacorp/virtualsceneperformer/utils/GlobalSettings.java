package bossacorp.virtualsceneperformer.utils;

public class GlobalSettings {

	public static enum ProjectionType{KEYBOARD, AUTO};
	public static enum ImageEffectType{FALLOW, DESTRUCT, SEEDS, TREE, VIDEO, BACKGROUND, FIELD, NONE};
	
	public static enum InterfaceType{MIDI, CAMERAS, OSC, NONE};
	
	public static enum MidiTypes{NONE,ORGAN,OCTAPAD};
	
	public static String Roland = "USB MIDI Interface";
	public static String UM_ONE = "UM_ONE";

	public static String DefaultScriptFile = "script.xml";
}
