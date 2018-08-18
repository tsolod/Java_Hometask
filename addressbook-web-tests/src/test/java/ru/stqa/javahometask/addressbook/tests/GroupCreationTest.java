package ru.stqa.javahometask.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.javahometask.addressbook.model.TestBase;

public class GroupCreationTest extends TestBase {


    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().getGroupsPage();
        app.getGroupHelper().createGroup(new GroupData("test1", null, null));

    }

}
