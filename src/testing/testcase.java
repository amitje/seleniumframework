package testing;

import org.testng.annotations.Test;

import base.config;
import locators.login;
import value.login_value;

public class testcase extends config {
	
	login ss=new login();
	login_value ff=new login_value();
	@Test
	public void vv() {
	
	typeByxpath (ss.aa,ff.dd);
	typeByxpath(ss.bb,ff.ee);
	clickbyxpath (ss.cc);
	
	
	
		
	}
	
	

}
