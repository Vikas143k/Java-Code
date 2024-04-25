public class insertionShort {
    public static void ShortList(int list[]) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void main(String[] args) {
        int list[] = { 12, 3, 45, 1, 56, 4, 89 };
        for (int i = 1; i < list.length; i++) {
            int current = list[i];
            int j = i - 1;
            while (j >= 0 && current < list[j]) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = current;
        }
        ShortList(list);
    }
}
