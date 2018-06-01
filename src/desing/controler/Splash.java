/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.controler;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import principal.Login;
import principal.Splashi;

/**
 *
 * @author manoel.barros
 */
public class Splash {

    /**
     * @param args the command line arguments
     */URL icon;
    Image icontitle;
    public static void main(String[] args) {
        
        // TODO code application logic here
        Splashi splash = new Splashi();
        splash.setVisible(true);

        Login prince = new Login();

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                splash.loading.setText(Integer.toString(i) + "%");
                splash.progress.setValue(i);
                if (i == 100) {
                    splash.setVisible(false);
                    prince.setVisible(true);
                }
            }

        } catch (Exception e) {

        }
    }

}
