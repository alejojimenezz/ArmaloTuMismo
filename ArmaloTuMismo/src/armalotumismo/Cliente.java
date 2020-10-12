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
public class Cliente extends Usuario {
    
    public Cliente(String Userid, String Password, boolean LoginStatus, Date Birthday) {
        super(Userid, Password, LoginStatus, Birthday);
    }
    
    public Elemento SearchElemento (){
        return null;
    }
    
    public boolean AddSC (){
        return false;
    }
    
    public boolean DeleteSC (){
        return false;
    }
}
