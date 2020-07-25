package cl.psa.inventory.model;

import java.util.ArrayList;
import java.util.List;

import static cl.psa.inventory.model.DAO.NON_PERSISTED_ID;

/**
 * Created by root on 25-07-20.
 */
public class ProductDefinition {

    /** El identificador único de la entidad, inicialmente fijado en <code>NON_PERSISTED_ID</code>. */
    private long id = NON_PERSISTED_ID;

    private String name;
    private String description;
    private List<AttributeDefinition> attributeDefinitions = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    public ProductDefinition(String name, String description, List<AttributeDefinition> attributeDefinitions, List<Product> products) {
        this.name = name;
        this.description = description;
        this.attributeDefinitions = attributeDefinitions;
        this.products = products;
    }

    public ProductDefinition(long id, String name, String description, List<AttributeDefinition> attributeDefinitions, List<Product> products) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.attributeDefinitions = attributeDefinitions;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<AttributeDefinition> getAttributeDefinitions() {
        return attributeDefinitions;
    }

    public void setAttributeDefinitions(List<AttributeDefinition> attributeDefinitions) {
        this.attributeDefinitions = attributeDefinitions;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
