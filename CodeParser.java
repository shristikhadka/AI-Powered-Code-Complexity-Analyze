package codecomplexityanalyzer;

public class CodeParser {
    public ASTNode parseCode(String code) {
        // Simple implementation: Just count methods and loops (to be enhanced)
        ASTNode rootNode = new ASTNode("root");

        // Example logic: Count the number of methods and loops (add more complexity parsing)
        int methodCount = code.split("void").length - 1;
        int loopCount = code.split("for").length - 1;

        // Creating a simple AST to reflect the code structure
        rootNode.addChild(new ASTNode("Methods: " + methodCount));
        rootNode.addChild(new ASTNode("Loops: " + loopCount));

        return rootNode;
    }
}
