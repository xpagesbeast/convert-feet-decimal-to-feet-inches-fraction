package com.xpagesbeast.convertfeetdecimaltofeetinchesfraction.controller;

import com.xpagesbeast.convertfeetdecimaltofeetinchesfraction.model.json.CalculatorResponse;
import com.xpagesbeast.convertfeetdecimaltofeetinchesfraction.service.ConversionService;
import com.xpagesbeast.tools.converter.model.FeetInchesFraction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("conversions")
public class CalculatorController {

    @Autowired
    private ConversionService service;

    @GetMapping("getConversion")
    public CalculatorResponse getFeetInchesFraction(@RequestParam(name="decimalFeet") double decimalFeet){
        CalculatorResponse response = new CalculatorResponse();
        FeetInchesFraction answer = service.convertDecimalFeetToFeetInchesFraction(decimalFeet);
        response.setFeetPart(answer.getFeet());
        response.setInchesPart(answer.getInches());
        response.setFeetPart(answer.getFeet());
        response.setFactionPartDenominator(answer.getDenominatorFraction());
        response.setFractionPartNumerator(answer.getNumeratorFraction());
        response.setFractionPart(answer.getFractionOfInch());
        response.setStatus("success");
        return response;
    }
}
