package SigunUniversity.Activity;

import java.util.Date;

public class PartyActivity extends Activity{
    private String theme;
    private String classification;

    public PartyActivity(String id, String name, Date startTime, Date endTime, String description, String site, String theme, String classification) {
        super(id, name, startTime, endTime, description, site);
        this.theme = theme;
        this.classification = classification;
    }

    public String getTheme() {
        return theme;
    }

    public String getClassification() {
        return classification;
    }

    @Override
    public String toString() {
        return "PartyActivity{" +
                "theme='" + theme + '\'' +
                ", classification='" + classification + '\'' +
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
