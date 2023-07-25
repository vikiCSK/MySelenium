package com.projectname.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.myntra.com/men-casual-shirts?f=Brand%3ABYFORD+by+Pantaloons%2CHERE%26NOW%2CHIGHLANDER%2CMast+%26+Harbour%2CRoadster%2CThe+Indian+Garage+Co&sort=discount&utm_source=gh_haulpack&utm_medium=hp_telegram&utm_campaign=gh_hp_tel_0407_clothing_highlandshirts_frcp&af_xp=custom&af_force_deeplink=true&pid=gh_haulpack&is_retargeting=true&af_click_lookback=1d&utm_source=gh_haulpack&utm_medium=hp_telegram&utm_campaign=gh_hp_tel_0407_clothing_highlandshirts_frcp&deep_link_value=mytnra%3A%2F%2Fmyntra.com%2Fmen-casual-shirts%3Ff%3DBrand%253ABYFORD%2520by%2520Pantaloons%252CHERE%2526NOW%252CHIGHLANDER%252CMast%2520%2526%2520Harbour%252CRoadster%252CThe%2520Indian%2520Garage%2520Co%26sort%3Ddiscount%26utm_source%3Dgh_haulpack%26utm_medium%3Dhp_telegram%26utm_campaign%3Dgh_hp_tel_0407_clothing_highlandshirts_frcp&c=gh_hp_tel_0407_clothing_highlandshirts_frcp&utm_source=cashkaro&utm_medium=Affiliates&utm_term=64a4549821e612000115e57b&pid=4&sub1=&sub2=ENKR20230704A507990772&utm_campaign=4_ENKR20230704A507990772&source=dms_trafficaffiliates&medium=cashkaro_rev&p=3");
		driver.findElement(
				By.xpath("(//h4[text()='Printed Cotton Casual Shirt'])[1]/..//span[@class='product-discountedPrice']"))
				.click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		}

}
