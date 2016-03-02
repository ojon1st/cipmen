
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object evenement_Scope0 {
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

class evenement extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <meta name="description" content="CIPMEN - Evènement" />
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
    <div class="page-title pt-dark" style="background-image: url("""),_display_(/*115.67*/routes/*115.73*/.Assets.versioned("img/page-title/single-post.jpg")),format.raw/*115.124*/(""");" data-stellar-background-ratio="0.65">
        <span class="overlay ie-gradient" style="opacity: .85;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h1>Nos évènements</h1>
                </div><!-- .title -->
                <div class="breadcrumbs">
                    <a href="/">Accueil</a>
                    <span>Evènement</span>
                </div><!-- .breadcrumbs -->
            </div><!-- .inner -->
        </div><!-- .container -->
    </div><!-- .page-title -->

    <!-- Container -->
    <div class="container space-bottom-2x">
        <div class="row">

            <!-- Content -->
            <div class="col-lg-9 col-md-8 col-lg-push-3 col-md-push-4">
                <h3>Titre de l'actualité</h3>
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
                        <img src=""""),_display_(/*151.36*/routes/*151.42*/.Assets.versioned("img/blog/carousel/01.jpg")),format.raw/*151.87*/("""" alt="Image">
                        <img src=""""),_display_(/*152.36*/routes/*152.42*/.Assets.versioned("img/blog/carousel/02.jpg")),format.raw/*152.87*/("""" alt="Image">
                        <img src=""""),_display_(/*153.36*/routes/*153.42*/.Assets.versioned("img/blog/carousel/03.jpg")),format.raw/*153.87*/("""" alt="Image">
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

            </div><!-- .col-lg-9.col-md-8 -->

            <!-- Sidebar -->
            <div class="padding-top visible-sm visible-xs"></div>
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
<script src=""""),_display_(/*231.15*/routes/*231.21*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*231.71*/(""""></script>
<script src=""""),_display_(/*232.15*/routes/*232.21*/.Assets.versioned("js/vendor/bootstrap.min.js")),format.raw/*232.68*/(""""></script>
<script src=""""),_display_(/*233.15*/routes/*233.21*/.Assets.versioned("js/vendor/placeholder.js")),format.raw/*233.66*/(""""></script>
<script src=""""),_display_(/*234.15*/routes/*234.21*/.Assets.versioned("js/vendor/smoothscroll.js")),format.raw/*234.67*/(""""></script>
<script src=""""),_display_(/*235.15*/routes/*235.21*/.Assets.versioned("js/vendor/jquery.stellar.min.js")),format.raw/*235.73*/(""""></script>
<script src=""""),_display_(/*236.15*/routes/*236.21*/.Assets.versioned("js/vendor/velocity.min.js")),format.raw/*236.67*/(""""></script>
<script src=""""),_display_(/*237.15*/routes/*237.21*/.Assets.versioned("js/vendor/magnific-popup.min.js")),format.raw/*237.73*/(""""></script>
<script src=""""),_display_(/*238.15*/routes/*238.21*/.Assets.versioned("js/vendor/owl.carousel.min.js")),format.raw/*238.71*/(""""></script>
<script src=""""),_display_(/*239.15*/routes/*239.21*/.Assets.versioned("js/scripts.js")),format.raw/*239.55*/(""""></script>

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
object evenement extends evenement_Scope0.evenement
              /*
                  -- GENERATED --
                  DATE: Tue Mar 01 20:44:37 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/evenement.scala.html
                  HASH: a83294033176897fca94005ef92342178de0e9aa
                  MATRIX: 835->0|1478->616|1493->622|1546->654|1628->709|1643->715|1696->747|1875->899|1890->905|1950->944|2033->1000|2048->1006|2110->1047|2236->1146|2251->1152|2322->1202|2427->1280|2442->1286|2505->1328|3648->2444|3663->2450|3717->2483|7558->6296|7574->6302|7648->6353|9791->8468|9807->8474|9874->8519|9952->8569|9968->8575|10035->8620|10113->8670|10129->8676|10196->8721|16122->14619|16138->14625|16210->14675|16264->14701|16280->14707|16349->14754|16403->14780|16419->14786|16486->14831|16540->14857|16556->14863|16624->14909|16678->14935|16694->14941|16768->14993|16822->15019|16838->15025|16906->15071|16960->15097|16976->15103|17050->15155|17104->15181|17120->15187|17192->15237|17246->15263|17262->15269|17318->15303
                  LINES: 32->1|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|59->28|59->28|59->28|78->47|78->47|78->47|146->115|146->115|146->115|182->151|182->151|182->151|183->152|183->152|183->152|184->153|184->153|184->153|262->231|262->231|262->231|263->232|263->232|263->232|264->233|264->233|264->233|265->234|265->234|265->234|266->235|266->235|266->235|267->236|267->236|267->236|268->237|268->237|268->237|269->238|269->238|269->238|270->239|270->239|270->239
                  -- GENERATED --
              */
          