package ru.stqa.javahometask.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.javahometask.addressbook.model.TestBase;

public class GroupCreationTest extends TestBase {


    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().getGroupsPage();
        app.getGroupHelper().doNewGroup();
        app.getGroupHelper().putInfoGroup(new GroupData("test1", null, null));
        app.getGroupHelper().saveNewGrop();
        app.getGroupHelper().returnToGroupsPage();
    }

}
