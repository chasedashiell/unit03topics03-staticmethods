public class TimeDuration {
    private int hours;
    private int minutes;
    private int seconds;
    public static int numOfTimeDurations = 0;

    public TimeDuration(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        numOfTimeDurations += 1;
    }

    public static TimeDuration parseFromString(String time){
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        String[] integers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = time.length(); i > 0; i--){

        }
    }
    
    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSeconds(){
        return seconds;
    }

    public String toString(){
        String toReturnHours = "" + getHours();
        String toReturnMins = "" + getMinutes();
        String toReturnSeconds = "" + getSeconds();

        if (getHours()- 10 < 0){
            toReturnHours = "0" + toReturnHours;
        }

        if (getMinutes() - 10 <0){
            toReturnMins = "0" + toReturnMins;
        }

        if (getSeconds() - 10 < 0){
            toReturnSeconds = "0" + toReturnSeconds;
        }

        return toReturnHours + ":" + toReturnMins + ":" + toReturnSeconds;
    }

    public static void main(String[] args) {
        TimeDuration uno = new TimeDuration(9, 9, 9);
        System.out.println(uno.toString());
        System.out.println(numOfTimeDurations);
    }
}
