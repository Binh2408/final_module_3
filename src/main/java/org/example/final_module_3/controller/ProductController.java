package org.example.final_module_3.controller;

import org.example.final_module_3.model.Product;
import org.example.final_module_3.service.IProductService;
import org.example.final_module_3.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/products")
public class ProductController extends HttpServlet {
    private IProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                req.getRequestDispatcher("/WEB-INF/product/create.jsp").forward(req, resp);
                break;
            default:
                List<Product> productList = productService.findAll();
                req.setAttribute("productList", productList);
                req.getRequestDispatcher("/WEB-INF/product/list.jsp").forward(req, resp);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "add":
                String nameProduct = req.getParameter("nameProduct");
                double priceProduct = Double.parseDouble(req.getParameter("priceProduct"));
                double saleProduct = Double.parseDouble(req.getParameter("saleProduct"));
                int quantityProduct = Integer.parseInt(req.getParameter("quantityProduct"));
                Product product = new Product(nameProduct, priceProduct, saleProduct, quantityProduct);
                productService.add(product);
                resp.sendRedirect("/products");
                break;
        }
    }
}
