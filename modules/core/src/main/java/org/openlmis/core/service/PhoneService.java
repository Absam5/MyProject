package org.openlmis.core.service;

import org.openlmis.core.dto.PhoneDTO;
import org.openlmis.core.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {

    @Autowired
    private PhoneRepository repository;
    public List<PhoneDTO> getPhone(){
        return repository.getAllPhone();
    }

    public void save(PhoneDTO phoneDTO){

        PhoneDTO savedPhoneData = repository.getByBrandName(phoneDTO.getBrandName());
        if(savedPhoneData == null) {
            repository.insert(phoneDTO);
        } else {
            phoneDTO.setId(savedPhoneData.getId());
            repository.update(phoneDTO);
        }
    }
}
