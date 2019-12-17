package com.sample;
import javax.swing.JOptionPane;

public class Window {
	public Window(){
	}
	
	public static String zadajPytanie(String pytanie, String odp1, String odp2) {
		Object[] options = {odp1,odp2};
		int n = JOptionPane.showOptionDialog(null,
		pytanie,
		"Question",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null,     //do not use a custom Icon
		options,  //the titles of buttons
		options[0]); //default button title
		if(n==0) {
			return odp1;
		} else if (n==1) {
			return odp2;
		}else
			return "User interrupts";
    }
	
	public static void koniec(String nazwa) {
		JOptionPane.showConfirmDialog(null, "The perfect game for you: " + nazwa, "Result", JOptionPane.DEFAULT_OPTION);
	}
	
}