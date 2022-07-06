package Java;

public class Car {
  private Integer id;
  private String licence;
  private Account driver;
  private Integer passenger;

  public Car(String license, Account driver) {
    this.licence = license;
    this.driver = driver;
  }

  // getter
  public Integer getId() {
    return id;
  }

  public Account getDriver() {
    return driver;
  }

  public String getLicence() {
    return licence;
  }

  public Integer getPassenger() {
    return passenger;
  }

  // setter
  public void setId(Integer id) {
    this.id = id;
  }

  public void setDriver(Account driver) {
    this.driver = driver;
  }

  public void setLicence(String licence) {
    this.licence = licence;
  }

  public void setPassenger(Integer passenger) {
    if (passenger == 4) {
      this.passenger = passenger;
    } else {
      System.out.println("debe tener 4 asientos");
    }
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    String texto = "license: " + this.licence;
    return texto;
  }
}
