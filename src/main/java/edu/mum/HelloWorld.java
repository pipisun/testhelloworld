package edu.mum;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.mum.component.MessageDisplay;
import edu.mum.component.MessageOrigin;

public class HelloWorld {
    public static void main(String[] args) {
   	 @SuppressWarnings("resource")
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext( JavaConfiguration.class );
 
//    	MessageDisplay messageDisplay = (MessageDisplay) applicationContext.getBean("standardOutMessageDisplay");
    	MessageDisplay messageDisplay = (MessageDisplay) applicationContext.getBean("fileMessageDisplay");
    	try {
			messageDisplay.display();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
