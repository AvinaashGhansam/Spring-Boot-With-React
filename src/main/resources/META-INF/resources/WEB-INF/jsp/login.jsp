<html>
  <head>
    <title>Login</title>
  </head>

  <body>
    <div class="container">
      <!-- Show error when auth is wrong -->
      <pre>${errorMessage}</pre>
      <form method="post">
        Name: <input type="text" name="name" /> Password:
        <input type="password" name="password" />
        <input type="submit" />
        <!-- http://localhost:8082/login?name=nnb&password=bvcffdf this is what u will see when submit is clicked-->
        <!-- It is recommended to use post as seen in line 9 when sending secure information -->
      </form>
    </div>
  </body>
</html>
