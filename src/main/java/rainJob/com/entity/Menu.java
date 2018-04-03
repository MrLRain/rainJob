package rainJob.com.entity;

import javax.persistence.Column;
import javax.persistence.Transient;
import java.util.List;

public class Menu extends BaseEntity {
    @Column(name = "menu_name")
    private String menuName;
    @Column(name = "menu_id")
    private String menuId;
    @Transient
    public Menu parentMenu;
    @Transient
    public List<Menu> sonMenu;
    @Column
    public String leeway;//保留字段
    @Column(name = "user_Id")
    public String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Menu getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(Menu parentMenu) {
        this.parentMenu = parentMenu;
    }

    public List<Menu> getSonMenu() {
        return sonMenu;
    }

    public void setSonMenu(List<Menu> sonMenu) {
        this.sonMenu = sonMenu;
    }

    public String getLeeway() {
        return leeway;
    }

    public void setLeeway(String leeway) {
        this.leeway = leeway;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}
