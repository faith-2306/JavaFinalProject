/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_BugerKing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Faith c.c
 */
public class myParentClass {
// food
    public double rice;
    public double frenchFries;
    public double chicken;
    public double saladbowl;
    public double chickenBuger;
    public double beefBurger;
    public double doubleWopper;
    public double veggieBurger;
// topping
    public double chesse;
    public double sambal;
    public double mayo;
    public double soySauce;
// soda    
    public double fanta;
    public double coke;
    public double sprite;
    public double supperFloat;
// dersert
    public double chocolateIcecream;
    public double vanillaIcecream;
    public double mangoPudding;
    public double chocoPudding;
// tea
    public double iceTea;
    public double sweetTea;
    public double water;
// extras
    public double kidsMeal;
    public double tip;
    public double giftCard;
    
    
    public double food;
    public double drink;
    public double totalcost;
    public double totalcosttax;
    public double Tax;

    private JFrame frame;
        
    public void iexitButton(){
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, 
                "Are you sure you want to exit ?",
                "Burger king Self-Service System",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
               System.exit(0);
        }}
        
    public void isendOrderButton(){
        frame = new JFrame("Send Order ");
        
        if (JOptionPane.showConfirmDialog(frame, 
                "your order has been sent",
                "Burger king Self-service System",
               JOptionPane.OK_OPTION) == JOptionPane.OK_OPTION){
               System.exit(1);
        }   
        
            }
 //===================price================= 
    public double rice_p = 6000;
    public double frenchFries_p = 7000;
    public double chicken_p = 10000;
    public double saladbowl_p = 13000;
    public double chickenBuger_p = 15000;
    public double beefBurger_p = 17000;
    public double doubleWopper_p = 25000;
    public double veggieBurger_p = 35;
// topping
    public double chesse_p = 8000;
    public double sambal_p = 0;
    public double mayo_p = 2000;
    public double soySauce_p = 2000;
// soda    
    public double fanta_p = 6500;
    public double coke_p = 6600;
    public double sprite_p = 6400;
    public double supperFloat_p = 11500;
// dersert
    public double chocolateIcecream_p = 11700;
    public double vanillaIcecream_p = 10900;
    public double mangoPudding_p = 14000;
    public double chocoPudding_p = 14900;
// tea
    public double iceTea_p = 6500;
    public double sweetTea_p = 6700;
    public double water_p = 0;
// extras
    public double kidsMeal_p = 26700;
    public double tip_p = 0;
    public double giftCard_p = 0;

    
    public double food_p;
    public double drink_p;
    public double totalcost_p;
    
    public double GetPrice()
    {
        food_p = rice + frenchFries + chicken + 
                saladbowl + kidsMeal + chickenBuger + 
                beefBurger + doubleWopper + veggieBurger + 
                chesse + sambal + mayo + soySauce;
        
        drink_p = fanta + coke + sprite + supperFloat +
                chocolateIcecream + vanillaIcecream +
                mangoPudding + chocoPudding + iceTea +
                sweetTea + water;
        
        totalcost_p = food_p + drink_p;
        totalcosttax = totalcost_p;
         return totalcosttax;          
    }

    public double Tax_p = 0.9;
    public Double calculateTax(double amount_p)
    {
        double calculatedTax = amount_p - (amount_p * Tax_p);
        return calculatedTax;
}

}

