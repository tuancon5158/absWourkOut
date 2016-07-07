package anh.excam.com.testapp.Model;

/**
 * Created by MyPC on 06/07/2016.
 */
public class detailworkOut {
    private  String day;
    private  String round;
    private  String data;

    public detailworkOut(String day, String round, String data) {
        this.day = day;
        this.round = round;
        this.data = data;
    }

    public detailworkOut() {
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
