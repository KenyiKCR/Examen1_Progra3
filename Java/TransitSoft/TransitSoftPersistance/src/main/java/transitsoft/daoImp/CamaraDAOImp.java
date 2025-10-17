/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.daoImp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import transitsoft.dao.CamaraDAO;
import transitsoft.daoImp.util.Columna;
import transitsoft.model.CamaraDTO;

/**
 *
 * @author USUARIO
 */
public class CamaraDAOImp extends DAOImplBase implements CamaraDAO {

    private CamaraDTO camara;

    public CamaraDAOImp() {
        super("camara");
        camara = null;
    }

    @Override
    protected void configurarListaDeColumnas() {
        listaColumnas.add(new Columna("id", true, true));
        listaColumnas.add(new Columna("modelo", false, false));
        listaColumnas.add(new Columna("codigo_serie", false, false));
        listaColumnas.add(new Columna("latitud", false, false));
        listaColumnas.add(new Columna("longitud", false, false));
    }

    @Override
    public Integer insertar(CamaraDTO camara) {
        this.camara = camara;
        retornarLlavePrimaria = true;
        return super.insertar();
    }

    @Override
    public CamaraDTO obtenerPorId(Integer camaraId) {
        CamaraDTO camaraDTO = new CamaraDTO();
        camaraDTO.setId(camaraId);
        this.camara = camaraDTO;
        super.obtenerPorId();
        return this.camara;
    }

    @Override
    public Integer modificar(CamaraDTO camara) {
        this.camara = camara;
        return super.modificar();
    }

    @Override
    public Integer eliminar(CamaraDTO camara) {
        this.camara = camara;
        return super.eliminar();
    }

    @Override
    public ArrayList<CamaraDTO> listarTodos() {
        return (ArrayList<CamaraDTO>) super.listarTodos();
    }

    @Override
    protected void incluirValorDeParametrosParaInsercion() throws SQLException {
        this.statement.setString(1, this.camara.getModelo());
        this.statement.setString(2, this.camara.getCodigoSerie());
        this.statement.setInt(3, this.camara.getLatitud());
        this.statement.setInt(4, this.camara.getLongitud());
    }

    @Override
    protected void incluirValorDeParametrosParaEliminacion() throws SQLException {
        this.statement.setInt(1, camara.getId());
    }

    @Override
    protected void incluirValorDeParametrosParaModificacion() throws SQLException {
        this.statement.setString(1, this.camara.getModelo());
        this.statement.setString(2, this.camara.getCodigoSerie());
        this.statement.setInt(3, this.camara.getLatitud());
        this.statement.setInt(4, this.camara.getLongitud());
        this.statement.setInt(5, this.camara.getId());
    }

    @Override
    protected void incluirValorDeParametrosParaObtenerPorId() throws SQLException {
        this.statement.setInt(1, camara.getId());
    }

    @Override
    protected void instanciarObjetoDelResultSet() throws SQLException {
        this.camara = new CamaraDTO();
        this.camara.setId(this.resultSet.getInt("id"));
        this.camara.setModelo(this.resultSet.getString("modelo"));
        this.camara.setCodigoSerie(this.resultSet.getString("codigo_serie"));
        this.camara.setLatitud(this.resultSet.getInt("latitud"));
        this.camara.setLongitud(this.resultSet.getInt("longitud"));
    }

    @Override
    protected void agregarObjetoALaLista(List lista) throws SQLException {
        this.instanciarObjetoDelResultSet();
        lista.add(this.camara);
    }

    @Override
    protected void limpiarObjetoDelResultSet() {
        this.camara = null;
    }
}
