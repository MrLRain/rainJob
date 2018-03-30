package rainJob.com.controller.vo;

/**
 * @Author: xiaoyu
 * @Date: 11:36 2018/3/30
 * @Description:
 * @ModifyBy:
 */
public class BaseEntityVo{

    private int pageSize;
    private int page;
    private String order;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}