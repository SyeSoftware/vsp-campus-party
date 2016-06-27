package bossacorp.virtualsceneperformer.utils.configuration;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="resource")
public class ResourceConfiguration {

	@Attribute
	private String type;

	@Attribute
	private String name;
	
	@Element(name="srcLocation")
	private String location;
	
	@Element(name="effect")
	private FXConfiguration effect;
	
	public String getType(){
		return type;
	}

	public String getName(){
		return name;
	}
	
	public String getLocation(){
		return location;
	}

	public FXConfiguration getFxConfiguration(){
		return effect;
	}
	
}
