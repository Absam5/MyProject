package org.openlmis.distribution.repository;

import org.openlmis.distribution.dto.DistributionDataServicesDTO;
import org.openlmis.distribution.repository.mapper.DistributionServicesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DistributionDataServicesRepository {

    @Autowired
    private DistributionServicesMapper mapper;

    public List<DistributionDataServicesDTO> getAllDistributionServices(){
        return mapper.getDistributionServices();
    }

    public int insert(DistributionDataServicesDTO distributionDataServicesDTO){
        return mapper.insert(distributionDataServicesDTO);
    }

}
