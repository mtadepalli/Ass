package com.test;

import com.base.BaseTest;
import com.pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;


public class HomePageTest extends BaseTest {

    private HomePage _hp;

    @BeforeClass
    public void beforeClass() {
        _hp = new HomePage(driver);
    }

    @Test(priority = 1, alwaysRun = true)
    public void testGetLinkCount() throws IOException{
        driver.takeScreenShot();
        assertEquals(4, _hp.getLinkCount());
        driver.takeScreenShot();
    }
    
    @Test(priority = 1, alwaysRun = true)
    public void testClickExploreLink() throws IOException{
        driver.takeScreenShot();
        assertEquals(true, _hp.clickExploreLink());
        driver.takeScreenShot();
    }
}
