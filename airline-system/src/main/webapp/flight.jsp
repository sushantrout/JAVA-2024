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
            <form action="${pageContext.request.contextPath}/manage-flight" method="post" class="form-inline justify-content-center">
                <input type="hidden" name="action" value="${flight == null ? 'add' : 'update'}">
                <input type="hidden" name="id" value="${flight == null ? '' : flight.id}">

                <label for="flightNumber" class="form-label">Flight Number:</label>
                <input type="text" class="form-control form-control-sm me-2" id="flightNumber" value="${flight == null ? '' : flight.flightNumber}" name="flightNumber" placeholder="Flight Number" required>

                <label for="destination" class="form-label">Destination:</label>
                <input type="text" class="form-control form-control-sm me-2" id="destination" value="${flight == null ? '' : flight.destination}" name="destination" placeholder="Destination" required>

                <button type="submit" class="btn btn-primary btn-sm w-100">${flight == null ? 'Save' : 'Update'}</button>
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
                                    <a href="${pageContext.request.contextPath}/manage-flight?id=${flight.id}&action=edit" class="btn btn-warning">Edit</a>
                                    <a href="#" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#deleteModal"
                                       onclick="setDeleteFlightId('${flight.id}');">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </c:if>
                    <c:if test="${empty flights}">
                        <tr>
                            <td colspan="3" class="text-center">No flights available.</td>
                        </tr>
                    </c:if>
                </tbody>
            </table>
        </section>
    </main>

    <!-- Delete Confirmation Modal -->
    <div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="deleteModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="deleteModalLabel">Confirm Deletion</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    Are you sure you want to delete this flight?
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                    <button type="button" class="btn btn-danger" id="confirmDeleteBtn">Delete</button>
                </div>
            </div>
        </div>
    </div>

    <jsp:include page="include/footer.jsp"/>

    <script>
        let flightIdToDelete = null;

        function setDeleteFlightId(id) {
            flightIdToDelete = id;
        }

        document.getElementById('confirmDeleteBtn').addEventListener('click', function() {
            if (flightIdToDelete) {
                window.location.href = '${pageContext.request.contextPath}/manage-flight?id=' + flightIdToDelete + '&action=delete';
            }
        });
    </script>
</body>
</html>
