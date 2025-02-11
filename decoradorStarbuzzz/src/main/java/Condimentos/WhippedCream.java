/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condimentos;

import ClaseAbstractaDecoradora.CondimentDecorator;
import TypesDrinks.Beverage;

/**
 *
 * @author caarl
 */
public class WhippedCream extends CondimentDecorator {
    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }
    
    @Override
    public double cost() {
        return beverage.cost() + 6.00;
    }
}
