public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    public String getDescription() {
        return this.description;
    }

    public void setDone(){
        isDone = true;
        System.out.println("\t____________________________________________________________");
        System.out.println("\tNice! I've marked this task as done: ");
        System.out.println("\t" + "[" + "\u2713" + "] " + getDescription() ); //ticked symbols
        System.out.println("\t____________________________________________________________");
    }


}