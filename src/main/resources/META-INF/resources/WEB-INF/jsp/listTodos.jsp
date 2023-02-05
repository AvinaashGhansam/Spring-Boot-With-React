<!-- Importing JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>Login</title>
  </head>

  <body>
    <div>Welcome ${name}</div>
    <hr>
    <h1>Your Todos</h1>
    <table>
      <thead>
        <tr>
          <th>id</th>
          <th>Description</th>
          <th>Target Date</th>
          <th>Is Done?</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${todos}" var="todos">
          <tr>
            <td>${todos.id}</td>
            <td>${todos.description}</td>
            <td>${todos.targetDate}</td>
            <td>${todos.done}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
