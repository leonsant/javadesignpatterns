# Factory Pattern

This pattern is used when there is a non-trivial logic behind the creation of instances of the objects needed for the program to work or if we do not know which instances to create. 

In addition to picking up different classes for building instances, it can also be used to shape the same classes differently, based on their attributes. 
Because of that, the factory pattern can help to prevent class explosion.

In the example source code, we have a BalancedShipFactory, which uses round-robin to pick up a product class, and a RandomShipFactory, that uses a randomized instance creation strategy.

![](diagram.png?)