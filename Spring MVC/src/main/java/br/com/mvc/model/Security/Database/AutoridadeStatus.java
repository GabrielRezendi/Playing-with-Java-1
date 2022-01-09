package br.com.mvc.model.Security.Database;

public enum AutoridadeStatus {
    ROLE_ADMINISTRADOR("ADMINISTRADOR"),
    ROLE_USUARIO("USUARIO");    
    private  String role;

    AutoridadeStatus(String role){
      this.role = role;
    }

    public String toString() {
      return this.role;
   }


}