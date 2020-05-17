package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objects.Methods;
import utility.ExcelUtils;

public class Log_In_Main_Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		ExcelUtils.setExcell("korisnici.xls");
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {

			Methods.openHomePage(wd);
			wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			Methods.sendkeysUsername(wd, ExcelUtils.getData(i, 0));
			Methods.sendkeysPass(wd, ExcelUtils.getData(i, 2));
			Methods.clickLogIn(wd);

			Methods.clickAccount(wd);

		}

		wd.quit();

	}

}
