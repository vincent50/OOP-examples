import Car from Car

export class UberVan extends Car{
  constructor(license, driver, passenger, typeCarAccepted, seatsMaterial){
    super(license, driver, passenger);
    this.typeCarAccepted = typeCarAccepted;
    this.seatsMaterial = seatsMaterial;
  }
}