package Java;

import java.util.ArrayList;

public class Route {
  Integer id;
  ArrayList<Double> start;
  ArrayList<Double> end;

  public Route(ArrayList<Double> start, ArrayList<Double> end) {
    this.start = start;
    this.end = end;
  }
}
