package cl.psa.inventory.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static cl.psa.inventory.model.DAO.NON_PERSISTED_ID;

/**
 * Created by root on 25-07-20.
 */
public class Dimension {

    private static final Logger logger = LoggerFactory.getLogger(Dimension.class);

    /** El identificador único de la entidad, inicialmente fijado en <code>NON_PERSISTED_ID</code>. */
    private long id = NON_PERSISTED_ID;

    private float weight;
    private float width;
    private float height;
    private float length;

    public Dimension(float weight, float width, float height, float length) {
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Dimension(long id, float weight, float width, float height, float length) {
        this.id = id;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}
