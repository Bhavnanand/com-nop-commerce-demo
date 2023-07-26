package com.nop.commerce.demo.pages;

import com.nop.commerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    @CacheLookup@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerLink;
    @CacheLookup@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
    WebElement DeskTopLink;
    @CacheLookup@FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement BuildURComputer;
    @CacheLookup@FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement Processor;
    @CacheLookup@FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ram1;
    @CacheLookup@FindBy(xpath = "//dd[@id='product_attribute_input_4']//ul[@class='option-list']")
    WebElement HDD1;
    @CacheLookup@FindBy(xpath = "//dd[@id='product_attribute_input_4']//ul[@class='option-list']")
    WebElement OS;
    @CacheLookup@FindBy(xpath = "//label[normalize-space()='Software']")
    WebElement Software;
    @CacheLookup@FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement AddToCart;
    public void clickOnComputerLink(){
       clickOnElement(computerLink);
    }
    public void clickOnDeskTopLink(){
        clickOnElement(DeskTopLink);
    }
    public String getTextForDeskTop(){
        return getTextFromElement(By.xpath("//h1[normalize-space()='Desktops']"));
    }
    public void clickOnBuildUrComputer(){
        clickOnElement(BuildURComputer);
    }
    public void selectProcessor(String processorname){
        selectByValueFromDropDown(Processor,processorname);
    }
    public void selectRam(String ram){
        selectByValueFromDropDown(ram1,ram);
    }
    public void selectOS(String os){
        selectByValueFromDropDown(OS,os);
    }
    public void selectHDD(String HDD){
        selectByValueFromDropDown(HDD1,HDD);
    }
    public String getTextForAddToCart(){
        return getTextFromElement(AddToCart);
    }
    public void clickOnaDDtoCart(){
        clickOnElement(AddToCart);
    }
    public void clickOnSoftware(String software){
        clickOnElement(Software);
    }
}
