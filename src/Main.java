public class Main {
    public static void main(String[] args) {
        ToyStore shop = new ToyStore();
        shop.putToy(new Toy(1, "конструктор", 2));
        shop.putToy(new Toy(2, "робот", 2));
        shop.putToy(new Toy(3, "кукла", 6));

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            Toy toy = shop.getToy();
            if (toy != null) {
                result.append(toy.getName()).append("\n");
            }
        }

        Service fileService = new Service("toys.txt");
        fileService.save(result + "\n");
    }
}