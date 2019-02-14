# Model-View-Controller Pattern

# Why use MVC?
* decouples major components for code reuse and parallel development
* used for desktop GUIs, popular for desinging web and mobile app
* other benefits include clean separation of concerns (SoC), allows Test Driven Development (TDD) etc.

# Running Script
```
javac MVCPatternDemo.java
java MVCPatternDemo
```

# Example demo 
MVCPatternDemo
* uses StudentController

StudentController
* updates Student View
* uses Student

+ Model
    * Student.java
+ View
    * StudentView.java
+ Controller
    * StudentController.java

### Credits
* https://www.tutorialspoint.com/design_pattern/mvc_pattern.html