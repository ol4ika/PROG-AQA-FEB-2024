package org.prog.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyTestNGTest extends ParentTest {

    @Test(dataProvider = "celebrityNames")
    public void myGoogleSearchForBen(String name) {
        System.out.println("I locate search bar and enter " + name);
        System.out.println("I perform search");
        System.out.println("I validate there are at least 3 headers in search results");
    }

    @Test(dataProvider = "celebrityNamesWithUrls")
    public void luckySearchTest(int run, String celebrityName, String pageUrl) {
        System.out.println("This is test run #" + run);
        System.out.println("I locate search bar and enter " + celebrityName);
        System.out.println("I press feeling lucky");
        System.out.println("I confirm page url is " + pageUrl + " for " + celebrityName);
    }

    @DataProvider
    public Object[][] celebrityNames() {
        return new Object[][]{
                {"Ben Affleck"},
                {"Sean Bean"},
                {"Jim Carry"},
                {"Nikole Kidman"}
        };
    }

    @DataProvider
    public Object[][] celebrityNamesWithUrls() {
        return new Object[][]{
                {1, "Ben Affleck", "wikipedia"},
                {2, "Nicolas Cage", "IMDB"}
        };
    }
}
