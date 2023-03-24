from abc import ABCMeta, abstractmethod

class Drinks(ABCMeta):
    @abstractmethod
    def beverage(self):
        pass

class LatteDrink(Drinks):
    def beverage(self):
        print ("Ваш Латте готов")

class CapuchinoDrink(Drinks):
    def beverage(self):
        print ("Ваш Капучино готов")

class LimonadeDrink(Drinks):
    def beverage(self):
        print ("Ваш Лимонад готов")

class TeaDrink(Drinks):
    def beverage(self):
        print ("Ваш чай готов")