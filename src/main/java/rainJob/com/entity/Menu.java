package rainJob.com.entity;

import java.util.List;

public class Menu extends BaseEntity {

    public String menuName;
    public  Menu parentMenu;
    public List<Menu> sonMenu;
    public String leeway;//保留字段
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
}
