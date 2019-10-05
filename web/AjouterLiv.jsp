<%-- 
    Document   : AjouterLiv
    Created on : 22 janv. 2019, 13:46:47
    Author     : start
--%>

<!doctype html>
<html lang="en">
 
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title></title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../assets/vendor/bootstrap/css/bootstrap.min.css">
    <link href="../assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
    <link rel="stylesheet" href="../assets/libs/css/style.css">
    <link rel="stylesheet" href="../assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
    <style>
    html,
    body {
        height: 100%;
    }

    body {
        display: -ms-flexbox;
        display: flex;
        -ms-flex-align: center;
        align-items: center;
        padding-top: 40px;
        padding-bottom: 40px;
    }
    </style>
</head>
<!-- ============================================================== -->
<!-- signup form  -->
<!-- ============================================================== -->

<body>
    <!-- ============================================================== -->
    <!-- signup form  -->
    <!-- ============================================================== -->
    <form class="splash-container" action="AjouterLiv" method="post">
        <div class="card">
            <div class="card-header">
                <h3 class="mb-1">Ajouter un Livreur</h3>
                <p>Entrez les inforamrions de ce Livreur.</p>
            </div>
            <div class="card-body">
                <div class="form-group">
                    <input class="form-control form-control-lg" type="text" name="nom" required="" placeholder="Nom de Livreur" autocomplete="off">
                </div>
                <div class="form-group">
                    <input class="form-control form-control-lg" type="text" name="prenom" required="" placeholder="Prénom de Livreur" autocomplete="off">
                </div>
                <div class="form-group">
                    <input class="form-control form-control-lg" type="text" name="tel" required="" placeholder="Télephone de Livereur" autocomplete="off">
                </div>
                <div class="form-group">
                    <input class="form-control form-control-lg" type="email" name="email" required="" placeholder="Email" autocomplete="off">
                </div>
                 <div class="form-group">
                    <input class="form-control form-control-lg" type="text" name="username" required="" placeholder="Username" autocomplete="off">
                </div>
                <div class="form-group">
                    <input class="form-control form-control-lg" type="text" name="pass" required="" placeholder="Mpt de passe" autocomplete="off">
                </div>
                <div class="form-group">
                    <input class="form-control form-control-lg" type="text" name="id" required="" placeholder="Id de livreur" autocomplete="off">
                </div>
                
                <div class="form-group">
                    <input class="form-control form-control-lg" name="add" type="text" required="" placeholder="addresse" autocomplete="off">
                </div>
                
                
                <div class="form-group pt-2">
                    <button class="btn btn-block btn-primary" type="submit">Ajouter un Livreur</button>
                </div>
                
                
            </div>
            
        </div>
    </form>
</body>

 
</html>
