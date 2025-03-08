package com.pranoti.selenium;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class LoginTest {

    @DataProvider(name = "logindata1")
    public Object[][] getData(Method method) {
        String excelPath = "D:\\PranotiWorkspace\\seleniumTestNG\\src\\test\\resources\\logindata1.xlsx";
        ExcelUtils excel = new ExcelUtils(excelPath, "Sheet1");

        int rowCount = excel.getRowCount();
        int colCount = excel.getColCount();

        Object data[][] = new Object[rowCount - 1][colCount];

        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                data[i - 1][j] = excel.getCellData(i, j);
            }
        }
        return data;
    }

    @Test(dataProvider = "logindata1")
    public void testLogin(String username, String password) {
        System.out.println("Testing login with: " + username + " / " + password);
        // Add your login test logic here
        // Example: Assert.assertTrue(loginPage.login(username, password));
    }
}
