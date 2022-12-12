package SigunUniversity.Activity;

import java.util.Date;

public class ArtisticActivity extends Activity {
    private String type;

    public ArtisticActivity(String id, String name, Date startTime, Date endTime, String description, String site, String type) {
        super(id, name, startTime, endTime, description, site);
        this.type = type;
    }

    public String  getType(){
        return type;
    }

    @Override
    public String toString() {
        return "ArtisticActivity{" +
                "type='" + getType() + '\'' +
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
