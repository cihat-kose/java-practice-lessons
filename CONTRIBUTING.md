# Contributing

This repository contains independent Java learning examples. Keep
contributions focused and preserve the examples' educational structure.

For substantial changes, open an issue for discussion before starting work.

## Requirements

- Java 17
- Maven

## Verify changes

From the repository root, run:

```bash
mvn clean verify
```

This compiles the Java examples and runs the JUnit 5 test suite. Tests cover
selected deterministic examples; most learning examples do not yet have
automated tests.

## Pull requests

Summarize the change and its rationale in your pull request description.
Include the verification command you ran and its result, and add or update
focused tests when changing deterministic behavior.
