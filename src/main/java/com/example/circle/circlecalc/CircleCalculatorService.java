package com.example.circle.circlecalc;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@AllArgsConstructor
@Service
public class CircleCalculatorService {

    public AreaResultDto calculateArea(RadiusDto radiusDto) {
        AreaResultDto areaResult = new AreaResultDto();
        double radius = radiusDto.getRadius();
        areaResult.setArea(Math.PI * Math.pow(radius, 2));
        return areaResult;
    }
}
