<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body style="background-color: #eee;">


<section style="background-color: #eee;">
  <div class="container py-5">
    <div class="row">
      <div class="col">
        <nav aria-label="breadcrumb" class="bg-body-tertiary rounded-3 p-3 mb-4">
          <ol class="breadcrumb mb-0">
            <li class="breadcrumb-item"><a href="/home">Home</a></li>
          </ol>
        </nav>
      </div>
    </div>

    <div class="row " >
      <div class="col-lg-12">
        <div class="card mb-12">
          <div class="card-body">
            <div class ="container">
				<div class="row">
					<div class="col-md-12">
						<h1>Formulario de Usuario</h1>
						<form action="#" method="post">
					      
						  <div class="mb-3">
						    <label for="nombre" class="form-label">Nombre</label>
						    <input type="text" name="nombre" class="form-control" id="nombre">
						  </div>
						  <div class="mb-3">
						    <label for="apellido" class="form-label">Apellido</label>
						    <input type="text" name="apellido" class="form-control" id="apellido">
						  </div>
						  <div class="mb-3">
						    <label for="email" class="form-label">Email</label>
						    <input type="email" name="email" class="form-control" id="email">
						  </div>
						  <div class="mb-3">
						    <label for="username" class="form-label">username</label>
						    <input type="text" name="username" class="form-control" id="username">
						  </div>
						  <div class="mb-3">
						    <label for="password" class="form-label">password</label>
						    <input type="password" name="password" class="form-control" id="password">
						  </div>
						  <div class="mb-3">
						    <label for="rol" class="form-label">Rol</label>
						    <select class="form-control" name="rol" id="rol">
						    	<option value="ADMIN">ADMIN</option>
						    	<option value="MANAGER">MANAGER</option>
						    	<option value="USER" selected>USER</option>
						    </select>
						  </div>
						  <button type="submit" class="btn btn-primary">Ingresar</button>
						</form>
					</div>
				</div>
			</div>
           
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>