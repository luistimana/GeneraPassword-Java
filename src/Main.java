/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Timana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(generaPassword());
    }
    
    static String generaPassword(){
        char[] mayusculas = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[] minusculas = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] numeros = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        
        StringBuilder caracteres = new StringBuilder();
        caracteres.append(mayusculas);
        caracteres.append(minusculas);
        caracteres.append(numeros);
        
        StringBuilder password = new StringBuilder();
        
        for(int i = 0; i <=15; i++){
            int cantidadCaracteres = caracteres.length();
            int numeroRandom = (int)(Math.random()*cantidadCaracteres);
            
            password.append((caracteres.toString().charAt(numeroRandom)));
            
        }
        
        return password.toString();
    }
}
