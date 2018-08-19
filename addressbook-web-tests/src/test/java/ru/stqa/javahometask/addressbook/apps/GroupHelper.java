package ru.stqa.javahometask.addressbook.apps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.javahometask.addressbook.tests.GroupData;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToGroupsPage() {
    click(By.linkText("group page"));
  }

  public void saveNewGrop() {
      click(By.name("submit"));
  }

  public void putInfoGroup(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHead());
    type(By.name("group_footer"), groupData.getFeet());


  }

  public void doNewGroup() {
    click(By.name("new"));
  }

  public void deleteGroup() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void createGroup(GroupData group) {
    doNewGroup();
    putInfoGroup(group);
    saveNewGrop();
    returnToGroupsPage();

  }

  public boolean isThereAGroup() {
   return isElementPresent(By.name("selected[]"));
  }

  public int GroupCount() {
    return wd.findElements(By.name("selected[]")).size();

  }
}
