
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profil_Scope0 {
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

class profil extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <meta name="description" content="CIPMEN - DASHBOARD" />
        <meta name="keywords" content="CIPMEN - CENTRE D'INCUBATION POUR LES PMES DU NIGER - L'entrepreunariat innovant et durable"/>
        <meta name="author" content="Cipmen" />

            <!--Mobile Specific Meta Tag-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

            <!--Favicon-->
        <link rel="shortcut icon" href=""""),_display_(/*17.42*/routes/*17.48*/.Assets.versioned("favicon.ico")),format.raw/*17.80*/("""" type="image/x-icon">
        <link rel="icon" href=""""),_display_(/*18.33*/routes/*18.39*/.Assets.versioned("favicon.ico")),format.raw/*18.71*/("""" type="image/x-icon">

            <!-- All Theme Styles including Bootstrap, Bourbon, Pixeden, etc. compiled from styles.scss-->
        <link href=""""),_display_(/*21.22*/routes/*21.28*/.Assets.versioned("css/styles.min.css")),format.raw/*21.67*/("""" rel="stylesheet" media="screen">
        <link href=""""),_display_(/*22.22*/routes/*22.28*/.Assets.versioned("css/colors/color.css")),format.raw/*22.69*/("""" rel="stylesheet" media="screen">

            <!--Modernizr / Detectizr-->
        <script src=""""),_display_(/*25.23*/routes/*25.29*/.Assets.versioned("js/vendor/modernizr.custom.js")),format.raw/*25.79*/(""""></script>

            <!-- Page Preloader (Pace) -->
        <script src=""""),_display_(/*28.23*/routes/*28.29*/.Assets.versioned("js/vendor/pace.min.js")),format.raw/*28.71*/(""""></script>
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
                            <img src=""""),_display_(/*47.40*/routes/*47.46*/.Assets.versioned("img/logo.png")),format.raw/*47.79*/("""" alt="CIPMEN">
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
                    <h1>Dashbord</h1>
                </div><!-- .title -->
                <div class="breadcrumbs">
                    <a href="/">Accueil</a>
                    <span>Profil</span>
                </div><!-- .breadcrumbs -->
            </div><!-- .inner -->
        </div><!-- .container -->
    </div><!-- .page-title -->

    <!-- Container -->
    <div class="container space-bottom-2x">
        <div class="row">

            <!-- Side Navigation -->
            <div class="col-md-3 col-sm-4 space-bottom-2x">
                <nav class="side-nav">
                    <ul role="tablist">
                        <li class="active"><a href="#ressources" role="tab" data-toggle="tab">Mes ressources</a></li>
                        <li><a href="#evenements" role="tab" data-toggle="tab">Mes évènements</a></li>
                        <li><a href="#profil" role="tab" data-toggle="tab">Mon profil</a></li>
                    </ul>
                </nav><!-- .side-nav -->
            </div><!-- .col-md-3.col-sm-4 -->

            <!-- Content -->
            <div class="col-md-9 col-sm-8">
                <div class="tab-content transparent space-bottom-2x">
                    <div role="tabpanel" class="tab-pane transition fade scale in active" id="ressources">
                        <h5 class="text-uppercase text-gray text-thin space-bottom">Mes ressources</h5>
                        <div class="table-responsive space-bottom-2x">
                            <table class="table-striped">
                                <thead>
                                <tr>
                                    <th>#</th>
                                    <th>Catégorie</th>
                                    <th>Intitulé</th>
                                    <th>Date limite</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <th scope="row">1</th>
                                    <td>Concours</td>
                                    <td>Hack'4 dev</td>
                                    <td>15/01/2016</td>
                                </tr>
                                <tr>
                                    <th scope="row">2</th>
                                    <td>Formation</td>
                                    <td>Techniques de communication</td>
                                    <td>14/11/2016</td>
                                </tr>
                                <tr>
                                    <th scope="row">3</th>
                                    <td>Challenge</td>
                                    <td>Orange app challenge</td>
                                    <td>08/04/2016</td>
                                </tr>
                                <tr>
                                    <th scope="row">4</th>
                                    <td>Séminaire</td>
                                    <td>Tonny Elimelu</td>
                                    <td>01/02/2016</td>
                                </tr>
                                <tr>
                                    <th scope="row">5</th>
                                    <td>Formation</td>
                                    <td>Ligne startup</td>
                                    <td>01/04/2016</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div><!-- .tab-panel -->
                    <div role="tabpanel" class="tab-pane transition fade scale" id="evenements">
                        <h5 class="text-uppercase text-gray text-thin space-bottom">Environnement</h5>
                        <div class="table-responsive space-bottom-2x">
                            <table class="table-striped">
                                <thead>
                                <tr>
                                    <th>#</th>
                                    <th>Catégorie</th>
                                    <th>Intitulé</th>
                                    <th>Date</th>
                                    <th>Status</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <th scope="row">1</th>
                                    <td>Concours</td>
                                    <td>Hack'4 dev</td>
                                    <td>15/01/2016</td>
                                    <td><span class="bg-info">Réservé</span></td>
                                </tr>
                                <tr>
                                    <th scope="row">2</th>
                                    <td>Formation</td>
                                    <td>Techniques de communication</td>
                                    <td>14/11/2016</td>
                                    <td><span class="bg-info">Réservé</span></td>
                                </tr>
                                <tr>
                                    <th scope="row">3</th>
                                    <td>Challenge</td>
                                    <td>Orange app challenge</td>
                                    <td>08/04/2016</td>
                                    <td><span class="bg-default">Non Réservé</span></td>
                                </tr>
                                <tr>
                                    <th scope="row">4</th>
                                    <td>Séminaire</td>
                                    <td>Tonny Elimelu</td>
                                    <td>01/02/2016</td>
                                    <td><span class="bg-default">Non Réservé</span></td>
                                </tr>
                                <tr>
                                    <th scope="row">5</th>
                                    <td>Formation</td>
                                    <td>Ligne startup</td>
                                    <td>01/04/2016</td>
                                    <td><span class="bg-info">Réservé</span></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div><!-- .tab-panel -->
                    <div role="tabpanel" class="tab-pane transition fade scale" id="profil">
                        <div class="row">
                                <div class="col-sm-12 space-bottom-2x">
                                    <!-- Nav Tabs -->
                                    <ul class="nav-tabs" role="tablist">
                                        <li class="active"><a href="#tab1" role="tab" data-toggle="tab">Tab 1</a></li>
                                        <li><a href="#tab2" role="tab" data-toggle="tab">Tab 2</a></li>
                                        <li><a href="#tab3" role="tab" data-toggle="tab">Tab 3</a></li>
                                    </ul><!-- .nav-tabs -->
                                    <!-- Tab panes -->
                                    <div class="tab-content">
                                        <div role="tabpanel" class="tab-pane transition fade in active" id="tab1">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ut dignissimos ipsam obcaecati corrupti modi, deserunt facere asperiores. Voluptatum laudantium ut, minus nam. Libero facilis aspernatur cumque, quisquam quod sint odit.</div>
                                        <div role="tabpanel" class="tab-pane transition fade" id="tab2">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Qui hic laboriosam odio doloribus suscipit error nostrum totam dignissimos esse numquam voluptatum, aspernatur est, at voluptatem minus temporibus reprehenderit culpa voluptates.</div>
                                        <div role="tabpanel" class="tab-pane transition fade" id="tab3">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur ratione nulla asperiores repellat natus dolor delectus dolorum harum sequi fugiat vero, voluptatem reiciendis autem, vel. Repellendus ea laudantium pariatur eum!</div>
                                    </div><!-- .tab-content -->
                            </div>
                        </div>

                    </div><!-- .tab-panel -->
                </div><!-- .tab-content.transparent.space-bottom-2x -->
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
<script src=""""),_display_(/*308.15*/routes/*308.21*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*308.71*/(""""></script>
<script src=""""),_display_(/*309.15*/routes/*309.21*/.Assets.versioned("js/vendor/bootstrap.min.js")),format.raw/*309.68*/(""""></script>
<script src=""""),_display_(/*310.15*/routes/*310.21*/.Assets.versioned("js/vendor/placeholder.js")),format.raw/*310.66*/(""""></script>
<script src=""""),_display_(/*311.15*/routes/*311.21*/.Assets.versioned("js/vendor/smoothscroll.js")),format.raw/*311.67*/(""""></script>
<script src=""""),_display_(/*312.15*/routes/*312.21*/.Assets.versioned("js/vendor/jquery.stellar.min.js")),format.raw/*312.73*/(""""></script>
<script src=""""),_display_(/*313.15*/routes/*313.21*/.Assets.versioned("js/vendor/velocity.min.js")),format.raw/*313.67*/(""""></script>
<script src=""""),_display_(/*314.15*/routes/*314.21*/.Assets.versioned("js/vendor/magnific-popup.min.js")),format.raw/*314.73*/(""""></script>
<script src=""""),_display_(/*315.15*/routes/*315.21*/.Assets.versioned("js/vendor/owl.carousel.min.js")),format.raw/*315.71*/(""""></script>
<script src=""""),_display_(/*316.15*/routes/*316.21*/.Assets.versioned("js/scripts.js")),format.raw/*316.55*/(""""></script>

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
object profil extends profil_Scope0.profil
              /*
                  -- GENERATED --
                  DATE: Tue Mar 01 20:45:36 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/profil.scala.html
                  HASH: 7c70c98a64230af03a5666f771c5aaba9b0a1b1c
                  MATRIX: 829->0|1472->616|1487->622|1540->654|1622->709|1637->715|1690->747|1869->899|1884->905|1944->944|2027->1000|2042->1006|2104->1047|2230->1146|2245->1152|2316->1202|2421->1280|2436->1286|2499->1328|3642->2444|3657->2450|3711->2483|7552->6296|7568->6302|7635->6346|18445->17128|18461->17134|18533->17184|18587->17210|18603->17216|18672->17263|18726->17289|18742->17295|18809->17340|18863->17366|18879->17372|18947->17418|19001->17444|19017->17450|19091->17502|19145->17528|19161->17534|19229->17580|19283->17606|19299->17612|19373->17664|19427->17690|19443->17696|19515->17746|19569->17772|19585->17778|19641->17812
                  LINES: 32->1|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|59->28|59->28|59->28|78->47|78->47|78->47|146->115|146->115|146->115|339->308|339->308|339->308|340->309|340->309|340->309|341->310|341->310|341->310|342->311|342->311|342->311|343->312|343->312|343->312|344->313|344->313|344->313|345->314|345->314|345->314|346->315|346->315|346->315|347->316|347->316|347->316
                  -- GENERATED --
              */
          