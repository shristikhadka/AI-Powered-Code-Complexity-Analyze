package codecomplexityanalyzer;

public class CodeAnalysisResult {
    private String timeComplexity;
    private String spaceComplexity;

    public CodeAnalysisResult(String timeComplexity, String spaceComplexity) {
        this.timeComplexity = timeComplexity;
        this.spaceComplexity = spaceComplexity;
    }

    public String getTimeComplexity() {
        return timeComplexity;
    }

    public String getSpaceComplexity() {
        return spaceComplexity;
    }
}
