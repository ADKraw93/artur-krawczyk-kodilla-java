package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String COOKIES = "//div[contains(@class, \"_9xo5\")]/button[2]";
    public static final String CREATE_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String FIRSTNAME = "firstname"; //name
    public static final String LASTNAME = "lastname"; //name
    public static final String EMAIL = "reg_email__"; //name
    public static final String EMAIL_CONFIRM = "reg_email_confirmation__"; //name
    public static final String PASSWORD = "reg_passwd__"; //name
    public static final String DAY = "birthday_day"; //name
    public static final String MONTH = "birthday_month"; //name
    public static final String YEAR = "birthday_year"; //name
    public static final String SEX_MALE = "//span[2]/input"; //xpath

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https:www.facebook.com/");

        driver.findElement(By.xpath(COOKIES)).click();
        driver.findElement(By.xpath(CREATE_ACCOUNT)).click();

        Thread.sleep(1000);

        WebElement firstname = driver.findElement(By.name(FIRSTNAME));
        firstname.sendKeys("John");
        WebElement lastname = driver.findElement(By.name(LASTNAME));
        lastname.sendKeys("Smith");
        WebElement email = driver.findElement(By.name(EMAIL));
        email.sendKeys("john.smith@kodilla.com");
        WebElement emailConfirm = driver.findElement(By.name(EMAIL_CONFIRM));
        emailConfirm.sendKeys("john.smith@kodilla.com");
        WebElement password = driver.findElement(By.name(PASSWORD));
        password.sendKeys("Pass1234");

        WebElement selectDayButton = driver.findElement(By.name(DAY));
        Select selectDay = new Select(selectDayButton);
        selectDay.selectByIndex(29);
        WebElement selectMonthButton = driver.findElement(By.name(MONTH));
        Select selectMonth = new Select(selectMonthButton);
        selectMonth.selectByIndex(0);
        WebElement selectYearButton = driver.findElement(By.name(YEAR));
        Select selectYear = new Select(selectYearButton);
        selectYear.selectByIndex(34);

        driver.findElement(By.xpath(SEX_MALE)).click();

    }
}
