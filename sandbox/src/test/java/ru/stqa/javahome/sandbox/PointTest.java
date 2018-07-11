package ru.stqa.javahome.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
  @Test
  public void testDistance1(){ //от начала координат до точки
    Point p1 = new Point(0,0);
    Point p2 = new Point (7,2);
    Assert.assertEquals( Math.round(p1.distance(p2)), 7 );
  }
  @Test
  public void testDistance2(){ //от самой себя
  Point p1 = new Point (7,2);
  Assert.assertEquals( Math.round(p1.distance(p1)), 0 );
}

  @Test
  public void testDistance3(){ //из противоположных областей
    Point p1 = new Point (-7,2);
    Point p2 = new Point (7,-2);
    Assert.assertEquals( Math.round(p1.distance(p2)), 15 );
  }

}
