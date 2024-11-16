package TestNg;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample //TestNG class
{
@Test
public void sample() {
	Reporter.log("sample testcase executed",true);
}
public void demo()  //test case
{
	//test steps
	Reporter.log("demo testcase executed",true);	
}
public void add()
{
	Reporter.log("add testcase executed",true);	
}

}
