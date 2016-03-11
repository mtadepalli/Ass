package com.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.util.Configuration;
import com.util.ExcelUtils;
import com.util.PageDriver;
import com.util.WBy;

public abstract class BaseTest {

    public static final Configuration _config;
    public PageDriver driver;
    public ExcelUtils excelUtils;

    static {
        _config = new Configuration("web");
    }       

    @BeforeSuite
    public void beforeSuite() {
        driver = new PageDriver(_config);
        WBy.loadJsonMap(String.format("%s/locators.json", System.getProperty("user.dir")));
        excelUtils = new ExcelUtils();
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }
}
