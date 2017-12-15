package com.maven.cucumber.dataProvider;

import org.testng.annotations.DataProvider;

import com.maven.cucumber.excelRead.ExcelReadClass;
import com.maven.cucumber.utility.utility;

public class DataProviderClass {

	@DataProvider(name = "LoginFunctionality")
    public static Object[][] FetchData() throws Exception{
		String ExcelPath = utility.getDataRepoFilePath();
        Object[][] retObjArr= ExcelReadClass.getTableArray(ExcelPath ,
                "Sheet1", "testdata1");
        return(retObjArr);
    }
	
}
