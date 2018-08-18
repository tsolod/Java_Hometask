package ru.stqa.javahometask.addressbook.apps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.javahometask.addressbook.tests.ContactData;



public class ContactHelper extends HelperBase {


  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnHomePage() {
    click(By.linkText("home page"));
  }

  public void putNewContactInfo(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFname());
    type(By.name("lastname"), contactData.getLname());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getHnamber());
    type(By.name("mobile"), contactData.getMobnamber());
    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void doNewContact() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void selectContact() {

  }

  public void initModificationContact() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[3]/td[8]/a/img"));
  }

  public void submitContactModification() {
    click(By.xpath("//div[@id='content']/form[1]/input[22]"));
  }

  public void deletContact() {
    click(By.xpath("//div[@id='content']/form[2]/input[2]"));
  }

  public void getAddNewContact() {
    if ((isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry"))) {
      return;
    }
    click(By.linkText("add new"));
  }



  public void createContact(ContactData contact, boolean creation) {
    getAddNewContact();
    putNewContactInfo(contact, creation);
    doNewContact();
    returnHomePage();
  }


  public boolean ThereAContact() {
    return isElementPresent(By.xpath("//table[@id='maintable']/tbody/tr[3]/td[8]/a/img"));
  }
}
