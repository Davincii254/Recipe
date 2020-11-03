
package com.moringaschool.recipeapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties {

    @SerializedName("answer")
    @Expose
    private Answer answer;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("type")
    @Expose
    private Type type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Properties() {
    }

    /**
     * 
     * @param image
     * @param answer
     * @param type
     */
    public Properties(Answer answer, Image image, Type type) {
        super();
        this.answer = answer;
        this.image = image;
        this.type = type;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
