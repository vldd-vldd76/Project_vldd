package PoPrykolu;

public class General {
    public static void main(String [] args){
        {
            int [] array = {4, 7, 3, 1, 2, 5, 9, 6, 8};
            int x = 0;
            int el = 0;
            for(int i = 0; i <array.length; i++) {
                if (array[i] > array[i+1]){
                    el = array[i];
                    array[i] = array[i+1];
                    array[i+1] = el;
                    x = x + 1;
                } else if (x == 0 && i == 7) {
                    break;
                }
                if(i == 7) {
                    i = -1;
                    x = 0;
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
