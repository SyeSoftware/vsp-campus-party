package bossacorp.virtualsceneperformer.utils.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;

import org.simpleframework.xml.core.Persister;

import bossacorp.virtualsceneperformer.utils.GlobalSettings;

public class ConfigManager {
	
	//Atributos para el funcionamiento normal
	Properties props;
	FileInputStream fis;
			
	ArrayList<String> imagenes;
			
	private ProductConfiguration productConfiguration;
	Persister xmlPersister;
			
	private static ConfigManager instance;
			
	/**
	* Patron Singleton para devolver una unica instancia
	* @return
	*/
	public static ConfigManager getInstance(){
		if(instance == null){
			instance = new ConfigManager(GlobalSettings.DefaultScriptFile);
		}
		return instance;
	}
			
	/**
	* 
	*/
	public ConfigManager(String script){		

		xmlPersister = new Persister();
		File source = new File(script);
					
		try {
			productConfiguration = xmlPersister.read(ProductConfiguration.class, source);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
			
	/**
	* 
	* @param i
	* @return
	*/
	public String getImagenAt(int i){
		if (i <= imagenes.size()){
			return imagenes.get(i);
		}
		return "";
		}
			
	/**
	* Devuelve la configuracion del producto
	* @return
	*/
	public ProductConfiguration getProductConfiguration(){
		return productConfiguration;
	}
}
