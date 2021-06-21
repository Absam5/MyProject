package org.openlmis.core.repository;


import org.openlmis.core.dto.PhoneDTO;
import org.openlmis.core.repository.mapper.PhoneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PhoneRepository {

    @Autowired
    private PhoneMapper mapper;

    public List<PhoneDTO> getAllPhone(){
        return mapper.getPhone();
    }

    public int insert(PhoneDTO phoneDTO){
        return mapper.insert(phoneDTO);
    }

    public PhoneDTO getByBrandName(String brandName){
        return mapper.getByBrandName(brandName);
    };

    public void update(PhoneDTO phoneDTO) {
        mapper.update(phoneDTO);
    }
}
