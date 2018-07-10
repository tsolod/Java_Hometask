package ru.stqa.javahome.sandbox;

public class RunPoint {

  public static void main(String[] args) {
    Point p1 = new Point(3.0, 5.0);
    Point p2 = new Point(8.0,1.0);
    System.out.println("Расстояние между точками равно " + p1.distance(p2));
  }


}
