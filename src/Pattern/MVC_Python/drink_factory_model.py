from random import randint
from drink_enum import Drink
from drink import *

class DrinkFactory:

    def __init__(self):
        self.latteCount =0
        self.capuchinoCount = 0
        self.limonadeCount = 0
        self.teaCount = 0

    def createDrink(self, filling):
        match filling:
            case Drink.LATTE:
                self.latteCount += 1
                return LatteDrink
            case Drink.CAPUCHINO:
                self.capuchinoCount += 1
                return CapuchinoDrink
            case Drink.LIMONADE:
                self.limonadeCount += 1
                return LimonadeDrink
            case Drink.TEA:
                self.teaCount += 1
                return TeaDrink
            case _:
                raise Exception("Напиток не найден")

    def countDrinks(self):
        print("""Ваши напитки:
        {} latte
        {} Капучино
        {} Лимонад
        {} чай """
              .format(self.latteCount, self.capuchinoCount, self.limonadeCount, self.teaCount))
