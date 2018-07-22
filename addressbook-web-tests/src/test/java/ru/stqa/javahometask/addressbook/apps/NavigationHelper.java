package ru.stqa.javahometask.addressbook.apps;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void getGroupsPage() {
      click(By.linkText("groups"));
  }

  public void getAddNewContact() {
    click(By.linkText("add new"));
  }
}
