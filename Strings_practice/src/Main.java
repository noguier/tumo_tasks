public class Main {
    public static void main(String[] args) {
        Product mask = new Product("mask", 50);
        StringBuilder goods = new StringBuilder();

        for (int i = 0; i < 10_000; i++) {
            goods.append(mask).append("\n");
        }

        String allGoods = goods.toString();

        long start = System.currentTimeMillis();
        allGoods = allGoods.concat(mask.toString());
        System.out.println(System.currentTimeMillis() - start);
    }
}