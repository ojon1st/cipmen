
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object evenements_Scope0 {
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

class evenements extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <meta name="description" content="CIPMEN - Evènements" />
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
    <div class="page-title pt-dark" style="background-image: url("""),_display_(/*115.67*/routes/*115.73*/.Assets.versioned("img/page-title/blog-list.jpg")),format.raw/*115.122*/(""");" data-stellar-background-ratio="0.65">
        <span class="overlay ie-gradient" style="opacity: .85;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h1>Nos évènements</h1>
                </div><!-- .title -->
                <div class="breadcrumbs">
                    <a href="/">Accueil</a>
                    <span>Evènements</span>
                </div><!-- .breadcrumbs -->
            </div><!-- .inner -->
        </div><!-- .container -->
    </div><!-- .page-title -->

    <!-- Container -->
    <div class="container space-bottom-2x">
        <div class="row">

            <!-- Content -->
            <div class="col-lg-9 col-md-8 col-sm-7 col-lg-push-3 col-md-push-4 col-sm-push-5">

                <!-- Post -->
                <article class="tile post-tile ">
                    <div class="post-thumb">
                        <a href="/evenements/hack4dev"><img src=""""),_display_(/*140.67*/routes/*140.73*/.Assets.versioned("img/blog/blog-list/post01.jpg")),format.raw/*140.123*/("""" alt="Post 1"></a>
                        <div class="post-meta">
                <span class="post-date">
                  <a href="/evenements/hack4dev">15 février 2016</a>
                </span>
                        </div>
                        <div class="post-share-btn">
                            <div class="share-dropup">
                                <a href="#"><i class="fa fa-facebook"></i></a>
                                <a href="#"><i class="fa fa-google-plus"></i></a>
                                <a href="#"><i class="fa fa-twitter"></i></a>
                                <a href="#"><i class="fa fa-instagram"></i></a>
                            </div>
                            <a href="#"><i class="pe-7s-share"></i></a>
                        </div>
                    </div>
                    <div class="tile-body post-body">
                        <div class="post-format"></div>
                        <h3 class="post-title"><a href="/evenements/hack4dev">Evenement 1</a></h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua enim ad minim veniam quis  nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.  Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur...</p>
                    </div>
                </article><!-- .tile.post-tile -->

                <!-- Post -->
                <article class="tile post-tile ">
                    <div class="post-thumb">
                        <a href="/evenement"><img src=""""),_display_(/*166.57*/routes/*166.63*/.Assets.versioned("img/blog/blog-list/post01.jpg")),format.raw/*166.113*/("""" alt="Post 1"></a>
                        <div class="post-meta">
                <span class="post-date">
                  <a href="/evenements/hack4dev">15 février 2016</a>
                </span>

                        </div>
                        <div class="post-share-btn">
                            <div class="share-dropup">
                                <a href="#"><i class="fa fa-facebook"></i></a>
                                <a href="#"><i class="fa fa-google-plus"></i></a>
                                <a href="#"><i class="fa fa-twitter"></i></a>
                                <a href="#"><i class="fa fa-instagram"></i></a>
                            </div>
                            <a href="#"><i class="pe-7s-share"></i></a>
                        </div>
                    </div>
                    <div class="tile-body post-body">
                        <div class="post-format"></div>
                        <h3 class="post-title"><a href="/evenements/hack4dev">Evenement 2</a></h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua enim ad minim veniam quis  nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.  Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur...</p>
                    </div>
                </article><!-- .tile.post-tile -->

            </div><!-- .col-lg-9.col-md-8.col-sm-7 -->

            <!-- Sidebar -->
            <div class="padding-top visible-xs"></div>
            <div class="col-lg-3 col-md-4 col-sm-5 col-lg-pull-9 col-md-pull-8 col-sm-pull-7">
                <aside class="sidebar space-bottom">

                    <!-- Tags Widget -->
                    <section class="widget widget_tags">
                        <h3 class="widget-title">
                            <i class="pe-7s-ticket"></i>
                            Tags
                        </h3>
                        <a href="#" class="tag">Environnement<span>5</span></a>
                        <a href="#" class="tag">Energie<span>123</span></a>
                        <a href="#" class="tag">Solaire<span>9</span></a>
                        <a href="#" class="tag">Android<span>46</span></a>
                        <a href="#" class="tag">Nature<span>77</span></a>
                        <a href="#" class="tag">Informatique<span>184</span></a>
                        <a href="#" class="tag">Development TIC<span>16</span></a>
                    </section><!-- .widget.widget_tags -->
                </aside><!-- .sidebar -->
            </div><!-- .col-lg-3.col-md-4.col-sm-5 -->
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
<script src=""""),_display_(/*252.15*/routes/*252.21*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*252.71*/(""""></script>
<script src=""""),_display_(/*253.15*/routes/*253.21*/.Assets.versioned("js/vendor/bootstrap.min.js")),format.raw/*253.68*/(""""></script>
<script src=""""),_display_(/*254.15*/routes/*254.21*/.Assets.versioned("js/vendor/placeholder.js")),format.raw/*254.66*/(""""></script>
<script src=""""),_display_(/*255.15*/routes/*255.21*/.Assets.versioned("js/vendor/smoothscroll.js")),format.raw/*255.67*/(""""></script>
<script src=""""),_display_(/*256.15*/routes/*256.21*/.Assets.versioned("js/vendor/jquery.stellar.min.js")),format.raw/*256.73*/(""""></script>
<script src=""""),_display_(/*257.15*/routes/*257.21*/.Assets.versioned("js/vendor/velocity.min.js")),format.raw/*257.67*/(""""></script>
<script src=""""),_display_(/*258.15*/routes/*258.21*/.Assets.versioned("js/vendor/magnific-popup.min.js")),format.raw/*258.73*/(""""></script>
<script src=""""),_display_(/*259.15*/routes/*259.21*/.Assets.versioned("js/vendor/owl.carousel.min.js")),format.raw/*259.71*/(""""></script>
<script src=""""),_display_(/*260.15*/routes/*260.21*/.Assets.versioned("js/scripts.js")),format.raw/*260.55*/(""""></script>

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
object evenements extends evenements_Scope0.evenements
              /*
                  -- GENERATED --
                  DATE: Wed Mar 02 01:15:07 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/evenements.scala.html
                  HASH: e9cd7c62150450eae7b0422a6c3f366b734a9743
                  MATRIX: 837->0|1481->617|1496->623|1549->655|1631->710|1646->716|1699->748|1878->900|1893->906|1953->945|2036->1001|2051->1007|2113->1048|2239->1147|2254->1153|2325->1203|2430->1281|2445->1287|2508->1329|3651->2445|3666->2451|3720->2484|7561->6297|7577->6303|7649->6352|8657->7332|8673->7338|8746->7388|10433->9047|10449->9053|10522->9103|15166->13719|15182->13725|15254->13775|15308->13801|15324->13807|15393->13854|15447->13880|15463->13886|15530->13931|15584->13957|15600->13963|15668->14009|15722->14035|15738->14041|15812->14093|15866->14119|15882->14125|15950->14171|16004->14197|16020->14203|16094->14255|16148->14281|16164->14287|16236->14337|16290->14363|16306->14369|16362->14403
                  LINES: 32->1|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|59->28|59->28|59->28|78->47|78->47|78->47|146->115|146->115|146->115|171->140|171->140|171->140|197->166|197->166|197->166|283->252|283->252|283->252|284->253|284->253|284->253|285->254|285->254|285->254|286->255|286->255|286->255|287->256|287->256|287->256|288->257|288->257|288->257|289->258|289->258|289->258|290->259|290->259|290->259|291->260|291->260|291->260
                  -- GENERATED --
              */
          