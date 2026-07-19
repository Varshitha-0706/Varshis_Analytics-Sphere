class BankAccount:
    def __init__(self, balance):
        self.__balance = balance  # Private attribute

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount

    def get_balance(self):
        return self.__balance

account = BankAccount(1000)
print(account.get_balance())  # Outputs: 1000
account.__balance = 5000  # This will not change the balance due to encapsulation
print(account.get_balance())  # Still outputs: 1000
account.deposit(1000)
print(account.get_balance())
class Dog:
    def __init__(self, name):
        self.name = name

    def __str__(self):
        return f"Dog's name is {self.name}"

dog = Dog("Rex")
print(dog)  # Outputs: Dog's name is Rex


