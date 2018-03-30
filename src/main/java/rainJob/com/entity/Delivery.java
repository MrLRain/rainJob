package rainJob.com.entity;


import javax.persistence.Column;
import javax.persistence.Transient;

/**
 * @Author: xiaoyu
 * @Date: 10:20 2018/1/2
 * @Description:
 * @ModifyBy: 简历投递表
 */
public class Delivery extends BaseEntity {

    @Column(name = "user_id",length = 36)
    private String userId;
    @Transient
    private User user;
    @Column(name = "resume_id",length = 36)
    private String resumeId; //简历选择
    @Column(name="employmentInformation_id")
    private String employmentInformationId;
    @Transient
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmploymentInformationId() {
        return employmentInformationId;
    }

    public void setEmploymentInformationId(String employmentInformationId) {
        this.employmentInformationId = employmentInformationId;
    }
}
