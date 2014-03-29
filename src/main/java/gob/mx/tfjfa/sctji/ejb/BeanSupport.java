package gob.mx.tfjfa.sctji.ejb;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.log4j.Logger;

/**
 * @author rafa
 * @param <T>
 */
public abstract class BeanSupport<T> implements Serializable, IBeanSupport<T> {

    private final static long serialVersionUID = 1L;
    @PersistenceContext
    EntityManager em;
    Logger logger = Logger.getLogger(this.getClass());
    protected Class<T> classType;

    @Override
    public T create(T t) {
        em.persist(t);
        return t;
    }

    @Override
    public T update(T t) {
        em.merge(t);
        return t;
    }

    @Override
    public void delete(T t) {
        em.remove(t);
    }

    @Override
    public T read(int id) {
        return em.createQuery("SELECT x FROM " + classType.getSimpleName() + " x WHERE x.id=:id", classType).setParameter("id", id).getSingleResult();
    }

    @Override
    public List<T> readAll() {
        return em.createQuery("SELECT x FROM " + classType.getSimpleName() + " x", classType).getResultList();
    }
}
