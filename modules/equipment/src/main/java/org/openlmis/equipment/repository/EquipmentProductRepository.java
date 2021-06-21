/*
 * Electronic Logistics Management Information System (eLMIS) is a supply chain management system for health commodities in a developing country setting.
 *
 * Copyright (C) 2015  John Snow, Inc (JSI). This program was produced for the U.S. Agency for International Development (USAID). It was prepared under the USAID | DELIVER PROJECT, Task Order 4.
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.openlmis.equipment.repository;

import org.openlmis.core.domain.Product;
import org.openlmis.equipment.domain.EquipmentProduct;
import org.openlmis.equipment.repository.mapper.EquipmentProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EquipmentProductRepository {

  @Autowired
  EquipmentProductMapper mapper;

  public List<EquipmentProduct> getByProgramEquipmentId(Long programEquipmentId){
    return mapper.getByProgramEquipmentId(programEquipmentId);
  }

  public void insert(EquipmentProduct equipmentProduct){
    mapper.insert(equipmentProduct);
  }

  public void update(EquipmentProduct equipmentProduct){
    mapper.update(equipmentProduct);
  }

  public void remove(Long programEquipmentId) {
    mapper.remove(programEquipmentId);
  }

   public void removeAllByEquipmentProducts(Long programEquipmentId){
       mapper.removeByEquipmentId(programEquipmentId);
   }

  public List<Product> getAvailableProductsToLink(Long programId, Long equipmentId) {
    return mapper.getAvailableProductsToLink(programId, equipmentId);
  }
}
