package gob.mx.tfjfa.sctji.ejb;

import java.util.List;
import javax.ejb.Local;

@Local
public interface IBeanSupport<T> {

    T create(T t);

    T update(T t);

    /**
     *
     * @param t
     */
    void delete(T t);

    T read(int id);

    List<T> readAll();
}
