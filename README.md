# String Calculator

This project implements a String Calculator that processes a string of numbers separated by commas, new lines, or custom delimiters and returns the sum of the numbers. It also handles cases where the input may contain negative numbers or non-numeric values.

## Features

- **Empty String**: Returns `0`.
- **Single Number**: Returns the number itself.
- **Two or More Numbers**: Supports comma and newline as delimiters.
- **Custom Delimiters**: Supports user-defined delimiters using the format `//[delimiter]\n[numbers]`.
- **Negative Numbers**: Throws an exception if negative numbers are present and lists them in the error message.
- **Non-Numeric Values**: Throws an exception if non-numeric values are encountered.


## Usage

1. **Clone the repository**:
    ```sh
    git clone https://github.com/MananPatel21/string-calculator.git
    cd string-calculator
    ```

2. **Compile the project**:
    ```sh
    mkdir -p out
    javac -d out src/main/java/com/example/StringCalculator.java
    ```

3. **Run the application**:
    ```sh
    java -cp out com.example.StringCalculator
    ```
    
4. **Run tests**:
    ```sh
    mvn compile
    mvn test
    ```

5. **Input Format**:
    - **Comma-Separated**: `18,45,33`
    - **New Line Separated**: `18\n45\n33`
    - **Custom Delimiter**: `//[delimiter]\n[numbers]`, e.g., `//;\n18;45;33`

## Acknowledgements

- **JUnit**: Used for unit testing.
- **Java**: The programming language used for this project.

---
