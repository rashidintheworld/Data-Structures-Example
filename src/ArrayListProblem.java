import java.util.*;
public class ArrayListProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> integerList = getList(list,n,sc);
        checkList(list,sc);
    }
    public static ArrayList<ArrayList<Integer>> getList(ArrayList<ArrayList<Integer>> list,int n,Scanner sc) {

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<Integer>(d);
            for (int j = 0; j < d; j++) {
                int value = sc.nextInt();
                arrayList.add(value);
            }
            list.add(arrayList);
        }
        return list;
    }

    public static void checkList(ArrayList<ArrayList<Integer>> list , Scanner sc){
        int q = sc.nextInt();
        for (int i = 0;i<q ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            try{
                System.out.println(list.get(x-1).get(y-1));
            }catch (IndexOutOfBoundsException ex){
                System.err.println("ERROR!");
            }
        }
    }
}
