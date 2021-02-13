package com.wordpress.phumelelathedesigner.learnerspermit;

public class StackCardB {
    private Integer cardResId;
    private String cardDesc;
    private Boolean imgCard;
    private String [] genericResponses;

    public StackCardB(Integer res, String description, String [] genericResponses, Boolean imgCard) {
        this.imgCard = imgCard;
        this.cardResId = res;
        this.cardDesc = description;
        this.genericResponses = genericResponses;
    }

    public Integer getImage() {
        return this.cardResId;
    }

    public String getText() {
        return this.cardDesc;
    }

    public String [] getOtherText() {
        return this.genericResponses;
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

    public void setOtherText(String [] gen) {
        this.genericResponses = gen;
        return;
    }
}