package ru.stqa.javahometask.addressbook.tests;

public class ContactData {
  private final String fname;
  private final String lname;
  private final String address;
  private final String hnamber;
  private final String mobnamber;
  private String group;

  public ContactData(String fname, String lname, String address, String hnamber, String mobnamber, String group) {
    this.fname = fname;
    this.lname = lname;
    this.address = address;
    this.hnamber = hnamber;
    this.mobnamber = mobnamber;
    this.group = group;
  }

  public String getFname() {
    return fname;
  }

  public String getLname() {
    return lname;
  }

  public String getAddress() {
    return address;
  }

  public String getHnamber() {
    return hnamber;
  }

  public String getMobnamber() {
    return mobnamber;
  }

  public String getGroup() {
    return group;
  }
}
