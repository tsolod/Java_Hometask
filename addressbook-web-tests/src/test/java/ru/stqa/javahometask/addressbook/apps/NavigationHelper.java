package ru.stqa.javahometask.addressbook.apps;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
 private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void getGroupsPage() {
      wd.findElement(By.linkText("groups")).click();
  }

  public void getAddNewContact() {
    wd.findElement(By.linkText("add new")).click();
  }
}
