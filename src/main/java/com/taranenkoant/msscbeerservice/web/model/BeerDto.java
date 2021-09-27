package com.taranenkoant.msscbeerservice.web.model;

import lombok.*;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Create by taranenko on 05.07.2021
 * Описание:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @Null
    private UUID id;

    @Null
    private Integer version;

    @Null
    private OffsetDateTime createdDate;

    @Null
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    @Size(min = 3, max = 100)
    private String beerName;

    @NotNull
    private BeerStyleEnum beerStyleEnum;

    @NotNull
    @Positive
    private Long upc;

    @NotNull
    @Positive
    private BigDecimal price;

    @Positive
    private Integer quantityOnHand;


}
