package SigunUniversity.Activity;

import SigunUniversity.Members.Organizer;
import SigunUniversity.Members.Teacher;
import SigunUniversity.Members.Team;

import java.util.*;

public abstract class Activity {
    private String id;
    private String name;
    private Date startTime;
    private Date endTime;
    private String description;
    private String site;
    private List<Team> teamList;
    private List<Organizer> organizerList;
    private List<Teacher> teacherList;

    public Activity(String id, String name, Date startTime, Date endTime, String description, String site) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.site = site;
        this.teamList = new ArrayList<>();
        this.organizerList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getDescription() {
        return description;
    }

    public String getSite() {
        return site;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addTeamToActivity(Team team){
        teamList.add(team);
    }

    public void removeTeamFromActivity(String id){
        Iterator itr = teamList.iterator();
        while (itr.hasNext()){
            Team team = (Team) itr.next();
            if (team.getTeamId().equals(id)){
                itr.remove();
                break;
            }
        }
    }

    public void addTeacherToActivity(Teacher teacher){
        teacherList.add(teacher);
    }

    public void removeTeacherFromActivity(String id){
        Iterator itr = teacherList.iterator();
        while (itr.hasNext()){
            Teacher teacher = (Teacher) itr.next();
            if (teacher.getId().equals(id)){
                itr.remove();
                break;
            }
        }
    }

    public void addOrganizerToActivity(Organizer organizer){
        organizerList.add(organizer);
    }

    public void removeOrganizerFromActivity(String id){
        Iterator itr = organizerList.iterator();
        while (itr.hasNext()){
            Organizer organizer = (Organizer) itr.next();
            if (organizer.getId().equals(id)){
                itr.remove();
                break;
            }
        }
    }

    public Iterator getTeamsIterator(){
        return teamList.iterator();
    }

    public Iterator getTeachersIterator(){
        return teacherList.iterator();
    }

    public Iterator getOrganizerIterator(){
        return organizerList.iterator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return Objects.equals(id, activity.id) && Objects.equals(name, activity.name) && Objects.equals(startTime, activity.startTime) && Objects.equals(endTime, activity.endTime) && Objects.equals(description, activity.description) && Objects.equals(site, activity.site);
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", description='" + description + '\'' +
                ", site='" + site + '\'' +
                ", teamList=" + teamList +
                ", organizerList=" + organizerList +
                ", teacherList=" + teacherList +
                '}';
    }

    protected List<Team> getTeamList(){
        return teamList;
    }

    protected List<Organizer> getOrganizerList(){
        return organizerList;
    }

    protected List<Teacher> getTeacherList(){
        return teacherList;
    }
}
