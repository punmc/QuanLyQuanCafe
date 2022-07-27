
package main;

import GUI.Menu;
import GUI.LoginForm;
import pojo.TaiKhoan;

/**
 *
 * @author PC
 */
public class Run {
    public static LoginForm lg;
    public static Menu mn;
    public static TaiKhoan tk;
    
    public static void main(String[] args) {
        login();
    }
    
    public static void login(){
        lg = new LoginForm();
        lg.setVisible(true);       
    }  
    public static void QLCF(){
        mn = new Menu();
        mn.setVisible(true);       
    }
}
