/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armalotumismo;

import Elementos.Elemento;
import java.util.Date;

/**
 *
 * @author Familia
 */
public class Administrador extends Usuario {
    
    public Administrador(String Userid, String Password, boolean LoginStatus, Date Birthday) {
        super(Userid, Password, LoginStatus, Birthday);
    }
    
    public boolean updateCaralog (Elemento e){
        return false;
    }
    
}
