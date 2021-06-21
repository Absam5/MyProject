package org.openlmis.distribution.repository.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.openlmis.distribution.dto.DistributionDataServicesDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistributionServicesMapper {

    @Select("Select * from distribution_services")
    List<DistributionDataServicesDTO> getDistributionServices();

   @Insert("INSERT INTO distribution_services(supplier, receiver, createddate, status, modifiedby, lastupdateddate) \n" +
           "VALUES (#{supplier}, #{receiver}, NOW(), #{status}, #{modifiedBy}, NOW())")
   @Options(useGeneratedKeys = true)
   int insert(DistributionDataServicesDTO distributionDataServicesDTO);
}


