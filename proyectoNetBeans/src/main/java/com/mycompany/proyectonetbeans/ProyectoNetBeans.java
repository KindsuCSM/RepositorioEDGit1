/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectonetbeans;

/**
 *
 * @author Cristina
 * @version v1.2
 */
public class ProyectoNetBeans {
    /**
     * 
     */
public class Counter {
/**
 * .
 */
    private int count;
// a simple integer instance variable
/**
 * 
 */
    public Counter() { }
// default constructor (count is 0)
/**
 * 
 * @param initial valor inicial del contador
 */
    public Counter(int initial) { count = initial; }
// an alternate constructor
/**
 * 
 * @return 
 */
    public int getCount() { return count; }
// an accessor method
/**
 * 
 */
    public void increment() { count++; }
// an update method
/**
 * 
 * @param delta 
 */
    public void increment(int delta) { count += delta; }
// an update method
/**
 * 
 */
    public void reset() { count = 0; }
// an update method

}

		
}
