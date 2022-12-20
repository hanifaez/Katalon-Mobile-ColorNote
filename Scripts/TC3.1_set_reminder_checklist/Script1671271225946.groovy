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

WebUI.callTestCase(findTestCase('common/create_checklist'), [('checklist_item1') : 'Cleaning bathroom', ('checklist_item2') : 'Doing dishes'
        , ('checklist_item3') : 'Doing laundry', ('checklist_item_a') : 'Ketchup', ('checklist_item_b') : 'Chili sauce', ('checklist_item_c') : 'Instant noodle'
        , ('checklist_item_d') : 'MSG', ('checklist_item_e') : 'Milo'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/TC3.1_set_reminder_checklist/android.widget.TextView - Grocery lists'), 0)

Mobile.tap(findTestObject('Object Repository/TC3.1_set_reminder_checklist/checklist option'), 0)

Mobile.tap(findTestObject('Object Repository/TC3.1_set_reminder_checklist/android.widget.TextView - Reminder'), 0)

Mobile.tap(findTestObject('Object Repository/TC3.1_set_reminder_checklist/android.widget.TextView - None'), 0)

Mobile.tap(findTestObject('Object Repository/TC3.1_set_reminder_checklist/android.widget.CheckedTextView - Time alarm'), 
    0)

Mobile.tap(findTestObject('Object Repository/TC3.1_set_reminder_checklist/set preset'), 0)

Mobile.tap(findTestObject('Object Repository/TC3.1_set_reminder_checklist/android.widget.CheckedTextView - 6 hours'), 0)

Mobile.tap(findTestObject('Object Repository/TC3.1_set_reminder_checklist/android.widget.Button - DONE'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/TC3.1_set_reminder_checklist/reminder set body'), 0)

Mobile.tap(findTestObject('Object Repository/TC3.1_set_reminder_checklist/back to note'), 0)

Mobile.closeApplication()

