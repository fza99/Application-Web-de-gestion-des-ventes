<%-- 
    Document   : Liv
    Created on : 29 nov. 2018, 13:21:16
    Author     : start
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="s" %>



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
    </head>

    <body>
        <div class="dashboard-main-wrapper">
            <!-- ============================================================== -->
            <!-- navbar -->
            <!-- ============================================================== -->
            <div class="dashboard-header">
                <nav class="navbar navbar-expand-lg bg-white fixed-top">
                    <a class="navbar-brand" href="home.jsp">home</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse " id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto navbar-right-top">
                            <li class="nav-item">
                                <div id="custom-search" class="top-search-bar">
                                    <input class="form-control" type="text" placeholder="Search..">
                                </div>
                            </li>
                            <li class="nav-item dropdown notification">
                                <a class="nav-link nav-icons" href="#" id="navbarDropdownMenuLink1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fas fa-fw fa-bell"></i> <span class="indicator"></span></a>
                                <ul class="dropdown-menu dropdown-menu-right notification-dropdown">

                                </ul>
                            </li>
                            <li class="nav-item dropdown connection">
                                <a class="nav-link" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="fas fa-fw fa-th"></i> </a>
                                <ul class="dropdown-menu dropdown-menu-right connection-dropdown">

                                    <li>
                                        <div class="conntection-footer"><a href="#">More</a></div>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item dropdown nav-user">
                                <a class="nav-link nav-user-img" href="#" id="navbarDropdownMenuLink2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><img src="../assets/images/avatar-1.jpg" alt="" class="user-avatar-md rounded-circle"></a>
                                <div class="dropdown-menu dropdown-menu-right nav-user-dropdown" aria-labelledby="navbarDropdownMenuLink2">
                                    <div class="nav-user-info">
                                        <h5 class="mb-0 text-white nav-user-name">John Abraham </h5>
                                        <span class="status"></span><span class="ml-2">en ligne</span>
                                    </div>
                                    <a class="dropdown-item" href="#"><i class="fas fa-user mr-2"></i>Sing in </a>
                                    <a class="dropdown-item" href="#"><i class="fas fa-power-off mr-2"></i>Logout</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
            <!-- ============================================================== -->
            <!-- main wrapper -->
            <!-- ============================================================== -->
            <div class="dashboard-main-wrapper">
                <div class="nav-left-sidebar sidebar-dark">
                    <div class="menu-list">
                        <nav class="navbar navbar-expand-lg navbar-light">
                            
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarNav">
                                <ul class="navbar-nav flex-column">
                                    <li class="nav-divider">
                                        Menu
                                    </li>
                                    <li class="nav-item ">
                                        
                                        <div id="submenu-1" class="collapse submenu" style="">
                                            <ul class="nav flex-column">
                                                <li class="nav-item">
                                                    <div id="submenu-1-2" class="collapse submenu" style="">
                                                        <ul class="nav flex-column">
                                                            <li class="nav-item">
                                                            </li>
                                                            <li class="nav-item">
                                                            </li>
                                                            <li class="nav-item">
                                                            </li>
                                                            <li class="nav-item">
                                                            </li>
                                                        </ul>
                                                    </div>
                                                </li>
                                               
                                            </ul>
                                        </div>
                                    </li>
                                    
                                    <li class="nav-item">
                                        <a class="nav-link" href="#"  aria-expanded="false" data-target="#submenu-6" aria-controls="submenu-6"><i class="fas fa-fw fa-file"></i>Catalogue</a>
                                        
                                    </li>
                                    <li class="nav-item ">
                                        <a class="nav-link" href="#"  aria-expanded="false" data-target="#submenu-4" aria-controls="submenu-4"><i class="fab fa-fw fa-wpforms"></i>NOS PRODUITS </a>
                                        
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="#" aria-expanded="false" data-target="#submenu-5" aria-controls="submenu-5"><i class="fas fa-fw fa-table"></i>Faire votre commande</a>
                                   
                                    <li class="nav-item">
                                        <a class="nav-link" href="#" aria-expanded="false" data-target="#submenu-10" aria-controls="submenu-10"><i class="fas fa-f fa-folder"></i>Ma commande</a>
                                        
                                                
                                            </ul>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </nav>
                    </div>
                </div>
               
                <div class="dashboard-wrapper">
                    <div class="container-fluid dashboard-content">
                        <div class="row">
                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                                <div class="page-header">
                                    <h2 class="pageheader-title">Votre commande</h2>
                                    <div class="page-breadcrumb">
                                        <nav aria-label="breadcrumb">
                                            <ol class="breadcrumb">
                                        </nav>
                                    </div>
                                </div>
                            </div>
                        </div>
                    <div>
                    <div class="card">
                        <h5 class="card-header">catalogue</h5>
                              
                                        
                                            
                                                <thead class="bg-light">
                                                    <tr class="border-0">
                                                        <th class="border-0">Produit Achheté</th>
                                                        
                                                    </tr>
                                                </thead>
                                                
                                                
                                                <s:setDataSource var="dbSource" driver="org.apache.derby.jdbc.ClientDriver"
                                                    url="jdbc:derby://localhost:1527/ProjetS3" user="elamrani" password="elamrani" />
                                                <s:query dataSource="${dbSource}" var="result"> select* from panier  </s:query>
                                                <tbody>
                                                  <c:forEach var="row" items="${result.rows}" >
                                                    <tr>
                                                         <td>
                                                            <div class="m-r-10"><img src="<c:out value="${row.image}" />" alt="" class="rounded" width="170"></div>
                                                        </td>
                                                        <td><c:out value="${row.idarticle}" /></td>
                                                        
                                                        <div class="btn-group ml-auto">
                                                            <td><i><a href="cata.jsp"><button class="btn btn-sm btn-outline-light">Edit</button></i></a></td>
                                                  <form action="sup" method="POST">
                                                        <td><button> <i class="far fa-trash-alt"></i></button></td>
                                                  </form>
                                                        </div>
                                                    </tr>
                                                  </c:forEach>
                                                </tbody>
                                        
                                    
                                </div>
                            </div>
                        <script src="../assets/vendor/jquery/jquery-3.3.1.min.js"></script>
                        <script src="../assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
                        <script src="../assets/vendor/slimscroll/jquery.slimscroll.js"></script>
                        <script src="../assets/libs/js/main-js.js"></script>
                        <script src="../assets/vendor/shortable-nestable/Sortable.min.js"></script>
                        <script src="../assets/vendor/shortable-nestable/sort-nest.js"></script>
                        <script src="../assets/vendor/shortable-nestable/jquery.nestable.js"></script>

                        </body>
                                
                        </html>