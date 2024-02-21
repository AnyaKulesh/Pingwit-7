package org.example.homework.lesson35;

import com.zaxxer.hikari.HikariDataSource;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Application {
    private static final String URL = "jdbc:postgresql://localhost:5432/pingwit";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {

        HikariDataSource ds = new HikariDataSource();

        ds.setJdbcUrl(URL);
        ds.setUsername(USERNAME);
        ds.setPassword(PASSWORD);

        ProductRepository repository = new ProductRepository(ds);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("В нашей системе возможно произвести операции с продуктами");
            System.out.println("""
                    Введите
                    1 - для подсчета количества продуктов,
                    2 - для получения продукта по ID,
                    3 - для получения продукта по имени,
                    4 - для создания продукта,
                    5 - получить все продукты,
                    6 - удалить продукт,
                    любое другое число - для выхода из программы""");
            int operation = scanner.nextInt();

            if (operation == 1) {
                int productCount = repository.countProducts();
                System.out.printf("В системе %s продуктов%n", productCount);
                System.out.println("--------------------------------------");
            } else if (operation == 2) {

                System.out.println("Введите ID продукта для поиска:");

                int id = scanner.nextInt();
                Optional<Product> productById = repository.findProductById(id);
                if (productById.isPresent()) {
                    System.out.println(productById.get());
                } else {
                    System.out.printf("Продукт с ID = %d не найден!%n", id);
                    System.out.println("--------------------------------------");
                }
            } else if (operation == 3) {

                System.out.println("Введите имя продукта для поиска:");

                String name = scanner.next();
                List<Product> productsByName = repository.findProductsByName(name);

                if (productsByName.isEmpty()) {
                    System.out.printf("Продукты с именем %s не найдены!%n", name);
                } else {
                    System.out.println("Список продуктов: ");
                    productsByName.forEach(System.out::println);
                }
            } else if (operation == 4) {

                System.out.println("Создаем продукт.");
                System.out.println("Введите name продукта:");
                String name = scanner.next();
                System.out.println("Введите описание продукта:");
                String description = scanner.next();
                System.out.println("Введите цену продукта:");
                BigDecimal price = scanner.nextBigDecimal();

                Product product = new Product(null, name, description, price);
                Integer id = repository.storeProduct(product);
                System.out.printf("Создан продукт с ID = %d", id);
                System.out.println("--------------------------------------");

            } else if (operation == 5) {

                List<Product> products = repository.getAllProducts();

                if (products.isEmpty()) {
                    System.out.println("Продуктов нет!");
                } else {
                    System.out.println("Список продуктов: ");
                    products.forEach(System.out::println);
                }
            } else if (operation == 6) {
                System.out.println("Введите id продукта, чтобы удалить");

                Integer id = scanner.nextInt();

                repository.deleteProductById(id);

            } else {
                System.out.println("До свидания!");
                break;
            }
        }
    }
}
