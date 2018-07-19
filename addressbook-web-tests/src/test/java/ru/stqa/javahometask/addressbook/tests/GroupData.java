package ru.stqa.javahometask.addressbook.tests;

public class GroupData {
  private final String name;
  private final String head;
  private final String feet;

  public GroupData(String name, String head, String feet) {
    this.name = name;
    this.head = head;
    this.feet = feet;
  }

  public String getName() {
    return name;
  }

  public String getHead() {
    return head;
  }

  public String getFeet() {
    return feet;
  }
}
