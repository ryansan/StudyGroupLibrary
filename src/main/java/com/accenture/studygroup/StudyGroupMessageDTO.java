package com.accenture.studygroup;

import java.io.Serializable;
import java.util.List;

public class StudyGroupMessageDTO implements Serializable {
    private long study_group_id;
    private String groupName;
    private String startDate;
    private String description;
    private boolean acceptingNewStudents;
    private List<StudentMessageDTO> students;

    public long getStudy_group_id() {
        return study_group_id;
    }

    public void setStudy_group_id(long study_group_id) {
        this.study_group_id = study_group_id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAcceptingNewStudents() {
        return acceptingNewStudents;
    }

    public void setAcceptingNewStudents(boolean acceptingNewStudents) {
        this.acceptingNewStudents = acceptingNewStudents;
    }

    public List<StudentMessageDTO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentMessageDTO> students) {
        this.students = students;
    }
}
