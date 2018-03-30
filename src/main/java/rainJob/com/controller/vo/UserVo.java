package rainJob.com.controller.vo;

import rainJob.com.util.enumCodes.SexType;

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
    }

    public String getResumeId() {
        return resumeId;
    }


    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }


    public void setDimensionality(String dimensionality) {
        this.dimensionality = dimensionality;
    }

    public String getDimensionality() {
        return dimensionality;
    }


    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleId() {
        return roleId;
    }


    public void setSex(SexType sex) {
        this.sex = sex;
    }

    public SexType getSex() {
        return sex;
    }


    public void setRealityName(String realityName) {
        this.realityName = realityName;
    }

    public String getRealityName() {
        return realityName;
    }


    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getUseName() {
        return useName;
    }


    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public String getEamil() {
        return eamil;
    }


    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLongitude() {
        return longitude;
    }
}