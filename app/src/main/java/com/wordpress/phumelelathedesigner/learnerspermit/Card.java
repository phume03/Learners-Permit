package com.wordpress.phumelelathedesigner.learnerspermit;

class Card {
    private Integer imageResourceID;
    private String titleTag;

    public Card (int img, String title) {
        this.imageResourceID = new Integer(img);
        this.titleTag = title;
    }

    public Integer getImage() {
        return imageResourceID;
    }

    public String getTitleTag() {
        return titleTag;
    }

    public void setImageResourceID(int img) {
        this.imageResourceID = new Integer(img);
    }

    public void setTitleTag(String title) {
        this.titleTag = title;
    }
}
