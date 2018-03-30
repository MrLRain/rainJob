package rainJob.com.entity;

import rainJob.com.util.enumCodes.SexType;

import javax.persistence.Column;

/**
 * @Author: xiaoyu
 * @Date: 10:21 2017/12/29
 * @Description:
 * @ModifyBy:
 */
public class User extends BaseEntity {

    @Column(name = "sex",length = 2)
    private SexType sex;
    @Column(name ="username",length = 255,nullable = false)
    private String userName;
    @Column(name ="reality_name",length = 255,nullable = false)
    private String realityName;
    @Column(length = 26)
    private String password;
    @Column(length = 255)
    private String signature;
    @Column(name = "head_icon")
    private String headIcon;
    @Column(name="role_id")
    private String roleId;
    @Column(name="resume_id")
    private String resumeId;
    @Column
    private String eamil;
    @Column
    private String dimensionality;//维度
    @Column
    private String longitude;//精度

    public SexType getSex() {
        return sex;
    }

    public void setSex(SexType sex) {
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String useName) {
        this.userName = useName;
    }

    public String getRealityName() {
        return realityName;
    }

    public void setRealityName(String realityName) {
        this.realityName = realityName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getHeadIcon() {
        return headIcon;
    }

    public void setHeadIcon(String headIcon) {
        this.headIcon = headIcon;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public String getDimensionality() {
        return dimensionality;
    }

    public void setDimensionality(String dimensionality) {
        this.dimensionality = dimensionality;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
