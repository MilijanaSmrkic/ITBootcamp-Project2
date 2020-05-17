package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Methods;
import utility.ExcelUtils2;

public class Products_Test {

	public static WebDriver wd;
	public static SoftAssert sa = new SoftAssert();

	@BeforeClass
	public static void createDriver() {
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		wd = new ChromeDriver();

	}

	@AfterClass
	public void closeDriver() {
		wd.close();
	}

	// Testirati dodavanje 5 proizvoda - potrebno je popuniti samo osnovne podatke.
	// (Potrebne podatke uèitati iz xlsx ili xls fajla, kreirati proizvode i
	// proveriti da li je njihovo kreiranje uspešno).

	@Test(priority = 0)
	public void productCreation() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.sendkeysUsername(wd, "marija12");
		Methods.sendkeysPass(wd, "Marija12");
		Methods.clickLogIn(wd);

		ExcelUtils2.setExcell("products.xls");
		ExcelUtils2.setWorkSheet(0);

		for (int i = 1; i < 6; i++) {
			Methods.clickProducts(wd);
			Methods.clickAddProduct(wd);
			Methods.typeName(wd, ExcelUtils2.getData(i, 0));
			Methods.typeID(wd, ExcelUtils2.getData(i, 1));
			Methods.typePrice(wd, ExcelUtils2.getData(i, 2));
			Methods.button1(wd);
			Methods.button2(wd);
			Methods.submitChange(wd);

		}

		Methods.clickView(wd);
		Methods.clear1(wd);
		Methods.clear2(wd);
		Methods.clear3(wd);
		Methods.clear4(wd);
		Methods.clear5(wd);
		Methods.clickDelete(wd);
		sa.assertEquals(wd.getTitle(), "Seller Area / Delete Products");
		sa.assertAll();
		Methods.clickAccount(wd); // da se izloguje

	}

	// Poveæati cenu prethodno kreiranih proizvoda za 100 i proveriti uspešnost
	// izmena.

	@Test(priority = 1)
	public void priceIncrease() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.sendkeysUsername(wd, "marija12");
		Methods.sendkeysPass(wd, "Marija12");
		Methods.clickLogIn(wd);
		Methods.clickProducts(wd);

		Methods.raisePrices(wd);
		Methods.clickView(wd);
		sa.assertEquals(Methods.gettext1(wd), "400.00");
		sa.assertEquals(Methods.gettext2(wd), "600.00");
		sa.assertEquals(Methods.gettext3(wd), "300.00");
		sa.assertEquals(Methods.gettext4(wd), "800.00");
		sa.assertEquals(Methods.gettext5(wd), "550.00");
		sa.assertAll();

	}

}
