package com.Hexaware.CMS;

import static org.junit.Assert.assertEquals;

import com.Hexaware.CMS.Model.Menu;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

/**
 * Unit test for Menu class.
 */
public class MenuTest 
{
    static Menu menu;
    @BeforeClass
    public static void beforeClass(){
        menu=new Menu(101,"Burger",100);
    }
   
    @Test
    public  void testGet(){
       assertEquals(101,menu.getMenuId());
       assertEquals("Burger",menu.getMenuName());
       assertEquals(100,menu.getMenuPrice()); 
    }

    @Test
    public void testToString(){
        String str=menu.toString();
        String expected= "Menu id:"+menu.getMenuId()+"Menu Name:"+menu.getMenuName()+"Menu Price"+menu.getMenuPrice();
        assertEquals(expected,str);
    }
    @AfterClass
    public static void afterClass(){
        menu=null;
    }
}
