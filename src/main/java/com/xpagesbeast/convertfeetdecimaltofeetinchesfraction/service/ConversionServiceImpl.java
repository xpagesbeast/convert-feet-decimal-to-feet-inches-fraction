package com.xpagesbeast.convertfeetdecimaltofeetinchesfraction.service;

import com.xpagesbeast.tools.converter.TankConversions;
import com.xpagesbeast.tools.converter.TankConversionsImpl;
import com.xpagesbeast.tools.converter.model.FeetInchesFraction;
import org.springframework.stereotype.Service;



@Service
public class ConversionServiceImpl implements ConversionService {

    @Override
    public FeetInchesFraction convertDecimalFeetToFeetInchesFraction(double decimalFeet) {
        TankConversionsImpl converter = new TankConversionsImpl();
        return converter.convertDecimalFeetToFeetInchesFraction(decimalFeet);
    }
}
