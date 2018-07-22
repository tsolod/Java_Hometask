package ru.stqa.javahometask.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.javahometask.addressbook.model.TestBase;

public class ContactDeletionTest extends TestBase {
  @Test
  public void testContactDeletion(){

    app.getNavigationHelper().getHome();
    app.getContactHelper().initModificationContact();
    app.getContactHelper().deletContact();
    app.getNavigationHelper().getHome();

  }
}
