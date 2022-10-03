package com.Hexaware.CMS.Model;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Menu {
    private int menuId;
    private String menuName;
    private int menuPrice;

    public Menu(){}

    public Menu(int menuId,String menuName, int menuPrice){
        this.menuId=menuId;
        this.menuName=menuName;
        this.menuPrice=menuPrice;

    }
    public void setMenuId(int menuId){
        this.menuId=menuId;
    }

    public int getMenuId(){
        return menuId;
    }

    public void setMenuName(String menuName){
        this.menuName=menuName;
    }

    public String getMenuName(){
        return menuName;
    }

    public void setMenuPrice(int menuPrice){
        this.menuPrice=menuPrice;
    }

    public int getMenuPrice(){
        return menuPrice;
    }
    public String toString(){
        return "Menu id:"+menuId+"Menu Name:"+menuName+"Menu Price"+menuPrice;
    }
}
