package ru.stqa.pft.sandbox;

import java.awt.geom.Point2D;

public class Point {

  public double x;
  public double y;

  public Point (double x, double y) {
    this.x = x;
    this.y = y;
  }
  public static double distance(Point p1, Point p2) {
    return  Point2D.distance(p1.x, p1.y, p2.x, p2.y);
            }
}
