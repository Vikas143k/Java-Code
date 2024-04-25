
public class selectionShort {

    public static void ShortList(int list[]) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void main(String[] args) {
        int list[] = { 7, 8, 3, 2, 1, 56, 5 };

        // Selection short
        for (int i = 0; i < list.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[smallest] > list[j]) {
                    smallest = j;
                }
            }
            int temp = list[smallest];
            list[smallest] = list[i];
            list[i] = temp;
        }
        ShortList(list);
    }
}
