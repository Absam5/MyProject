package org.openlmis.core.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.openlmis.core.domain.BaseModel;

@Data
@NoArgsConstructor
public class PhoneDTO extends BaseModel {

    public String brandName;
    public String color;
    public int internalStorage;
    public int ramMemory;


    public PhoneDTO(Long id) { super(id);
    }
}
