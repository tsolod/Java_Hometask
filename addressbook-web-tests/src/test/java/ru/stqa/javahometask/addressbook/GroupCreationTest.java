package ru.stqa.javahometask.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {


    @Test
    public void testGroupCreation() {
        getGroupsPage();
        doNewGroup();
        putInfoGroup(new GroupData("test1", "test2", "test3"));
        saveNewGrop();
        returnToGroupsPage();
    }

}
