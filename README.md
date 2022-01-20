# UML Class diagram exercise

Creating a UML class diagram from acceptance criteria, then implementing and testing the class.

PlantUML used for the class diagram.  Implementation in Java.

### Business Acceptance Criteria:
<ul>
<li>A Student must have a name
<li>A Student must have a single grade
<li>The value for grade must be one of the following: A, B, C, D, E, F
<li>A Student must have a single group
<li>The value for group must be one of the following: 1, 2, 3, 4, 5
<li>A Student has a secretNickName and is set to "MySecretNickName"
<li>The school should be able to initialise the Student Java Class with an initial value for name, grade and group.
<li>The school should be able to get the Student's grade securely
<li>The school should be able to get the Student's name securely
<li>The school should NOT be able to get the Student’s secretNickName
<li>The school should be able to call methods to upgrade and downgrade the Student's grade.
<li>For example, if the Student has a current grade of "B", an upgrade will result in the grade being set to "A".
<li>If the Student has a current grade of "C", a downgrade will result in the grade being set to "D".
</ul>

### Pre-Requisites
<ul>
<li>Java SE Development Kit (the code should work against version 11 upwards).
<li>Maven
<li>PlantUML - to view the class diagram
</ul>

