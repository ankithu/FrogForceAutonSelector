/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ankith
 */
public class FrogForceAutonSelector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MainScreen();
        NetworkTablesSpitter spitter = new NetworkTablesSpitter();
        while (true){
        	if (SelectorState.readyToSend){
        		spitter.spitData();
        	}
        }
    }
    
}
