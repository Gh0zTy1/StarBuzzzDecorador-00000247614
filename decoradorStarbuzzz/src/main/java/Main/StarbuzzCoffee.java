/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Condimentos.Chocolate;
import Condimentos.Milk;
import Condimentos.SoyMilk;
import Condimentos.WhippedCream;
import TypesDrinks.Beverage;
import TypesDrinks.Decaf;
import TypesDrinks.Espresso;
import TypesDrinks.HouseBlend;

/**
 *
 * @author caarl
 */
public class StarbuzzCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Probando un Decaf con doble Chocolate y Crema batida
        System.out.println("=== Primera Orden ===");
        Beverage beverage = new Decaf();
        beverage = new Chocolate(beverage);
        beverage = new Chocolate(beverage);
        beverage = new WhippedCream(beverage);
        
        System.out.println("Orden: " + beverage.getDescription());
        System.out.println("Costo: $" + beverage.cost());
        
        // Probando un House Blend con Leche de Soya y Chocolate
        System.out.println("\n=== Segunda Orden ===");
        Beverage beverage2 = new HouseBlend();
        beverage2 = new SoyMilk(beverage2);
        beverage2 = new Chocolate(beverage2);
        
        System.out.println("Orden: " + beverage2.getDescription());
        System.out.println("Costo: $" + beverage2.cost());
        
        // Probando un Espresso con todos los condimentos
        System.out.println("\n=== Tercera Orden ===");
        Beverage beverage3 = new Espresso();
        beverage3 = new Milk(beverage3);
        beverage3 = new SoyMilk(beverage3);
        beverage3 = new WhippedCream(beverage3);
        beverage3 = new Chocolate(beverage3);
        
        System.out.println("Orden: " + beverage3.getDescription());
        System.out.println("Costo: $" + beverage3.cost());
    }
}