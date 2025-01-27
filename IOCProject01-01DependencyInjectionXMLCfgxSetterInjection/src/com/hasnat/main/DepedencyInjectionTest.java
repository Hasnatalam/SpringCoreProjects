package com.hasnat.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.hasnat.sbeans.WishMassageGenerator;
public class DepedencyInjectionTest {
	public static void main(String[]args) {
		System.out.println("DepedencyInjectionTest.main() Start");
		
		//Create the Ioc container 
		
		/*//Relative path w.r.t Project folder (good to use)
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/hasnat/cfgs/applicationContext.xml");
							*/
		/*//Absolute path Not a good way
		FileSystemXmlApplicationContext ctx = 
					new FileSystemXmlApplicationContext("C:\\Users\\Hasnat Alam\\OneDrive\\Desktop\\FullStack\\Spring And SpringBoot\\SpringAndSpringBootEclipse\\IOCProject01DependencyInjectionXMLCfgx\\src\\com\\hasnat\\cfgs\\applicationContext.xml");
		*/
		
		//Best way to create IOC containerfor xml config
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/hasnat/cfgs/applicationContext.xml");
				
		/*//use as sorce folder
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		*/
		
		//get target spring bean class object ref from the ioc container
		Object obj = ctx.getBean("wmg");
		
		//typecasting
		WishMassageGenerator generator = (WishMassageGenerator)obj;
		
		//invoke the b method
		String result = generator.generateWishMassage("Scott");
		System.out.println(result);
		ctx.close();
		System.out.println("DepedencyInjectionTest.main() Start");
	}
}

