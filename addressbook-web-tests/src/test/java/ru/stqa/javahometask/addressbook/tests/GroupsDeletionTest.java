package ru.stqa.javahometask.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.javahometask.addressbook.model.TestBase;

public class GroupsDeletionTest extends TestBase {

    @Test
    public void testGroupsDeletion() {
        app.getGroupsPage();
        app.selectGroup();
        app.deleteGroup();
        app.returnToGroupsPage();
    }


}
