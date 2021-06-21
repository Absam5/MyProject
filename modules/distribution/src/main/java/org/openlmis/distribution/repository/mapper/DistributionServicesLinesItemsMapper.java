package org.openlmis.distribution.repository.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.openlmis.distribution.dto.DistributionServicesLinesItemsDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistributionServicesLinesItemsMapper {

    @Select("Select * from distribution_services_line_items")
    List<DistributionServicesLinesItemsDTO> getDistributionServicesLinesItemsMapper();

    @Insert("INSERT INTO distribution_services_lines_items(distributionserviceid, product, quantity, modifiedby, lastupdateddate, createddate) \n" +
            "VALUES (#{distributionserviceid}, #{product}, #{quantity}, #{modifiedby}, NOW(), NOW())")
    @Options(useGeneratedKeys = true)
    Integer insert(DistributionServicesLinesItemsDTO distributionServicesLinesItemsDTO);
}
