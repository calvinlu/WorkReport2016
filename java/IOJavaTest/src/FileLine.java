/**
 * Created by calvinlu on 2016-05-06.
 */
public class FileLine {
    private String[] lineArrayString;

    public FileLine(String fileLineString) {
        setLineArrayString(fileLineString.split(","));
    }

    public String[] getLineArrayString() {
        return lineArrayString;
    }

    public void setLineArrayString(String[] lineArrayString) {
        this.lineArrayString = lineArrayString;
    }
}
