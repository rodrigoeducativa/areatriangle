
package aplication;

import java.util.Locale;
import java.util.Scanner;


public class Program {

  
    public static void main(String[] args) {
        // declarando as variáveis dos triangulos x e y (3 para cada)
        try(Scanner sc = new Scanner (System.in)){
        double xA, xB, xC, yA, yB, yC, areaX, areaY;
        
        
        
        Locale.setDefault(Locale.US);
        
        System.out.println("Entre com os lados do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        
        System.out.println("Entre com os lados do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        
       areaX = (xA + xB + xC) / 2;
       areaY = (yA + yB + yC) / 2;
        
        System.out.println("A área do triângulo X é: " + areaX);
        System.out.println("A área do triângulo Y é: " + areaY);
        
        if (areaX > areaY){
            
            System.out.println("O triângulo X tem a maior área.");
        }else if (areaX == areaY){
            System.out.println("Ambos tem o tamanho da área igual.");
            
        } else {
            System.out.println("O triângulo Y tem a maior área.");
        }
        
        sc.close();
        }
    }
    
}
