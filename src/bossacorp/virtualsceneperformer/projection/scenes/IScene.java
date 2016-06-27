package bossacorp.virtualsceneperformer.projection.scenes;

import bossacorp.virtualsceneperformer.utils.configuration.SceneConfiguration;

public interface IScene {
	
	public void setUpScene();
	public void drawScene();
	public SceneConfiguration getSceneConfiguration();
	
}
