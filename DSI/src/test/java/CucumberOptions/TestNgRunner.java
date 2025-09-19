package CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//Features is the on of the attributes of the CucumberOptions it will helps to TestNgRunner 
//to navigate to the features files 
//One More attributes that is glue which is used for the find the step definations 
//Monochrome used to convert output into the plain English language
@CucumberOptions(features= "src/test/java/Features",
glue = "TestDefination", monochrome = true)

public class TestNgRunner extends AbstractTestNGCucumberTests {

	
}
