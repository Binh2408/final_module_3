<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Thêm mới</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container mt-4">
  <h2 class="text-center">Thêm mới sản phẩm</h2>

  <form method="post" action="/products?action=add" class="w-50 mx-auto">
    <div class="mb-3">
      <label class="form-label">Tên sản phẩm: <span style="color: red">(*)</span></label>
      <input type="text" name="nameProduct" value="${product.nameProduct}" class="form-control" required title="Bắt buộc nhập">
    </div>

    <div class="mb-3">
      <label class="form-label">Giá sản phẩm: <span style="color: red">(*)</span></label>
      <input type="number" min="101" step="1" name="priceProduct" value="${product.priceProduct}" class="form-control" required title="Bắt buộc nhập và lớn hơn 100">
    </div>

    <div class="mb-3">
      <label class="form-label">Phần trăm discount: <span style="color: red">(*)</span></label>
      <select name="saleProduct" class="form-select" required>
        <option value="">------Chọn phần trăm------</option>
        <option value="5">5%</option>
        <option value="10">10%</option>
        <option value="15">15%</option>
        <option value="20">20%</option>
      </select>
    </div>

    <div class="mb-3">
      <label class="form-label">Số lượng: <span style="color: red">(*)</span></label>
      <input type="number" min="11" step="1" name="quantityProduct" value="${product.quantityProduct}" class="form-control" required title="Bắt buộc nhập và lớn hơn 10">
    </div>

    <div class="text-center">
      <button type="submit" class="btn btn-success">Thêm</button>
      <a class="btn btn-secondary" href="/products">Hủy</a>
    </div>
  </form>
</div>
</body>
</html>
