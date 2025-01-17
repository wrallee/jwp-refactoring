# 키친포스

## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
| 상품 | product | 메뉴를 관리하는 기준이 되는 데이터 |
| 메뉴 그룹 | menu group | 메뉴 묶음, 분류 |
| 메뉴 | menu | 메뉴 그룹에 속하는 실제 주문 가능 단위 |
| 메뉴 상품 | menu product | 메뉴에 속하는 수량이 있는 상품 |
| 금액 | amount | 가격 * 수량 |
| 주문 테이블 | order table | 매장에서 주문이 발생하는 영역 |
| 빈 테이블 | empty table | 주문을 등록할 수 없는 주문 테이블 |
| 주문 | order | 매장에서 발생하는 주문 |
| 주문 상태 | order status | 주문은 조리 ➜ 식사 ➜ 계산 완료 순서로 진행된다. |
| 방문한 손님 수 | number of guests | 필수 사항은 아니며 주문은 0명으로 등록할 수 있다. |
| 단체 지정 | table group | 통합 계산을 위해 개별 주문 테이블을 그룹화하는 기능 |
| 주문 항목 | order line item | 주문에 속하는 수량이 있는 메뉴 |
| 매장 식사 | eat in | 포장하지 않고 매장에서 식사하는 것 |


<br/>


## 요구 사항

#### 메뉴 그룹(menu groups)

- `POST /api/menu-groups`: 메뉴 그룹을 생성한다.
- `GET /api/menu-groups`: 메뉴 그룹 목록을 가져온다.


#### 메뉴(menus)

- `POST /api/menus`: 메뉴를 생성한다.
  - 가격이 null이거나, 0보다 작을 경우 예외 발생
  - 메뉴 그룹 ID가 존재하지 않을 경우 예외 발생
  - 메뉴 내 제품이 존재하지 않을 경우 예외 발생
  - 메뉴 가격이 제품 가격이 합보다 크면 예외 발생
- `GET /api/menus`: 메뉴 목록을 가져온다.


#### 주문(orders)

- `POST /api/orders`: 주문을 생성한다.
  - 주문 항목이 비어있을 경우 예외 발생
  - 주문 항목의 갯수와 메뉴 갯수가 일치하지 않을 경우 예외 발생
    (중복 주문 or 존재하지 않는 메뉴 주문)
  - 주문 테이블이 존재하지 않을 경우 예외 발생
  - 주문 테이블이 empty 상태일 경우 예외 발생
- `GET /api/orders`: 주문 목록을 가져온다.
- `PUT /api/orders/1/order-status`: 특정 주문의 상태를 변경한다.
  - 해당 주문이 존재하지 않을 경우 예외 발생
  - 해당 주문의 상태가 이미 COMPLETION일 경우 예외 발생


### 제품(products)

- `POST /api/products`: 제품을 생성한다.
  - 가격이 null이거나, 0보다 작을 경우 예외 발생
- `GET /api/products`: 제품 목록을 가져온다.


### 단체 지정(table groups)

- `POST /api/table-groups`: 테이블 그룹을 생성한다.
  - 그룹의 주문 테이블 목록이 비어있거나, 2보다 작을 경우 예외 발생
  - 그룹의 주문 테이블 목록이 DB와 일치하지 않을 경우 예외 발생
    (요청값에 포함 된 주문 테이블이 존재하지 않을 경우)
  - DB의 주문 테이블 중 비어 있지 않거나, 이미 그룹에 포함된 경우 예외 발생
- `DELETE /api/table-groups/1`: 특정 테이블 그룹을 삭제한다.
  - DB의 주문 테이블 중 조리, 식사 상태가 존재할 경우 예외 발생


### 주문 테이블(order tables)

- `POST /api/tables`: 테이블을 생성한다.
- `GET /api/tables`: 테이블 목록을 가져온다.
- `PUT /api/tables/1/empty`: 특정 테이블의 주문가능 상태를 변경한다.
  - 주문 테이블이 존재하지 않을 경우 예외 발생
  - DB의 주문 테이블이 테이블 그룹에 포함되어 있을 경우 예외 발생
  - DB의 주문 테이블이 조리, 식사 상태일 경우 예외 발생
- `PUT /api/tables/1/number-of-guests`: 특정 테이블의 손님 수를 변경한다.
  - 손님 숫자가 0보다 작을 경우 예외 발생
  - 주문 테이블이 존재하지 않을 경우 예외 발생
  - 주문 테이블이 empty 상태일 경우 예외 발생
