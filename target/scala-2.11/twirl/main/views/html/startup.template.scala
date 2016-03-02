
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object startup_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class startup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>CIPMEN | Home</title>

    <!--SEO Meta Tags-->
    <meta name="description" content="CIPMEN - Startup" />
    <meta name="keywords" content="CIPMEN - CENTRE D'INCUBATION POUR LES PMES DU NIGER - L'entrepreunariat innovant et durable"/>
    <meta name="author" content="Cipmen" />

    <!--Mobile Specific Meta Tag-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

    <!--Favicon-->
    <link rel="shortcut icon" href=""""),_display_(/*17.38*/routes/*17.44*/.Assets.versioned("favicon.ico")),format.raw/*17.76*/("""" type="image/x-icon">
    <link rel="icon" href=""""),_display_(/*18.29*/routes/*18.35*/.Assets.versioned("favicon.ico")),format.raw/*18.67*/("""" type="image/x-icon">

    <!-- All Theme Styles including Bootstrap, Bourbon, Pixeden, etc. compiled from styles.scss-->
    <link href=""""),_display_(/*21.18*/routes/*21.24*/.Assets.versioned("css/styles.min.css")),format.raw/*21.63*/("""" rel="stylesheet" media="screen">
    <link href=""""),_display_(/*22.18*/routes/*22.24*/.Assets.versioned("css/colors/color.css")),format.raw/*22.65*/("""" rel="stylesheet" media="screen">

    <!--Modernizr / Detectizr-->
    <script src=""""),_display_(/*25.19*/routes/*25.25*/.Assets.versioned("js/vendor/modernizr.custom.js")),format.raw/*25.75*/(""""></script>

    <!-- Page Preloader (Pace) -->
    <script src=""""),_display_(/*28.19*/routes/*28.25*/.Assets.versioned("js/vendor/pace.min.js")),format.raw/*28.67*/(""""></script>
</head>

<!-- Body -->
<!-- ".is-preloader" class is used for page preloading animation. Please note if you do not want preloading you need to remove this class along with pace.min.js link in the <head> of the document.-->
<!-- Adding/Removing class ".parallax" is enabling/disabling background parallax effect on elements with background images and attributes data-stellar-background-ratio applied to them. Make sure you also added/removed link to stellar.js script before </body>. -->
<body class="is-preloader parallax">

<!-- Page Wrapper -->
<div class="page-wrapper">

    <!-- Navbar -->
    <!-- Remove ".navbar-fixed" class to make navigation bar scrollable with the page. Another modifier calss is ".submenu-dark" to alter submenu appearance. -->
    <header class="navbar navbar-fixed">
        <div class="container">
            <div class="inner">

                <!-- Site Logo -->
                <a href="/" class="site-logo">
                    <img src=""""),_display_(/*47.32*/routes/*47.38*/.Assets.versioned("img/logo.png")),format.raw/*47.71*/("""" alt="CIPMEN">
                </a><!-- .site-logo -->

                <!-- Mobile Dropdown -->
                <div class="mobile-dropdown">

                    <!-- Mobile Tools -->
                    <div class="mobile-tools">
                        <div class="social-bar text-center">
                            <a href="#" class="sb-facebook"><i class="fa fa-facebook"></i></a>
                            <a href="#" class="sb-twitter"><i class="fa fa-twitter"></i></a>
                        </div><!-- .social-bar -->
                    </div><!-- .mobile-tools -->

                    <!-- Main Navigation -->
                    <nav class="main-navigation">
                        <ul class="menu">
                            <li>
                                <a href="/incubateur">L'incubateur</a>
                            </li>
                            <li class="menu-item-has-children">
                                <a href="#">Les incubés<span>&#8211;</span></a>
                                <ul class="sub-menu">
                                    <li><a href="/startup/one">One</a></li>
                                    <li><a href="/startup/novateck">Novateck</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href="/postule">Je postule</a>
                            </li>
                            <li>
                                <a href="/evenements">Evènement</a>
                            </li>
                            <li>
                                <a href="/blogs">Blogs</a>
                            </li>
                            <li>
                                <a href="/mediatheques">Mediathèque</a>
                            </li>
                            <li>
                                <a href="/contacts">Contact</a>
                            </li>
                        </ul><!-- .menu -->
                    </nav><!-- .main-navigation -->
                </div><!-- .mobile-dropdown -->

                <!-- Toolbar -->
                <div class="toolbar">
                    <span class="divider"></span>
                    <div class="share-btn">
                        <i class="pe-7s-share"></i>
                        <ul class="dropdown">
                            <li><a href="#" class="sb-facebook"><i class="fa fa-facebook"></i>Facebook</a></li>
                            <li><a href="#" class="sb-twitter"><i class="fa fa-twitter"></i>Twitter</a></li>
                        </ul>
                    </div>
                    <a href="/inscription" class="btn btn-sm btn-info btn-ghost btn-icon-left scroll-to" data-offset-top="115">
                        <i class="pe-7s-download"></i>Page perso
                    </a>
                    <!-- Mobile Menu Toggle -->
                    <div class="nav-toggle"><span></span></div>
                </div><!-- .toolbar -->
            </div><!-- .inner -->
        </div><!-- .container -->
    </header><!-- .navbar.navbar-fixed -->

    <!-- Page Title -->
    <!-- Use modifier class ".pt-dark" to switch to dark skin. "pt-parallax" to enable css parallax effect. -->
    <div class="page-title pt-dark" style="background-image: url("""),_display_(/*115.67*/routes/*115.73*/.Assets.versioned("img/page-title/help.jpg")),format.raw/*115.117*/(""");" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity: .85;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h1>One</h1>
                </div><!-- .title -->
                <div class="breadcrumbs">
                    <a href="/">Accueil</a>
                    <span>Nos entreprises incubés</span>
                </div><!-- .breadcrumbs -->
            </div><!-- .inner -->
        </div><!-- .container -->
    </div><!-- .page-title -->

    <!-- Container -->
    <div class="container space-bottom-2x">
        <div class="row">

            <!-- Side Navigation -->
            <div class="col-md-3 col-sm-4 space-bottom-2x">
                <nav class="side-nav dark-skin">
                    <ul role="tablist">
                        <li class="active"><a href="#account" role="tab" data-toggle="tab">Présentation</a></li>
                        <li><a href="#mobile" role="tab" data-toggle="tab">Marché et cible</a></li>
                        <li><a href="#payment" role="tab" data-toggle="tab">Produits / services</a></li>
                        <li><a href="#other" role="tab" data-toggle="tab">Portfolio</a></li>
                        <li><a href="#ask-question" class="scroll-to" data-offset-top="165">Nous contacter</a></li>
                    </ul>
                </nav><!-- .side-nav -->
            </div><!-- .col-md-3.col-sm-4 -->

            <!-- Content -->
            <div class="col-md-9 col-sm-8">
                <div class="tab-content transparent space-bottom-2x">
                    <div role="tabpanel" class="tab-pane transition fade scale in active" id="account">
                        <h5 class="text-uppercase text-gray text-thin space-bottom">Account</h5>
                        <div class="panel-group" id="accordion">
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion" href="#ac01">
                                        How do I sign up to get free access?
                                    </a>
                                </div>
                                <div id="ac01" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur.
                                    </div>
                                </div>
                            </div><!-- .panel -->
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title" data-toggle="collapse" data-parent="#accordion" href="#ac02">
                                        How do I change my password?
                                    </a>
                                </div>
                                <div id="ac02" class="panel-collapse collapse in" role="tabpanel">
                                    <div class="panel-body">
                                        Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur.
                                    </div>
                                </div>
                            </div><!-- .panel -->
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion" href="#ac03">
                                        How can I delete my account?
                                    </a>
                                </div>
                                <div id="ac03" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur.
                                    </div>
                                </div>
                            </div><!-- .panel -->
                        </div><!-- .panel-group -->
                    </div><!-- .tab-panel -->
                    <div role="tabpanel" class="tab-pane transition fade scale" id="mobile">
                        <h5 class="text-uppercase text-gray text-thin space-bottom">Mobile App</h5>
                        <div class="panel-group" id="accordion2">
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title" data-toggle="collapse" data-parent="#accordion2" href="#mb01">
                                        Where to download mobile application?
                                    </a>
                                </div>
                                <div id="mb01" class="panel-collapse collapse in">
                                    <div class="panel-body">
                                        Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur.
                                    </div>
                                </div>
                            </div><!-- .panel -->
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion2" href="#mb02">
                                        How do I upload files to cloud?
                                    </a>
                                </div>
                                <div id="mb02" class="panel-collapse collapse" role="tabpanel">
                                    <div class="panel-body">
                                        Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur.
                                    </div>
                                </div>
                            </div><!-- .panel -->
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion2" href="#mb03">
                                        How do I connect app to my Google account?
                                    </a>
                                </div>
                                <div id="mb03" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur.
                                    </div>
                                </div>
                            </div><!-- .panel -->
                        </div><!-- .panel-group -->
                    </div><!-- .tab-panel -->
                    <div role="tabpanel" class="tab-pane transition fade scale" id="payment">
                        <h5 class="text-uppercase text-gray text-thin space-bottom">Payment &amp; Billing</h5>
                        <div class="panel-group" id="accordion3">
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion3" href="#pb01">
                                        What payment methods can I use to pay for subscription?
                                    </a>
                                </div>
                                <div id="pb01" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur.
                                    </div>
                                </div>
                            </div><!-- .panel -->
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion3" href="#pb02">
                                        Can I have invoice for my subscription?
                                    </a>
                                </div>
                                <div id="pb02" class="panel-collapse collapse" role="tabpanel">
                                    <div class="panel-body">
                                        Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur.
                                    </div>
                                </div>
                            </div><!-- .panel -->
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title" data-toggle="collapse" data-parent="#accordion3" href="#pb03">
                                        What plan is best suits my needs?
                                    </a>
                                </div>
                                <div id="pb03" class="panel-collapse collapse in">
                                    <div class="panel-body">
                                        Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur.
                                    </div>
                                </div>
                            </div><!-- .panel -->
                        </div><!-- .panel-group -->
                    </div><!-- .tab-panel -->
                    <div role="tabpanel" class="tab-pane transition fade scale" id="other">
                        <h5 class="text-uppercase text-gray text-thin space-bottom">Other Information</h5>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                        <div class="row">
                            <div class="col-lg-5 col-md-6">
                                <ul class="list-featured">
                                    <li>Neque porro quisquam est, qui dolorem ipsum</li>
                                    <li>Lorem <a href="#">ipsum dolor sit</a> amet, consectetur</li>
                                    <li>Excepteur sint occaecat cupidatat non</li>
                                    <li>Duis aute irure dolor in reprehenderit</li>
                                    <li>Nemo enim ipsam voluptatem quia voluptas</li>
                                </ul>
                            </div><!-- .col-lg-5.col-md-6 -->
                            <div class="col-lg-5 col-md-6">
                                <ul class="list-featured">
                                    <li>Neque porro quisquam est, qui dolorem ipsum</li>
                                    <li>Lorem <a href="#">ipsum dolor sit</a> amet, consectetur</li>
                                    <li>Excepteur sint occaecat cupidatat non</li>
                                    <li>Duis aute irure dolor in reprehenderit</li>
                                    <li>Nemo enim ipsam voluptatem quia voluptas</li>
                                </ul>
                            </div><!-- .col-lg-5.col-md-6 -->
                        </div><!-- .row -->
                        <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p>
                        <p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.</p>
                    </div><!-- .tab-panel -->
                </div><!-- .tab-content.transparent.space-bottom-2x -->

                <!-- Ask Question Form -->
                <div class="tile" id="ask-question">
                    <form method="post" autocomplete="off">
                        <h3 class="text-center">Vous voulez nous contacter ?</h3>
"""),
format.raw("""                        <p class="text-gray text-center">Veuillez utiliser le formalaire ci-après</p>
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="form-control">
                                    <i class="pe-7s-user"></i>
                                    <input type="text" placeholder="Nom">
                                </div><!-- .form-control -->
                            </div><!-- .col-sm-6 -->
                            <div class="col-sm-6">
                                <div class="form-control">
                                    <i class="pe-7s-mail"></i>
                                    <input type="email" placeholder="Email">
                                </div><!-- .form-control -->
                            </div><!-- .col-sm-6 -->
                        </div><!-- .row -->
                        <div class="form-control">
                            <i class="pe-7s-help1"></i>
                            <textarea rows="3" placeholder="Message"></textarea>
                        </div><!-- .form-control -->
                        <div class="row">
                            <div class="col-sm-6 text-right">
                                <button type="submit" class="btn btn-ghost btn-primary">Envoyer</button>
                            </div><!-- .col-sm-6.text-right -->
                        </div><!-- .row -->
                    </form><!-- .contact-form -->
                </div><!-- .tile -->
            </div><!-- .col-md-9.col-sm-8 -->
        </div><!-- .row -->
    </div><!-- .container -->

    <!-- Scroll To Top Button -->
    <a href="#" class="scroll-to-top-btn">
        <i class="icon-arrow-up"></i>
    </a><!-- .scroll-to-top-btn -->

    <!-- Footer -->
    <!-- Use modifier class ".footer-dark" to switch to dark skin. -->
    <footer class="footer space-top-3x">
        <div class="container">
            <!-- Copyright -->
            <div class="copyright">
                <div class="inner">
                    <div class="column">
                        <span class="copy-text">&copy; 2016. Tous droits réservés</span>
                    </div><!-- .column -->
                    <div class="column">
                        <nav class="footer-nav">
                            <ul>
                                <li><a href="/mediatheques">Mediathèque</a></li>
                                <li><a href="/postule">Porteurs de projet</a></li>
                                <li><a href="/contacts">Contacts</a></li>
                            </ul>
                        </nav><!-- .footer-nav -->
                    </div><!-- .column -->
                    <div class="column">
                        <div class="social-bar">
                            <a href="#" class="sb-facebook" data-toggle="tooltip" data-placement="top" title="Facebook"><i class="fa fa-facebook"></i></a>
                            <a href="#" class="sb-twitter" data-toggle="tooltip" data-placement="top" title="Twitter"><i class="fa fa-twitter"></i></a>
                        </div><!-- .social-bar -->
                    </div><!-- .column -->
                </div><!-- .inner -->
            </div><!-- .copyright -->
        </div><!-- .container -->
    </footer><!-- .footer --></div><!-- .page-wrapper -->

<!-- JavaScript (jQuery) libraries, plugins and custom scripts -->
    <script src=""""),_display_(/*371.19*/routes/*371.25*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*371.75*/(""""></script>
    <script src=""""),_display_(/*372.19*/routes/*372.25*/.Assets.versioned("js/vendor/bootstrap.min.js")),format.raw/*372.72*/(""""></script>
    <script src=""""),_display_(/*373.19*/routes/*373.25*/.Assets.versioned("js/vendor/placeholder.js")),format.raw/*373.70*/(""""></script>
    <script src=""""),_display_(/*374.19*/routes/*374.25*/.Assets.versioned("js/vendor/smoothscroll.js")),format.raw/*374.71*/(""""></script>
    <script src=""""),_display_(/*375.19*/routes/*375.25*/.Assets.versioned("js/vendor/jquery.stellar.min.js")),format.raw/*375.77*/(""""></script>
    <script src=""""),_display_(/*376.19*/routes/*376.25*/.Assets.versioned("js/vendor/velocity.min.js")),format.raw/*376.71*/(""""></script>
    <script src=""""),_display_(/*377.19*/routes/*377.25*/.Assets.versioned("js/vendor/magnific-popup.min.js")),format.raw/*377.77*/(""""></script>
    <script src=""""),_display_(/*378.19*/routes/*378.25*/.Assets.versioned("js/vendor/owl.carousel.min.js")),format.raw/*378.75*/(""""></script>
    <script src=""""),_display_(/*379.19*/routes/*379.25*/.Assets.versioned("js/scripts.js")),format.raw/*379.59*/(""""></script>

</body><!-- <body> -->

</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object startup extends startup_Scope0.startup
              /*
                  -- GENERATED --
                  DATE: Wed Mar 02 00:18:05 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/startup.scala.html
                  HASH: 151b3d46c3604f43e041a8ea8a6b57fa77679741
                  MATRIX: 831->0|1416->558|1431->564|1484->596|1562->647|1577->653|1630->685|1797->825|1812->831|1872->870|1951->922|1966->928|2028->969|2142->1056|2157->1062|2228->1112|2321->1178|2336->1184|2399->1226|3414->2214|3429->2220|3483->2253|6836->5578|6852->5584|6919->5628|30456->29117|30472->29123|30544->29173|30602->29203|30618->29209|30687->29256|30745->29286|30761->29292|30828->29337|30886->29367|30902->29373|30970->29419|31028->29449|31044->29455|31118->29507|31176->29537|31192->29543|31260->29589|31318->29619|31334->29625|31408->29677|31466->29707|31482->29713|31554->29763|31612->29793|31628->29799|31684->29833
                  LINES: 32->1|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|59->28|59->28|59->28|78->47|78->47|78->47|146->115|146->115|146->115|403->371|403->371|403->371|404->372|404->372|404->372|405->373|405->373|405->373|406->374|406->374|406->374|407->375|407->375|407->375|408->376|408->376|408->376|409->377|409->377|409->377|410->378|410->378|410->378|411->379|411->379|411->379
                  -- GENERATED --
              */
          