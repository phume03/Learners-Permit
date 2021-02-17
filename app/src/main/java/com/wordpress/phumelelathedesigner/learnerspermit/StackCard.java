package com.wordpress.phumelelathedesigner.learnerspermit;

public class StackCard {
    private Integer cardResId;
    private String cardDesc;
    private Boolean imgCard;

    public StackCard(Integer res, String description, Boolean imgCard) {
        this.imgCard = imgCard;
        this.cardResId = res;
        this.cardDesc = description;
    }

    public Integer getImage() {
        return this.cardResId;
    }

    public String getText() {
        return this.cardDesc;
    }

    public Boolean isImageCard() {
        return this.imgCard;
    }

    public void setImage(Integer resId) {
        this.cardResId = resId;
        return;
    }

    public void setText(String desc) {
        this.cardDesc = desc;
        return;
    }
}
