package script;


import java.util.ArrayList;

import org.testng.annotations.Test;

import base.Baselib;
import pom.Country;
import pom.HommePage;

public class Worldbank extends Baselib{
	@Test
	public void testmain() {
			ArrayList<String> alPopulation=new ArrayList<String>();
			ArrayList<String> alGdp=new ArrayList<String>();
			HommePage hm=new HommePage(driver);
			Country country=new Country(driver);
		hm.getCountry().click();
		country.getAfghanistan().click();
		String population=country.getPopulation().getText();
		System.out.println("population: "+population);
		alPopulation.add(population);
		String GDP=country.getgdp().getText();
		System.out.println("GDP: "+GDP);
		alGdp.add(GDP);
		String gdpGrowth=country.getGdpGrowth().getText();
		System.out.println("GDP Growth: "+gdpGrowth);
		hm.getCountry();
		
		System.out.println(alPopulation);
		System.out.println(alGdp);
		
		

	}

}
