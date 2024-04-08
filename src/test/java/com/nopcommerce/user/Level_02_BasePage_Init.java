package com.nopcommerce.user;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class Level_02_BasePage_Init extends BasePage {
    WebDriver driver;

    BasePage basePage;

    String firstName, lastName, day,month,year,emailAddress, companyName,password;

    @BeforeClass
    public void beforeClass(){
        driver = new FirefoxDriver();
        basePage = new BasePage();
        basePage.openPageUrl(driver,"https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        emailAddress = "luong" + generateRandomNumber()+"@gmail.com";
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

    @Test
    public void User_01_Register(){

    }

}
