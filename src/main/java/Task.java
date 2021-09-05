public class Task {

    /** The actual description or name of the task */
    private String description;
    /** Shows if task is completed */
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public boolean checkStringNullOrEmpty(String validString) {
        return validString == null || validString.isEmpty();

    }

    /**
     * Obtains description of task
     *
     * @return get the description of the task
     */
    public String getDescription() {
        return description;
    }

    /**
     * Checks if the task is completed and returns corresponding icons
     *
     * @return X if task is already completed else just blank
     */
    private String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    /**
     * Sets the task as completed
     */
    public void markAsDone() {
        isDone = true;
    }

    /**
     * Check the completion status of a task
     *
     * @return get the isDone value
     */
    public boolean getIsDone() {
        return isDone;
    }

    /**
     * Overwrites default toString method with the custom print message
     *
     * @return Customised string message for task
     */
    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + description;
    }
}
