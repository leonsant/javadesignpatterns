# Bridge Pattern

The bridge pattern is used when we want to prevent cross product between two 
different set of classes. We do it by separating these two set of hierarchies and using 
composition to make them work together.

In the example, different shapes (square, triangle and circle) are mixed with 
different colours (red, green and blue) avoiding class explosion, i.e., avoiding 
the creation of classes like RedSquare, BlueTriangle, GreenCircle, etc.

Instead of having to create 9 classes for all possible combination (most probably with 
some code duplication) we can manage it with 6 classes (most probably with no duplicated 
code). As the number of different flavours of each hierarchy increases the advantage 
of using the Bridge pattern becomes more evident.

![](diagram.png?)

### Reference for the example

https://refactoring.guru/design-patterns/bridge