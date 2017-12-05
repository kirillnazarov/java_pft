package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("GROUPS"));
  }

  public void gotoContactCreationPage() {
    click(By.linkText("ADD_NEW"));
  }

  public void gotoHome() {click(By.linkText("HOME"));}
}
