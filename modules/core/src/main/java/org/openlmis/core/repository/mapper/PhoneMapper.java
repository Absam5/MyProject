package org.openlmis.core.repository.mapper;

import org.apache.ibatis.annotations.*;
import org.openlmis.core.dto.PhoneDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneMapper {

    @Select("Select * from phone")
    List<PhoneDTO> getPhone();

    @Insert("INSERT INTO phone(brandname, color, internalstorage, rammemory, createddate, modifiedby, lastupdateddate) \n" +
            "VALUES (#{brandName}, #{color}, #{internalStorage}, #{ramMemory}, NOW(), #{modifiedBy}, NOW())")
    @Options(useGeneratedKeys = true)
    int insert(PhoneDTO phoneDTO);

    @Select(" SELECT * FROM phone WHERE brandName=#{brandName}")
    PhoneDTO getByBrandName(@Param("brandName") String brandName);

    @Update("  UPDATE phone SET brandName=#{brandName}," +
            " color=#{color}, " +
            "internalstorage=#{internalStorage} WHERE id = #{id} ")
    void update(PhoneDTO phoneDTO);
}
