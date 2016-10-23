package com.tutorialspoint.springframework.helloworld;

/*
 *  Classe Hello World Comun.
 *  Está classe somete ira retornar uma mensagem ao chamar o metodo getMessage()
 */
public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your Message : " + message);
	}

    public void setMessage(String message) {
        this.message = message;
	}
}