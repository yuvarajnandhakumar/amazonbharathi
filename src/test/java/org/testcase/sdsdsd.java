package org.testcase;

import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import com.google.common.collect.Lists;

public class sdsdsd {
	
	public static void main(String[] args) {
		
		TestListenerAdapter t =new TestListenerAdapter();
		TestNG tg =new TestNG();
		
		List<String> suite = Lists.newArrayList();
		
		suite.add(".//testng.xml");
		
		tg.setTestSuites(suite);
		tg.run();
		
	}

}
