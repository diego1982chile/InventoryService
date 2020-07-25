package cl.psa.inventory.model;

/**
 * @author Andrés Farías
 */
public enum AttributeDefinitionType {

    STRING_TYPE(1, "string"),
    BOOLEAN_TYPE(2, "boolean"),
    INTEGER_TYPE(3, "int"),
    FLOAT_TYPE(4, "float"),
    DATE_TYPE(5, "date");

    private long id;

    private String typeName;

    AttributeDefinitionType(long id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public static AttributeDefinitionType valueOf(long id){
        for (AttributeDefinitionType attributeDefinitionType : values()) {
            if (attributeDefinitionType.getId()==id){
                return attributeDefinitionType;
            }
        }

        throw new IllegalArgumentException("No existe el tipo de ID=" + id);
    }

}
