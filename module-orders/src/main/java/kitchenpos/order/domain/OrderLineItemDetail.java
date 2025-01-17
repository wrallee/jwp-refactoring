package kitchenpos.order.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import kitchenpos.generic.price.domain.Price;
import kitchenpos.generic.quantity.domain.Quantity;
import kitchenpos.menu.domain.MenuProductOption;
import kitchenpos.product.domain.ProductOption;

@Entity
public class OrderLineItemDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq")
    private Long seq;

    @Column(nullable = false)
    private Long productId;

    @Column(nullable = false)
    private String name;

    @Embedded
    @Column(nullable = false)
    private Price price;

    @Embedded
    @Column(nullable = false)
    private Quantity quantity;

    protected OrderLineItemDetail() {
    }

    public OrderLineItemDetail(Long productId, String name, Price price, Quantity quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public MenuProductOption toMenuDetailOption() {
        return new MenuProductOption(productId, quantity);
    }

    public ProductOption toProductOption() {
        return new ProductOption(productId, name, price);
    }
}
