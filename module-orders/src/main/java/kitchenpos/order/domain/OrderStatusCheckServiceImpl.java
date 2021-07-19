package kitchenpos.order.domain;

import java.util.List;

import org.springframework.stereotype.Component;

import kitchenpos.ordertable.domain.OrderStatusCheckService;

@Component
public class OrderStatusCheckServiceImpl implements OrderStatusCheckService {
    private final OrderRepository orderRepository;

    public OrderStatusCheckServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public boolean existsOrdersInProgress(List<Long> orderTableIds) {
        return orderRepository.existsAllByOrderTableIdInAndOrderStatusIn(
            orderTableIds, OrderStatus.getInProgressStatuses());
    }
}
