package com.accenture.studygroup;

import java.io.Serializable;

public class StudyGroupMessage implements Serializable {
    public enum MessageType {ADD, UPDATE, DELETE}

    private long messageID;
    private MessageType type;
    private StudyGroupMessageDTO studyGroup;

    public long getMessageID() {
        return messageID;
    }

    public void setMessageID(long messageID) {
        this.messageID = messageID;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public StudyGroupMessageDTO getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(StudyGroupMessageDTO studyGroup) {
        this.studyGroup = studyGroup;
    }
}