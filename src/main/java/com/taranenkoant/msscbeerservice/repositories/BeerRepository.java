package com.taranenkoant.msscbeerservice.repositories;

import com.taranenkoant.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
