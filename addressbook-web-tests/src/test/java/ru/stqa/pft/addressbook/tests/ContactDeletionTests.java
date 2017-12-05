package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
  @Test
  public void testContactDeletion() throws InterruptedException {
    app.getContactHelper().selectContact();
    app.getContactHelper().deletedSelectedContacts();
    app.getContactHelper().acceptBrowserAlert();
    app.getNavigationHelper().gotoHome();

  }
}
