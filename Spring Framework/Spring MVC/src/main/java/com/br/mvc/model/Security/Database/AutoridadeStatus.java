package com.br.mvc.model.Security.Database;

public enum AutoridadeStatus {
    ADMINISTRADOR("ADMINISTRADOR"),
    USUARIO("USUARIO");    
    private  String role;

    AutoridadeStatus(String role){
      this.role = role;
    }

    public String toString() {
      return this.role;
   }


}