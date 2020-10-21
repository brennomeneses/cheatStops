

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wrench
 */
public class Atribuidores {
    public int alfabeto(String letra){
        int numLetra = 0;
        String alfa[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","Z"};
        for (int i = 0; i < alfa.length-1; i++) {
            if (alfa[i] == letra) {
                numLetra = i;
            }
        }
        return numLetra;
    }
    
    
}
