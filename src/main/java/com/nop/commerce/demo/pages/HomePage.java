package com.nop.commerce.demo.pages;

import com.nop.commerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    /*2.HomePage - All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, My account link and LogOut link locatores
  and create appropriate methods for it.*/
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']")
    List<WebElement> allTopListMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopcommerceLogo;


        public void selectMenu(String menu)
        {
            //1.2 This method should click on the menu whatever name is passed as parameter.
            List<WebElement> topMenuList = getListOfElements(allTopListMenu);
            try {
                for (WebElement element : topMenuList) {
                    if (element.getText().equalsIgnoreCase(menu)) {
                        element.click();
                    }
                }
            } catch (StaleElementReferenceException e) {
                topMenuList = getListOfElements(allTopListMenu);
            }
            clickOnElement(By.linkText(menu));
        }

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public void nopcommerceLogoActualText(){
        String nopLogoText= getTextFromElement(nopcommerceLogo);
    }



}
