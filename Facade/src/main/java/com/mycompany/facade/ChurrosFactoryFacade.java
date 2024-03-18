/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facade;

/**
 *
 * @author edgar
 */
public class ChurrosFactoryFacade {
    ChurrosFactory churrosFactory;
    
    ChurrosFactoryFacade(ChurrosFactory cf){
        churrosFactory = cf;
    }
    
    void startFactory(){
        churrosFactory.openDoors();
        churrosFactory.cleanChurrosMachine();
        churrosFactory.startChurrosMachine();
    }
    
    void closeFactory(){
        churrosFactory.cleanChurrosMachine();
        churrosFactory.shutdownChurrosMachine();
        churrosFactory.closeDoors();
    }
    
    
}
