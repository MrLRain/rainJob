package rainJob.com.entity;

import javax.persistence.Column;

public class Resume extends BaseEntity {
    @Column(name = "user_id",length = 36)
    public String userId;
    @Column
    public String address;
    @Column(name="resume_name")
    public String resumeName;//简历名称

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }
}
