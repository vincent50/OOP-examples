import Car from Car

export class UberPool extends Car{
  constructor(license, driver, passenger, brand, model){
    super(license, driver, passenger);
    this.brand = brand;
    this.model = model;
  }
}