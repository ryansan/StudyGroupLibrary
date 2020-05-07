package com.accenture.studygroup;

import java.io.Serializable;
import java.util.List;

public class StudentMessageDTO implements Serializable {
    private long student_id;
    private String first_name;
    private String last_name;
    private String student_number;
    private String fieldOfStudy;
    private List<StudyGroupMessageDTO> studyGroups;

    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public List<StudyGroupMessageDTO> getStudyGroups() {
        return studyGroups;
    }

    public void setStudyGroups(List<StudyGroupMessageDTO> studyGroups) {
        this.studyGroups = studyGroups;
    }
}
