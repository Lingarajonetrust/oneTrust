package com.OnetrustAutomation.app;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class CommonFunctions {
	

	  
	  public void getscreenshot( WebDriver driver) throws Exception 
      {
              File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           //The below method will save the screen shot in resource folder drive with name "screenshot.png"
              FileUtils.copyFile(scrFile, new File("resources\\screenshot\\screenshot.png"));
      }

}
