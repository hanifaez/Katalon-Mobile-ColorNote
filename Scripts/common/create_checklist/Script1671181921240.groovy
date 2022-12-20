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

Mobile.tap(findTestObject('Object Repository/create_checlist/Add button'), 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/Add Checklist'), 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/Checklist Title'), 0)

Mobile.setText(findTestObject('Object Repository/create_checlist/Checklist Title'), GlobalVariable.CHECKLIST_TITLE_1, 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/Checklist Add item'), 0)

Mobile.setText(findTestObject('Object Repository/create_checlist/Add list set text'), checklist_item_a, 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/Checklist Add item'), 0)

Mobile.setText(findTestObject('Object Repository/create_checlist/Add list set text'), checklist_item_b, 0)

Mobile.tap(findTestObject('create_checlist/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/Checklist Add item'), 0)

Mobile.setText(findTestObject('Object Repository/create_checlist/Add list set text'), checklist_item_c, 0)

Mobile.tap(findTestObject('create_checlist/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/Checklist Add item'), 0)

Mobile.setText(findTestObject('Object Repository/create_checlist/Add list set text'), checklist_item_d, 0)

Mobile.tap(findTestObject('create_checlist/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/Checklist Add item'), 0)

Mobile.setText(findTestObject('Object Repository/create_checlist/Add list set text'), checklist_item_e, 0)

Mobile.tap(findTestObject('create_checlist/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/android.widget.ImageButton'), 0)

Mobile.verifyElementVisible(findTestObject('create_checlist/verify added checklist'), 0)

Mobile.tap(findTestObject('create_checlist/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/Add button'), 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/Add Checklist'), 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/Checklist Title'), 0)

Mobile.setText(findTestObject('Object Repository/create_checlist/Checklist Title'), GlobalVariable.CHECKLIST_TITLE_2, 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/Checklist Add item'), 0)

Mobile.setText(findTestObject('Object Repository/create_checlist/Add list set text'), checklist_item1, 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/Checklist Add item'), 0)

Mobile.setText(findTestObject('Object Repository/create_checlist/Add list set text'), checklist_item2, 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/Checklist Add item'), 0)

Mobile.setText(findTestObject('Object Repository/create_checlist/Add list set text'), checklist_item3, 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/create_checlist/android.widget.ImageButton'), 0)

Mobile.verifyElementVisible(findTestObject('create_checlist/verify added checklist'), 0)

Mobile.tap(findTestObject('create_checlist/android.widget.ImageButton'), 0)

