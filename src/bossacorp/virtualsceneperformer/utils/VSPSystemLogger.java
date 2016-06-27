package bossacorp.virtualsceneperformer.utils;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class VSPSystemLogger {
	private static Logger instance = null;
	private static Level LogLevel = Level.FINE;
	private static boolean sendToFile = false;
	
	public static Logger getLogger(){
		if(instance == null){
			try{
				instance = Logger.getLogger("VSPLogger");
				
				instance.addHandler(new ConsoleHandler());
				instance.setUseParentHandlers(false);
				instance.setLevel(LogLevel);
				
				if(sendToFile){
					FileHandler fileHander = new FileHandler("vsp.log", true);
					instance.addHandler(fileHander);
					SimpleFormatter formatter = new SimpleFormatter();
					fileHander.setFormatter(formatter);
				}
				
				instance.log(Level.INFO, "Logger creado");
			
			}catch(SecurityException se){
				se.printStackTrace();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
		return instance;
	}
}
