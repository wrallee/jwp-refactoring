package kitchenpos.menugroup.dto;

import kitchenpos.menugroup.domain.MenuGroup;

public class MenuGroupResponse {
    private Long id;
    private String name;

    public static MenuGroupResponse of(MenuGroup menuGroup) {
        return new MenuGroupResponse(
            menuGroup.getId(),
            menuGroup.getName());
    }

    public MenuGroupResponse() {
    }

    public MenuGroupResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
