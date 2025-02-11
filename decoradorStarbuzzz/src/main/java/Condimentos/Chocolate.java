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
public class Chocolate extends CondimentDecorator {
    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }
    
    @Override
    public double cost() {
        return beverage.cost() + 7.00;
    }
}
