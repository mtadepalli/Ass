package com.util;

import com.util.Browsers;

import java.io.*;

import java.util.Properties;

public class Configuration {

    public Browsers Browser;
    public String Device;
    public String BaseUrl;
    public String BaseURI;
    public String TestResultPath;
    public String TestDataPath;
    public int WaitTimeout;
    public String DataFileName;
    public boolean TakeScreenShot;
    public String MobileOs;
    public String Devicename;
    public String APKName;
    public String AppiumURL;
    public String AppPackage;
    public String AppActivity;



    public Configuration(String type){

    		Properties props = loadProperties(type);
            
            if(type=="web")
            {
                setWebProps(props);
            }
    }

    private Properties loadProperties(String type)
    {
        Properties props = new Properties();
        try {
            if(type=="web")
            {
                props.load(new FileReader(String.format("%s/config.properties", System.getProperty("user.dir"))));
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        return props;
    }

    public void setWebProps(Properties mProps)
    {
    	WaitTimeout = Integer.parseInt(mProps.getProperty("wait-timeout"));
    	
        DataFileName = mProps.getProperty("data-file-name");
        
        String browser = mProps.getProperty("browser");
        Browser = Browsers.Firefox;
        if(browser.toLowerCase().equals("firefox"))
        {
            Browser = Browsers.Firefox;
        }
        else if(browser.toLowerCase().equals("chrome"))
        {
            Browser = Browsers.Chrome;
        }
        else if(browser.toLowerCase().equals("htmlunit"))
        {
            Browser = Browsers.HtmlUnit;
        }
        else if(browser.toLowerCase().equals("ie"))
        {
            Browser = Browsers.InternetExplorer;
        }

        BaseUrl = mProps.getProperty("url");
        Device = mProps.getProperty("device");
        TestResultPath = mProps.getProperty("test-result-path");
        TestDataPath = mProps.getProperty("test-data-path");
        TakeScreenShot = Boolean.valueOf(mProps.getProperty("takeScreenShot"));
       // ScreenFolderPath = mProps.getProperty("screenshot-folder-path");
    }   
}
