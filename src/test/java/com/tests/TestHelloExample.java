package com.tests;

import org.testng.annotations.Test;

import com.utils.LoggerUtil;

public class TestHelloExample {
	
		/*public static void main(String[] args) {
			HelloExample2 obj = new HelloExample2();
			obj.runMe("mkyong");
		}*/
		
	@Test	
	private void runMe(){
			/*if(logger.isDebugEnabled()){
				logger.debug("This is debug : " + parameter);
			}
			
			if(logger.isInfoEnabled()){
				logger.info("This is info : " + parameter);
			}*/
			
			/*logger.warn("This is warn : " + parameter);
			logger.error("This is error : " + parameter);
			logger.fatal("This is fatal : " + parameter);*/		
			LoggerUtil.logMessage("Checking LoggerUtil abstract class ");
		}
	}