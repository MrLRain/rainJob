package rainJob.com.util;

/**
 * @Author: xiaoyu
 * @Date: 11:37 2018/3/27
 * @Description: 分页实体
 * @ModifyBy:
 */
public class PageUtils<T> {

    //页码
    private Integer page=1;
    //页显示数量
    private Integer pageSize=10;

    private Long count;

    private Integer startSize;

    public PageUtils(Integer page, Integer pageSize,Long count) {
        this.page = page;
        this.pageSize = pageSize;
        this.count=count;
        if(page<1) page=1;
        if(pageSize<0) pageSize=10;
        startSize=(page-1)*pageSize<=count?(page-1)*pageSize:0;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Integer getStartSize() {
        return startSize;
    }

    public void setStartSize(Integer startSize) {
        this.startSize = startSize;
    }

    @Override
    public String toString() {
        return "PageUtils{" + "page=" + page + ", pageSize=" + pageSize + ", count=" + count + ", startSize=" + startSize + '}';
    }
}
