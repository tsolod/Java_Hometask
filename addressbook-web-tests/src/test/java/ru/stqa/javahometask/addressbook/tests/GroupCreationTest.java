package ru.stqa.javahometask.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.javahometask.addressbook.model.TestBase;

public class GroupCreationTest extends TestBase {


    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().getGroupsPage();
        int before = app.getGroupHelper().GroupCount();
        app.getGroupHelper().createGroup(new GroupData("test1", null, null));
        int after = app.getGroupHelper().GroupCount();
        Assert.assertEquals(after, before+1);
    }

}
