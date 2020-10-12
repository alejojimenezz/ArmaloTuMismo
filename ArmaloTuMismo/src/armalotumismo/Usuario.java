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
  
    protected String Userid;
    protected String Password;
    protected boolean LoginStatus;
    protected Date Birthday;

    public Usuario(String Userid, String Password, boolean LoginStatus, Date Birthday) {
        this.Userid = Userid;
        this.Password = Password;
        this.LoginStatus = LoginStatus;
        this.Birthday = Birthday;
    }

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String Userid) {
        this.Userid = Userid;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isLoginStatus() {
        return LoginStatus;
    }

    public void setLoginStatus(boolean LoginStatus) {
        this.LoginStatus = LoginStatus;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date Birthday) {
        this.Birthday = Birthday;
    }
    
}
