// A Point object represents a pair of (x, y) coordinates.
import java.util.*;
public class Point{
  private int x;
  private int y;
  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  
  public int setX(int newX)
  {
    x=newX;
    return x;
  }
  public int setY(int newY)
  {
    y=newY;
    return y;
  }
  public double distanceFromOrigin()
  {
    return Math.sqrt(x*x+y*y);
  }
  public double distance(Point p2)
  {
    return Math.sqrt((x-p2.getX())*(x-p2.getX())+(y-p2.getY())*(y-p2.getY()));
  }
  public void translate(int addX,int addY)
  {
    x+=addX;
    y+=addY;
  }
  public String toString()
  {
    String out="("+x+","+y+")";
    return out;
  }
}
