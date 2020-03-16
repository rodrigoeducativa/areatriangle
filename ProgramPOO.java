/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import entities.TrianglePOO;
import java.util.Scanner;

public class ProgramPOO {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        TrianglePOO x;
        TrianglePOO y;
        x = new TrianglePOO();
        y = new TrianglePOO();

        System.out.println("Entre com lados do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com lados do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Área do triângulo X: " + areaX);
        System.out.println("Área do triângulo Y: " + areaY);

        if (areaX > areaY) {

            System.out.println("A ára do triângulo X é maior. ");

        } else if (areaX == areaY) {

            System.out.println("Ambas são do mesmo tamanho.");

        } else {
            System.out.println("A área do triângulo Y é maior.");
        }

    }

}
