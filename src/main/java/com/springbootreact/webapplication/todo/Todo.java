package com.springbootreact.webapplication.todo;

import java.time.LocalDate;

// Database (MySql)
// Static List of Todo => Database
public class Todo {
    private int id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean isDone;

    /**
     * @param id
     * @param username
     * @param description
     * @param targetDate
     * @param isDone
     */
    public Todo(int id, String username, String description, LocalDate targetDate, boolean isDone) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the targetDate
     */
    public LocalDate getTargetDate() {
        return targetDate;
    }

    /**
     * @param targetDate the targetDate to set
     */
    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    /**
     * @return the isDone
     */
    public boolean isDone() {
        return isDone;
    }

    /**
     * @param isDone the isDone to set
     */
    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
                + targetDate + ", isDone=" + isDone + "]";
    }

}
