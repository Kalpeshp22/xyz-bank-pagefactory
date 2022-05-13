package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);

        }
        @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
        WebElement bankManagerLogin;

        @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
        WebElement customerLogin;

        public void clickOnBankManagerLogin(){
            clickOnElement(bankManagerLogin);
            CustomListeners.test.log(Status.PASS,"Click BankManager Login");

        }
         public void clickOnCustomerLogin(){
            clickOnElement(customerLogin);
            CustomListeners.test.log(Status.PASS,"Click on Customer Login");
         }
    }


