package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class TestChrome {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        //Instantiating objects and variables
        ChromeDriver driver = new ChromeDriver();
        //Launching a browser session
        driver.get("http://www.ebay.com");
        //Enter data
        driver.findElement(By.id("gh-ac")).sendKeys("Playstation");
        Thread.sleep(1000);
        //Click a button
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(1000);
        //Clear data
        driver.findElement(By.id("gh-ac")).clear();
        //Enter data
        driver.findElement(By.id("gh-ac")).sendKeys("Playstation 5");
        Thread.sleep(1000);
        //Drop-down box to select category
        Select dropCategory = new Select(driver.findElement(By.id("gh-cat")));
        dropCategory.selectByValue("1249");
        //Click the search button
        driver.findElement(By.id("gh-btn")).click();
        //Click the checkbox
        driver.findElement(By.xpath("//*[@id=\"x-refine__group_1__3\"]/ul/li[1]/div/a/div/span/input")).click();
        Thread.sleep(3000);
        //Click the first result link
        driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a")).click();
        Thread.sleep(1000);
        //Print the first result information
        String name = driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3")).getText();
        System.out.println("Product: " + name);
        String price = driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/div[3]/div[1]/span")).getText();
        System.out.println("Price: " + price);
        Thread.sleep(1000);
        //Quit
        driver.quit();
    }
}


//implicit
//explicit
//fluent wait

/*
                String expectedTitle = "Search";
                String actualTitle = "";
        //Get the actual value of the title
                actualTitle =driver.getTitle();
        //Compare the expected and actual values
                if (actualTitle.contentEquals(expectedTitle)) {
                System.out.println("Test Passed");
                } else {
                System.out.println("Test Failed");
                }
                Thread.sleep(3000);
 */