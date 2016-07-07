package anh.excam.com.testapp.Model;

import java.io.Serializable;

/**
 * Created by MyPC on 05/07/2016.
 */
public class workOut implements Serializable {
    private int Background;
    private String title;
    private String week;

    public workOut(int background, String title, String week) {
        Background = background;
        this.title = title;
        this.week = week;
    }

    public workOut() {
    }
    //cau xem luon ho minh sao no lag the
    // do mays thooi. khong phai do code ak

    @Override
    public String toString() {
        return "workOut{" +
                "Background=" + Background +
                ", title='" + title + '\'' +
                ", week='" + week + '\'' +
                '}';
    }

    public int getBackground() {
        return Background;
    }

    public void setBackground(int background) {
        Background = background;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }
}
