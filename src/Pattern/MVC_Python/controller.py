from drink_factory_model import DrinkFactory

factory = DrinkFactory()

def beverageDrink(filling):
    drin = factory.createDrink(filling)
    drin.beverage(drin)

def countDrinks():
    factory.countDrinks()