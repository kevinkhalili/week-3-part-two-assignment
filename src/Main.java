
//written by Kevin Khalili
//a set of methods

public class Main {
    public static void main(String[] args) {

        String[] names = new String[]{"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        String allNames = "";
        String startChar = "S";
        int count = 0;
        int totalLetters = 0;
        double averagePerName = 0.0;
        int[] findNumOfEachElement = new int[names.length];

        //populating findNumOfEachElement with the length of each word in the names array
        for (int i = 0; i < names.length ; i++){

            findNumOfEachElement[i] = names[i].length();
            totalLetters = totalLetters + findNumOfEachElement[i];
        }
        //finding the average of each word
        for (int i = 0; i < names.length ; i++){

            averagePerName = (double)findNumOfEachElement[i]/totalLetters;
            System.out.printf("The averaeg number of letters per name is:%2.2f" , averagePerName);
            System.out.println();

        }

        //concatenating names separated by a space
        for (int i = 0; i < names.length; i++) {
            allNames = allNames.concat(names[i] + " ");
            allNames = allNames.toUpperCase();
        }
        System.out.println(allNames);
        //accessing to the last element of any array
        System.out.println("The last element of array is: " + names[names.length-1]);
        //accessing to the first element of any array
        System.out.println("The first element of array is: " + names[names.length-names.length]);

        int[] nameLengths = new int[names.length];

       //populating nameLengths array with data
        for(int i = 0; i < nameLengths.length; i++)
            nameLengths[i] = names[i].length();

        int sum = 0;
        //calculating the sum of all the elements in the array nameLeghts
        for (int i = 0; i < nameLengths.length; i++)
            sum = sum + nameLengths[i];
        System.out.println("The sum is: " + sum);

        //calling method to print a word n numbers of time
        System.out.println("Concatenating itself: " + repeatItself("Hello", 3));

        //getting a full name by sending first name and last name
        System.out.println("The full name is: " + fullName("Sue", "Smith"));

        //to find out if it is true or false for the sum of all the elements of the array against 100
        boolean myAnswer = trueOrFalse(nameLengths);
        System.out.println("Is it greater than or equal to 100: " + myAnswer);

        //passing an array of double to the averageOfArray method to get an average of a set of double values
        double[] myArray = new  double[]{12.5, 3.75, 50.11, 50.50};
        double averageOfArray = averageOfArrayElements(myArray);
        System.out.printf("The average of all the elements in the array is: %2.2f ", averageOfArray);
        System.out.println();
        //passing two double arrays and returns true if the average of the elements in the first array is
        //greater than the average of the elements in the second array
        boolean checkTwoAverages;
        double[] ourArray = new double[]{1.3, 21.75, 84.25, 22.4};
        double[] yourArray = new double[]{1.35, 10.75, 8.25, 32.4};
        checkTwoAverages = checkingAverageOfTwoArrays(ourArray, yourArray);
        System.out.printf("The average of ourAarray is greater than yourArray: " + checkTwoAverages);
        System.out.println();

        //Will you buy a drink or not? This method will tell you what to do.
        boolean isHot = true;
        double  myMoney = 20.00;
        System.out.println("Is it ture I will by a drink: " + willBuyDrink(isHot, myMoney));

        //Will you buy some gas or not? This method will tell you what to do.

        double gasValue = 5.59;
        double totalMoney = 50.00;
        gasPrice(gasValue, totalMoney);

    }

    //this method repeats a word n number of times
    public static String repeatItself(String word, int n)
    {
        String str = "";
        for(int i = 0; i < n; i++)
            str = str + word;
        return str;
    }
    //this method return a full name
    public static String fullName(String firstName, String lastName)
    {
        return (firstName + " " + lastName);
    }
    //this method return true if the sum of an array element is greater than 100 and false otherwise
    public static boolean trueOrFalse(int[] myNumber)
    {
        int sum = 0;
        for (int i = 0; i < myNumber.length - 1; i++)
            sum = sum + myNumber[i];
        if (sum >= 100)
            return true;
        else
            return false;
    }
    //This array return the average of all the elements in the array
    public static double averageOfArrayElements(double[] myNumbers)
    {
        double sum = 0.0;
        for(int i = 0; i < myNumbers.length - 1; i++)
            sum = sum + myNumbers[i];
        return sum/myNumbers.length;

    }
    //This method compares the average of two arrays' elements and retrun true of false if myNumbers
    //array average greater than yourNumbers array average
    public static boolean checkingAverageOfTwoArrays(double[] myNumbers, double[] yourNumbers)
    {
        double mySum = 0.0;
        double yourSum = 0.0;
        for(int i = 0; i < myNumbers.length - 1; i++) {
            mySum = mySum + myNumbers[i];
            yourSum = yourSum + yourNumbers[i];
        }
        if (mySum/myNumbers.length > yourSum/yourNumbers.length)
            return true;
        else
            return false;
    }

    //This method returns true if isHotOutside and moneyInPocket is greater than 10.50
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
    {
        if(isHotOutside == true && moneyInPocket > 10.50)
            return true;
        else
            return false;
    }
    //This method indicate if you will buy some gas or not
    public static void gasPrice(double pricePerGallon, double pocketMoney)
    {
        if(pricePerGallon < 4.00 && pocketMoney > 25.00)
            System.out.println("I will buy some gas.");
        else
            System.out.println("I will not buy any gas.");

    }

}