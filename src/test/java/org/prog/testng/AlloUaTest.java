package org.prog.testng;

import org.openqa.selenium.WebDriver;
import org.prog.pages.AlloUaPage;
import org.prog.web.WebDriverFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AlloUaTest {

    private final WebDriver driver = WebDriverFactory.getDriver();
    private AlloUaPage page;

    @BeforeSuite
    public void setUp() {
        page = new AlloUaPage(driver);
    }

    //TODO: add method to page object that will switch between search pages
    //TODO: methods: left, right and by page number
    //TODO: test must vefiry that searched value is present on that page
    @Test
    public void searchForPhone() {
        String phoneName = "iPhone 15";
        page.loadPage();
        page.searchForGoods(phoneName);
        Assert.assertTrue(page.searchResultsContain(phoneName),
                "No phone with name '" + phoneName + "' was present on page");
        page.switchToNextPage();
        page.switchToSearchPageByNumber("4");
        page.switchToPrevPage();
        //add next page by clicking ">"
        // add verifiation like line 29
    }

    //TODO: add second test where you change page by clicking "2"

    //TODO: * - switch page "2" then click "<" then validate goods

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
