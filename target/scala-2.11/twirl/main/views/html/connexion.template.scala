
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object connexion_Scope0 {
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

class connexion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <title>CIPMEN | Connexion</title>

            <!--SEO Meta Tags-->
        <meta name="description" content="CIPMEN - Home" />
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

    <!-- 404 Content -->
    <!-- User modifier class ".light-skin" to make text light for cases when dark background image used. -->
    <div class="page-404">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2">
                    <h1>Connexion</h1>
                   <form method="post" action="/profil">
                       <div class="form-control">
                           <i class="pe-7s-mail"></i>
                           <input type="email" name="email" placeholder="Email">
                       </div>
                       <div class="form-control">
                           <i class="pe-7s-key"></i>
                           <input type="password" name="password" placeholder="Mot de passe">
                       </div>
                       <div class="form-control">
                           <button type="submit" class="btn btn-ghost btn-default">Connexion</button>
                       </div>
                   </form>
                </div>
            </div>

        </div>
    </div><!-- .page-404 -->

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
<script src=""""),_display_(/*176.15*/routes/*176.21*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*176.71*/(""""></script>
<script src=""""),_display_(/*177.15*/routes/*177.21*/.Assets.versioned("js/vendor/bootstrap.min.js")),format.raw/*177.68*/(""""></script>
<script src=""""),_display_(/*178.15*/routes/*178.21*/.Assets.versioned("js/vendor/placeholder.js")),format.raw/*178.66*/(""""></script>
<script src=""""),_display_(/*179.15*/routes/*179.21*/.Assets.versioned("js/vendor/smoothscroll.js")),format.raw/*179.67*/(""""></script>
<script src=""""),_display_(/*180.15*/routes/*180.21*/.Assets.versioned("js/vendor/jquery.stellar.min.js")),format.raw/*180.73*/(""""></script>
<script src=""""),_display_(/*181.15*/routes/*181.21*/.Assets.versioned("js/vendor/velocity.min.js")),format.raw/*181.67*/(""""></script>
<script src=""""),_display_(/*182.15*/routes/*182.21*/.Assets.versioned("js/vendor/magnific-popup.min.js")),format.raw/*182.73*/(""""></script>
<script src=""""),_display_(/*183.15*/routes/*183.21*/.Assets.versioned("js/vendor/owl.carousel.min.js")),format.raw/*183.71*/(""""></script>
<script src=""""),_display_(/*184.15*/routes/*184.21*/.Assets.versioned("js/scripts.js")),format.raw/*184.55*/(""""></script>

</body><!-- <body> -->

</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object connexion extends connexion_Scope0.connexion
              /*
                  -- GENERATED --
                  DATE: Tue Mar 01 20:45:36 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/connexion.scala.html
                  HASH: 2ba8640622c42cfb31a3cf20e4e8988b02210bb9
                  MATRIX: 835->0|1478->616|1493->622|1546->654|1628->709|1643->715|1696->747|1875->899|1890->905|1950->944|2033->1000|2048->1006|2110->1047|2236->1146|2251->1152|2322->1202|2427->1280|2442->1286|2505->1328|3648->2444|3663->2450|3717->2483|10317->9055|10333->9061|10405->9111|10459->9137|10475->9143|10544->9190|10598->9216|10614->9222|10681->9267|10735->9293|10751->9299|10819->9345|10873->9371|10889->9377|10963->9429|11017->9455|11033->9461|11101->9507|11155->9533|11171->9539|11245->9591|11299->9617|11315->9623|11387->9673|11441->9699|11457->9705|11513->9739
                  LINES: 32->1|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|59->28|59->28|59->28|78->47|78->47|78->47|207->176|207->176|207->176|208->177|208->177|208->177|209->178|209->178|209->178|210->179|210->179|210->179|211->180|211->180|211->180|212->181|212->181|212->181|213->182|213->182|213->182|214->183|214->183|214->183|215->184|215->184|215->184
                  -- GENERATED --
              */
          