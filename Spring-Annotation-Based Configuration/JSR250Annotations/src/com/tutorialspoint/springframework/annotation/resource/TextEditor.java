package com.tutorialspoint.springframework.annotation.resource;

import javax.annotation.Resource;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class TextEditor {

	private SpellChecker spellChecker;
	private String name;

	@Resource(name = "spellChecker")
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}