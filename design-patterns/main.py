"""Demonstration of null object pattern"""

import sys
from abc import ABCMeta, abstractmethod
from enum import Enum


class ICustomer(metaclass=ABCMeta):
    @abstractmethod
    def about(self):
        pass


class GoldCustomer(ICustomer):
    def about(self):
        return "Gold Customer"


class SilverCustomer(ICustomer):
    def about(self):
        return "Silver Customer"


class NullCustomer(ICustomer):
    def about(self):
        return "Customer type not implemented"


class CustomerTypes(Enum):
    Gold = 1
    Silver = 2


def get_customer(customerType):
    if customerType == CustomerTypes.Gold:
        return GoldCustomer()
    elif customerType == CustomerTypes.Silver:
        return SilverCustomer()
    else:
        return NullCustomer()


if __name__ == "__main__":
    customer_type = sys.argv[1]
    try:
        customer_type = CustomerTypes[customer_type]
    except:
        customer_type = None
    customer = get_customer(customer_type)
    print(customer.about())
