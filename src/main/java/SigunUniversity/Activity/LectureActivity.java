package SigunUniversity.Activity;

import java.util.Date;

public class LectureActivity extends Activity{
    private String keySpeaker;

    public LectureActivity(String id, String name, Date startTime, Date endTime, String description, String site, String keySpeaker) {
        super(id, name, startTime, endTime, description, site);
        this.keySpeaker = keySpeaker;
    }

    public String getKeySpeaker(){
        return keySpeaker;
    }

    @Override
    public String toString() {
        return "LectureActivity{" +
                "keySpeaker='" + keySpeaker + '\'' +
                ", id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", startTime=" + getStartTime() +
                ", endTime=" + getEndTime() +
                ", description='" + getDescription() + '\'' +
                ", site='" + getSite() + '\'' +
                ", teamList=" + getTeamList() +
                ", organizerList=" + getOrganizerList() +
                ", teacherList=" + getTeacherList() +
                '}';

    }
}
