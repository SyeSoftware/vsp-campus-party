package bossacorp.virtualsceneperformer.utils.configuration;

import java.util.List;
import java.util.logging.Level;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import bossacorp.virtualsceneperformer.utils.GlobalSettings.ProjectionType;
import bossacorp.virtualsceneperformer.utils.VSPSystemLogger;

@Root(name="obra")
public class ProductConfiguration {

	//Atributos para el XML
	@Attribute
	private String name;
		
	@Attribute	
	private String autor;
	
	@Attribute
	private ProjectionType projectionHandler;
		
	@ElementList(inline=true)
	private List<SceneConfiguration> sceneList;
	
	public ProductConfiguration(){
		VSPSystemLogger.getLogger().log(Level.INFO, "Leyendo el Script de configuracion");
	}
	
	public String getName(){
		return name;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public ProjectionType getProjection(){
		return projectionHandler;
	}
	
	public List<SceneConfiguration> getSceneList(){
		return sceneList;
	}
	
}