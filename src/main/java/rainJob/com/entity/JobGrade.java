package rainJob.com.entity;

import javax.persistence.Column;
import javax.persistence.Transient;
import java.util.List;

/**
 * @Author: xiaoyu
 * @Date: 17:12 2017/12/29
 * @Description: 等级记录
 * @ModifyBy:
 */
public class JobGrade extends BaseEntity {

    @Column(name = "grade_name")
    private String gradeName;
    @Column(name = "jobGrade_id")
    private String jobGradeId;
    @Transient
    private List<JobGrade> jobGrades;
    @Transient
    private JobGrade parentGrades;

    public JobGrade getParentGrades() {
        return parentGrades;
    }

    public void setParentGrades(JobGrade parentGrades) {
        this.parentGrades = parentGrades;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public List<JobGrade> getJobGrades() {
        return jobGrades;
    }

    public String getJobGradeId() {
        return jobGradeId;
    }

    public void setJobGradeId(String jobGradeId) {
        this.jobGradeId = jobGradeId;
    }

    public void setJobGrades(List<JobGrade> jobGrades) {

        this.jobGrades = jobGrades;
    }
}
