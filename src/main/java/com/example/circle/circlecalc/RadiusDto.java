package com.example.circle.circlecalc;

import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class RadiusDto {

    @NotNull(message = "Radius must be provided")
    @Range(min = 1, max = 100, message = "Radius must be 1 and 100")
//    @Pattern(regexp = "\\-?\\d*\\.?\\d{1,2}", message = "Quantity must be a numeric value")
    private double radius;
}
