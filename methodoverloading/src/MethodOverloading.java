public class MethodOverloading {
    /*
     * In order to do method overloading is creating multiple of the same method
     * names and having each function have different parameters and amount of parameters
     */
    public static void main(String[] args) {
        calculateScore("Tim", 5); // This function is calling the first method
        calculateScore(4); // This function is using the second calcScore method
        calculateScore(); // This function is calling the third method

        calcFeetAndInchesToCentimeters(13,1);
        calcFeetAndInchesToCentimeters(100);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name or player score");
        return 0;
    }

    // This function coverts ft & inches to cm
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0) { // validation check
            return -1;
        } else if(inches < 0 || inches > 12){ // validation check
            return -1;
        } else {
            // 1ft = 12in
            // 1in = 2.54cm
            double ftToInches = convertInchesToCm(feet * 12);
            double inchesToCm = convertInchesToCm(inches);
            double total = ftToInches + inchesToCm;
            System.out.println(feet + "ft " + inches + "in = " + total + "cm");
            return total;
        }
    }

    // This function takes only inches and transforms to cm
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) { // validation check
            return -1;
        }

        double inchesToFt = (int) inches / 12;
        double leftOverInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(inchesToFt, leftOverInches);



     }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }
}
