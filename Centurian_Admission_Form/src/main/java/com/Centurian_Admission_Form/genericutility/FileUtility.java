package com.Centurian_Admission_Form.genericutility;
import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.Icon;

public class FileUtility {

	
	

		private static final String IConstantst = null;

		// TODO Auto-generated method stub
		/**
		 *   its used return the value from the property file based on key
		 * @param key
		 * @return value
		 * @throws Throwable
		 */
			public String getPropertyKeyValue(String key) throws Throwable {
				
				FileInputStream fis = new FileInputStream(IConstants.propertyFilepath);
				Properties pObj = new Properties();
				pObj.load(fis);
				String value = pObj.getProperty(key);
				return value;
				
			}
}