package com.pages;

import com.base.BasePage;
import com.util.*;

public class HomePage extends BasePage {

    public HomePage(PageDriver driver) {
        super(driver);       
    }

    public int getLinkCount() {
        return driver.findElements("header.links").size();
    }
    
    public boolean clickExploreLink(){
    	
    	boolean exploreLinkWorks = false;
    	
    	driver.findElement("header.links.explore").click();
    	
    	driver.waitForLoad();
    	
    	exploreLinkWorks = driver.getCurrentUrl().contains("explore");    	
    	
    	return exploreLinkWorks;
    }    
}
