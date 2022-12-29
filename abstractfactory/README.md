# Abstract Factory Pattern

This pattern is much similar to the Factory Pattern except that instead of having a factory that creates a single object, it has a factory that creates multiple objects.

Those objects can be:
* different implementations of a certain product
* same implementation of a certain product (but created using different parameters)
* different implementations of different products
* same implementation of different products (but created using different parameters)

The goal of this pattern is to control the creation of object instances through classes to prevent the generation of incompatible products.
It is achieved by the different factory implementations, which only provide creation options that make sense for our software.

In the example source code, we have a FrenchMenuFactory, ChineseMenuFactory and IndianMenuFactory, which allow for the creation of specific sets of Starter, Meal and Dessert.

Reference: https://socook.co.uk/menu-category/dinner-party-menus

![](diagram.png?)