public class FindArrayRotation {

    public FindArrayRotation() {
    }

    public  int findRotationPoint(String[] words) {

        // find the rotation point in the array
        int rotation = 0;
        boolean rotationFund = false;

        if(words.length<2)
            return 0;

        rotation = words.length/2;
        String compare = "a";

        System.out.println("aa".compareTo("ac"));

        while(true){

            if(rotation>0 && rotation<words.length-1) {
                if (words[rotation].compareTo(words[rotation - 1]) < 0 && words[rotation].compareTo(words[rotation + 1]) < 0) {
                    break;
                }
            }else if(rotation == 0){
                System.out.println("reached start");
                break;
            }else if(rotation == words.length-1){
                System.out.println("reahced end");
                break;
            }

            if(words[rotation].compareTo(compare) < 0){
                System.out.println("in less than 0");
                rotation = rotation/2;


            }
            else if(words[rotation].compareTo(compare) > 0){
                System.out.println("in greater than 0");
                rotation = (rotation + words.length)/2;

            }
        }

        return rotation;
    }
}
