/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.entities;

/**
 *
 * @author ASUS
 */
public class SavingsAccount {
    private double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(){

    }
    
    public SavingsAccount(double annualInterestRate, double savingsBalance) {
        this.annualInterestRate = annualInterestRate;
        this.savingsBalance = savingsBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    
    public double calculateMonthlyInterest(double annualInterestRate, double savingsBalance){
        double interest = (annualInterestRate*savingsBalance)/12; 
        savingsBalance += (annualInterestRate*savingsBalance)/12;
        return interest;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" + "annualInterestRate=" + annualInterestRate + ", savingsBalance=" + savingsBalance + '}';
    }
    
}
