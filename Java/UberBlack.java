package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car {
  Map<String, Map<String, Integer>> typeCarAccepted;
  ArrayList<String> seatsMaterial;

  public UberBlack(String license,
      Account driver,
      Integer passenger,
      Map<String, Map<String, Integer>> typeCarAcceptedMap,
      ArrayList<String> seatsMaterial) {
    super(license, driver, passenger);
    this.typeCarAccepted = typeCarAcceptedMap;
    this.seatsMaterial = seatsMaterial;
  }
}
