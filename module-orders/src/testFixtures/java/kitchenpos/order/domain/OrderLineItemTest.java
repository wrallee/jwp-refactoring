package kitchenpos.order.domain;

import static kitchenpos.menu.domain.MenuTest.*;
import static kitchenpos.order.domain.OrderLineItemDetailTest.*;

import kitchenpos.generic.price.domain.Price;
import kitchenpos.generic.quantity.domain.Quantity;

public class OrderLineItemTest {
    public static final OrderLineItem 테이블9주문_1 = new OrderLineItem(1L, 반반치킨_메뉴.getId(), 반반치킨_메뉴.getName(), 반반치킨_메뉴.getPrice(),
        Quantity.valueOf(1), OrderLineItemDetails.of(반반치킨_주문내역_상세));
    public static final OrderLineItem 테이블10주문_1 = new OrderLineItem(2L, 후라이드_메뉴.getId(), 후라이드_메뉴.getName(), 후라이드_메뉴.getPrice(),
        Quantity.valueOf(1), OrderLineItemDetails.of(후라이드_주문내역_상세));
    public static final OrderLineItem 테이블10주문_2 = new OrderLineItem(3L, 양념치킨_메뉴.getId(), 양념치킨_메뉴.getName(), 양념치킨_메뉴.getPrice(),
        Quantity.valueOf(1), OrderLineItemDetails.of(양념치킨_주문내역_상세));
    public static final OrderLineItem 테이블11주문_1 = new OrderLineItem(4L, 순살치킨_메뉴.getId(), 순살치킨_메뉴.getName(), 순살치킨_메뉴.getPrice(),
        Quantity.valueOf(1), OrderLineItemDetails.of(순살치킨_주문내역_상세));

    public static OrderLineItem of(Long seq, Long menuId, String name, Price price, Quantity quantity, OrderLineItemDetails orderLineItemDetails) {
        return new OrderLineItem(seq, menuId, name, price, quantity, orderLineItemDetails);
    }
}
