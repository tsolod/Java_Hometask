package ru.stqa.javahometask.addressbook;

public class ContactData {
  private final String fname;
  private final String lname;
  private final String address;
  private final String hnamber;
  private final String mobnamber;

  public ContactData(String fname, String lname, String address, String hnamber, String mobnamber) {
    this.fname = fname;
    this.lname = lname;
    this.address = address;
    this.hnamber = hnamber;
    this.mobnamber = mobnamber;
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
}
