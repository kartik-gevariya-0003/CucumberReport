import com.github.mkolisnyk.cucumber.reporting.CucumberCoverageOverview;
import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;

public class Test {
    public static void main(String[] args) throws Exception {
        CucumberResultsOverview results = new CucumberResultsOverview();
        results.setOutputDirectory("target");
        results.setOutputName("cucumber-results");
        results.setSourceFile("/Users/kartikgevariya/Extra/CucumberReport/src/main/java/cucumber.json");
        results.execute();

//        CucumberCoverageOverview results = new CucumberCoverageOverview();
//        results.setOutputDirectory("target");
//        results.setOutputName("cucumber-results");
//        results.setSourceFile("/Users/kartikgevariya/Extra/CucumberReport/src/main/java/cucumber.json");
//        results.setExcludeCoverageTags(new String[]{"@android"});
//        results.setIncludeCoverageTags(new String[]{"@ios"});
//        results.execute();
    }
}
