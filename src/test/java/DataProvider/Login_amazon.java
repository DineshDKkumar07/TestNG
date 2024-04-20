package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_amazon {

	
	
	@DataProvider(name="login")
	public Object[] [] met1(){
		
		Object value [] []=new  Object[4][4];
		value[0][0]="dineshdkssm@gmail.com";
		value[0][1]="Thalapathy";
		value[1][0]="dineshdkssm@gmail.com";
		value[1][1]="Thala";
		value[2][0]="dineshd@gmail.com";
		value[2][2]="Thalapathy";
		value[3][0]="dk@gmail.com";
		value[3][3]="kk";
						
		return value;
		
		
	}
	
	
	@Test(dataProvider = "login")
	public void login_amazon(String name, String pass)  {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D678802104188%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D16656327742674133661%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061990%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2371562%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys(name);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(pass);
		driver.findElement(By.id("signInSubmit")).click();
		
		
		
	}
}
