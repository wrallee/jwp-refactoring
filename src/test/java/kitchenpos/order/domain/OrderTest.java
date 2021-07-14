package kitchenpos.order.domain;

import static kitchenpos.order.domain.OrderLineItemTest.*;
import static kitchenpos.order.domain.OrderStatus.*;
import static kitchenpos.order.domain.OrderTableTest.*;

import org.junit.jupiter.api.DisplayName;

@DisplayName("주문 단위 테스트")
public class OrderTest {
    public static final Order 테이블9주문_조리 = new Order(1L, 테이블9_사용중.getId(), COOKING, OrderLineItems.of(테이블9주문_1));
    public static final Order 테이블10주문_식사 = new Order(2L, 테이블10_사용중.getId(), MEAL, OrderLineItems.of(테이블10주문_1, 테이블10주문_2));
    public static final Order 테이블11주문_완결 = new Order(3L, 테이블11_사용중.getId(), COMPLETION, OrderLineItems.of(테이블11주문_1));

    public static Order order(Long id, Long orderTableId, OrderStatus orderStatus, OrderLineItems orderLineItems) {
        return new Order(id, orderTableId, orderStatus, orderLineItems);
    }
}