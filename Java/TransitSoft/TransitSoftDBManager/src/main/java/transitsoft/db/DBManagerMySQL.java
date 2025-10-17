/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.db;

/**
 *
 * @author USUARIO
 */
public class DBManagerMySQL extends DBManager {

    protected DBManagerMySQL() {

    }

    @Override
    protected String getURL() {
        String url = this.tipo_de_driver.concat("://");
        url = url.concat(this.nombre_de_host);
        url = url.concat(":");
        url = url.concat(this.puerto);
        url = url.concat("/");
        url = url.concat(this.base_de_datos);
        //System.out.println(url);
        return url;
    }

    @Override
    public String retornarSQLParaUltimoAutoGenerado() {
        return "select @@last_insert_id as id";
    }

    @Override
    public String retornarSQLParaDateTime(String columnaFecha, String columnaHora) {
        return "TIMESTAMP("+columnaFecha+", "+columnaHora+")";
    }

    @Override
    public String retornarFechaActual() {
        return "NOW()";
    }

}
