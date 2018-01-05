package rainJob.com.util.enumCodes;

public enum GradeEnum {
    Admin(0),User(1),VIP(2),Company(3),Custom(4);
    private Integer id;

    GradeEnum(Integer id) {
        this.id = id;
    }

}
