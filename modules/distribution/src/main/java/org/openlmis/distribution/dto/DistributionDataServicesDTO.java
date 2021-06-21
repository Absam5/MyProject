package org.openlmis.distribution.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.openlmis.core.domain.BaseModel;

@Data
@NoArgsConstructor
public class DistributionDataServicesDTO extends BaseModel {

    public String supplier;
    public String receiver;
    public String status;

    public DistributionDataServicesDTO(Long id) {
        super(id);
    }

}
