public class Proj {
    
    public static void reverseDisplayLoop(int value){
        while(value > 0){
            System.out.print(value % 10);
            value /= 10;
        }
    }

    public static void reverseDisplayRecursion(int value){
        System.out.print(value % 10);
        if (value >= 10) {
            reverseDisplayLoop(value / 10);
        }
    }

    public static void reverseDisplayLoop(String value){
        while(value.length() > 0){
            System.out.print(value.charAt(value.length()-1));
            value = value.substring(0, value.length()-1);
        }
    }

    public static void reverseDisplayRecursion(String value){
        System.out.print(value.charAt(value.length()-1));
        if (value.length() > 0) {
            reverseDisplayLoop(value.substring(0, value.length()-1));
        }
    }
}
