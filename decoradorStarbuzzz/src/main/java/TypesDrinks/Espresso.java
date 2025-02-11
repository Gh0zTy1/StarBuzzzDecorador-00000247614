/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TypesDrinks;

/**
 *
 * @author caarl
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }
    
    @Override
    public double cost() {
        return 36.00;
    }
}