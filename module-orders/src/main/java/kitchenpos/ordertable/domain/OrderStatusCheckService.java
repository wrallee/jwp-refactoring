package kitchenpos.ordertable.domain;

import java.util.List;

public interface OrderStatusCheckService {
    boolean existsOrdersInProgress(List<Long> orderTableIds);
}
