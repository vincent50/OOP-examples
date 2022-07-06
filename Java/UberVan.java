package Java;

public class UberVan extends Car {
  String brand;
  String model;

  public UberVan(String license, Account driver, String brand, String model) {
    super(license, driver);
    this.brand = brand;
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public void setPassenger(Integer passenger) {
    if (passenger == 6) {
      super.setPassenger(passenger);
    } else {
      System.out.println("Debe tener 6 asientos");
    }
  }

}
