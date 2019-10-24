<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <!doctype html>
<html lang="en">
 
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Login</title>
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
    div.bouton-aligne{
	display:inline-block;
	width:70%;
	margin:10px 2.5% 10px 2.5%;
	text-align:center;
}
    </style>
</head>

<body background="photos/bck.jpg"  width="120">
    <!-- ============================================================== -->
    <!-- login page  -->
    <!-- ============================================================== -->
    <div class="splash-container">
                <form>
                    <div  class="bouton-aligne">
                        <a href="Admin.jsp" ><i type="submit" valaue ="Administarteur" class="btn btn-primary btn-lg btn-block">Administarteur</i></a>
                    </div>
                    <div  class="bouton-aligne">
                        <a href="Client.jsp"><i  type="submit" class="btn btn-primary btn-lg btn-block">Client</i></a>
                    </div>
                    <div  class="bouton-aligne">
                        <a href="Liv.jsp"><i type="submit" class="btn btn-primary btn-lg btnq-block" >Livreur</i></a>
                    </div>
                </form>
    </div>

    <!-- ============================================================== -->
    <!-- end login page  -->
    <!-- ============================================================== -->
    <!-- Optional JavaScript -->
    <script src="../assets/vendor/jquery/jquery-3.3.1.min.js"></script>
    <script src="../assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
</body>
 
</html> 
                                                        