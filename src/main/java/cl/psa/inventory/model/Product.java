package cl.psa.inventory.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static cl.psa.inventory.model.DAO.NON_PERSISTED_ID;
import static java.util.Collections.EMPTY_LIST;

/**
 * Created by root on 25-07-20.
 */
public class Product implements Auditable {

    private static final Logger logger = LoggerFactory.getLogger(Product.class);

    /** El identificador único de la entidad, inicialmente fijado en <code>NON_PERSISTED_ID</code>. */
    private long id = NON_PERSISTED_ID;

    private String SKU;

    private String description;

    private Timestamp validityUntil;

    ProductDefinition productDefinition;

    private List<Attribute> attributes = new ArrayList<>();

    private Dimension dimension;

    public Product(String SKU, String description, Timestamp validityUntil, ProductDefinition productDefinition, List<Attribute> attributes, Dimension dimension) {
        this.SKU = SKU;
        this.description = description;
        this.validityUntil = validityUntil;
        this.productDefinition = productDefinition;
        this.attributes = attributes;
        this.dimension = dimension;
    }

    public Product(long id, String SKU, String description, Timestamp validityUntil, ProductDefinition productDefinition, List<Attribute> attributes, Dimension dimension) {
        this.id = id;
        this.SKU = SKU;
        this.description = description;
        this.validityUntil = validityUntil;
        this.productDefinition = productDefinition;
        this.attributes = attributes;
        this.dimension = dimension;
    }

    public static Logger getLogger() {
        return logger;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getValidityUntil() {
        return validityUntil;
    }

    public void setValidityUntil(Timestamp validityUntil) {
        this.validityUntil = validityUntil;
    }

    public ProductDefinition getProductDefinition() {
        return productDefinition;
    }

    public void setProductDefinition(ProductDefinition productDefinition) {
        this.productDefinition = productDefinition;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public List<AuditActionType> getChanges(Auditable auditable) {
        Product product = (Product) auditable;
        return EMPTY_LIST;
    }
}
