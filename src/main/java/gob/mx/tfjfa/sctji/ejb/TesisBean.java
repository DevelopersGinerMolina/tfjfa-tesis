package gob.mx.tfjfa.sctji.ejb;

import gob.mx.tfjfa.sctji.entity.Tesis;
import java.io.Serializable;
import javax.ejb.Stateless;

/**
 * @author rafa
 */
@Stateless
public class TesisBean extends BeanSupport<Tesis> implements Serializable {

    private final static long serialVersionUID = 1L;
}
