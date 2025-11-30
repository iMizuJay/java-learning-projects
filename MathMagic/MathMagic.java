package MathMagic;

public class MathMagic {
    public static void main(String[] args) {
    //This is the original number
    int myNumber = 1738;

    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    
    System.out.println(stepSix);

		

	}
}
