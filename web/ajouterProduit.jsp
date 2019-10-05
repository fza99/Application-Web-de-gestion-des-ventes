<%-- 
    Document   : ajouterProduit
    Created on : 20 janv. 2019, 15:53:09
    Author     : start
--%>

<!doctype html>
<html lang="en">
 
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Concept - Bootstrap 4 Admin Dashboard Template</title>
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
    <form class="splash-container" action="AjouterProduit" method="post">
        <div class="card">
            <div class="card-header">
                <h3 class="mb-1">Ajouter un Produit</h3>
                <p>Entrez les inforamrions de ce Produir .</p>
            </div>
            <div class="card-body">
                <div class="form-group">
                    <input class="form-control form-control-lg" type="text" name="libelle" required="" placeholder="libelle de ce produit" autocomplete="off">
                </div>
                <div class="form-group">
                    <input class="form-control form-control-lg" type="text" name="id" required="" placeholder="Id de ce Produit" autocomplete="off">
                </div>
                <div class="form-group">
                    <input class="form-control form-control-lg" type="text" name="image" required="" placeholder="enplacement de l'iamge de ce produit" autocomplete="off">
                </div>
                <div class="form-group">
                    <input class="form-control form-control-lg" type="text" name="quantite" required="" placeholder="Quantitede ce produit" autocomplete="off">
                </div>
                <div class="form-group">
                    <input class="form-control form-control-lg" name="prix" type="text" required="" placeholder="prix de ce produit" autocomplete="off">
                </div>
                
                <div class="form-group pt-2">
                    <button class="btn btn-block btn-primary" type="submit">Ajouter Produit</button>
                </div>
                
                
            </div>
            
        </div>
    </form>
</body>

 
</html>
