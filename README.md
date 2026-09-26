# Java Practice Lessons

This repository contains independent Java practice examples for learning core
Java and object-oriented programming concepts. It is a learning repository,
not a production application.

## Requirements

- Java 17
- Maven

The project is configured for Java 17 and Maven.

## Running the examples in IntelliJ IDEA

Open the project in IntelliJ IDEA and mark `src` as the source directory if it
is not detected automatically. Classes with a `main` method can then be run
individually from the editor or the project view. Some examples expect input
from the terminal.

## Maven

To compile all sources from the repository root, run:

```bash
mvn clean compile
```

The build has been verified with IntelliJ IDEA's bundled Maven: 240 source
files compiled successfully with Java release 17. There are currently no
automated tests in the repository.

## Topics

The numbered folders provide a gradual progression through:

- Output, escape sequences, variables, data types, type casting, and strings
- Arithmetic, conditions, switch statements, loops, and user input
- Arrays, two-dimensional arrays, and methods
- ArrayList, two-dimensional ArrayList, sets, maps, and enums
- Classes, static and non-static methods, constructors, and access modifiers
- Encapsulation, inheritance, polymorphism, interfaces, and abstract classes

Each topic folder contains small, independent examples. Repeated class names
in different topic folders are intentional.

## Project information

- [License](LICENSE)
- [Contributing](CONTRIBUTING.md)
