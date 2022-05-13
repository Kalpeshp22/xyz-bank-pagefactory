package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {

    public void AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement enterFirstName;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement enterLastname;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement enterPostCode;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement clickOnAddCustomer;

    public void firstName(String firstName){
        sendTextToElement(enterFirstName,firstName);
        CustomListeners.test.log(Status.PASS,"Enter First name" + firstName);

    }
    public void lastName(String lastName){
        sendTextToElement(enterLastname,lastName);
        CustomListeners.test.log(Status.PASS,"Enter Last name");
    }
     public void postCode(String postCode) {
        sendTextToElement(enterPostCode,postCode);
        CustomListeners.test.log(Status.PASS,"Enter Postcode");
     }
      public void addCustomer(){
        clickOnElement(clickOnAddCustomer);
        CustomListeners.test.log(Status.PASS,"Add Customer");
      }

      public void alertTextVerify(String expectedMessage)throws InterruptedException{

        Thread.sleep(2500);
        String message = getTextFromAlert();
        verifyText (expectedMessage,message,"Error, Message not displayed as expected");

      }

}
