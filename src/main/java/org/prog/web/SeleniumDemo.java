package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

//TODO: go to rozetka
//TODO: search for any goods (iPhone 15)
//TODO: print that goods name ( Мобильный телефон Apple iPhone 15 Pro Max 256GB Black Titanium (MU773RX/A) )

public class SeleniumDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        //search Iphone 15
              WebElement searchInput = driver.findElement(By.name("search"));
            searchInput.sendKeys("Iphone 15");
            //Step 2: press enter while in search form
            searchInput.sendKeys(Keys.ENTER);

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
//            List<WebElement> searchHeaders =
//                    wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("h3"), 5));
//
        List<WebElement> searchGoods = driver.findElements(By.xpath("//div[@class='goods-tile__inner']//span[@class='goods-tile__title']"));
        WebElement firstGood = searchGoods.get(0);
        String titleOfFirstGood = firstGood.getText();
        System.out.println(titleOfFirstGood);

        driver.quit();

//        WebDriver driver = new ChromeDriver();
//        try {
//            driver.get("https://google.com/");
//            //accept cookies if they are present
//            //find all buttons in cookies form
//            List<WebElement> cookieButtons =
//                    driver.findElements(By.xpath(
//                            "//a[contains(@href,'https://policies.google.com/technologies/cookies')]/../../../..//button"));
//            if (!cookieButtons.isEmpty()) {
//                //click button with index 3 (this button accepts all cookies)
//                cookieButtons.get(3).click();
//            }
//            //TODO: sreach for ben Affleck
//            //Step 1: set search form value to Ben Affleck
//            WebElement searchInput = driver.findElement(By.name("q"));
//            searchInput.sendKeys("Ben Affleck");
//            //Step 2: press enter while in search form
//            searchInput.sendKeys(Keys.ENTER);
//
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
//            List<WebElement> searchHeaders =
//                    wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("h3"), 5));
//
//            System.out.println(">>>>> " + searchHeaders.size());
//
//            int afflecksFound = 0;
//            for (WebElement element : searchHeaders) {
//                if (element.getText().contains("Ben Affleck")) {
//                    afflecksFound++;
//                }
//            }
//            if (afflecksFound >= 3) {
//                System.out.println("Ben found!");
//            } else {
//                System.out.println("Ben not found :(");
//            }
//        } finally {
//            driver.quit();
//        }
    }
}