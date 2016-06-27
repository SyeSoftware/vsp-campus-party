package bossacorp.virtualsceneperformer.projection.scenes;

import java.util.logging.Level;

import bossacorp.virtualsceneperformer.utils.GlobalSettings.ImageEffectType;
import bossacorp.virtualsceneperformer.utils.GlobalSettings.InterfaceType;
import bossacorp.virtualsceneperformer.utils.VSPSystemLogger;
import bossacorp.virtualsceneperformer.utils.configuration.SceneConfiguration;
import processing.core.PApplet;

public class Scene implements IScene {

	private SceneConfiguration sceneConfiguration;
	private InterfaceType interfaz;
	String image;
	ImageEffectType effect;
	
	public Scene(PApplet p, SceneConfiguration config){
		sceneConfiguration = config;
		setUpScene();
	}

	@Override
	public void setUpScene() {
		for(int i=0; i < sceneConfiguration.getResourceList().size(); i++){
								    
			image = sceneConfiguration.getResourceList().get(i).getLocation();
			
			effect = sceneConfiguration.getResourceList().get(i).getFxConfiguration().getImageFxType();
			
			interfaz = sceneConfiguration.getResourceList().get(i).getFxConfiguration().getInterfaceType();
			String deviceName = sceneConfiguration.getResourceList().get(i).getFxConfiguration().getControllerName();
			
			//VSPSystemLogger.getLogger().log(Level.INFO, "XML Script DeviceName - " + deviceName);
			System.out.println("Image: " + image + ", effect: " + effect + ", interface: " + interfaz + ", device: " + deviceName);
								
			switch(interfaz){
			case MIDI:
				break;
			case CAMERAS:
				break;
			case OSC:
				break;
			case NONE:
				break;
			}
			
		}

		VSPSystemLogger.getLogger().log(Level.INFO,"Generic Scene Set Up done");
	}

	@Override
	public void drawScene() {
		
	}
	
	@Override
	public SceneConfiguration getSceneConfiguration() {
		return sceneConfiguration;
	}

}
