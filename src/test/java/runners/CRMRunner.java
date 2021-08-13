package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src//test//resources//features//CRMLoginfeature.feature",
					glue= {"stepdefs"},
					monochrome=true,
							plugin= {"pretty" ,
									
									"html:target/reports/MainHtmlReport.html" }
					
			)
	public class CRMRunner {

	}