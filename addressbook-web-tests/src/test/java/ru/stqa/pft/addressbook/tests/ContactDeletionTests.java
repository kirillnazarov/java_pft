package ru.stqa.pft.addressbook.tests;

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
