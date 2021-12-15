package commons;

import java.util.Properties;

public class BrowserProperties {
	
	protected String platformName ;
	protected String appPackage;
	protected String appActivity;
	protected Long timeout;

	
	private Properties loadProperties() {
		Properties prop = new Properties();
		try {
			prop.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return prop;
	}
	
	public String getPlatformName() {
		return this.platformName = loadProperties().getProperty("platformName");
	}
	

	public String getAppPackage() {
		return this.appPackage = loadProperties().getProperty("appPackage");
	}

	
	public String getAppActivity() {
		return this.appActivity = loadProperties().getProperty("appActivity");
	}

	public Long getTimeout() {
		return this.timeout = Long.parseLong(loadProperties().getProperty("timeout"));
	}
	


}
