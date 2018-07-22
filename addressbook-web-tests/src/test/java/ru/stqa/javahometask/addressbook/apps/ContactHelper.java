package ru.stqa.javahometask.addressbook.apps;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.javahometask.addressbook.tests.ContactData;

public class ContactHelper {
  private FirefoxDriver wd;

  public ContactHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void returnHomePage() {
      wd.findElement(By.linkText("home page")).click();
  }

  public void putNewContactInfo(ContactData contactData) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(contactData.getFname());
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(contactData.getLname());
      wd.findElement(By.name("address")).click();
      wd.findElement(By.name("address")).clear();
      wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
      wd.findElement(By.name("home")).click();
      wd.findElement(By.name("home")).clear();
      wd.findElement(By.name("home")).sendKeys(contactData.getHnamber());
      wd.findElement(By.name("mobile")).click();
      wd.findElement(By.name("mobile")).clear();
      wd.findElement(By.name("mobile")).sendKeys(contactData.getMobnamber());

  }

  public void doNewContact() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }
}
