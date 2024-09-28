<!DOCTYPE html>
<html lang="en">
<body>
<jsp:include page="include/head.jsp"/>

<main class="main">
    <section id="contact" class="contact section">
        <!-- Section Title -->
              <div class="container section-title" data-aos="fade-up">
                <p>Manage Flight</p>
              </div>

              <form action="${pageContext.request.contextPath}/manage-flight" method="post" class="d-flex justify-content-center align-items-center">
                  <input type="hidden" name="action" value="add">
                  <input type="text" class="form-control form-control-sm me-2" id="flightNumber" name="flightNumber" placeholder="Flight Number" required>
                  <input type="text" class="form-control form-control-sm me-2" id="destination" name="destination" placeholder="Destination" required>
                  <button type="submit" class="btn btn-primary btn-sm">Submit</button>
              </form>

             <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Flight Number</th>
                                <th>Destination</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="flight" items="${flights}">
                                <tr>
                                    <td>${flight.id}</td>
                                    <td>${flight.flightNumber}</td>
                                    <td>${flight.destination}</td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/flight/edit?id=${flight.id}" class="btn btn-warning">Edit</a>
                                        <a href="${pageContext.request.contextPath}/flight/delete?id=${flight.id}" class="btn btn-danger">Delete</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

    </section>
</main>
<jsp:include page="include/footer.jsp"/>
</body>

</html>