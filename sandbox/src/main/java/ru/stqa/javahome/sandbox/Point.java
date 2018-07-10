package ru.stqa.javahome.sandbox;

class Point {
  public double x;
  public double y;

  /*public Point(double c, double d) {
    x = c;
    y = d;
  }*/


  public Point(double a, double b) {
    this.x = a;
    this.y = b;
  }


  public double distance(Point p) {
    return Math.sqrt( Math.pow(p.x-x,2) + Math.pow(p.y-y,2) );
  }
}
