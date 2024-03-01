package org.example.homework.lesson36;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.List;

public class OrderTransaction {
    private static final String URL = "jdbc:postgresql://localhost:5432/pingwit";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(URL);
        ds.setUsername(USERNAME);
        ds.setPassword(PASSWORD);

        createTransaction(ds);
    }

    private static void createTransaction(DataSource dataSource) {
        try {
            Connection connection = dataSource.getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO orders (id, user_id, created_at, status_id, comment) VALUES(?,?,?,?,?)");
            int orderId = getNextOrderId(dataSource);
            statement.setInt(1, orderId);
            statement.setInt(2, 15);
            statement.setDate(3, Date.valueOf(LocalDate.now()));
            statement.setInt(4, 16);
            statement.setString(5, "payment by card");
            statement.executeUpdate(); //

            System.out.println("Order created");
            List<OrderItem> orderItems = List.of(
                    // в этих объектах OrderItem в качестве orderId я предполагал использовать orderId из строки 30
                    // таким образом, мы создадим заказ со строчками
                    new OrderItem(9, 11, 10),
                    new OrderItem(20, 31, 7),
                    new OrderItem(1, 41, 11)
            );
            prepareOrderItemStatement(connection, dataSource, orderItems);
            // а здесь можно использовать стрим:
            // orderItems.forEach(item -> createOrderItem(connection, dataSource, item));

            System.out.println("Order items created");
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // этот метод не только готовит statement, но и выполняет их. я бы предложил его немного изменить - принимать один объект OrderItem
    // и для него собирать стейтмент и выполнять апдейт:
    private static void createOrderItem(Connection connection, DataSource dataSource, OrderItem item) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO order_items(id, order_id, product_id, quantity) VALUES (?,?,?,?)");
            int orderItemId = getNextOrderItemId(dataSource);
            statement.setInt(1, orderItemId);
            statement.setInt(2, item.orderId());
            statement.setInt(3, item.productId());
            statement.setInt(4, item.quantity());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement prepareOrderItemStatement(Connection connection, DataSource dataSource, List<OrderItem> items) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO order_items(id, order_id, product_id, quantity) VALUES (?,?,?,?)");

        for (OrderItem item : items) {
            int orderItemId = getNextOrderItemId(dataSource);
            statement.setInt(1, orderItemId);
            statement.setInt(2, item.orderId());
            statement.setInt(3, item.productId());
            statement.setInt(4, item.quantity());
            statement.executeUpdate();
        }
        return statement;
    }

    private static Integer getNextOrderId(DataSource dataSource) {
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT nextval('orders_id_seq')");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1);
            } else throw new RuntimeException("id not found");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Integer getNextOrderItemId(DataSource dataSource) {
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT nextval('order_items_id_seq')");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1);
            } else throw new RuntimeException("id not found");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
