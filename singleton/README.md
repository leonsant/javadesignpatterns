# Singleton Pattern

The goal of this pattern is to force clients to reuse the same instance of an object, globally, instead of letting them create a new instance each time the client wants to access the object methods.

This pattern is sometimes seen as an antipattern because carrying a state among different calls can cause issues.

The exact same call of a singleton method can easily return different results when the previous state is being taken into consideration.
Because of that we can face inconsistencies in code or test results, like when we run the code or tests twice and the results are different.

The singleton pattern is not suitable for multithreading environment, unless synchronization is used on the getInstance method to prevent race conditions.
It happens because two threads can call the getInstance method at the same time and end up both having its own instance of the singleton.

As a good practice, we should avoid using the Singleton pattern and prefer to simply create an unconstrained single object instance instead.

![](diagram.png?)
