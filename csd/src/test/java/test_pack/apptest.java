package test_pack;

import csd_pack.app;

public class apptest {
	
@Test
Run|Debug
public void testlogin()
{
	app myapp=new App();
	{
		Assert.assertEquals(0,myapp.userLogin("abc", "abc@123"));
	}
	@Test
	Run|Debug
	public void testlogin()
	{
		app myapp=new app();
		{
			Assert.assertEquals(1,myapp.userLogin("abc", "abc@123"))
		}
	}
}
}
