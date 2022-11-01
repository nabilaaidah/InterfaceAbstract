/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaceabstract;

/**
 *
 * @author NABILA
 */
public class InterfaceAbstractNabila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account acc1 = new Account("Lendy Elhadi", "12345", 1000);
//        System.out.println(acc1.getBankName());
        acc1.deposit(1000);
        acc1.deposit(1000);
        acc1.print();
        
        CreditAccount acc2 = new CreditAccount("Norman Normandy", "54545", 1000);
        System.out.println(acc1.getBankName());
        acc2.print();
        
        //polymorphism with instanceof
        System.out.println("\n\n");
        AbstractBankAccount[] listAll = new AbstractBankAccount[5];
        listAll[0] = acc1;
        listAll[1] = acc2;
        listAll[2] = acc1;        listAll[3] = acc2;
        listAll[4] = acc1;
        
        for(AbstractBankAccount acc : listAll)
            if(acc instanceof Account)
                System.out.println("akun tabungan");
            else
                System.out.println("akun kredit");
    }
    
}
