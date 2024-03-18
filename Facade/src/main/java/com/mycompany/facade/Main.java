/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.facade;

/**
 *
 * @author edgar
 */
public class Main {

    public static void main(String[] args) {
        
        ChurrosFactory churrosFactory = new ChurrosFactory();
        System.out.println("\n---Churros Factory---");
        churrosFactory.openDoors();
        churrosFactory.cleanChurrosMachine();
        churrosFactory.startChurrosMachine();
        
        System.out.println("-----------------------");
        
        churrosFactory.cleanChurrosMachine();
        churrosFactory.shutdownChurrosMachine();
        churrosFactory.closeDoors();
        
        
        ChurrosFactoryFacade churrosFactoryFacade = new ChurrosFactoryFacade(churrosFactory);
        System.out.println("\n---Churros Factory Facade---");
        churrosFactoryFacade.startFactory();
        System.out.println("-----------------------");
        churrosFactoryFacade.closeFactory();
    }
}
