package com.ea.utilities

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select

public class CommonFunctions {

@Keyword
	def checkDropDownListElementExist(TestObject object, String value) {

		boolean flag = false;
		WebElement dropdown = WebUiCommonHelper.findWebElement(object, 20)
		Select sel = new Select(dropdown);

		for (WebElement elem : sel.getOptions()) {
			if(elem.getText().equals(value)) {
				println "Element exists"
				sel.selectByVisibleText(value)
				return flag = true;
			}
		}
		
		if (flag==true) {
			println "Element present in dropdown"
		}else {
			println "Element not present in dropdown"
		}
	}
}
