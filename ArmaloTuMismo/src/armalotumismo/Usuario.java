/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armalotumismo;

import java.util.Date;

/**
 *
 * @author Familia
 */
public class Usuario {
  
     private String Userid;
    private String Nombre;
    private String Password;
    private String Age;
    private String Modificar;

    public Usuario(String Userid, String Nombre, String Password, String Age, String Modificar) {
        this.Userid = Userid;
        this.Nombre = Nombre;
        this.Password = Password;
        this.Age = Age;
        this.Modificar = Modificar;
    }

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String Userid) {
        this.Userid = Userid;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getModificar() {
        return Modificar;
    }

    public void setModificar(String Modificar) {
        this.Modificar = Modificar;
    }

   

}
