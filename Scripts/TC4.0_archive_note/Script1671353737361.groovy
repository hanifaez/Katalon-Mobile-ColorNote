import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('common/create_note'), [('note_body_1') : 'Cloud testing is the process of using the cloud computing resources of a third-party service provider to test software applications.'
        , ('note_body_2') : 'API testing is a type of software testing that analyzes an application program interface (API) to verify it fulfills its expected functionality, security, performance and reliability'
        , ('note_body_3') : 'Regression testing is testing existing software applications to make sure that a change or addition hasn\'t broken any existing functionality.'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHold(findTestObject('Object Repository/TC4.0_achive_note/android.widget.TextView - Regression Testing'), 0, 
    0)

Mobile.tap(findTestObject('Object Repository/TC4.0_achive_note/android.widget.TextView - Cloud Testing'), 0)

Mobile.tap(findTestObject('Object Repository/TC4.0_achive_note/android.widget.TextView - Archive'), 0)

Mobile.tap(findTestObject('Object Repository/TC4.0_achive_note/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/TC4.0_achive_note/more button'), 0)

Mobile.tap(findTestObject('Object Repository/TC4.0_achive_note/archive section'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/TC4.0_achive_note/Archive note 1'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/TC4.0_achive_note/Archive note 2'), 0)

Mobile.tap(findTestObject('Object Repository/TC4.0_achive_note/back button'), 0)

Mobile.tap(findTestObject('Object Repository/TC4.0_achive_note/note button'), 0)

Mobile.closeApplication()

