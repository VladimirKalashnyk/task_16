package task_1;

/**
 * Created by User on 10.04.2017.
 */
public enum Security {
    LIGHT("light"),
    MEDIUM("medium"),
    HIGH("high");
    private String description;

    Security(String description) {
        this.description = description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return description;
    }
}
