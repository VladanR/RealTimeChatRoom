package com.example.roronoazoro.realtimechatroom.model;

public class MessageDataModel {

    private String text;
    private MemberData data;
    private boolean belongsToCurrentUser;

    public MessageDataModel(String text, MemberData data, boolean belongsToCurrentUser) {
        this.text = text;
        this.data = data;
        this.belongsToCurrentUser = belongsToCurrentUser;
    }

    public String getText() {
        return text;
    }

    public MemberData getData() {
        return data;
    }

    public boolean isBelongsToCurrentUser() {
        return belongsToCurrentUser;
    }
}
