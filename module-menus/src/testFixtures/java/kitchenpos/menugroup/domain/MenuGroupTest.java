package kitchenpos.menugroup.domain;

public class MenuGroupTest {
    public static MenuGroup 두마리메뉴 = new MenuGroup(1L, "두마리메뉴");
    public static MenuGroup 한마리메뉴 = new MenuGroup(2L, "한마리메뉴");
    public static MenuGroup 순살파닭두마리메뉴 = new MenuGroup(3L, "순살파닭두마리메뉴");
    public static MenuGroup 신메뉴 = new MenuGroup(4L, "신메뉴");

    public static MenuGroup menuGroup(Long id, String name) {
        return new MenuGroup(id, name);
    }
}
