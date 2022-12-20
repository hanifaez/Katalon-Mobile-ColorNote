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

Mobile.startExistingApplication('com.socialnmobile.dictapps.notepad.color.note')

Mobile.tap(findTestObject('Object Repository/TC1.0_create_simple_note/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC1.0_create_simple_note/android.widget.LinearLayout (1)'), 0)

Mobile.setText(findTestObject('TC1.0_create_simple_note/android.widget.EditText (1)'), GlobalVariable.NOTE_TITLE_1, 0)

Mobile.setText(findTestObject('TC1.0_create_simple_note/android.widget.EditText (2)'), note_body_1, 0)

Mobile.tap(findTestObject('Object Repository/TC1.0_create_simple_note/android.widget.ImageButton (2)'), 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('create_note/Cloud Testing Object Note'), 0)

Mobile.tap(findTestObject('Object Repository/TC1.0_create_simple_note/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC1.0_create_simple_note/android.widget.LinearLayout (1)'), 0)

Mobile.setText(findTestObject('TC1.0_create_simple_note/android.widget.EditText (1)'), GlobalVariable.NOTE_TITLE_2, 0)

Mobile.setText(findTestObject('TC1.0_create_simple_note/android.widget.EditText (2)'), note_body_2, 0)

Mobile.tap(findTestObject('Object Repository/TC1.0_create_simple_note/android.widget.ImageButton (2)'), 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('create_note/API testing Object Note'), 0)

Mobile.tap(findTestObject('Object Repository/TC1.0_create_simple_note/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC1.0_create_simple_note/android.widget.LinearLayout (1)'), 0)

Mobile.setText(findTestObject('TC1.0_create_simple_note/android.widget.EditText (1)'), GlobalVariable.NOTE_TITLE_3, 0)

Mobile.setText(findTestObject('TC1.0_create_simple_note/android.widget.EditText (2)'), note_body_3, 0)

Mobile.tap(findTestObject('Object Repository/TC1.0_create_simple_note/android.widget.ImageButton (2)'), 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('create_note/Regression Testing Object Note'), 0)

