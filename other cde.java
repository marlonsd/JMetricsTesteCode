/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmetrics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author regiszanandrea
 */
/* Metricas da classe:
	LOC = 10
	NOA = 2
	NOM = 3
*/
public abstract class Tata {
	public static String name="static";
	private static int other = 0;

	Tata(){
		// Commentario
	}

	public abstract void nana(){

	}

	private final void nana(){
		
	}
}

/* Metricas da classe:
	LOC = 12
	NOA = 1
	NOM = 2
*/
public /* testing */ class Toto extends Tata{
	private int var = 3/2;

	if (bool || bool)

	Toto(){
		// Comentário
		this.var = 0; //Testing
		this.var++; /* Other
						Comment*/ this.toto = 3;
	}

	public final void nana(){
		String coisa = " public \\\";// class Toto(){ } ";
	}
}

/* Metricas da classe:
	LOC = 4
	NOA = 0
	NOM = 1
*/
public class Titi extends Toto{
	Titi(){

	}
}