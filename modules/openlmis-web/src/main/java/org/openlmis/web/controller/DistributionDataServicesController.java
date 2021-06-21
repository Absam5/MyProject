package org.openlmis.web.controller;

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
public class DistributionDataServicesController extends BaseController {

    @Autowired
    private DistributionDataService service;

    @RequestMapping(value = "rest-api/DistributionServicesList", method = RequestMethod.GET)
    @ResponseBody
    public List<DistributionDataServicesDTO> getDistributionServices(){
        return service.getDistributionServices();
    }

    @RequestMapping(value = "rest-api/save-DistributionServices", method = RequestMethod.POST)
    @ResponseBody
    public String postDistributionServices(@RequestBody DistributionDataServicesDTO distributionDataServicesDTO){
        service.save(distributionDataServicesDTO);
        return "All Distribution Services are Successfully distributed";
    }

}

