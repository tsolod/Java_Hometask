package ru.stqa.javahometask.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.javahometask.addressbook.model.TestBase;

public class ContactModificationTest extends TestBase {

  @Test

  public void testContactModification() {

    app.getNavigationHelper().getHome();
    if (! app.getContactHelper().ThereAContact()) {
      app.getContactHelper().createContact(new ContactData("ivan", "ivanov", "moscow", "84996523652", "79145632145", "test1"), true);
    }
    app.getContactHelper().initModificationContact();
    app.getContactHelper().putNewContactInfo(new ContactData("zzzzz", "i8787", "moscow", "84996523652", "79145632145", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnHomePage();
 }


}
