package Java;

public class Car {
  Integer id;
  String licence;
  Account driver;
  Integer passenger;

  public Car(String license, Account driver, Integer passenger) {
    this.licence = license;
    this.driver = driver;
    this.passenger = passenger;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    String texto = "license: " + this.licence;
    return texto;
  }
}
