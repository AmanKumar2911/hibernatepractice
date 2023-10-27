package com.practice;

import jakarta.persistence.CascadeType;
// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
    @Id
    private int id;
    private String ans;
    
    @OneToOne
    @JoinColumn(name = "question_id")
    private question quest;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAns() {
        return ans;
    }
    public void setAns(String ans) {
        this.ans = ans;
    }
    public question getQuest() {
        return quest;
    }
    public void setQuest(question quest) {
        this.quest = quest;
    }

    
}
