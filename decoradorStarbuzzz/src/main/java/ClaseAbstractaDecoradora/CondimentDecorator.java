/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseAbstractaDecoradora;

import TypesDrinks.Beverage;

/**
 *
 * @author caarl
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    @Override
    public abstract String getDescription();
}
