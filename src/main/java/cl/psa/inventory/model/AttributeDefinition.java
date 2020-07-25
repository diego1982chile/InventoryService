package cl.psa.inventory.model;

import java.util.ArrayList;
import java.util.List;

import static cl.psa.inventory.model.DAO.NON_PERSISTED_ID;

/**
 * Created by root on 25-07-20.
 */
public class AttributeDefinition<T extends Comparable> {

    /** El identificador único de la entidad, inicialmente fijado en <code>NON_PERSISTED_ID</code>. */
    private long id = NON_PERSISTED_ID;

    /** Nombre del tipo */
    private String name;

    /** Descripción del tipo: "¿Es pedible?" */
    private String description;

    /** El dominio de valores posibles */
    private List<T> domain;

    /** El tipo concreto de esta definición * */
    private AttributeDefinitionType type;

    public AttributeDefinition() {
    }

    public AttributeDefinition(String name, String description) {
        this(-1, name, description);
    }

    public AttributeDefinition(String name, String description, AttributeDefinitionType type) {
        this(-1, name, description, type);
    }

    /**
     * The minimal constructor available for building a Basic Type with all its attributes and the ID.
     *
     * @param id          The basic type unique ID.
     * @param name        The basic type name.
     * @param description The description about this basic type.
     */
    public AttributeDefinition(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.domain = new ArrayList<T>();
    }

    /**
     * The full constructor available for building a Basic Type with all its attributes and the ID.
     *
     * @param id          The basic type unique ID.
     * @param name        The basic type name.
     * @param description The description about this basic type.
     * @param type        The concrete type about this definition
     */
    public AttributeDefinition(long id, String name, String description, AttributeDefinitionType type) {
        this(id, name, description);
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<T> getDomain() {
        return domain;
    }

    public void setDomain(List<T> domain) {
        if (domain != null) {
            this.domain = new ArrayList<>(domain);
        } else {
            this.domain = new ArrayList<>();
        }
    }

    public boolean addToDomain(T anElement) {
        return domain.add(anElement);
    }

    /**
     * Este método es responsable de indicar si el tipo tiene valores concretos o discretos.
     *
     * @return <code>true</code> si es un dominio discreto de valores y <code>false</code> sino (dominio continuo).
     */
    public boolean isDiscreteDomain() {

        /* Si el tipo tiene un dominio discreto (no vacío), y no tiene un intervalo definido, entonces es discreto */
        return !this.domain.isEmpty();

    }

    public AttributeDefinitionType getType() {
        return type;
    }

    public void setType(AttributeDefinitionType type) {
        this.type = type;
    }

}
