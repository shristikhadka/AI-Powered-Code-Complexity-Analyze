# AI-Powered-Code-Complexity-Analyze
The AI-Powered Code Complexity Analyzer is a console-based Java tool designed to analyze the time and space complexity of Java code. It uses static code analysis techniques to inspect the code's Abstract Syntax Tree (AST) and predict its computational complexity. 
Overview
The AI-Powered Code Complexity Analyzer is a Java-based command-line application that analyzes the time and space complexity of input Java code. It performs static code analysis on Java code and provides a complexity assessment based on the constructs found in the code. The analyzer helps developers better understand the performance of their code and identify areas for optimization.

Features
Time Complexity Analysis: The tool detects loops, methods, and nested structures to analyze and report the time complexity (e.g., O(n), O(n^2)).
Space Complexity Analysis: It evaluates the space complexity by identifying methods, classes, and the use of memory-consuming structures.
Real-time Feedback: Users can input their Java code, and the tool will instantly display the calculated complexity for both time and space.
Customizable and Expandable: The analysis logic can be expanded to support additional complexity scenarios.
Requirements
Java 8 or higher
No additional libraries or dependencies required (pure Java implementation)
How to Run
Clone the repository or download the source code.
Navigate to the project directory:
bash
Copy
Edit
cd path/to/AI-Powered-Code-Complexity-Analyzer
Compile the code:
bash
Copy
Edit
javac -d out src/**/*.java
Run the program:
bash
Copy
Edit
java -cp out codecomplexityanalyzer.Main
Input your Java code when prompted. Type exit to terminate the program.
Example Usage
Input:
java
Copy
Edit
public class Test {
    public void myMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
Output:
yaml
Copy
Edit
Analyzing node: class
  Analyzing node: method
    Analyzing node: for
Analysis Result:
Time Complexity: O(n)
Space Complexity: O(n)

How It Works
Input: The user enters Java code into the console.
Parsing: The code is parsed into an Abstract Syntax Tree (AST).
Complexity Analysis: The AST is analyzed to detect loops, methods, and other constructs.
Output: The time and space complexities are calculated and displayed.
Future Improvements
Support for more Java constructs: Adding more specific analysis for various Java structures (e.g., recursion, nested functions).
Advanced time and space complexity calculations: Implementing deeper AI/heuristic-based analysis for more accurate complexity predictions.
GUI Implementation: Converting the console-based application to a graphical user interface (GUI) for better usability.
Contribution
Contributions are welcome! If you find any bugs, have suggestions, or want to add features, feel free to fork the repository and submit a pull request.


