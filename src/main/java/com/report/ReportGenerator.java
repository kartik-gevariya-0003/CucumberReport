package com.report;

import com.github.mkolisnyk.cucumber.reporting.CucumberCoverageOverview;
import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;

public class ReportGenerator {
    public static void generateOverviewReport(String inputPath, String outputPath) throws Exception {
        CucumberResultsOverview results = new CucumberResultsOverview();
        results.setOutputDirectory(outputPath);
        results.setOutputName("cucumber-results");
        results.setSourceFile(inputPath);
        results.execute();
    }

    public static void generateCoverageOverviewReport(String inputPath, String outputPath) throws Exception {
        CucumberCoverageOverview results = new CucumberCoverageOverview();
        results.setOutputDirectory(outputPath);
        results.setOutputName("cucumber-results");
        results.setSourceFile(inputPath);
        results.execute();
    }
}
