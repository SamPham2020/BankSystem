/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

/**
 *
 * @author Hong Hien Pham
 */
public class Test {
    public static void main(String[] args) {
        // 3 new users
        Bank.addUser("Yi", "1234");
        Bank.addUser("Wang", "2345");
        Bank.addUser("Mike", "3456");
        
        //3 ATM
        AutomatedTellerMachine a1 = new AutomatedTellerMachine();
        AutomatedTellerMachine a2 = new AutomatedTellerMachine();
        AutomatedTellerMachine a3 = new AutomatedTellerMachine();

        //System.out.println(Bank.getUsers());
        a1.pipeline();
        System.out.println(Bank.getUsers().get(0).getHistory());        
    }
    
}
