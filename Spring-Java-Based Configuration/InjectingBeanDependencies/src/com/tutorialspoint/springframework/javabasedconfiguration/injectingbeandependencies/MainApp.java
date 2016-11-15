package com.tutorialspoint.springframework.javabasedconfiguration.injectingbeandependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class MainApp {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);

		TextEditor te = context.getBean(TextEditor.class);
		te.spellCheck();
	}
}