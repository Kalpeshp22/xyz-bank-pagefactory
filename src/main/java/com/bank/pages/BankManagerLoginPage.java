package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import jdk.net.SocketFlow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {

    public void BankManagerLoginpagel() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]") //
    WebElement addCustomerButton;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccount;

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[3]")
    WebElement customers;

    public void addCustomerButton(){
        clickOnElement(addCustomerButton);
        CustomListeners.test.log(Status.PASS,"Click Add Customer");

    }
    public void openAccount(){
        clickOnElement(openAccount);
        CustomListeners.test.log(Status.PASS,"Click Opne account");
    }
    public void customers(){
        clickOnElement(customers);
        CustomListeners.test.log(Status.PASS,"Click on Customers");
    }
}

