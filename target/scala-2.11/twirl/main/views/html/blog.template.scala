
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object blog_Scope0 {
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

class blog extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <title>CIPMEN | Blog</title>

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

    <!-- Page Title -->
    <!-- Use modifier class ".pt-dark" to switch to dark skin. "pt-parallax" to enable css parallax effect. -->
    <div class="page-title pt-dark" style="background-image: url("""),_display_(/*115.67*/routes/*115.73*/.Assets.versioned("img/page-title/single-post.jpg")),format.raw/*115.124*/(""";" data-stellar-background-ratio="0.65">
        <span class="overlay ie-gradient" style="opacity: .85;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h1>Blog</h1>
                </div><!-- .title -->
                <div class="breadcrumbs">
                    <a href="/">Accueil</a>
                    <span>Blog</span>
                </div><!-- .breadcrumbs -->
            </div><!-- .inner -->
        </div><!-- .container -->
    </div><!-- .page-title -->

    <!-- Content -->
    <div class="content-no-sidebar padding-bottom">
        <h3>Titre blog 1</h3>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident.</p>

        <!-- Image Carousel -->
        <!-- Data API:
          data-loop="true/false" enable/disable looping
          data-autoplay="true/false" enable/disable carousel autoplay
          data-interval="3000" autoplay interval timeout in miliseconds
          data-autoheight="true/false" enable/disable autoheight with transition
          data-dots="true/false" enable/disable bullet navigation
          Simply add necessary data attribute to the ".image-carousel" with appropriate value to adjust carousel functionality.
          Add ".light-controls" class to change skin of carousel controls to light version. e.x. for dark images.
         -->
        <div class="image-carousel space-top-2x space-bottom" data-dots="true">
            <div class="inner">
                <img src=""""),_display_(/*147.28*/routes/*147.34*/.Assets.versioned("img/blog/carousel/01.jpg")),format.raw/*147.79*/("""" alt="Image">
                <img src=""""),_display_(/*148.28*/routes/*148.34*/.Assets.versioned("img/blog/carousel/02.jpg")),format.raw/*148.79*/("""" alt="Image">
                <img src=""""),_display_(/*149.28*/routes/*149.34*/.Assets.versioned("img/blog/carousel/03.jpg")),format.raw/*149.79*/("""" alt="Image">
            </div>
        </div><!-- .image-carousel -->
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident.</p>
        <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi.</p>
        <blockquote>
            <p>Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?</p>
            <cite>James Cameron</cite>
        </blockquote>
        <p>Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.</p>
        <div class="embed-responsive embed-responsive-16by9 space-top-2x space-bottom-2x">
            <iframe src="https://player.vimeo.com/video/33984473?color=ff3366&amp;title=0&amp;byline=0&amp;portrait=0" class="embed-responsive-item"></iframe>
        </div>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident.</p>
        <p>Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.</p>
    </div><!-- .content-no-sidebar -->

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
    <script src=""""),_display_(/*203.19*/routes/*203.25*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*203.75*/(""""></script>
    <script src=""""),_display_(/*204.19*/routes/*204.25*/.Assets.versioned("js/vendor/bootstrap.min.js")),format.raw/*204.72*/(""""></script>
    <script src=""""),_display_(/*205.19*/routes/*205.25*/.Assets.versioned("js/vendor/placeholder.js")),format.raw/*205.70*/(""""></script>
    <script src=""""),_display_(/*206.19*/routes/*206.25*/.Assets.versioned("js/vendor/smoothscroll.js")),format.raw/*206.71*/(""""></script>
    <script src=""""),_display_(/*207.19*/routes/*207.25*/.Assets.versioned("js/vendor/jquery.stellar.min.js")),format.raw/*207.77*/(""""></script>
    <script src=""""),_display_(/*208.19*/routes/*208.25*/.Assets.versioned("js/vendor/velocity.min.js")),format.raw/*208.71*/(""""></script>
    <script src=""""),_display_(/*209.19*/routes/*209.25*/.Assets.versioned("js/vendor/magnific-popup.min.js")),format.raw/*209.77*/(""""></script>
    <script src=""""),_display_(/*210.19*/routes/*210.25*/.Assets.versioned("js/vendor/owl.carousel.min.js")),format.raw/*210.75*/(""""></script>
    <script src=""""),_display_(/*211.19*/routes/*211.25*/.Assets.versioned("js/scripts.js")),format.raw/*211.59*/(""""></script>

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
object blog extends blog_Scope0.blog
              /*
                  -- GENERATED --
                  DATE: Tue Mar 01 20:44:37 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/blog.scala.html
                  HASH: a2418957c8757d027a89fa8b1cfce544e933dd18
                  MATRIX: 825->0|1463->611|1478->617|1531->649|1613->704|1628->710|1681->742|1860->894|1875->900|1935->939|2018->995|2033->1001|2095->1042|2221->1141|2236->1147|2307->1197|2412->1275|2427->1281|2490->1323|3633->2439|3648->2445|3702->2478|7543->6291|7559->6297|7633->6348|9510->8197|9526->8203|9593->8248|9663->8290|9679->8296|9746->8341|9816->8383|9832->8389|9899->8434|14440->12947|14456->12953|14528->13003|14586->13033|14602->13039|14671->13086|14729->13116|14745->13122|14812->13167|14870->13197|14886->13203|14954->13249|15012->13279|15028->13285|15102->13337|15160->13367|15176->13373|15244->13419|15302->13449|15318->13455|15392->13507|15450->13537|15466->13543|15538->13593|15596->13623|15612->13629|15668->13663
                  LINES: 32->1|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|59->28|59->28|59->28|78->47|78->47|78->47|146->115|146->115|146->115|178->147|178->147|178->147|179->148|179->148|179->148|180->149|180->149|180->149|234->203|234->203|234->203|235->204|235->204|235->204|236->205|236->205|236->205|237->206|237->206|237->206|238->207|238->207|238->207|239->208|239->208|239->208|240->209|240->209|240->209|241->210|241->210|241->210|242->211|242->211|242->211
                  -- GENERATED --
              */
          