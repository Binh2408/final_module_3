<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 6/5/2025
  Time: 1:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
  <title>Danh sách sản phẩm</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
          crossorigin="anonymous"></script>
  <link rel="stylesheet" href="bootstrap520/css/bootstrap.min.css"/>
  <link rel="stylesheet" href="datatables/css/dataTables.bootstrap5.min.css"/>
</head>
<body>
<nav class="navbar navbar-light bg-white shadow-sm border-bottom mb-4">
  <div class="container justify-content-center">
    <span class="navbar-brand mb-0 h4 text-dark fw-bold">
      Nguyễn Văn Bình - Lớp C0225G1-JV101
    </span>
  </div>
</nav>

<div class="container mt-4">
  <h1>Danh sách sản phẩm</h1>
  <div class="mb-3">
    <button class="btn btn-primary" onclick="window.location.href='/products?action=add'">Thêm mới</button>
  </div>

  <form action="/products" method="get" class="d-flex align-items-center gap-2">
    <input name="action" type="hidden" value="top"/>
    <label class="form-label mb-0">Danh sách top:</label>
    <select name="limit" class="form-select w-auto">
      <option value="3">3</option>
      <option value="5">5</option>
      <option value="10">10</option>
    </select>
    <label class="form-label mb-0">Sản phẩm được bán chạy nhiều nhất</label>
    <button type="submit" class="btn btn-outline-primary">Xem</button>
  </form>

  <form action="/products" method="get" class="d-flex align-items-center gap-2">
    <input name="action" type="hidden" value="top"/>
    <label class="form-label mb-0">Danh sách sản phẩm được đặt từ:</label>
    <input type="date">
    <label class="form-label mb-0"> đến: </label>
    <input type="date">
    <button type="submit" class="btn btn-outline-primary">Xem</button>
  </form>

  <table id="tableProduct" class="table table-striped table-bordered" style="width:100%">
    <thead>
    <tr>
      <th>STT</th>
      <th>Tên sản phẩm</th>
      <th>Giá sản phẩm</th>
      <th>Giảm giá</th>
      <th>Số lượng kho</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${productList}" varStatus="idx">
      <tr>
        <td>${idx.count}</td>
        <td hidden="hidden">${item.idProduct}</td>
        <td>${item.nameProduct}</td>
        <td><fmt:formatNumber value="${item.priceProduct}" type="number" groupingUsed="true"/> VNĐ</td>
        <td><fmt:formatNumber value="${item.saleProduct}" type="number" groupingUsed="true"/>%</td>
        <td>${item.quantityProduct}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>
<footer class="bg-light text-center text-muted py-3 mt-5 border-top">
  <div class="container">
    <p class="mb-0 fw-bold">© 2025 Quản lý Thương Mại Điện Tử CodeGym - Nhóm phát triển bởi bạn.</p>
  </div>
</footer>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap5.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<script>
  $(document).ready(function () {
    $('#tableProduct').dataTable({
      "dom": 'rtp',
      "lengthChange": false,
      "pageLength": 5,
      "language": {
        "paginate": {
          "previous": "Trước",
          "next": "Sau"
        },
        "info": "",
        "zeroRecords": "Không có dữ liệu",
        "emptyTable": "Không có sản phẩm nào",
        "search": "Tìm kiếm:"
      }
    });
  });
</script>
</body>
</html>
