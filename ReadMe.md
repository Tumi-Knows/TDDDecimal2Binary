#READ ME
## Purpose of this project
This project is a simple calculator that takes an integer and returns the binary
equivalent of that number. The returned value is displayed on the command line. 
The binary digits are represented by the values. The project serves as an exercise
in working with TDD in the real world, and seeing the benefits of this discipline
of software development. 
 
**NB:** the character 'A' represents a 1, and the character 'B' represents a 0.
 
## Stories
A user picks up the binary converter, and enters an integer on the command line
and sees the binary equivalent.
 
### Scenario 1
A user enters the number zero, and sees his input converted to the value 'B'.
 
### Scenario 2
A user enters the number 1, and sees his input converted to the value 'A'
 
### Scenario 3
A user enters the number 2 into the converter, and sees his input converted to
the value 'AB'.

### Scenario 4
A user enters the number 3, and sees his input converted to the value 'AA'
 
### Scenario 5
A user enters a value greater than 3, and should see his input converted to the
corresponding binary value e.g. 5 should be 'ABA'