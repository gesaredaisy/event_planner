package com.onchiri.daisy.eventplanner.Model;

public class Budget {

    String event;
    int amount;
    int paidAmount;
    String note;
    String budgetItem;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(int paid) {
        this.paidAmount = paid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getBudgetItem() {
        return budgetItem;
    }

    public void setBudgetItem(String budgetItem) {
        this.budgetItem = budgetItem;
    }


}
