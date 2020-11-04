package seedu.duke.commands;

public class Task {
    public String description;
    public boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    public String getDescription() {
        return "[" + getStatusIcon() + "] " + this.description;
    }

    public void setDone() {
        isDone = true;
    }
}