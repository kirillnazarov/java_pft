package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  //разделить метод на несколько, взависимости от заполняемых полей - fillContactName, fillContactEmail etc

  public void fillContactData(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("middlename"), contactData.getMiddlename());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getPhone_home());
    type(By.name("mobile"), contactData.getPhone_mobile());
    type(By.name("work"), contactData.getPhone_work());
    type(By.name("fax"), contactData.getFax());
    type(By.name("email"), contactData.getEmail());
    type(By.name("email2"), contactData.getEmail2());
    type(By.name("email3"), contactData.getEmail3());
    type(By.name("homepage"), contactData.getHomepage());
    type(By.name("byear"), contactData.getByear());
    type(By.name("ayear"), contactData.getAyear());
  }

  public void submitContactCtreation() {
    click(By.name("submit"));
  }

  public void returnToHomePage() {
    click(By.linkText("home page"));
  }

  public void selectContact() {
    click(By.linkText("selected[]"));
  }

  public void initContactModification() {
    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();

    //переделать через HelperBase
  }

  public void submitContactModification() {
    click(By.name("update"));
  }

//добавить методы выбора даты рождения из дропдауна

}