public class Practice {
    public static void main(String[] args) {
      // areEqualByThreeDecimalPlaces(5.235, 5.2356);
        boolean jugs = hasTeen(-13,-17,-19);
        System.out.println(jugs);

    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else {
            if(barking) {
                if(hourOfDay < 8 || hourOfDay > 22) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public static boolean isLeapYear(int year) {
        if(year >= 1 && year <= 9999) {
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        double roundNumber1 = num1 * 100;
        double roundNumber2 = num2 * 100;
        roundNumber1 = roundNumber1/100;
        roundNumber2 = roundNumber2/100;
        System.out.println(roundNumber1);
        System.out.println(roundNumber2);

        if(roundNumber1 == roundNumber2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasEqualSum(int num1, int num2, int sum) {
        if((num1 + num2) == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        num3 = Math.abs(num3);
        if(num1 >= 13 && num1 <= 19 || num2 >= 13 && num2 <= 19 || num3 >= 13 && num3 <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
