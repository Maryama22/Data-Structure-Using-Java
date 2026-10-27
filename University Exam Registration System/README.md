# Assignment 3: Exception Handling

## University Exam Registration System

A Java console application that allows students to register for examinations. It validates student information, prevents invalid registrations, and displays meaningful error messages without terminating unexpectedly.

## Project Structure

```
Assignment3-ExamRegistration/
  Main.java
  Screenshots/
    successful-registration.png
    invalid-registration.png
```

## Class Structure

| Class | Description |
|---|---|
| `InvalidRegistrationException` | Custom checked exception for invalid registrations |
| `ExamRegistration` | Collects data with `Scanner` and validates it |
| `Main` | Runs the program using `try`, `catch`, and `finally` |

## Validation Rules

| Rule | Error Message |
|---|---|
| Student ID cannot be empty | `Student ID cannot be empty.` |
| Age must be at least 18 | `Age must be at least 18.` |
| Exam mark must be between 0 and 100 | `Exam mark must be between 0 and 100.` |
| Subjects must be at least 1 | `Minimum allowed subjects is 1.` |
| Subjects must be at most 5 | `Maximum allowed subjects is 5.` |
| Non-numeric input | `<Field> must be a valid number.` |

## OOP Concepts Demonstrated

- **Custom exception:** `InvalidRegistrationException extends Exception`
- **`throw`:** raises the exception inside `validate()`
- **`throws`:** declared on `collectData()` and `validate()`
- **`try` / `catch` / `finally`:** handled in `main`

## Output

### 1. Successful Registration



![Successful Registration](Screenshots/successful-registration.png)



```
===== EXAM REGISTRATION SYSTEM =====

Enter Student ID: ST001
Enter Student Name: Asiya
Enter Age: 22
Enter Exam Mark: 89
Enter Number of Subjects: 4

Registration Successful!
Student: Asiya
Registered Subjects: 4

Registration attempt completed.
```

### 2. Invalid Registration



![Invalid Registration](Screenshots/invalid-registration.png)



```
===== EXAM REGISTRATION SYSTEM =====

Enter Student ID: Sm002
Enter Student Name: Ali
Enter Age: 21
Enter Exam Mark: 78
Enter Number of Subjects: 8

Registration Failed!
Error: Maximum allowed subjects is 5.

Registration attempt completed.
```

## Questions

**1. What is the purpose of the try and catch blocks?**
The `try` block contains code that may cause an error (reading and validating input). The `catch` block handles the exception when it occurs and shows a meaningful message, so the program does not terminate unexpectedly.

**2. Explain the difference between throw and throws.**

| | `throw` | `throws` |
|---|---|---|
| What it is | A statement that raises an exception | A declaration in the method signature |
| Where | Inside a method body | After the method name |
| Example | `throw new InvalidRegistrationException("...")` | `void validate() throws InvalidRegistrationException` |
| Purpose | Create and throw the exception | Warn that the method may throw it |

**3. What is the purpose of the finally block?**
It always runs, whether an exception occurs or not. It is used for cleanup (such as closing the `Scanner`) and for printing "Registration attempt completed."

**4. Why is a custom exception useful in this application?**
- It makes registration errors specific and clear instead of using a generic `Exception`.
- Error messages can carry application-specific meaning.
- `catch` handles only registration errors, not unrelated ones.
- The code is easier to read and maintain.


