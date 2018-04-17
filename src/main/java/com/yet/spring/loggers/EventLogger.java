/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yet.spring.loggers;

import com.yet.spring.beans.Event;

/**
 *
 * @author LapasovFG.VCRP
 */
public interface EventLogger {
    
    public void logEvent(Event event);
}
