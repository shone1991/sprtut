/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yet.spring.loggers;

import com.yet.spring.beans.Event;
import com.yet.spring.loggers.EventLogger;

/**
 *
 * @author LapasovFG.VCRP
 */
public class ConsoleEventLogger implements EventLogger{
    
    @Override
    public void logEvent(Event event){
        System.out.println("msg: "+event.toString());
    }
    
}
