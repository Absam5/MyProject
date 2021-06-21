package org.openlmis.web.controller;


import org.openlmis.core.dto.PhoneDTO;
import org.openlmis.core.service.PhoneService;
import org.openlmis.distribution.dto.DistributionDataServicesDTO;
import org.openlmis.distribution.service.DistributionDataService;
import org.openlmis.restapi.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PhoneController extends BaseController {

    @Autowired
    private PhoneService service;

    @RequestMapping(value = "rest-api/PhoneList", method = RequestMethod.GET)
    @ResponseBody
    public List<PhoneDTO> getPhone(){
        return service.getPhone();
    }

    @RequestMapping(value = "rest-api/save-Phones", method = RequestMethod.POST)
    @ResponseBody
    public String postPhone(@RequestBody PhoneDTO phoneDTO){
        service.save(phoneDTO);
        return "Phone are Successfully Saved";
    }


}
