package com.example.ashish.instareplica;

/**
 * Created by siddharthutgikar on 4/18/17.
 */

public class ImageObject {

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String url;
    private boolean isLiked;


}
