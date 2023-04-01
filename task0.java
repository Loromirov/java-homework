
public class task0 {

    // Посчитайте сколько драгоценных камней в куче обычных камней
    // Пример:
    // jewels = “aB”, stones = “aaaAbbbB”
    // Результат в консоль ”a3B1”
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        String res = findJewelsInStones(jewels, stones);
        System.out.println(res);

    }

    public static String findJewelsInStones(String jewels, String stones) {

        char[] jewelsArr = jewels.toCharArray();
        char[] stonesArr = stones.toCharArray();
        String res = "";
        for (char jewel : jewelsArr) {
            int count = 0;
            for (char stone : stonesArr) {
                if (jewel == stone)
                    count++;
            }
            res = res + jewel + count;
        }
        return res;
    }
}
