package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("kirilltest1", "kirilltest2", "kirilltest3"));
    app.getGroupHelper().submitGroupCtreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
