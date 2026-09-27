# SC-Assignment-1-OOP

Assignment 1 for **Software Construction and Development** — demonstrating core Object-Oriented Programming principles in Java.

**Author:** Hashir Azeem
**Course:** Software Construction and Development
**Semester:** 5th
**University:** UET

## Overview

This repository contains four tasks, each demonstrating a different OOP principle:

| Task | Principle | Files |
|---|---|---|
| Task 1 | Encapsulation | `DigitalWallet.java`, `WalletDemo.java` |
| Task 2 | Inheritance & Polymorphism | `Employee.java`, `Developer.java`, `SalesManager.java`, `EmployeeMain.java` |
| Task 3 | Abstraction (Interfaces) | `SmartDevice.java`, `SmartBulb.java`, `SmartThermostat.java`, `SmartDeviceMain.java` |
| Task 4 | AI Code Review | `Book.java`, `Member.java`, `Library.java`, `LibraryMain.java` |

## Task 1: The Broken Vault (Encapsulation)

Refactors an unsafe `DigitalWallet` class (public fields) into a properly encapsulated version:
- `balance` can never go negative
- `pinCode` is set once via the constructor and never exposed
- `withdraw(amount, pin)` validates both the PIN and available funds before processing

Run `WalletDemo.java` to see wrong-PIN rejection, a valid withdrawal, an insufficient-funds rejection, and the final balance.

## Task 2: The Evolving Workforce (Inheritance & Polymorphism)

`Employee` is the base class; `Developer` (fixed tech allowance) and `SalesManager` (commission-based) override `calculatePay()`. `EmployeeMain` loops through a single `List<Employee>` and prints each employee's final pay, demonstrating runtime polymorphism.

Run `EmployeeMain.java` to see calculated pay for each employee type.

## Task 3: Design by Contract (Abstraction)

`SmartDevice` is an interface with `turnOn()`, `turnOff()`, and `getStatus()`. `SmartBulb` and `SmartThermostat` implement it independently, each with its own unique method (`setBrightness()` / `setTemperature()`).

Run `SmartDeviceMain.java` to see both devices report their status through the shared interface.

## Task 4: The AI Code Review (Meta-Learning)

An AI-generated Library System (`Book`, `Member`, `Library`) was reviewed for OOP soundness, a design flaw identified, and a corrected version implemented in `LibraryMain.java`.

## How to Run

**In NetBeans:** open the project, then right-click any `*Main.java` or `*Demo.java` file → **Run File**.

**From the command line:**
```bash
javac *.java
java WalletDemo
java EmployeeMain
java SmartDeviceMain
java LibraryMain
```

## Project Structure

```
Assignment1/
└── src/
    ├── DigitalWallet.java
    ├── WalletDemo.java
    ├── Employee.java
    ├── Developer.java
    ├── SalesManager.java
    ├── EmployeeMain.java
    ├── SmartDevice.java
    ├── SmartBulb.java
    ├── SmartThermostat.java
    ├── SmartDeviceMain.java
    └── (Task 4 files)
```
