package estudobczm;

import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luiz
 */
public class Metodo {
    
	public void recebeParametros(String nome){
		if(nome.length()> 0 ){
			//resultado mostrando o nome digitado
                    JOptionPane.showMessageDialog(null, "Seja bem vindo "+ nome+" ao treinamento de Git Hub");
                            
		}
		else{
			//resultado informando o erro por falta do nome
                    JOptionPane.showMessageDialog(null,"Digite seu nome!");
                
		}
	}
	
}
