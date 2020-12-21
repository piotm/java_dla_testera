public class Bug {
    private enum Status {
        OPEN, CLOSED
    }
    private String description;
    private String email;
    private int priority;
    private Status status;

    private Bug(String description, String email, int priority, Status status) {
        if(priority < 1 || priority > 5){
            throw new IllegalStateException("Piority 1-5");
        }
        this.description = description;
        this.email = email;
        this.priority = priority;
        this.status = status;
    }

    public Bug(String description, String email, int priority){
        this(description, email, priority, Status.OPEN);
    }

    public Bug(String description, String email, int priority, boolean isClosed){
        this(description, email, priority, isClosed ? Status.CLOSED : Status.OPEN);  //operator ternarny
   /*     if (isClosed){
            this.status = Status.CLOSED;
        } else {
            this.status = Status.OPEN;
        }
    */
    }

    public String getStatus() {
        return status.name();
    }

    public String getEmail() {
        return email;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "description='" + description + '\'' +
                ", email='" + email + '\'' +
                ", priority=" + priority +
                ", status=" + status.name() +
                '}';
    }
}


