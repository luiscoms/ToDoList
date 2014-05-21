package com.projeto.tarefas;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("login")
@SessionScoped
public class Login implements Serializable{
    String userName = "";
    String password = "";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String logar(){
        if ("teste".equalsIgnoreCase(userName)){
            return "index";
        } else{        
        return "";
        }
    }
    
}
