package runner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import org.apache.velocity.exception.VelocityException;
import org.junit.Test;

public class CucumberReporter {

	public File reportOutDirectory = new File(System.getProperty("user.dir")+"/target/site/");
	public List<String> list = new ArrayList<String>();
	
	public void listFileForFolder(final File folder) {
		for (final File fileEntry : folder.listFiles()) {
			if(fileEntry.isDirectory()) {
				listFileForFolder(fileEntry);
				}else if (fileEntry.getName().endsWith(".json")) {
				
				System.out.println("***********"+ fileEntry.getName());
				list.add(reportOutDirectory + "/" + fileEntry.getName());
			}
		}
	}
	@Test
	public void generateReports() throws VelocityException, IOException{
		listFileForFolder(reportOutDirectory);
		String jenkinsBasepath = "";
		String buildNumber = "1";
		String projectName = "Cucumber_MJ";
		boolean runWithJenkins = false;
		boolean parallelTesting = false;
	Configuration configuration = new Configuration(reportOutDirectory, projectName);
			
//	configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);
    
    ReportBuilder reportBuilder = new ReportBuilder(list, configuration);
    reportBuilder.generateReports();
	
	}
}