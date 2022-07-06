from statistics import mode


from car import Car


class UberX(Car):
    brand = str
    model = str

    def __init__(self, license, driver, passanger, brand, model):
        super().__init__(license, driver, passanger)
        self.brand = brand
        self.model = model
