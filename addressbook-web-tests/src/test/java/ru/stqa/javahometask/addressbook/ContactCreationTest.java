package ru.stqa.javahometask.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        getAddNewContact();
        putNewContactInfo(new ContactData("ivan", "ivanov", "moscow", "84996523652", "79145632145"));
        returnHomePage();
    }





}
