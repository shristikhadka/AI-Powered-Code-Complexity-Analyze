package codecomplexityanalyzer;

import java.util.ArrayList;
import java.util.List;

public class ASTNode {
    private String value;
    private List<ASTNode> children;

    public ASTNode(String value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public String getValue() {
        return value;
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    public void addChild(ASTNode child) {
        children.add(child);
    }
}
