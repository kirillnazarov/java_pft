package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase{

  @Test
  public void testContactModification() {
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactData(new ContactData("m","m","m","m","m","m","m","m","m","m","m","m","m","m","m","m","m"));
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }
}
