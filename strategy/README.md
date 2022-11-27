#Strategy Pattern

In the strategy pattern we use interfaces so that we can shape the behaviour of the code by switching the implementations as needed.
There are several ways of doing this.

This code is a very simplified example where:

* The 'core' holds the interface and its functionality depends on it
* The specific implementations live in 'main' and depend on the core interface
* We can switch between the two different implementation (French and Portuguese dictionaries) and the behaviour of the program changes accordingly.
