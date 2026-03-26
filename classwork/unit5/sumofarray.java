
public class sumofarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of the array: " + sum);
    }
}
/*method2
public class SumOfArray {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sum = 0;
        for (int val : list) {
            sum += val;
        }

        System.out.println("Sum = " + sum);
    }
}
*/
