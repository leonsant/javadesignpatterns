# Observer Pattern

This is a very interesting pattern that we should apply when we have one object that needs to be aware of changes of state in another object.

Instead of making the interested objects to frequently poll the object holding the data (in a sort of "Do you have new data?" question), which leads to spending valuable CPU cycles (only worthy when the data did change), this pattern suggests that we change the paradigm and make the object holding the data to notify any other interested objects, when the data changed.

This implementation violates the Single Responsibility Principle, in the sense that the ChatRoom should not need to care about notifying other objects and should focus only on chat-room-related aspects.
