package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testPoint() {
    Point p1 = new Point(10, 15);
    Point p2 = new Point(20, 25);
    Assert.assertEquals(Point.distance(p1, p2), 14.142135623730951);
  }
}
