public class validMountain {
    public boolean validMountainArray(int[] arr) {
        boolean goingUp = true;
        boolean wentUp = false;
        boolean wentDown = false;
        
        if(arr.length < 3)
            return false;
        for(int i = 0; i < arr.length - 1; i++){
            
            if(arr[i + 1] == arr[i])
                return false;
            
            if(goingUp ){

                if( arr[i+1] < arr[i])                 
                    goingUp =false;
                else
                    wentUp = true;
            }

            if(!goingUp){

                if(arr[i+1] > arr[i])
                    return false;
                else
                    wentDown = true;
            }
    }
    return wentUp && wentDown;
    }
}
