# Hailstone Series Generator

This repository contains a series of Java programs designed to generate and manipulate the Hailstone series, also known as the Collatz sequence, based on user input.

The Hailstone series is a sequence of numbers relevant to the unsolved problem in mathematics known as the Collatz conjecture. The sequence starts with any positive integer. Each subsequent number is obtained from the previous number as follows:

- If the previous number is even, the next number is one half of the previous number.
- If the previous number is odd, the next number is 3 times the previous number plus 1.

The conjecture is that no matter what value of n, the sequence will always reach 1.

## Files

### Hailstone1.java

This program generates and outputs the Hailstone series starting with the given integer.

### Hailstone2.java

This program generates and outputs the length of the Hailstone series starting with the given integer.

### Hailstone3.java

This program generates and outputs the maximum value of the Hailstone series starting with the given integer.

### Hailstone4.java

This program generates and outputs the maximum value of the Hailstone series starting with the given integer. It also allows the user to calculate another series by entering 'y' or 'n' when prompted.

### Hailstone5.java

This program repeatedly asks the user for a positive integer until the user enters one. It then generates and outputs the maximum value of the Hailstone series starting with this integer. It also allows the user to calculate another series by entering 'y' or 'n' when prompted.

### Hailstone6.java

This program generates and outputs the Hailstone series starting with the given NaturalNumber. It uses the NaturalNumber2 class from the components.naturalnumber package.

## Usage

Each program can be run in any Java IDE or from the command line using the `java` command followed by the filename (without the .java extension).

For example, to run Hailstone1.java:

```bash
java Hailstone1
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)
