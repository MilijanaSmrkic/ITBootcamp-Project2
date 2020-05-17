package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import objects.Methods;
import utility.ExcelUtils;

public class Registration_Main_Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Registrovati 30 osoba, pri èemu se podaci o svakoj osobi èitaju iz xlsx ili
		// xls fajla. Za svaku osobu proveriti da li je registracija bila uspešna.

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		Methods.clickSignUp(wd);
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		ExcelUtils.setExcell("users.xls");
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
			wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Methods.openHomePage(wd);
			wd.manage().window().maximize();
			Methods.clickSignUp(wd);

			Methods.sendkeysUser(wd, ExcelUtils.getData(i, 0));
			Methods.sendkeysEmail(wd, ExcelUtils.getData(i, 1));
			Methods.sendkeysPassword(wd, ExcelUtils.getData(i, 2));
			Methods.sendkeysConfirm(wd, ExcelUtils.getData(i, 3));
			Methods.select(wd);
			Methods.submit(wd);
			Methods.clickAccount(wd);// da se izloguje

		}

		wd.quit();

	}

}
