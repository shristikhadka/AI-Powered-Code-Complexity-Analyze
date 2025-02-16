package codecomplexityanalyzer;

public class ComplexityAnalyzer {

    public CodeAnalysisResult analyzeComplexity(ASTNode ast) {
        // Default complexity values
        int timeComplexity = 1;  // O(1) by default
        int spaceComplexity = 1; // O(1) by default

        // Print the structure of AST for debugging
        printASTStructure(ast, 0);

        // Traverse AST to analyze time and space complexity
        for (ASTNode child : ast.getChildren()) {
            String nodeValue = child.getValue().toLowerCase();

            // Debugging: show what is being analyzed
            System.out.println("Analyzing node: " + nodeValue);

            // Detect loops (for, while) and set time complexity
            if (nodeValue.contains("for") || nodeValue.contains("while")) {
                // A loop is found, assume O(n) for a simple loop
                timeComplexity = 2;  // O(n)
            }

            // Detect methods or classes for space complexity
            if (nodeValue.contains("method") || nodeValue.contains("class")) {
                spaceComplexity += 1;  // Space increases with methods/classes
            }

            // Detect nested loops for higher time complexity (O(n^2))
            if ((nodeValue.contains("for") || nodeValue.contains("while")) && !child.getChildren().isEmpty()) {
                timeComplexity = Math.max(timeComplexity, 4); // Nested loop increases time complexity
            }
        }

        // Return the analysis results
        return new CodeAnalysisResult(getTimeComplexityNotation(timeComplexity), getSpaceComplexityNotation(spaceComplexity));
    }

    // Helper method to print the AST structure for debugging
    private void printASTStructure(ASTNode node, int level) {
        System.out.println(" ".repeat(level * 2) + node.getValue());
        for (ASTNode child : node.getChildren()) {
            printASTStructure(child, level + 1);
        }
    }

    // Helper method to convert time complexity integer to readable O notation
    private String getTimeComplexityNotation(int timeComplexity) {
        switch (timeComplexity) {
            case 2: return "O(n)";  // Time complexity for simple loops
            case 4: return "O(n^2)"; // Time complexity for nested loops
            default: return "O(1)";  // Default if no significant operations
        }
    }

    // Helper method to convert space complexity integer to readable O notation
    private String getSpaceComplexityNotation(int spaceComplexity) {
        switch (spaceComplexity) {
            case 3: return "O(n)";  // Space for methods, variables
            case 4: return "O(n^2)"; // Nested methods or structures
            default: return "O(1)";  // Default if no extra space is used
        }
    }
}


