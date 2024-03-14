package org.prog.testng;

import io.restassured.RestAssured;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.prog.dto.NameDto;
import org.prog.dto.ResultsDto;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MyTestNGTest2 {

    @Test
    public void mySeleniumCode() {
        String userName = getRandomFirstLastName();
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://google.com/");
            List<WebElement> cookieButtons =
                    driver.findElements(By.xpath(
                            "//a[contains(@href,'https://policies.google.com/technologies/cookies')]/../../../..//button"));
            if (!cookieButtons.isEmpty()) {
                cookieButtons.get(3).click();
            }

            WebElement searchInput = driver.findElement(By.name("q"));
            searchInput.sendKeys(userName);
            searchInput.sendKeys(Keys.ENTER);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
            List<WebElement> searchHeaders =
                    wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("h3"), 5));

            int userNameFound = 0;
            for (WebElement element : searchHeaders) {
                if (element.getText().contains(userName)) {
                    userNameFound++;
                }
            }
            Assert.assertTrue(userNameFound >= 3, "Less than 3 mentions of user found!");
        } finally {
            driver.quit();
        }
    }

    private String getRandomFirstLastName() {
        RestAssured.baseURI = "https://randomuser.me/";
        ResultsDto dto = RestAssured.given()
                .queryParam("inc", "gender,name,nat")
                .queryParam("noinfo")
                .basePath("api/")
                .get()
                .as(ResultsDto.class);

        NameDto name = dto.getResults().get(0).getName();
        return name.getFirst() + " " + name.getLast();
    }
}
