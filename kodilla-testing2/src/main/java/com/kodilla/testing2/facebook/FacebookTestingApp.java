package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookTestingApp {
    public static final String COOKIES = "//div[contains(@class, \"_9xo5\")]/button[2]";
    public static final String CREATE_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String REGISTER_WINDOW = "//*[@id=\"reg_form_box\"]/div";
    //public static final String REGISTER_WINDOW = "//*[@id=\"reg_box\"]";

    //public static final String FIRSTNAME = "//div[contains(@class, \"inputtext _58mg _5dba _2ph-\")]/a";
    public static final String FIRSTNAME = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input";
    public static final String LASTNAME = "";
    public static final String EMAIL = "";
    public static final String PASSWORD = "";
    public static final String DAY = "";
    public static final String MONTH = "";
    public static final String YEAR = "";
    public static final String SEX_MALE = "";
    public static final String REGISTER_BUTTON = "";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https:www.facebook.com/");

        driver.findElement(By.xpath(COOKIES)).click();
        driver.findElement(By.xpath(CREATE_ACCOUNT)).click();

        while(!driver.findElement(By.xpath(REGISTER_WINDOW)).isDisplayed());

        //WebElement firstname = driver.findElement(By.xpath(FIRSTNAME));
        //firstname.sendKeys("John");
    }
}
