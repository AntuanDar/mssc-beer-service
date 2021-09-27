package com.taranenkoant.msscbeerservice.web.mappers;

import com.taranenkoant.msscbeerservice.domain.Beer;
import com.taranenkoant.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
