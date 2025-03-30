package Controllers;

import java.awt.Component;
import javax.swing.JOptionPane;

public class LoginController {
    
    private static Component parentComponent;
    
    public static String CheckLogin (String txtUsername, String txtPassword){
        if ((txtUsername.toUpperCase()).equals("ADMIN") && txtPassword.equals("Password")){
            return "admn";                    
        } else if ((txtUsername.toUpperCase()).equals("TMTCKEMP") && txtPassword.equals("EMP20")){
            return "emp";  
        } else if (txtUsername.isEmpty() && txtPassword.isEmpty()){
            JOptionPane.showMessageDialog(parentComponent, "Enter Data", "Warning", 0);
            return "f";
        }else {
            JOptionPane.showMessageDialog(parentComponent, "Incorrect Username Or Password", "Warning", 0);
            return "f";
        }
    }

    
}
