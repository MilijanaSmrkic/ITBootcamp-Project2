package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import objects.Methods;

public class Home_Page_Test {

	public static WebDriver wd;

	@BeforeClass
	public static void createDriver() {
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		wd = new ChromeDriver();

	}

	@AfterClass
	public static void closeDriver() {
		wd.close();
	}

	// Testirati da li je moguæe ulogovati se ukoliko je preskoèen korak
	// registracije korisnika

	@Test
	public void logIn() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		Methods.sendkeysUsername(wd, "Msassa");
		Methods.sendkeysPass(wd, "Mgtfytf122343");
		Methods.clickLogIn(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	// Testirati da li radi forma za registraciju unosom podataka za jednog
	// korisnika.
	@Test
	public void registration() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysUser(wd, "Baaja123");
		Methods.sendkeysEmail(wd, "baja@gmail.com");
		Methods.sendkeysPassword(wd, "Baja12345");
		Methods.sendkeysConfirm(wd, "Baja12345");
		Methods.select(wd);
		Methods.submit(wd);

		String current = wd.getTitle();
		String expected = "Seller Area / Home";
		Assert.assertEquals(current, expected);
		Methods.clickAccount(wd);
		String expected2 = "Seller Area"; // da proveri da li se izlogovao
		Assert.assertEquals(current, expected2);

	}

	// Detaljno proveriti da li je moguæe registrovati se bez unosa svih polja.

	@Test
	public void registration1() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysEmail(wd, "kaja@gmail.com");
		Methods.sendkeysPassword(wd, "kaja12345");
		Methods.sendkeysConfirm(wd, "kaja12345");
		Methods.select(wd);
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration2() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysUser(wd, "Kmlmml");
		Methods.sendkeysPassword(wd, "J878oljiom");
		Methods.sendkeysConfirm(wd, "J878oljiom");
		Methods.select(wd);
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration3() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysUser(wd, "Kmlmml");
		Methods.sendkeysEmail(wd, "kaja@gmail.com");
		Methods.sendkeysConfirm(wd, "J878oljiom");
		Methods.select(wd);
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration4() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysUser(wd, "Maaja123");
		Methods.sendkeysEmail(wd, "kaja@gmail.com");
		Methods.sendkeysPassword(wd, "J878oljiom");
		Methods.select(wd);
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration5() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysUser(wd, "Maaja123");
		Methods.sendkeysEmail(wd, "kaja@gmail.com");
		Methods.sendkeysPassword(wd, "J878oljiom");
		Methods.sendkeysConfirm(wd, "J878oljiom");
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration6() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysPassword(wd, "J878oljiom");
		Methods.sendkeysConfirm(wd, "J878oljiom");
		Methods.select(wd);
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration7() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysUser(wd, "kaja@gmail.com");
		Methods.sendkeysConfirm(wd, "J878oljiom");
		Methods.select(wd);
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration8() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysUser(wd, "Maaja123");
		Methods.sendkeysEmail(wd, "kaja@gmail.com");
		Methods.select(wd);
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration9() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysUser(wd, "Maaja123");
		Methods.sendkeysEmail(wd, "kaja@gmail.com");
		Methods.sendkeysPassword(wd, "J878oljiom");
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration10() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysEmail(wd, "kaja@gmail.com");
		Methods.sendkeysConfirm(wd, "J878oljiom");
		Methods.select(wd);
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration11() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysEmail(wd, "kaja@gmail.com");
		Methods.sendkeysPassword(wd, "J878oljiom");
		Methods.select(wd);
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration12() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysEmail(wd, "kaja@gmail.com");
		Methods.sendkeysPassword(wd, "J878oljiom");
		Methods.sendkeysConfirm(wd, "J878oljiom");
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration13() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysUser(wd, "Maaja123");
		Methods.sendkeysPassword(wd, "J878oljiom");
		Methods.select(wd);
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration14() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysUser(wd, "Maaja123");
		Methods.sendkeysPassword(wd, "J878oljiom");
		Methods.sendkeysConfirm(wd, "J878oljiom");
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration15() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysUser(wd, "Maaja123");
		Methods.sendkeysEmail(wd, "kaja@gmail.com");
		Methods.sendkeysConfirm(wd, "J878oljiom");
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration16() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysUser(wd, "Maaja123");
		Methods.sendkeysEmail(wd, "kaja@gmail.com");
		Methods.sendkeysPassword(wd, "J878oljiom");
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration17() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.select(wd);
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration18() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysUser(wd, "J878oljiom");
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration19() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.clickSignUp(wd);
		Methods.sendkeysEmail(wd, "kaja@gmail.com");
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration20() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.sendkeysPassword(wd, "J878oljiom");
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

	@Test
	public void registration21() throws Exception {
		Methods.openHomePage(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Methods.submit(wd);

		String current = wd.getTitle();
		Assert.assertEquals(current, current);

	}

}
