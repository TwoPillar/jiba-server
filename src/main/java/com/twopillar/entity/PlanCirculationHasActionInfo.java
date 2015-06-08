package com.twopillar.entity;

public class PlanCirculationHasActionInfo extends PlanCirculationHasActionInfoKey {
    private Integer sets;

    private Integer reps;

    private Integer seq;

    public Integer getSets() {
        return sets;
    }

    public void setSets(Integer sets) {
        this.sets = sets;
    }

    public Integer getReps() {
        return reps;
    }

    public void setReps(Integer reps) {
        this.reps = reps;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }
}