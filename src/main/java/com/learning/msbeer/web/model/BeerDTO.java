package com.learning.msbeer.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BeerDTO {

    private UUID uuid;
    private String name;
    private BeerStyleEnum style;
    private Integer quantityOnHand;
    private BigDecimal price;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private Integer version;
    private Long upc;
}
