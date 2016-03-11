package com.test;

import com.base.BaseTest;
import com.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.io.IOException;

public class LoginPageTest extends BaseTest {

    private LoginPage _lp;
    private String sheetName;

    @BeforeTest
    @Parameters({"sheetName"})
    public void init(String sheetName)
    {
        _lp = new LoginPage(driver);
        this.sheetName = sheetName;
    }
    
    @Test(dependsOnMethods = {"testLogin"})
    public void testPerformLogout() {        
    	boolean actual = _lp.performLogout();
    	assertTrue(actual);
    }    
    
    @DataProvider(name = "users-data")
    public Object[][] getUsers() throws Exception {
        Object[][] data = excelUtils.getSimpleExcelData(driver._configuration.DataFileName,sheetName);
        return data;
    }

    @Test(priority = 1,dataProvider = "users-data")
    public void testLogin(String uname,String pwd, boolean result)throws IOException
    {  	
         boolean actual = _lp.performLogin(uname, pwd);
         if(result){
        	 assertTrue(actual);
         }else{
        	 assertFalse(actual);
         }         
         driver.takeScreenShot();        
    }
}
