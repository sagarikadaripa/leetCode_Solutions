public class StepsToZero {
    public int numberOfSteps(int num) {
        int counter = 0;
        int temp = num;
        while(temp != 0){
            if(isEven(temp)){
            temp = temp/2;
            counter++;
        }
            else{
                temp = temp - 1;
                counter++;
            }
        }
        return counter;
    }
    public static boolean isEven(int num){
        if(num%2 == 0)
            return true;
        else
            return false;
    }
}
