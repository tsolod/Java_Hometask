package ru.stqa.javahometask.addressbook.apps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void getGroupsPage() {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Group")
            && isElementPresent(By.name("new")) ) {
      return;
    }
      click(By.linkText("groups"));
  }

  public void getAddNewContact() {
    if((isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry"))) {
      return;
    }
    click(By.linkText("add new"));
  }

  public void getHome() {
    if(isElementPresent(By.id("maintable"))) {
      return;
    }
    click(By.linkText("home"));
  }
}
