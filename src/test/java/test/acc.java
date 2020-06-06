package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import POM.create;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.suite;

public class acc extends suite {

	@Test
	public void ready() throws IOException, InterruptedException{
		create cre=new create(driver);
		cre.submit();
		
	}

}
