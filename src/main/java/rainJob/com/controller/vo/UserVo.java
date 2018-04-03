package rainJob.com.controller.vo;


<<<<<<< HEAD
import java.util.Date;
/**
 * @Author: xiaoyu
 * @Date: 11:36 2018/3/30
 * @Description:
 * @ModifyBy:
 */
public class UserVo extends BaseEntityVo {
    private String id;
    private Date createDate;
    private Date updateDate;

    public String getId() {
        return id;
=======
public class UserVo {
    private String headIcon;
    private String resumeId;
    private String signature;
    private String dimensionality;
    private String roleId;
    private SexType sex;
    private String realityName;
    private String useName;
    private String eamil;
    private String longitude;


    public void setHeadIcon(String headIcon) {
        this.headIcon = headIcon;
    }

    public String getHeadIcon() {
        return headIcon;
    }


    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
>>>>>>> 43ed15514465f493ae6e479859a4ee069c75759c
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}