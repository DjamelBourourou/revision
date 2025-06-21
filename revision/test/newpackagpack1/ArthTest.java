/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackagpack1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class ArthTest {
    
    public ArthTest() {
    }
    

    
  

    /**
     * Test of multip method, of class Arth.
     */
    @Test
    public void testMultip() {
      
   
        Arth instance = new Arth();
       
        int result = instance.multip(4, 6);
        assertEquals(24, result);
     
    }
    
}
