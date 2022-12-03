# Strategy Pattern

In the strategy pattern we use interfaces so that we can shape the behaviour of the code by switching the implementations as needed.

In this example we have:

* The 'core' package holds the interface. The 'core' functionality depends on it
* The specific implementations live in 'main' package and depend on the 'core' interface

We can switch between the two different implementation (French and Portuguese dictionaries) and the behaviour of the program changes accordingly.

![](diagram.png?)