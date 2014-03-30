package gob.mx.tfjfa.sctji.ejb;

import gob.mx.tfjfa.sctji.entity.Tesis;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 * @author rafa
 */
@Stateless
public class TesisBean extends BeanSupport<Tesis> implements Serializable {

    private final static long serialVersionUID = 1L;

    public List<Tesis> getTesisByCampos(ArrayList lista) {
        String query = "Select t from tesis t";
        if (lista.get(0) == null && lista.get(1) == null && lista.get(2) == null && lista.get(3) == null && lista.get(4) == null) {
            return em.createQuery(query, Tesis.class).getResultList();
        }
        query += " WHERE";
        if (lista.get(0) != null) {
            query += " t.materia LIKE:" + "%" + lista.get(0) + "%  AND ";
        }
        if (lista.get(1) != null) {
            query += " t.cveTesis LIKE:" + "%" + lista.get(1) + "%  AND ";
        }
        if (lista.get(2) != null) {
            query += " t.rubro LIKE:" + "%" + lista.get(2) + "% AND  ";
        }
        if (lista.get(3) != null) {
            query += " t.texto LIKE:" + "%" + lista.get(3) + "% AND  ";
        }
        if (lista.get(4) != null) {
            query += " t.precedente LIKE:" + "%" + lista.get(4) + "%  AND ";
        }
        if (lista.get(5) != null) {
            query += " t.referencia LIKE:" + "%" + lista.get(5) + "%  AND ";
        }
        query = query.substring(0, query.length() - 5);
        return em.createQuery(query, Tesis.class).getResultList();
    }

}
