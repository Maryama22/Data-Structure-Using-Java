# Hospital Package - Java Inheritance

This project demonstrates **inheritance** in Java using a hospital billing system. The `Patient` class is the superclass, and `Outpatient` and `Inpatient` extend it. Each class has a `CalculateBill()` method and a `Display()` method that prints its information, including the total bill.

## Class Structure

| Class | Type | Fields |
|---|---|---|
| `Patient` | Superclass | `name`, `consultFee` |
| `Outpatient` | Subclass | `labCharge` |
| `Inpatient` | Subclass | `roomCharge`, `numberOfDays` |

## Bill Calculation

- **Patient:** `Total Bill = consultFee`
- **Outpatient:** `Total Bill = labCharge + consultFee`
- **Inpatient:** `Total Bill = (numberOfDays × roomCharge) + consultFee`

## Output Screenshots

### 1. Patient (Superclass)



![Patient Output](Screenshots/Patient.png)



The base `Patient` class displays the patient's name, consult fee, and total bill.

- **Name:** Farah
- **Consult Fee:** $10.0
- **Total Bill:** $10.0

### 2. Outpatient (Subclass)



![Outpatient Output](Screenshots/Out-Patient.png)



`Outpatient` inherits `name` and `consultFee` from `Patient` and adds `labCharge`.

- **Name:** Hodan
- **Consult Fee:** $20.0
- **Lab Charge:** $15.0
- **Total Bill:** $35.0

Calculation: `15 + 20 = 35`

### 3. Inpatient (Subclass)



![Inpatient Output](Screenshots/in-Patient.png)



`Inpatient` inherits `name` and `consultFee` from `Patient` and adds `roomCharge` and `numberOfDays`.

- **Name:** Ali
- **Consult Fee:** $50.0
- **Room Charge:** $30.0
- **Number of Days:** 5
- **Total Bill:** $200.0

Calculation: `(5 × 30) + 50 = 200`

## Concepts Used

- Inheritance (`extends`)
- `super` constructor call
- Method overriding (`@Override`)
- Packages (`package hospital;`)

## How to Run

```
javac hospital/Main.java
java hospital.Main
```