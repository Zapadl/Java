from abc import ABCMeta, abstractmethod

import controller as c
from drink_enum import Drink

class ViewInterface(ABCMeta):

    @abstractmethod
    def orderDrinks(self):
        pass

class ConsoleView(ViewInterface):
    def orderDrinks(self):
        print("Выберите напиток:")
        for dr in Drink:
            print("{:15} - {}".format(dr.value, dr.name))

        dr = int(input(">>>"))
        amount = int(input("Количество напитков >>>"))
        for i in range(amount):
            c.beverageDrink(Drink(dr))

        c.countDrinks()

class WinView(ViewInterface):
    def orderDrinks(self):
        pass