package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("kirilltest1", "kirilltest2", "kirilltest3"));
    submitGroupCtreation();
    returnToGroupPage();
  }

}
