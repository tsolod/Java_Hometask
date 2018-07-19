package ru.stqa.javahometask.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.javahometask.addressbook.model.TestBase;

public class GroupCreationTest extends TestBase {


    @Test
    public void testGroupCreation() {
        app.getGroupsPage();
        app.doNewGroup();
        app.putInfoGroup(new GroupData("test1", "test2", "test3"));
        app.saveNewGrop();
        app.returnToGroupsPage();
    }

}
