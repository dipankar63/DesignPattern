package com.example.proxy;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class Factory {

	public static IComponent getObject(String key) throws Exception {
		Properties properties = new Properties();
		properties.load(new FileReader(new File("config.properties")));
		IComponent obj = null;
		if (properties.get(key + ".proxy").equals("enabled")) {
			Class<?> clsC = Class.forName(properties.getProperty(key));
			Constructor<?> consC = clsC.getConstructor();
			Object oC = consC.newInstance();
			Class<?> cls = Class.forName(properties.getProperty("proxy"));
			Constructor<?> cons = cls.getDeclaredConstructor(new Class[] { IComponent.class });
			obj = (IComponent) cons.newInstance(oC);
			return obj;
		}
		return obj;
	}

}
