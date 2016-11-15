package com.tutorialspoint.springframework.javabasedconfiguration.injectingbeandependencies;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */

@Configuration
public class TextEditorConfig {

	@Bean
	public TextEditor textEditor() {
		return new TextEditor(spellChecker());
	}

	@Bean
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}
}