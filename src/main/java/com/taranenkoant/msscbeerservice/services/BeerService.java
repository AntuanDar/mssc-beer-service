package com.taranenkoant.msscbeerservice.services;

import com.taranenkoant.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by taranenko on 06.10.2021
 * description:
 */
public interface BeerService {
    BeerDto findById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
