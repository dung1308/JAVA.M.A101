/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.main;

import java.util.ArrayList;
import java.util.Scanner;
import fa.training.entities.SavingsAccount;
/**
 *
 * @author ASUS
 */
public class SavingsAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SavingsAccount> listAni = new ArrayList();
        SavingsAccount saver1 = new SavingsAccount(2000,0.04);
        SavingsAccount saver2 = new SavingsAccount(3000,0.04);
        double s1=saver1.calculateMonthlyInterest(saver1.getAnnualInterestRate(),saver1.getSavingsBalance());
        System.out.println("Interst in saver1: "+s1);
        double s2=saver2.calculateMonthlyInterest(saver2.getAnnualInterestRate(),saver2.getSavingsBalance());
        System.out.println("Interst in saver2: "+s2);
        saver1.setAnnualInterestRate(0.05);
        saver2.setAnnualInterestRate(0.05);
        System.out.println("Change annual interest to 5%");
        double s3=saver1.calculateMonthlyInterest(saver1.getAnnualInterestRate(),saver1.getSavingsBalance());
        System.out.println("annual Interst in saver1: "+s3);
        double s4=saver2.calculateMonthlyInterest(saver2.getAnnualInterestRate(),saver2.getSavingsBalance());
        System.out.println("annual Interst in saver2: "+s4);
    }
}
