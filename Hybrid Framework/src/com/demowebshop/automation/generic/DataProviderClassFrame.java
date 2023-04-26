package com.demowebshop.automation.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class DataProviderClassFrame implements Framework_Constants
{
@DataProvider(name="testcred")
public static Object[][] getdata() throws EncryptedDocumentException, IOException
{
	Object[][] value = ReadDataFromExel.getMultipleData(SHEET_NAME);
	return value;
}
}
