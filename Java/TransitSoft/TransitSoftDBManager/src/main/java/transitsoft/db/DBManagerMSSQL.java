/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.db;

/**
 *
 * @author USUARIO
 */
public class DBManagerMSSQL extends DBManager {

    protected DBManagerMSSQL() {

    }

    @Override
    protected String getURL() {
        String url = this.tipo_de_driver.concat("://");
        url = url.concat(this.nombre_de_host);
        url = url.concat(":");
        url = url.concat(this.puerto);
        url = url.concat(";");
        url = url.concat("databaseName=" + this.base_de_datos);
        url = url.concat(";encrypt=false");
        //System.out.println(url);
        return url;
    }

    @Override
    public String retornarSQLParaUltimoAutoGenerado() {
        return "select @@IDENTITY as id";
    }

    @Override
    public String retornarSQLParaDateTime(String columnaFecha, String columnaHora) {
        return "CAST(" + columnaFecha + " AS DATETIME) + CAST(" + columnaHora + " AS DATETIME)";
    }

    @Override
    public String retornarFechaActual() {
        return "GETDATE()";
    }
}
