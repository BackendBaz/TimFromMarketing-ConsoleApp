Tim from Marketing Console App

- **Reference: [Exercism's Java Track](https://exercism.org/tracks/java)**
- **`Learning Exercise`**

# Instructions

In this exercise you'll be writing code to print name badges for factory employees.

1. Print a badge for an employee
   - Employees have an **ID**, **name** and **department name**. 
   - Employee badge labels are formatted as follows: `"[id] - name - DEPARTMENT"`.
   - Note that the department should be uppercased on the label.
2. Print a badge for a new employee
   - Modify the `print()` method to support new employees that don't yet have an **ID**.
3. Print a badge for the owner
   - An owner does not have a **department**. In this case, the label should print `"OWNER"` instead of the department name. Modify the `print()` method to print a label for the owner.
   - Note that it is possible for the **owner** to also be a **new employee**.
