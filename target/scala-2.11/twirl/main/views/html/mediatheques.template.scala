
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mediatheques_Scope0 {
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

class mediatheques extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <meta name="description" content="CIPMEN - MÉDIATHÈQUES" />
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
    <div class="page-title pt-dark" style="background-image: url("""),_display_(/*115.67*/routes/*115.73*/.Assets.versioned("img/page-title/gallery.jpg")),format.raw/*115.120*/(""");" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity: .85;"></span>
        <div class="container">
            <div class="inner">

                <div class="breadcrumbs">
                    <a href="/">Home</a>
                    <span>Médiathèques</span>
                </div><!-- .breadcrumbs -->
            </div><!-- .inner -->
        </div><!-- .container -->
    </div><!-- .page-title -->

    <!-- Container -->
    <div class="container space-bottom-2x">

        <!-- Filters Bar -->
        <nav class="filters-bar space-bottom-2x">
            <div class="column">
                <ul class="nav-filters">
                    <li class="active">
                        <a href="#" data-filter="*">
                            <i class="pe-7s-keypad"></i>
                            Tout voir
                        </a>
                    </li>
                    <li>
                        <a href="#" data-filter=".image">
                            <i class="pe-7s-photo"></i>
                            Images
                        </a>
                    </li>
                    <li>
                        <a href="#" data-filter=".video">
                            <i class="pe-7s-film"></i>
                            Video
                        </a>
                    </li>
                </ul>
            </div>
            <div class="column">
            </div>
        </nav><!-- .filters-bar -->

        <!-- Gallery Grid -->
        <section class="grid isotope-masonry-grid filter-grid">
            <div class="grid-sizer"></div>
            <div class="gutter-sizer"></div>

            <!-- Gallery Item -->
            <div class="grid-item h2 video inspiration">
                <a href="https://vimeo.com/76179199" class="gallery-tile gallery-video">
                    <div class="icon"><i class="pe-7s-film"></i></div>
                    <div class="image" style="background-image: url("""),_display_(/*168.70*/routes/*168.76*/.Assets.versioned("img/gallery/01.jpg")),format.raw/*168.115*/(""");"></div>
                </a>
            </div><!-- .grid-item.h2.apps -->

            <!-- Gallery Item -->
            <div class="grid-item image ux">
                <a href=""""),_display_(/*174.27*/routes/*174.33*/.Assets.versioned("img/gallery/02.jpg")),format.raw/*174.72*/("""" class="gallery-tile gallery-image">
                    <div class="icon"><i class="pe-7s-camera"></i></div>
                    <div class="image" style="background-image: url("""),_display_(/*176.70*/routes/*176.76*/.Assets.versioned("img/gallery/02.jpg")),format.raw/*176.115*/(""");"></div>
                </a>
            </div><!-- .grid-item.identity -->

            <!-- Gallery Item -->
            <div class="grid-item video animations">
                <a href="https://vimeo.com/33984473" class="gallery-tile gallery-video">
                    <div class="icon"><i class="pe-7s-film"></i></div>
                    <div class="image" style="background-image: url("""),_display_(/*184.70*/routes/*184.76*/.Assets.versioned("img/gallery/03.jpg")),format.raw/*184.115*/(""");"></div>
                </a>
            </div><!-- .grid-item.identity -->

            <!-- Gallery Item -->
            <div class="grid-item w2 image ux">
                <a href="img/gallery/04.jpg" class="gallery-tile gallery-image">
                    <div class="icon"><i class="pe-7s-camera"></i></div>
                    <div class="image" style="background-image: url("""),_display_(/*192.70*/routes/*192.76*/.Assets.versioned("img/gallery/04.jpg")),format.raw/*192.115*/(""");"></div>
                </a>
            </div><!-- .grid-item.w2.apps -->

            <!-- Gallery Item -->
            <div class="grid-item w2 image inspiration">
                <a href="img/gallery/05.jpg" class="gallery-tile gallery-image">
                    <div class="icon"><i class="pe-7s-camera"></i></div>
                    <div class="image" style="background-image: url("""),_display_(/*200.70*/routes/*200.76*/.Assets.versioned("img/gallery/05.jpg")),format.raw/*200.115*/(""");"></div>
                </a>
            </div><!-- .grid-item.w2.identity -->

            <!-- Gallery Item -->
            <div class="grid-item image animations">
                <a href=""""),_display_(/*206.27*/routes/*206.33*/.Assets.versioned("img/gallery/06.jpg")),format.raw/*206.72*/("""" class="gallery-tile gallery-image">
                    <div class="icon"><i class="pe-7s-camera"></i></div>
                    <div class="image" style="background-image: url("""),_display_(/*208.70*/routes/*208.76*/.Assets.versioned("img/gallery/06.jpg")),format.raw/*208.115*/(""");"></div>
                </a>
            </div><!-- .grid-item.apps -->
        </section><!-- .grid.isotope-masonry-grid.filter-grid -->

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
<script src=""""),_display_(/*251.15*/routes/*251.21*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*251.71*/(""""></script>
<script src=""""),_display_(/*252.15*/routes/*252.21*/.Assets.versioned("js/vendor/bootstrap.min.js")),format.raw/*252.68*/(""""></script>
<script src=""""),_display_(/*253.15*/routes/*253.21*/.Assets.versioned("js/vendor/placeholder.js")),format.raw/*253.66*/(""""></script>
<script src=""""),_display_(/*254.15*/routes/*254.21*/.Assets.versioned("js/vendor/smoothscroll.js")),format.raw/*254.67*/(""""></script>
<script src=""""),_display_(/*255.15*/routes/*255.21*/.Assets.versioned("js/vendor/jquery.stellar.min.js")),format.raw/*255.73*/(""""></script>
<script src=""""),_display_(/*256.15*/routes/*256.21*/.Assets.versioned("js/vendor/velocity.min.js")),format.raw/*256.67*/(""""></script>
<script src=""""),_display_(/*257.15*/routes/*257.21*/.Assets.versioned("js/vendor/magnific-popup.min.js")),format.raw/*257.73*/(""""></script>
<script src=""""),_display_(/*258.15*/routes/*258.21*/.Assets.versioned("js/vendor/owl.carousel.min.js")),format.raw/*258.71*/(""""></script>
<script src=""""),_display_(/*259.15*/routes/*259.21*/.Assets.versioned("js/scripts.js")),format.raw/*259.55*/(""""></script>

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
object mediatheques extends mediatheques_Scope0.mediatheques
              /*
                  -- GENERATED --
                  DATE: Tue Mar 01 20:45:36 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/mediatheques.scala.html
                  HASH: 8762e789ebb437c37b08c601f8108ece987d1e99
                  MATRIX: 841->0|1487->619|1502->625|1555->657|1637->712|1652->718|1705->750|1884->902|1899->908|1959->947|2042->1003|2057->1009|2119->1050|2245->1149|2260->1155|2331->1205|2436->1283|2451->1289|2514->1331|3657->2447|3672->2453|3726->2486|7567->6299|7583->6305|7653->6352|9674->8345|9690->8351|9752->8390|9964->8574|9980->8580|10041->8619|10249->8799|10265->8805|10327->8844|10751->9240|10767->9246|10829->9285|11242->9670|11258->9676|11320->9715|11741->10108|11757->10114|11819->10153|12043->10349|12059->10355|12120->10394|12328->10574|12344->10580|12406->10619|14429->12614|14445->12620|14517->12670|14571->12696|14587->12702|14656->12749|14710->12775|14726->12781|14793->12826|14847->12852|14863->12858|14931->12904|14985->12930|15001->12936|15075->12988|15129->13014|15145->13020|15213->13066|15267->13092|15283->13098|15357->13150|15411->13176|15427->13182|15499->13232|15553->13258|15569->13264|15625->13298
                  LINES: 32->1|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|59->28|59->28|59->28|78->47|78->47|78->47|146->115|146->115|146->115|199->168|199->168|199->168|205->174|205->174|205->174|207->176|207->176|207->176|215->184|215->184|215->184|223->192|223->192|223->192|231->200|231->200|231->200|237->206|237->206|237->206|239->208|239->208|239->208|282->251|282->251|282->251|283->252|283->252|283->252|284->253|284->253|284->253|285->254|285->254|285->254|286->255|286->255|286->255|287->256|287->256|287->256|288->257|288->257|288->257|289->258|289->258|289->258|290->259|290->259|290->259
                  -- GENERATED --
              */
          