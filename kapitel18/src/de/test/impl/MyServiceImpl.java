package de.test.impl;
import de.test.api.MyService;
/**
 * {@summary Erzeugt den Service Provider.} Der ServiceLoader
 * benoetigt diesen oeffentlichen, parameterlosen Konstruktor.
 */
public class MyServiceImpl implements MyService {
    @Override
    public void show() { 
        System.out.println("Show aus MyServiceImpl");
    } 
    
}
