package com.M42.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class Property {

	public static String getValueForKey(String key) throws Throwable {
		Properties conpro = new Properties();
		//load file
		conpro.load(new FileInputStream("C:\\Users\\Bandi.Ujjinesh\\OPENMRS\\M42_Dev\\propertyfile\\file.property"));
		return conpro.getProperty(key);
		}
}
