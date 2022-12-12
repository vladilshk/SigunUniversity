package SigunUniversity.Systems;


import SigunUniversity.Members.Organizer;
import SigunUniversity.Members.Student;
import SigunUniversity.Members.Teacher;
import SigunUniversity.Members.Team;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserSubSystem {
    private List<Student> studentList;
    private List<Organizer> organizerList;
    private List<Teacher> teacherList;
    private List<Team> teamList;

    public UserSubSystem(){
        this.studentList = new ArrayList<>();
        this.organizerList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
        this.teamList = new ArrayList<>();
    }

    public void addStudent(Student student){
        Iterator itr = studentList.iterator();
        boolean sameStudent = false;
        while (itr.hasNext()){
            Student student1 = (Student) itr.next();
            if (student1.getId().equals(student.getId())){
                sameStudent = true;
            }
        }
        if (sameStudent){
            removeStudentById(student.getId());
        }
        studentList.add(student);
    }

    public void removeStudentById(String id){
        Iterator itr = studentList.iterator();
        while (itr.hasNext()){
            Student student = (Student) itr.next();
            if (student.getId().equals(id)){
                itr.remove();
                break;
            }
        }
    }

    public Student getStudentById(String id){
        Iterator itr = studentList.iterator();
        while (itr.hasNext()){
            Student student = (Student) itr.next();
            if (student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }

    public List<Student> getStudentList(){
        return studentList;
    }

    public void addOrganizer(Organizer organizer){
        organizerList.add(organizer);
    }

    public void removeOrganizerById(String id){
        Iterator itr = organizerList.iterator();
        while (itr.hasNext()){
            Organizer organizer = (Organizer) itr.next();
            if (organizer.getId().equals(id)){
                itr.remove();
            }
        }
    }

    public Organizer getOrganizerById(String  id){
        Iterator itr = organizerList.iterator();
        while (itr.hasNext()){
            Organizer organizer = (Organizer) itr.next();
            if (organizer.getId().equals(id)){
                return organizer;
            }
        }
        return null;
    }

    public List<Organizer> getOrganizerList(){
        return organizerList;
    }



    public void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }

    public void removeTeacherById(String id){
        Iterator itr = teacherList.iterator();
        while (itr.hasNext()){
            Teacher teacher = (Teacher) itr.next();
            if (teacher.getId().equals(id)){
                itr.remove();
            }
        }
    }

    public Teacher getTeacherById(String  id){
        Iterator itr = teacherList.iterator();
        while (itr.hasNext()){
            Teacher teacher = (Teacher) itr.next();
            if (teacher.getId().equals(id)){
                return teacher;
            }
        }
        return null;
    }

    public List<Teacher> getTeacherList(){
        return teacherList;
    }

    public void createTeam(String creatorID, String teamId, String teamName, String department){
        Team team = new Team(teamId, teamName, department, getStudentById(creatorID));
        getStudentById(creatorID).addTeam(team);
        teamList.add(team);
    }

    public void addStudentToTeam(String creatorId, String studentId, String teamId){
        Iterator itr = teamList.iterator();
        Iterator studentsItr = studentList.iterator();
        while (itr.hasNext()){
            Team team = (Team) itr.next();
            if (team.getTeamId().equals(teamId)){
                getStudentById(studentId).addTeam(team);
                team.addStudent(getStudentById(studentId));
                break;
            }
        }
    }

    public void addTeacherToTeam(String creatorId, String teacherID, String teamId){
        Iterator itr = teamList.iterator();
        while (itr.hasNext()){
            Team team = (Team) itr.next();
            if (team.getTeamId().equals(teamId)){
                team.addTeacher(getTeacherById(teacherID));
            }
        }
    }
}
