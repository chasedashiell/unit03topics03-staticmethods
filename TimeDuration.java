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

    private static TimeDuration parseFromStringNotColon(String Time){
        Time = Time.toUpperCase();
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        for (int i = Time.length(); i >= 0; i++){
            String secondsString = "";
            int j = i;
            while (Time.substring(i, Time.length()).equals("S") && i != 0){
                if (Time.substring(i, Time.length()).equals("H") || (Time.substring(i, Time.length()).equals("M"))){
                    break;
                } else {
                    secondsString = Time.substring(j, i) + secondsString;
                }
                j--;
            }
        }

        TimeDuration sol = new TimeDuration(hours, minutes, seconds);
        return sol;
    }

    private static TimeDuration parseFromStringColon(String time){
        
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        int numColons = 0;
        for (int i = 0; i <= time.length() - 1; i++){
            if (time.substring(i, i +1).equals(":")){
                numColons++;
            }
        }

        //solves for one colon
        if(numColons == 1){
            int indexOfTheColon = time.indexOf(":");
            String minsString = time.substring(0, indexOfTheColon);
            String secondsString = time.substring(indexOfTheColon +1, time.length());
            minutes = Integer.parseInt(minsString);
            seconds = Integer.parseInt(secondsString);
        // solves for two
        } else if(numColons == 2){
            int indexOfTheFirstColon = time.indexOf(":");
            int indexOfTheSecondColon = time.lastIndexOf(":");
            String hoursString = time.substring(0, indexOfTheFirstColon);
            String minsString = time.substring(indexOfTheFirstColon+1, indexOfTheSecondColon);
            String secondsString = time.substring(indexOfTheSecondColon +1, time.length());
            hours = Integer.parseInt(hoursString);
            minutes = Integer.parseInt(minsString);
            seconds = Integer.parseInt(secondsString);
        }
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
    }
}
