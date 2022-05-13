package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends Utility {

    public void openAccountPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//select[@id='userSelect']")
    WebElement selectCustomer;

    @FindBy(xpath = "//select[@id='currency']")
    WebElement selectCurrency;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement clickOnProceessButton;

    @FindBy(xpath = "")
    WebElement navigateToHomepage;

    public void selectFromCustomerDropDown(String name){
        selectByVisibleTextFromDropDown(selectCustomer,name);
        CustomListeners.test.log(Status.PASS,"Select Customer"+ name);

    }
     public void selectFromCurrencyFromDropDown(String name){
        selectByVisibleTextFromDropDown(selectCurrency,name);
        CustomListeners.test.log(Status.PASS,"Select Currency "+name);

    }
     public void clickOnPorcessButton(){
        clickOnElement(clickOnProceessButton);
        CustomListeners.test.log(Status.PASS,"Click on Process Button");
     }
     public void alertTextVerify(String expectedMessage) throws InterruptedException{

        Thread.sleep(3000);
        String Message = getTextFromAlert();
        verifyText(expectedMessage,Message,"Error, Message not dispalyed as expected");
     }
     public void backToHomepage(){
        clickOnElement(navigateToHomepage);
        CustomListeners.test.log(Status.PASS,"Navigate to Homepage");
     }

}
