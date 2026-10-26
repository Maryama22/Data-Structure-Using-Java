## Assignment 2: Hospital Medical Billing System

*Concepts:* Abstract Class

A private hospital in Mogadishu provides consultations, laboratory tests, and ultrasound examinations. Each service has different additional charges.

### Class Structure

| Class | Type | Description |
|---|---|---|
| MedicalService | Abstract class | serviceId, serviceName, baseCost, abstract calculateTotalCost(), concrete displayServiceInfo() |
| Consultation | Subclass | Adds doctorFee |
| LaboratoryTest | Subclass | Adds testCharge |
| Ultrasound | Subclass | Adds additionalFee |

### Cost Rules

- *Consultation:* baseCost + doctorFee
- *Laboratory Test:* baseCost + testCharge
- *Ultrasound:* baseCost + additionalFee

### OOP Concepts Demonstrated

- *Abstraction:* abstract class MedicalService
- *Abstract method:* calculateTotalCost() has no body
- *Concrete method:* displayServiceInfo() is shared by all subclasses
- *Polymorphism:* services stored in a MedicalService[] array

### Output



![Hospital Billing System](Assignment2-Hospital/Screenshots/hospital-output.png)




===== HOSPITAL BILLING SYSTEM =====

Service ID: S101
Service: Consultation
Total Cost: $45.00

Service ID:S102
Service: Laboratory Test
Total Cost: $30.00

Service ID:S103
Service: Ultrasound
Total Cost: $50.00

------------------------------
Total Hospital Bill: $125.00


### Questions

*1. Why is MedicalService declared abstract?*
It is a general idea, not a specific service. It holds common data, while each service calculates its cost differently.

*2. Can an object be created directly from MedicalService?*
No. It is incomplete (it has an abstract method), so new MedicalService() gives a compile error. Objects can only be created from its concrete subclasses.

*3. What is the difference between an abstract method and a concrete method?*
An abstract method has no body and must be implemented by subclasses. A concrete method has a full body and can be used or inherited directly.

*4. Why must each concrete subclass implement calculateTotalCost()?*
Otherwise the subclass would also be abstract and could not be instantiated. It also ensures each service defines its own cost formula.

---



## Author

 Maryan — programmer IT, Jamhuriya University of Science and Technology