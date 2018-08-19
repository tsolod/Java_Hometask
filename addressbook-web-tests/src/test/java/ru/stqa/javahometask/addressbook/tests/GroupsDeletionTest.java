package ru.stqa.javahometask.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.javahometask.addressbook.model.TestBase;

public class GroupsDeletionTest extends TestBase {

    @Test
    public void testGroupsDeletion() {

        app.getNavigationHelper().getGroupsPage();
        int before = app.getGroupHelper().GroupCount();
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToGroupsPage();
        int after = app.getGroupHelper().GroupCount();
        Assert.assertEquals(after, before-1);
    }


}
