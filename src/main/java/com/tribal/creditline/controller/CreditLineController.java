package com.tribal.creditline.controller;

import com.tribal.creditline.model.CreditLineRequest;
import com.tribal.creditline.model.CreditLineResponse;
import com.tribal.creditline.service.CreditLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CreditLineController {

    @Autowired
    private CreditLineService creditLineService;

    @PostMapping(
            value = "/credit-line",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public CreditLineResponse creditLine(@RequestBody CreditLineRequest request){
        return creditLineService.calculate(request);
    }

}
