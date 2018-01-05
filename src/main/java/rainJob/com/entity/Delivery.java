package rainJob.com.entity;


/**
 * @Author: xiaoyu
 * @Date: 10:20 2018/1/2
 * @Description:
 * @ModifyBy: 简历投递表
 */
public class Delivery extends BaseEntity {

    private User user;

    private String resumeId; //简历选择

    private EmploymentInformation employmentInformation;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    public EmploymentInformation getEmploymentInformation() {
        return employmentInformation;
    }

    public void setEmploymentInformation(EmploymentInformation employmentInformation) {
        this.employmentInformation = employmentInformation;
    }
}
