<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="include/head.jsp"/>
</head>
<body>
    <main class="main">
        <section id="contact" class="contact section">
            <!-- Section Title -->
            <div class="container section-title" data-aos="fade-up">
                <p>Manage Flight</p>
            </div>

            <!-- Flight Management Form -->
            <form action="${pageContext.request.contextPath}/manage-flight" method="post" class="d-flex justify-content-center align-items-center">
                <input type="hidden" name="action" value="add">
                <input type="text" class="form-control form-control-sm me-2" id="flightNumber" name="flightNumber" placeholder="Flight Number" required>
                <input type="text" class="form-control form-control-sm me-2" id="destination" name="destination" placeholder="Destination" required>
                <button type="submit" class="btn btn-primary btn-sm">Submit</button>
            </form>

            <!-- Flight Table -->
            <table class="table table-bordered mt-4">
                <thead>
                    <tr>
                        <th>Flight Number</th>
                        <th>Destination</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:if test="${not empty flights}">
                        <c:forEach var="flight" items="${flights}">
                            <tr>
                                <td>${flight.flightNumber}</td>
                                <td>${flight.destination}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/flight/edit?id=${flight.flightNumber}" class="btn btn-warning">Edit</a>
                                    <a href="${pageContext.request.contextPath}/flight/delete?id=${flight.flightNumber}" class="btn btn-danger">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </c:if>
                    <c:if test="${empty flights}">
                        <tr>
                            <td colspan="4" class="text-center">No flights available.</td>
                        </tr>
                    </c:if>
                </tbody>
            </table>
        </section>
    </main>
    <jsp:include page="include/footer.jsp"/>
</body>
</html>