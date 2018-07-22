package ru.stqa.javahometask.addressbook.apps;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.javahometask.addressbook.tests.ContactData;

public class ContactHelper extends HelperBase{


  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnHomePage() {
      click(By.linkText("home page"));
  }

  public void putNewContactInfo(ContactData contactData) {
      type(By.name("firstname"),contactData.getFname());
      type(By.name("lastname"),contactData.getLname());
      type(By.name("address"),contactData.getAddress());
      type(By.name("home"),contactData.getHnamber());
      type(By.name("mobile"),contactData.getMobnamber());
  }

  public void doNewContact() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }
}
