# Java Practice Lessons

[![CI Tests](https://img.shields.io/github/actions/workflow/status/cihat-kose/java-practice-lessons/build.yml?branch=master&style=for-the-badge&label=CI%20Tests&logo=github)](https://github.com/cihat-kose/java-practice-lessons/actions/workflows/build.yml)
[![Java 17](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![MIT License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](LICENSE)

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
files compiled successfully with Java release 17.

To compile and run the automated checks, use:

```bash
mvn clean verify
```

The current verification compiles 5 test source files and passes 14 JUnit 5
tests. The tests cover selected deterministic methods from the learning
examples; most of the repository remains practice code without automated
tests.

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
