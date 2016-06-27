package bossacorp.virtualsceneperformer.utils.configuration;

import java.util.ArrayList;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="scene")
public class SceneConfiguration {

	@Attribute
	private int id;
	
	@Attribute
	private String name;
	
	@ElementList(inline=true, entry="resource")
	private ArrayList<ResourceConfiguration> resourceList;
	
	public SceneConfiguration(){

	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public ArrayList<ResourceConfiguration> getResourceList(){
		return resourceList;
	}
	
}