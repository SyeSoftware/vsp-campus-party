package bossacorp.virtualsceneperformer.projection.scenes;

import java.util.ArrayList;

import bossacorp.virtualsceneperformer.utils.configuration.ConfigManager;
import processing.core.PApplet;

public class SceneManager {
	
	IScene currentScene;
	PApplet parent;
	ArrayList<IScene> scenes;
	int currentSceneIndex;
		
	/**
	 * TODO este constructor debe recibir una instancia de ProductConfiguration
	 */
	public SceneManager(PApplet p) {
		parent = p;			
		
		scenes = new ArrayList<IScene>();
		for(int i = 0; i < ConfigManager.getInstance().getProductConfiguration().getSceneList().size(); i++){
			Scene scene = new Scene(parent, ConfigManager.getInstance().getProductConfiguration().getSceneList().get(i));
			scenes.add(scene);
		}
		currentSceneIndex = 0;
		currentScene = scenes.get(currentSceneIndex);
		
	}
	
	public IScene getCurrentScene(){
		return currentScene;
		//return currentScene;
	}
	
	
}
