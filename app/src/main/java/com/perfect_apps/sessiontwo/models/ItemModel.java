package com.perfect_apps.sessiontwo.models;

/**
 * Created by mostafa_anter on 10/15/16.
 */

public class ItemModel {
    private String avatarUrl;
    private String userName;
    private String description;

    public ItemModel(){

    }

    public ItemModel(String avatarUrl, String userName, String description) {
        this.avatarUrl = avatarUrl;
        this.userName = userName;
        this.description = description;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
