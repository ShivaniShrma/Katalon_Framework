package webKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Adactin {
	@Keyword
	def loginDetails(String Username, String Password) {
		WebUI.navigateToUrl('http://adactinhotelapp.com/')
		
		WebUI.setText(findTestObject('Spy_OR/Page1_Adactin.com - Hotel Reservation System/input_Username_textbox'), Username)
		
		WebUI.setText(findTestObject('Spy_OR/Page1_Adactin.com - Hotel Reservation System/input_Password_textbox'), Password)
		
		WebUI.click(findTestObject('Spy_OR/Page1_Adactin.com - Hotel Reservation System/loginButton'))
		
	}
}
