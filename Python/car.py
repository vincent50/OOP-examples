from Python.account import Account


class Car:
    id = int
    license = str
    driver = Account("", "")
    passenger = str

    def __init__(self, license, driver, passenger):
        self.licence = license
        self.driver = driver
        self.passenger = passenger
