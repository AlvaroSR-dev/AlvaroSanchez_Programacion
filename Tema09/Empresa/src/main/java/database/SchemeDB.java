package database;

public interface SchemeDB {

    String dtbs = "Empresa";
    String user = "root";
    String pass = "root";
    String host = "localhost:3306";
    String url = "jdbc:mysql://" + host + "/" + dtbs + "?" + "user=" + user + "&password=" + pass;

    String TAB_PERFILES = "perfiles";
    String TAB_USUARIOS = "usuario";
    String COL_ID = "id";

    String COL_NOMBRE = "nombre";
    String COL_APELLIDO = "apellido";
    String COL_TELEFONO = "telefono";
    String COL_SUELDO = "sueldo";
    String COL_PAIS = "pais";
    String COL_FK_ID = "perfil";
}
