package TP.amsd;

public class Dates {
    String begin ;
    String end ;

    public String getBeing() {
        return begin;
    }

    public void setBeing(String being) {
        this.begin = being;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String toString(){
        return "Dates{" +
                "begin='" + begin + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}
