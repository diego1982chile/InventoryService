package cl.psa.inventory.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.sql.Timestamp;

import static cl.psa.inventory.model.DAO.NON_PERSISTED_ID;

/**
 * Created by root on 25-07-20.
 */
public class Attribute<T extends Comparable> implements  Serializable {

    private static final Logger logger = LoggerFactory.getLogger(Attribute.class);

    /** El identificador único de la entidad, inicialmente fijado en <code>NON_PERSISTED_ID</code>. */
    private long id = NON_PERSISTED_ID;

    private T value;

    public Attribute(T value) {
        this.value = value;
        this.id = -1;
    }

    public Attribute(long id, T value) {
        this.id = id;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value)
    {
        if(value!=null){
            logger.debug("seteando valor de target valor={}", value);
            this.value = value;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(value) != null)
                ? (this.getClass().hashCode() + String.valueOf(value).hashCode())
                : super.hashCode();
    }

    public boolean isBoolean() {
        return this.value.getClass().equals(Boolean.class);
    }

    public boolean isDate() {
        return this.value.getClass().equals(Timestamp.class);
    }

    public boolean isFloat() {
        return this.value.getClass().equals(Float.class) || this.value.getClass().equals(Double.class);
    }

    public boolean isInteger() {
        return this.value.getClass().equals(Integer.class);
    }

    public boolean isString() {
        return this.value.getClass().equals(String.class);
    }

}
