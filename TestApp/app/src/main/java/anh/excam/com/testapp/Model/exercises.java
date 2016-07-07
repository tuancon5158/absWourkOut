package anh.excam.com.testapp.Model;

/**
 * Created by MyPC on 06/07/2016.
 */
public class exercises {
    private  int background;
    private String content;

    public exercises() {
    }

    public exercises(int background, String content) {
        this.background = background;
        this.content = content;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
