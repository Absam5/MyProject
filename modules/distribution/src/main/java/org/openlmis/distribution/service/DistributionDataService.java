package org.openlmis.distribution.service;

import org.openlmis.distribution.dto.DistributionDataServicesDTO;
import org.openlmis.distribution.repository.DistributionDataServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistributionDataService {

    @Autowired
    private DistributionDataServicesRepository repository;
    public List<DistributionDataServicesDTO> getDistributionServices(){
        return repository.getAllDistributionServices();
    }

    public void save(DistributionDataServicesDTO distributionDataServicesDTO){
        repository.insert(distributionDataServicesDTO);
    }

}
