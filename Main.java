package codecomplexityanalyzer;

import codecomplexityanalyzer.ASTNode;
import codecomplexityanalyzer.CodeAnalysisResult;
import codecomplexityanalyzer.CodeParser;
import codecomplexityanalyzer.ComplexityAnalyzer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display a welcome message
        System.out.println("AI-Powered Code Complexity Analyzer");
        System.out.println("====================================");

        // Ask user to input code
        System.out.println("Please enter your Java code (end with 'exit'):");
        StringBuilder codeInput = new StringBuilder();

        String line;
        while (!(line = scanner.nextLine()).equals("exit")) {
            codeInput.append(line).append("\n");
        }

        // Parse the code
        CodeParser codeParser = new CodeParser();
        ASTNode ast = codeParser.parseCode(codeInput.toString());

        // Analyze the code complexity
        ComplexityAnalyzer complexityAnalyzer = new ComplexityAnalyzer();
        CodeAnalysisResult result = complexityAnalyzer.analyzeComplexity(ast);

        // Display the result
        System.out.println("Analysis Result:");
        System.out.println("Time Complexity: " + result.getTimeComplexity());
        System.out.println("Space Complexity: " + result.getSpaceComplexity());
    }
}
