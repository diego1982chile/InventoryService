package cl.psa.inventory.model;

import java.util.List;

/**
 * Created by root on 25-07-20.
 */
public interface Auditable {

    List<AuditActionType> getChanges(Auditable auditable);
}
