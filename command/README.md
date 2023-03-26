# Command Pattern

The command pattern introduces a way of encapsulating requests between objects, decoupling the objects that generate those requests from the objects that receive them.
The command "knows" which method to execute upon which object and with which parameters but the caller triggers the action in a generic way.

Apart from decoupling aspect, the command pattern:
* makes it easier to implement an undo/redo mechanism
* allow same commands to be applied on different receivers

In the example code, we have an invoker, the Installer class, which works on a Product, the receiver.
This Installer has a list of install actions (commands) needed to install a product.
The classes that implement the Command interface have a "doIt" and an "undoIt" method, making uninstalling the product as easy as running each "undoIt" method in a reverse order.

![](diagram.png?)