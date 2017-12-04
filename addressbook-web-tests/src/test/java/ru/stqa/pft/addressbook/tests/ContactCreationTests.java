package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoContactCreationPage();
    app.getContactHelper().fillContactData(new ContactData("t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t"));
    app.getContactHelper().submitContactCtreation();
    app.getContactHelper().returnToHomePage();

  }
}
