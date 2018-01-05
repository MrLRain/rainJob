package rainJob.com.entity;

import java.util.List;

/**
 * @Author: xiaoyu
 * @Date: 17:12 2017/12/29
 * @Description: 等级记录
 * @ModifyBy:
 */
public class JobGrade extends BaseEntity {

    private String gradeName;
    private List<JobGrade> jobGrades;
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

    public void setJobGrades(List<JobGrade> jobGrades) {
        this.jobGrades = jobGrades;
    }
}
