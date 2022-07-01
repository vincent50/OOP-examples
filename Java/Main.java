package Java;

class Main {
  public static void main(String[] args) {
    System.out.println("Hola Mundo");
    Account driver = new Account("Vincent", "12345", "vin_snchz", "123345");
    Car car = new Car("QWA324S", driver, 2);
    System.out.println(car.toString());
  }
}