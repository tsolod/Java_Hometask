package ru.stqa.javahometask.addressbook.tests;

import org.testng.annotations.Test;

import ru.stqa.javahometask.addressbook.model.TestBase;

public class ContactDeletionTest extends TestBase {
  @Test
  public void testContactDeletion(){

    app.getNavigationHelper().getHome();
    if (! app.getContactHelper().ThereAContact()) {
      app.getContactHelper().createContact(new ContactData("ivan", "ivanov", "moscow", "84996523652", "79145632145", "test1"), true);
    }
    app.getContactHelper().initModificationContact();
    app.getContactHelper().deletContact();
    app.getNavigationHelper().getHome();

  }
}
