import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] product = {new Product("Молоко", 50),
                new Product("Хлеб", 14),
                new Product("Каша гречневая", 80)};

        System.out.println("Список доступных продуктов к покупке: ");
        for (int i = 0; i < product.length; i++) {
            int cnt = i + 1;
            System.out.println(cnt + ". " + product[i]);
        }


        while (true) {

            System.out.println("Выберите товар и количество или введите 'end' ");

            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }


            String[] s = input.split(" ");
            int productNumber = 0;
            int productCount = 0;

            try {
                if (s.length == 2) {
                    productNumber = Integer.parseInt(s[0]) - 1;
                    productCount = Integer.parseInt(s[1]);
                } else
                    System.out.println("вы сделали ввод не из двух частей, а из одной или более двух");

                if ((((productNumber + 1) > product.length)) || ((productNumber + 1) < 1)) {
                    System.out.println("нет такого продукта");
                }

            } catch (NumberFormatException e) {
                System.out.println("вместо чисел введен неподходящий текст");
                continue;
            }
            try {
                product[productNumber].sum += product[productNumber].price * productCount;
                product[productNumber].productName = product[productNumber].productName;
            } catch (ArrayIndexOutOfBoundsException c) {
            }
        }

        System.out.println("Ваша корзина: ");
        int sumBasket = 0;
        for (Product value : product) {
            if (value.sum > 0) {
                System.out.println(value + " " + value.sum / value.price + " шт. " +
                        "В сумме: " + value.sum + " руб.");
                sumBasket += value.sum;
            }
        }
        System.out.println("Итого: " + sumBasket + " руб.");
    }
}




