package org.example.final_module_3.repository;

import org.example.final_module_3.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final String SELECT_ALL = "select * from product order by id_product desc;";
    private final String INSERT_INTO = "insert into product(name_product,price_product,sale_product,quantity_product) values (?,?,?,?);";


    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        try (Connection connection = BaseRepository.getConnectDB();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idProduct = Integer.parseInt(resultSet.getString("id_product"));
                String nameProduct = resultSet.getString("name_product");
                double priceProduct = Double.parseDouble(resultSet.getString("price_product"));
                double saleProduct = Double.parseDouble(resultSet.getString("sale_product"));
                int quantityProduct = Integer.parseInt(resultSet.getString("quantity_product"));
                Product product = new Product(idProduct,nameProduct,priceProduct,saleProduct,quantityProduct);
                productList.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

    @Override
    public void add(Product product) {
        try (Connection connection = BaseRepository.getConnectDB();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO);){
            preparedStatement.setString(1,product.getNameProduct());
            preparedStatement.setDouble(2,product.getPriceProduct());
            preparedStatement.setDouble(3,product.getSaleProduct());
            preparedStatement.setInt(4,product.getQuantityProduct());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product findById(String id) {
        return null;
    }

    @Override
    public List<Product> findTopProduct(int limit) {
        return List.of();
    }
}
