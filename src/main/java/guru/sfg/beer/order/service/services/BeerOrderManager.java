package guru.sfg.beer.order.service.services;

import guru.sfg.beer.order.service.domain.BeerOrder;

/**
 * Created by jantonio on 15/08/2020.
 */
public interface BeerOrderManager {

    BeerOrder newBeerOrder(BeerOrder beerOrder);
}
