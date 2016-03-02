
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object blogs_Scope0 {
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

class blogs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
            <div class="page-title pt-dark" style="background-image: url("""),_display_(/*115.75*/routes/*115.81*/.Assets.versioned("img/page-title/blog-list.jpg")),format.raw/*115.130*/(""");" data-stellar-background-ratio="0.65">
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

            <!-- Filters -->

            <!-- Blog Grid -->
            <section class="container">
                <div class="grid isotope-grid col-3">
                    <div class="grid-sizer"></div>
                    <div class="gutter-sizer"></div>

                        <!-- Post -->
                    <div class="grid-item">
                        <article class="tile post-tile ">
                            <div class="post-thumb">
                                <a href="/blogs/hack4dev"><img src=""""),_display_(/*142.70*/routes/*142.76*/.Assets.versioned("img/blog/blog-grid/post02.jpg")),format.raw/*142.126*/("""" alt="Post 2"></a>
                                <div class="post-meta">
                                    <span class="post-date">
                                        <a href="/blogs/hack4dev">15 janvier 2016</a>
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
                                <h3 class="post-title"><a href="/blogs/hack4dev">Titre Actualité</a></h3>
                                <p>Short description de l'actualité. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua enim ad minim veniam quis...</p>
                            </div>
                        </article><!-- .tile.post-tile -->
                    </div><!-- .grid-item -->

                    <!-- Post -->
                    <div class="grid-item">
                        <article class="tile post-tile ">
                            <div class="post-thumb">
                                <a href="/blogs/hack4dev"><img src=""""),_display_(/*171.70*/routes/*171.76*/.Assets.versioned("img/blog/blog-grid/post02.jpg")),format.raw/*171.126*/("""" alt="Post 2"></a>
                                <div class="post-meta">
                                    <span class="post-date">
                                        <a href="/blogs/hack4dev">15 janvier 2016</a>
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
                                <h3 class="post-title"><a href="/blogs/hack4dev">Titre Actualité</a></h3>
                                <p>Short description de l'actualité. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua enim ad minim veniam quis...</p>
                            </div>
                        </article><!-- .tile.post-tile -->
                    </div><!-- .grid-item -->

                    <!-- Post -->
                    <div class="grid-item">
                        <article class="tile post-tile ">
                            <div class="post-thumb">
                                <a href="/blogs/hack4dev"><img src=""""),_display_(/*200.70*/routes/*200.76*/.Assets.versioned("img/blog/blog-grid/post02.jpg")),format.raw/*200.126*/("""" alt="Post 2"></a>
                                <div class="post-meta">
                                    <span class="post-date">
                                        <a href="/blogs/hack4dev">15 janvier 2016</a>
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
                                <h3 class="post-title"><a href="/blogs/hack4dev">Titre Actualité</a></h3>
                                <p>Short description de l'actualité. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua enim ad minim veniam quis...</p>
                            </div>
                        </article><!-- .tile.post-tile -->
                    </div><!-- .grid-item -->

                    <!-- Post -->
                    <div class="grid-item">
                        <article class="tile post-tile ">
                            <div class="post-thumb">
                                <a href="/blogs/hack4dev"><img src=""""),_display_(/*229.70*/routes/*229.76*/.Assets.versioned("img/blog/blog-grid/post02.jpg")),format.raw/*229.126*/("""" alt="Post 2"></a>
                                <div class="post-meta">
                                    <span class="post-date">
                                        <a href="/blogs/hack4dev">15 janvier 2016</a>
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
                                <h3 class="post-title"><a href="/blogs/hack4dev">Titre Actualité</a></h3>
                                <p>Short description de l'actualité. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua enim ad minim veniam quis...</p>
                            </div>
                        </article><!-- .tile.post-tile -->
                    </div><!-- .grid-item -->

                    <!-- Post -->
                    <div class="grid-item">
                        <article class="tile post-tile ">
                            <div class="post-thumb">
                                <a href="/blogs/hack4dev"><img src=""""),_display_(/*258.70*/routes/*258.76*/.Assets.versioned("img/blog/blog-grid/post02.jpg")),format.raw/*258.126*/("""" alt="Post 2"></a>
                                <div class="post-meta">
                                    <span class="post-date">
                                        <a href="/blogs/hack4dev">15 janvier 2016</a>
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
                                <h3 class="post-title"><a href="/blogs/hack4dev">Titre Actualité</a></h3>
                                <p>Short description de l'actualité. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua enim ad minim veniam quis...</p>
                            </div>
                        </article><!-- .tile.post-tile -->
                    </div><!-- .grid-item -->

                    <!-- Post -->
                    <div class="grid-item">
                        <article class="tile post-tile ">
                            <div class="post-thumb">
                                <a href="/blogs/hack4dev"><img src=""""),_display_(/*287.70*/routes/*287.76*/.Assets.versioned("img/blog/blog-grid/post02.jpg")),format.raw/*287.126*/("""" alt="Post 2"></a>
                                <div class="post-meta">
                                    <span class="post-date">
                                        <a href="/blogs/hack4dev">15 janvier 2016</a>
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
                                <h3 class="post-title"><a href="/blogs/hack4dev">Titre Actualité</a></h3>
                                <p>Short description de l'actualité. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua enim ad minim veniam quis...</p>
                            </div>
                        </article><!-- .tile.post-tile -->
                    </div><!-- .grid-item -->
                </div><!-- .grid.isotope-grid.col-3 -->

            </section><!-- .container-fluid -->

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
        <script src=""""),_display_(/*352.23*/routes/*352.29*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*352.79*/(""""></script>
        <script src=""""),_display_(/*353.23*/routes/*353.29*/.Assets.versioned("js/vendor/bootstrap.min.js")),format.raw/*353.76*/(""""></script>
        <script src=""""),_display_(/*354.23*/routes/*354.29*/.Assets.versioned("js/vendor/placeholder.js")),format.raw/*354.74*/(""""></script>
        <script src=""""),_display_(/*355.23*/routes/*355.29*/.Assets.versioned("js/vendor/smoothscroll.js")),format.raw/*355.75*/(""""></script>
        <script src=""""),_display_(/*356.23*/routes/*356.29*/.Assets.versioned("js/vendor/jquery.stellar.min.js")),format.raw/*356.81*/(""""></script>
        <script src=""""),_display_(/*357.23*/routes/*357.29*/.Assets.versioned("js/vendor/velocity.min.js")),format.raw/*357.75*/(""""></script>
        <script src=""""),_display_(/*358.23*/routes/*358.29*/.Assets.versioned("js/vendor/magnific-popup.min.js")),format.raw/*358.81*/(""""></script>
        <script src=""""),_display_(/*359.23*/routes/*359.29*/.Assets.versioned("js/vendor/owl.carousel.min.js")),format.raw/*359.79*/(""""></script>
        <script src=""""),_display_(/*360.23*/routes/*360.29*/.Assets.versioned("js/vendor/isotope.pkgd.min.js")),format.raw/*360.79*/(""""></script>
        <script src=""""),_display_(/*361.23*/routes/*361.29*/.Assets.versioned("js/scripts.js")),format.raw/*361.63*/(""""></script>

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
object blogs extends blogs_Scope0.blogs
              /*
                  -- GENERATED --
                  DATE: Wed Mar 02 01:45:39 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/blogs.scala.html
                  HASH: 28cbc833e0fa00fcde9651411a135790a6a24df2
                  MATRIX: 827->0|1465->611|1480->617|1533->649|1615->704|1630->710|1683->742|1862->894|1877->900|1937->939|2020->995|2035->1001|2097->1042|2223->1141|2238->1147|2309->1197|2414->1275|2429->1281|2492->1323|3635->2439|3650->2445|3704->2478|7569->6315|7585->6321|7657->6370|8881->7566|8897->7572|8970->7622|10833->9457|10849->9463|10922->9513|12785->11348|12801->11354|12874->11404|14737->13239|14753->13245|14826->13295|16689->15130|16705->15136|16778->15186|18641->17021|18657->17027|18730->17077|22547->20866|22563->20872|22635->20922|22697->20956|22713->20962|22782->21009|22844->21043|22860->21049|22927->21094|22989->21128|23005->21134|23073->21180|23135->21214|23151->21220|23225->21272|23287->21306|23303->21312|23371->21358|23433->21392|23449->21398|23523->21450|23585->21484|23601->21490|23673->21540|23735->21574|23751->21580|23823->21630|23885->21664|23901->21670|23957->21704
                  LINES: 32->1|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|59->28|59->28|59->28|78->47|78->47|78->47|146->115|146->115|146->115|173->142|173->142|173->142|202->171|202->171|202->171|231->200|231->200|231->200|260->229|260->229|260->229|289->258|289->258|289->258|318->287|318->287|318->287|383->352|383->352|383->352|384->353|384->353|384->353|385->354|385->354|385->354|386->355|386->355|386->355|387->356|387->356|387->356|388->357|388->357|388->357|389->358|389->358|389->358|390->359|390->359|390->359|391->360|391->360|391->360|392->361|392->361|392->361
                  -- GENERATED --
              */
          