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

    public static TimeDuration parseFromStringColon(String time){
        
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        int numColons = 0;
        for (int i = 0; i < time.length() - 1; i++){
            if (time.substring(i, i +1).equals(":")){
                numColons++;
            }
        }
        System.out.println(numColons);
        



        TimeDuration sol = new TimeDuration(hours, minutes, seconds);
        return sol;
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
        // TimeDuration uno = new TimeDuration(9, 9, 9);
        // System.out.println(uno.toString());
        // System.out.println(numOfTimeDurations);
        parseFromStringColon("::::");
    }
}
