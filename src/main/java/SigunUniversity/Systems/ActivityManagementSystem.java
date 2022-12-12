package SigunUniversity.Systems;

public class ActivityManagementSystem {
    private ActivitySubSystem activitySubSystem;
    private UserSubSystem userSubSystem;

    public ActivityManagementSystem(){
        activitySubSystem = new ActivitySubSystem();
        userSubSystem = new UserSubSystem();
    }

    public void displayUserSubSystem(){
        System.out.println(getUserSubSystem().getOrganizerList());
        System.out.println(getUserSubSystem().getTeacherList());
        System.out.println(getUserSubSystem().getStudentList());
    }

    public void displayActivitySubSystem(){
        System.out.println(getActivitySubSystem().getActivityList());
    }

    public UserSubSystem getUserSubSystem(){
        return userSubSystem;
    }

    public ActivitySubSystem getActivitySubSystem(){
        return activitySubSystem;
    }
}
