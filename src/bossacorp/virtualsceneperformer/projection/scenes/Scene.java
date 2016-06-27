package bossacorp.virtualsceneperformer.projection.scenes;

import java.util.logging.Level;

import bossacorp.virtualsceneperformer.fx.basics.Sketch;
import bossacorp.virtualsceneperformer.utils.GlobalSettings.ImageEffectType;
import bossacorp.virtualsceneperformer.utils.GlobalSettings.InterfaceType;
import bossacorp.virtualsceneperformer.utils.VSPSystemLogger;
import bossacorp.virtualsceneperformer.utils.configuration.SceneConfiguration;
import processing.core.PApplet;

public class Scene implements IScene {

	private SceneConfiguration sceneConfiguration;
	private InterfaceType interfaz;
	String image;
	String deviceName;
	PApplet parent;
	ImageEffectType effect;
	Sketch sketch;
	
	public Scene(PApplet parent, SceneConfiguration config){
		sceneConfiguration = config;
		this.parent = parent;
		setUpScene();
	}

	@Override
	public void setUpScene() {
		for(int i=0; i < sceneConfiguration.getResourceList().size(); i++){
								    
			image = sceneConfiguration.getResourceList().get(i).getLocation();
			
			//effect = sceneConfiguration.getResourceList().get(i).getFxConfiguration().getImageFxType();
			
			interfaz = sceneConfiguration.getResourceList().get(i).getFxConfiguration().getInterfaceType();
			
			deviceName = sceneConfiguration.getResourceList().get(i).getFxConfiguration().getControllerName();
			
			System.out.println("Image: " + image + ", effect: " + effect + ", interface: " + interfaz + ", device: " + deviceName);
			
			VSPSystemLogger.getLogger().log(Level.INFO, "Image: " + image + ", effect: " + effect + ", interface: " + interfaz + ", device: " + deviceName);
			
			sketch = new Sketch(parent, image, deviceName);
			
		}

		VSPSystemLogger.getLogger().log(Level.INFO,"Generic Scene Set Up done");
	}

	@Override
	public void drawScene() {
		sketch.draw();
	}
	
	@Override
	public SceneConfiguration getSceneConfiguration() {
		return sceneConfiguration;
	}

}
