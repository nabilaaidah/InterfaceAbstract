/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceabstract;

/**
 *
 * @author NABILA
 */
public class CreditAccount extends AbstractBankAccount {
    private static int creditLimit;
    
    public CreditAccount(String name, String num, int amt){
        super(name, num, amt);
        this.creditLimit = 100;
    }
    
    public void print(){
        System.out.println("Bank Name: " + this.getBankName()
                            + "\nAccount Name: " + this.accountName
                            + "\nAccount Number: " + this. accountNum
                            + "\nBalance: " + this.balance
                            + "\nCredit Limit: " + this.creditLimit);
    }
    
    @Override
    public void deposit(int amt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getBalance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getBankName() {
        return this.BANK;
    }
}