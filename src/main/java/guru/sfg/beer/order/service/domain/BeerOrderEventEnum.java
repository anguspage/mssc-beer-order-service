package guru.sfg.beer.order.service.domain;

/**
 * Created by jantonio on 14/08/2020.
 */
public enum BeerOrderEventEnum {
    VALIDATE_ERROR, VALIDATION_PASSED, VALIDATION_FAILED,
    ALLOCATION_SUCCESS, ALLOCATION_NO_INVENTORY, ALLOCATION_FAILED,
    BEERORDER_PICKED_UP, VALIDATE_ORDER
}
