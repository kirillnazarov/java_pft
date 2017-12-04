package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void fillContactData(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("middlename"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getFirstname());
    type(By.name("nickname"), contactData.getFirstname());
    type(By.name("title"), contactData.getFirstname());
    type(By.name("company"), contactData.getFirstname());
    type(By.name("address"), contactData.getFirstname());
    type(By.name("home"), contactData.getFirstname());
    type(By.name("mobile"), contactData.getFirstname());
    type(By.name("work"), contactData.getFirstname());
    type(By.name("fax"), contactData.getFirstname());
    type(By.name("email"), contactData.getFirstname());
    type(By.name("email2"), contactData.getFirstname());
    type(By.name("email3"), contactData.getFirstname());
    type(By.name("homepage"), contactData.getFirstname());
    type(By.name("byear"), contactData.getFirstname());
    type(By.name("ayear"), contactData.getFirstname());
  }

  public void submitContactCtreation() {
    click(By.name("submit"));
  }

  public void returnToHomePage() {
    click(By.linkText("home page"));
  }

}