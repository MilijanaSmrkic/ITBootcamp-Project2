package objects;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Methods {

	// metoda za otvaranje pocetne strane
	public static void openHomePage(WebDriver wd) {
		wd.get("https://sandbox.2checkout.com/sandbox");

	}

	// metoda za unos korisnickog imena
	public static void sendkeysUsername(WebDriver wd, String user) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.xpath(p.getProperty("USERNAME_XPATH"))).click();
		wd.findElement(By.xpath(p.getProperty("USERNAME_XPATH"))).sendKeys(user);
	}

	// metoda za unos sifre
	public static void sendkeysPass(WebDriver wd, String pass) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.xpath(p.getProperty("PASSWORD_XPATH"))).click();
		wd.findElement(By.xpath(p.getProperty("PASSWORD_XPATH"))).sendKeys(pass);
	}

	// metoda za klik na log in
	public static void clickLogIn(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.xpath(p.getProperty("LOG_IN_XPATH"))).click();
	}

	// metoda za klik na sign up
	public static void clickSignUp(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.xpath(p.getProperty("SIGN_UP_XPATH"))).click();
	}

	// metoda za unos korisnickog imena u registracionoj formi
	public static void sendkeysUser(WebDriver wd, String user) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.id(p.getProperty("USERNAME_ID"))).sendKeys(user);
	}

	// metoda za unos mejla u registracionoj formi

	public static void sendkeysEmail(WebDriver wd, String email) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.id(p.getProperty("EMAIL_ID"))).sendKeys(email);
	}

	// metoda za unos sifre u registracionoj formi

	public static void sendkeysPassword(WebDriver wd, String passw) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.id(p.getProperty("PASSWORD_ID"))).sendKeys(passw);
	}

	// metoda za unos ponovljene sifre u registracionoj formi

	public static void sendkeysConfirm(WebDriver wd, String conf) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.id(p.getProperty("CONFIRM_PASS"))).sendKeys(conf);
	}

	// metoda za selekciju necega o korisniku u registracionoj formi

	public static void select(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.id(p.getProperty("ABOUT_ID"))).click();
		Select about = new Select(wd.findElement(By.id(p.getProperty("ABOUT_ID"))));
		about.selectByVisibleText("I don't have a website");

	}

	// metoda za klik na dig in and start testing registracionoj formi

	public static void submit(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.id(p.getProperty("SUBMIT_ID"))).click();
	}

	// metoda koja treba da klikne na korisnikov nalog i da ga izloguje
	public static void clickAccount(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.id(p.getProperty("ACCOUNT_ID"))).click();
		wd.findElement(By.id(p.getProperty("LOG_OUT_ID"))).click();
	}

	// metoda za klik na products
	public static void clickProducts(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.linkText(p.getProperty("PRODUCTS_linkTekst"))).click();
	}

	// metoda za klik na add new product
	public static void clickAddProduct(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.linkText(p.getProperty("ADD_PRODUCT_linkTekst"))).click();
	}

	// metoda za unos imena proizvoda
	public static void typeName(WebDriver wd, String name) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.name(p.getProperty("NAME_name"))).sendKeys(name);
	}

	// metoda za unos id-a
	public static void typeID(WebDriver wd, String id) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.name(p.getProperty("ID_name"))).sendKeys(id);
	}

	// metoda za unos cene
	public static void typePrice(WebDriver wd, String price) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.name(p.getProperty("PRICE_name"))).sendKeys(price);
	}

	// metoda za cekiranje- tangible
	public static void button1(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.id(p.getProperty("BUTTON1_ID"))).click();
	}

	// metoda za cekiranje- recurring
	public static void button2(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.cssSelector(p.getProperty("BUTTON2_cssSelector"))).click();
	}

	// metoda za dugme save changes
	public static void submitChange(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.xpath(p.getProperty("SUBMIT_CHANGES_xpath"))).click();
	}

	// metoda za klik na view
	public static void clickView(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.linkText(p.getProperty("VIEW_link"))).click();

	}

	// metode za brisanje proizvoda- 5
	public static void clear1(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.xpath(p.getProperty("CLEAR1_xpath"))).click();
	}

	public static void clear2(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.xpath(p.getProperty("CLEAR2_xpath"))).click();
	}

	public static void clear3(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.xpath(p.getProperty("CLEAR3_xpath"))).click();
	}

	public static void clear4(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.xpath(p.getProperty("CLEAR4_xpath"))).click();
	}

	public static void clear5(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.xpath(p.getProperty("CLEAR5_xpath"))).click();
	}

	public static void clickDelete(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.xpath(p.getProperty("DELETE_xpath"))).click();
	}

	// metoda za klik na edit
	public static void clickEdit(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.linkText(p.getProperty("EDIT_link"))).click();
	}

	// metoda za klik na save changes ****
	public static void saveChanges(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.findElement(By.xpath(p.getProperty("SUBMIT_CHANGES_xpath"))).click();
	}

	// metoda za uzimanje teksta1
	public static String gettext1(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		String text1 = wd.findElement(By.xpath(p.getProperty("TEXT1_xpath"))).getText();
		return text1;
	}

	// metoda za uzimanje teksta2
	public static String gettext2(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		String text2 = wd.findElement(By.xpath(p.getProperty("TEXT2_xpath"))).getText();
		return text2;
	}

	// metoda za uzimanje teksta3
	public static String gettext3(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		String text3 = wd.findElement(By.xpath(p.getProperty("TEXT3_xpath"))).getText();
		return text3;
	}

	// metoda za uzimanje teksta4
	public static String gettext4(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		String text4 = wd.findElement(By.xpath(p.getProperty("TEXT4_xpath"))).getText();
		return text4;
	}

	// metoda za uzimanje teksta5
	public static String gettext5(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		String text5 = wd.findElement(By.xpath(p.getProperty("TEXT5_xpath"))).getText();
		return text5;
	}

	// metoda za dohvatanje cena, njihovo povecanje za 100

	public static void raisePrices(WebDriver wd) throws Exception {
		Properties p = new Properties();
		FileReader reader = new FileReader("locators.txt");
		p.load(reader);
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		for (int i = 0; i < 5; i++) {

			wd.findElement(By.xpath("//tr[" + String.valueOf(i + 2) + "]//td[2]//a[1]")).click();
			String actual = wd.findElement(By.name(p.getProperty("PRICE_name"))).getAttribute("value");
			double parsed = Double.parseDouble(actual);
			double raise = parsed + 100;
			String newPrice = Double.toString(raise);

			wd.findElement(By.name(p.getProperty("PRICE_name"))).clear();
			wd.findElement(By.name(p.getProperty("PRICE_name"))).sendKeys(newPrice);

			wd.findElement(By.xpath(p.getProperty("SUBMIT_CHANGES_xpath"))).click();
			Methods.clickView(wd);

		}

	}

}
