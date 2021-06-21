package org.openlmis.distribution.dto;

import lombok.Data;
import org.openlmis.core.domain.BaseModel;
@Data
public class DistributionServicesLinesItemsDTO extends BaseModel {
    public DistributionServicesLinesItemsDTO(Long id) {
        super(id);
    }

    public String distributionserviceid;
    public String product;
    public String quantity;
}
