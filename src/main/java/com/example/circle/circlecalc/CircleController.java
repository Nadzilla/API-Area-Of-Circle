package com.example.circle.circlecalc;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "api/v1/circle")
@AllArgsConstructor
public class CircleController {

    private final CircleCalculatorService circleCalculatorService;

    @PostMapping(path="/area")
    public AreaResultDto getArea(@Valid @RequestBody RadiusDto radiusDto) {
        return circleCalculatorService.calculateArea(radiusDto);
    }
}
