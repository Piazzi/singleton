<div align="center">
  <h1> SINGLETON </h1>
</div>

# Code

Simple project representing the singleton project pattern. In this example i used a singleton to represent a Log class for a system that needs to store and show erros/warnings for the user (IDE for example).

# Definition

The singleton design pattern is one of the twenty-three well-known "Gang of Four" design patterns that describe how to solve recurring design problems to design flexible and reusable object-oriented software with the aim of making it easier to implement, change, test, and reuse objects.[1]

The singleton design pattern solves problems by allowing it to:[2]

- Ensure that a class only has one instance
- Easily access the sole instance of a class
- Control its instantiation
- Restrict the number of instances
- Access a global variable

The singleton design pattern describes how to solve such problems:

- Hide the constructors of the class.
- Define a public static operation (getInstance()) that returns the sole instance of the class.
In essence, the singleton pattern forces it to be responsible for ensuring that it is only instantiated once. A hidden constructor—declared private or protected—ensures that the class can never be instantiated from outside the class. The public static operation can be accessed by using the class name and operation name, e.g., Singleton.getInstance().

Source: <a href="https://en.wikipedia.org/wiki/Singleton_pattern"> Wikipedia </a>
