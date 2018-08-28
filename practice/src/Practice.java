public class Practice {
    private static final String INVALID_VALUE = "Invalid Value";
    public static void main(String[] args) {
        printYearsAndDays(-9);
        printEqual(-1,1,1);
        boolean catPlaying = isCatPlaying(false, 35);
        System.out.println(catPlaying);

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

    // area of a circle
    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }
        double areaOfCircle = radius * radius * 3.14159;
        System.out.println("Area of a circle = " + areaOfCircle);
        return areaOfCircle;
    }

    // area of a rectangle
    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1;
        } else {
            double areaRectangle = x * y;
            System.out.println("Area of a rectangle = " + areaRectangle);
            return areaRectangle;
        }
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println(INVALID_VALUE);
        } else {
            long hrs = minutes > 60 ? minutes / 60 : minutes;
            long days = hrs >= 24 ? hrs / 24 : 0;
            long years = days >= 365 ? days / 365 : 0;

            long remainingHrs = minutes > 60 ? minutes % 60 : minutes;
            long remainingDays = days >= 365 ? days % 365 : days;


            System.out.println(minutes +" min = " + years + " y and " + remainingDays + " d");
        }
    }

    public static void printEqual(int x, int y, int z) {
        if(x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else {
            if(x == y && x == z || y == x && y == z || z == x && z == y) {
                System.out.println("All numbers are equal");
            } else if( (x == y && x != z || y == x && y != z || z == x && z != y) || (x != y && x == z || y != x && y == z || z != x && z == y) ) {
                System.out.println("Neither all are equal or different");
            } else {
                System.out.println("All numbers are different");
            }
        }
    }

    public static boolean isCatPlaying(boolean summer, int temp) {
        if(summer) {
            if(temp >= 25 && temp <=45) {
                return true;
            }
            return false;
        } else {
            if(temp >=25 && temp <=35) {
                return true;
            } else {
                return false;
            }
        }
    }
}
