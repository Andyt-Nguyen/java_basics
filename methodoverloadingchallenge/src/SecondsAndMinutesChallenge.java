public class SecondsAndMinutesChallenge {
    private static final String INVALID_MESSAGE = "Invalid value"; // Constant

    public static void main(String[] args) {
        getDurationString(130, 50);
        getDurationString(3605);
        getDurationString(-34);
    }

    private static String getDurationString(int min, int sec) {
        if(min < 0 || sec > 59 || sec < 0) {
            System.out.println(INVALID_MESSAGE);
            return INVALID_MESSAGE;
        }
        int hrs = (int) min >= 60 ? min/60 : 0;
        int remainingMin = (int) min >= 60 ? min % 60 : min;

        String hrToString = "" + hrs;
        String minToString = "" + remainingMin;
        String secToString = "" + sec;

        hrToString = hrToString.length() < 2 ? "0" + hrToString : hrToString;
        minToString = minToString.length() < 2 ? "0" + minToString : minToString;
        secToString = secToString.length() < 2 ? "0" + secToString : secToString;

        String formattedTime = hrToString + "hr " + minToString + "m " + secToString + "s";
        System.out.println(formattedTime);
        return formattedTime;

    }

    private static String getDurationString(int sec) {
        if(sec < 0) {
            System.out.println(INVALID_MESSAGE);
            return INVALID_MESSAGE;
        }
        int minutes = sec >= 60 ? sec / 60 : sec;
        int remainingSec = sec >= 60 ? sec % 60 : sec;

        return getDurationString(minutes, remainingSec);
    }
}
