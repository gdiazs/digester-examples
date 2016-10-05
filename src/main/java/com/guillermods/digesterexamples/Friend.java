package com.guillermods.digesterexamples;

/**
 * Created by gdiazs on 08/09/2016.
 */
public class Friend {

    private String friendName;

    private Integer friendAge;

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public Integer getFriendAge() {
        return friendAge;
    }

    public void setFriendAge(Integer friendAge) {
        this.friendAge = friendAge;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "friendName='" + friendName + '\'' +
                ", friendAge=" + friendAge +
                '}';
    }
}
