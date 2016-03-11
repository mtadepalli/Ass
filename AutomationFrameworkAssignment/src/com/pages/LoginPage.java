package com.pages;

import com.base.BasePage;
import com.util.PageDriver;

public class LoginPage extends BasePage {
	
	public LoginPage(PageDriver driver) {
        super(driver);       
        
        getLoginPage();
    }
	
	
	public void getLoginPage(){
		
		driver.findElement("header.signin.link").click();
	}
	
	public boolean performLogin(String userName,String password){
    	
    	boolean isLoggedIn = false;   	
    	
    	driver.waitForLoad();   	
    	
    	driver.findElement("login.username").clear();    	
    	
    	driver.findElement("login.username").sendKeys(userName);
    	
    	driver.findElement("login.password").clear();
    	
    	driver.findElement("login.password").sendKeys(password);
    	
    	driver.findElement("login.signin.button").click();    	
    	
    	driver.waitForLoad();  
    	
    	if(driver.getCurrentUrl().contains("session")){
    		
    		isLoggedIn = (driver.findElement("login.invalid.login").isDisplayed()) ? false : true; 
   		
    	}else{
    		driver.findElement("login.dropdown.menu").click();
        	
    		isLoggedIn = (driver.findElement("login.signout.link").isDisplayed()) ? true : false;
    	}
    	return isLoggedIn;
    }  
	
	public boolean performLogout(){
    	
    	boolean isLoggedIn = false;
    	
    	isLoggedIn = driver.findElement("login.signout.link").isDisplayed();
    	
    	if(isLoggedIn){
    		
    		driver.findElement("login.signout.link").click();    		
    	}
    	
    	return isLoggedIn;
    }  
}
