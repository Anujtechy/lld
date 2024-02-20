**Null Object Design Pattern**
- A null object replaces NULL return type.
- No need to put if check for check NULL.
- Null object reflects do Nothing or default behaviour.

**Iterator Design Pattern**
- Provides a way to access element of a collection sequentially without exposing the underlying representation of the collection.

**Interpreter Design Pattern**
- Interpret expression based on CONTEXT

**Memento Design Pattern**
- It is also known as snapshot design pattern.
- Specifically used for keep the history of an object
- Provides an ability to revert the object to a previous state i.e. UNDO capability.
- It does not expose the object internal implementation
- Major Components
  - Originator 
    - It represents the object for which state need to be saved and restored.
    - Expose Methods to save and restore its state using Memento Object.
  - Memento
    - It represents an Object which holds the state of the Originator.
  - Caretaker
    - Manages the list of states i.e. list of Memento

**Template Design Pattern**
- When you want all classes to follow the specific steps to process the task but also need to provide the flexibility that each class can have their own logic in that specific steps.

**Command Design Pattern**
- Let's take the use-case of Remote control which can control various home appliances and with that lets understand the problem, then we will go with this pattern.
- It separates the logic of:
  - Receiver
  - Invoker
  - Command