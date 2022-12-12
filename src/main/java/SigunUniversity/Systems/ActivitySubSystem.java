package SigunUniversity.Systems;

import SigunUniversity.Activity.Activity;
import SigunUniversity.Members.Team;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ActivitySubSystem {
    private List<Activity> activityList;

    public ActivitySubSystem(){
        activityList = new ArrayList<>();
    }

    public void addActivity(Activity activity){
        activityList.add(activity);
    }

    public void removeActivityById(String id){
        Iterator itr = activityList.iterator();
        while (itr.hasNext()){
            Activity activity = (Activity) itr.next();
            if (activity.getId().equals(id)){
                itr.remove();
                break;
            }
        }
    }

    public Activity getActivityById(String id){
        Iterator itr = activityList.iterator();
        while (itr.hasNext()){
            Activity activity = (Activity) itr.next();
            if (activity.getId().equals(id)){
                return activity;
            }
        }
        return null;
    }

    public ArrayList<Activity> getActivitiesByDate(Date date){
        Iterator itr = activityList.iterator();
        ArrayList<Activity> activities = new ArrayList<>();
        while (itr.hasNext()){
            Activity activity = (Activity) itr.next();
            if ((activity.getStartTime().before(date) && activity.getEndTime().after(date))){
                activities.add(activity);
            }
        }
        return activities;
    }

    public List<Activity> getActivityList(){
        return activityList;
    }

    public int checkActivityNumOfTeam(String teamId){
        int activityNum = 0;
        Iterator itr = activityList.iterator();
        while (itr.hasNext()){
            Activity activity = (Activity) itr.next();
            Iterator teamItr = activity.getTeamsIterator();
            while (teamItr.hasNext()){
                Team team = (Team) teamItr.next();
                if(team.getTeamId().equals(teamId)){
                    activityNum++;
                }
            }
        }
        return activityNum;
    }
}
