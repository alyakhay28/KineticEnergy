# Kinetic Energy Calculator

Simple Java program to calculate kinetic energy.

## Formula
```
KE = ½ × mass × velocity²
```

## How to Run
1. Make sure you have Java installed
2. Compile:
   ```bash
   javac KineticEnergy.java
   ```
3. Run:
   ```bash
   java KineticEnergy
   ```

## Example
```
Enter object's mass (in kg): 5
Enter object's velocity (in ms^-1): 10
The Kinetic Energy for the given mass and velocity is: 250.0 joules
```

## What It Does
- Takes mass (kg) and velocity (m/s) as input
- Calculates kinetic energy in joules
- Shows the result

## Code
The program has one main method that:
1. Gets user input
2. Calls `calculateKineticEnergy()` method
3. Displays the answer

The calculation method uses:
```java
0.5 * mass * Math.pow(velocity, 2)
```
