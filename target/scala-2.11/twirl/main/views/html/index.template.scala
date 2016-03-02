
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <meta name="description" content="CIPMEN - Home" />
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

    <!-- Intro Section -->
    <section class="intro-section" style="background-image: url("""),_display_(/*114.66*/routes/*114.72*/.Assets.versioned("img/home/intro/33.jpg")),format.raw/*114.114*/(""");" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity: .25;"></span>
        <div class="container">
            <div class="row">
                <div class="col-lg-5 col-lg-offset-1 col-md-6 col-sm-6 padding-bottom-3x mobile-center">
                    <div class="padding-top-3x hidden-xs"></div>
                    <h2 class="text-light">L'entrepreneuriat innovant et durable</h2>
                    <p class="text-light opacity-50">CIPMEN est le premier incubateur des PME au Niger, il offre aux entrepreneurs du Niger un environnement unique pour démarrer une entreprise prospère ou accélérer leur développement..</p>
                    <ul class="sharing-links light-skin space-bottom">
                        <li>Environnement</li>
                        <li>Energie</li>
                        <li>TIC</li>
                    </ul><!-- .sharing-links -->
                    <div class="mobile-center">
                        <a href="#" class="btn btn-ghost btn-light btn-icon-right">
                            Je postule
                            <i class="icon-arrow-right"></i>
                        </a>
                    </div>
                </div><!-- .col-lg-5 -->

                <div class="col-lg-6 col-md-6 col-sm-6">

                    <!-- Phone Carousel -->
                    <!-- Data API:
                      data-loop="true/false" enable/disable looping
                      data-autoplay="true/false" enable/disable carousel autoplay
                      data-interval="3000" autoplay interval timeout in miliseconds
                      Simply add necessary data attribute to the ".phone-carousel" with appropriate value to adjust carousel functionality.
                     -->
                    <div class="phone-carousel light-controls" data-loop="true" data-autoplay="true" data-interval="4000">
                        <div class="phone">
                            <div class="inner">
                                <img src=""""),_display_(/*147.44*/routes/*147.50*/.Assets.versioned("img/home/intro/screen03.jpg")),format.raw/*147.98*/("""" alt="Screen 1">
                                <img src=""""),_display_(/*148.44*/routes/*148.50*/.Assets.versioned("img/home/intro/screen01.jpg")),format.raw/*148.98*/("""" alt="Screen 2">
                                <img src=""""),_display_(/*149.44*/routes/*149.50*/.Assets.versioned("img/home/intro/screen02.jpg")),format.raw/*149.98*/("""" alt="Screen 3">
                            </div>
                        </div><!-- .phone -->
                    </div><!-- .phone-carousel -->
                </div><!-- .col-lg-6 -->
            </div><!-- .row -->
        </div><!-- .container -->
        <span class="inner-shadow"></span>
    </section><!-- .intro-section -->

    <section class="fw-section padding-top-3x padding-bottom-3x">
        <div class="container">
            <div class="row">
                <div class="col-sm-4">
                    <img src=""""),_display_(/*163.32*/routes/*163.38*/.Assets.versioned("img/img.png")),format.raw/*163.70*/("""" class="img-rounded block-cente" alt="Square">
                </div>
                <div class="col-sm-4">
                    <img src=""""),_display_(/*166.32*/routes/*166.38*/.Assets.versioned("img/img.png")),format.raw/*166.70*/("""" class="img-rounded block-cente" alt="Square">
                </div>
                <div class="col-sm-4">
                    <img src=""""),_display_(/*169.32*/routes/*169.38*/.Assets.versioned("img/img.png")),format.raw/*169.70*/("""" class="img-rounded block-cente" alt="Square">
                </div>
            </div>
        </div>
    </section>

    <!-- Split Section (Gallery) -->
    <section class="split-section split-gallery">
        <div class="tab-content">
            <div class="tab-pane transition fade scaledown in active" id="img1" style="background-image: url("""),_display_(/*178.111*/routes/*178.117*/.Assets.versioned("img/home/gallery/01.jpg")),format.raw/*178.161*/(""")"></div>
            <div class="tab-pane transition fade scaledown" id="img2" style="background-image: url("""),_display_(/*179.101*/routes/*179.107*/.Assets.versioned("img/home/gallery/02.jpg")),format.raw/*179.151*/(""")"></div>
            <div class="tab-pane transition fade scaledown" id="img3" style="background-image: url("""),_display_(/*180.101*/routes/*180.107*/.Assets.versioned("img/home/gallery/03.jpg")),format.raw/*180.151*/(""")"></div>
        </div><!-- .tab-content -->
        <div class="content">

            <!-- Filters Bar -->
            <nav class="filters-bar space-bottom-2x">
                <div class="column">
                    <div class="custom-controls">
                        <a href="#" class="prev-btn"><i class="pe-7s-angle-left"></i></a>
                        <ul class="bullets">
                            <li class="active"><a href="#img1" data-toggle="tab"></a></li>
                            <li><a href="#img2" data-toggle="tab"></a></li>
                            <li><a href="#img3" data-toggle="tab"></a></li>
                        </ul><!-- .nav-tabs -->
                        <a href="#" class="next-btn"><i class="pe-7s-angle-right"></i></a>
                    </div>
                </div><!-- .column -->
            </nav><!-- .filters-bar -->
            <h3>Un titre ici</h3>
            <p>Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur.</p>

            <ul class="counters">
                <li>
                    <i class="pe-7s-check"></i>
                    <h4>Environnement</h4>
                </li>
                <li>
                    <i class="pe-7s-check"></i>
                    <h4>Energie</h4>
                </li>
                <li>
                    <i class="pe-7s-check"></i>
                    <h4>IT</h4>
                </li>
            </ul><!-- .counters -->
        </div><!-- .content -->
    </section><!-- .split-section -->

    <!-- Scroll To Top Button -->
    <a href="#" class="scroll-to-top-btn">
        <i class="icon-arrow-up"></i>
    </a><!-- .scroll-to-top-btn -->

    <section>
        <div class="container">
            <div class="row">
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*228.36*/routes/*228.42*/.Assets.versioned("img/clients/01.png")),format.raw/*228.81*/("""" alt="Client1">
                    </a><!-- .client -->
                </div><!-- .col-md-2.col-sm-4 -->
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*233.36*/routes/*233.42*/.Assets.versioned("img/clients/02.png")),format.raw/*233.81*/("""" alt="Client2">
                    </a><!-- .client -->
                </div><!-- .col-md-2.col-sm-4 -->
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*238.36*/routes/*238.42*/.Assets.versioned("img/clients/03.png")),format.raw/*238.81*/("""" alt="Client3">
                    </a><!-- .client -->
                </div><!-- .col-md-2.col-sm-4 -->
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*243.36*/routes/*243.42*/.Assets.versioned("img/clients/04.png")),format.raw/*243.81*/("""" alt="Client4">
                    </a><!-- .client -->
                </div><!-- .col-md-2.col-sm-4 -->
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*248.36*/routes/*248.42*/.Assets.versioned("img/clients/05.png")),format.raw/*248.81*/("""" alt="Client5">
                    </a><!-- .client -->
                </div><!-- .col-md-2.col-sm-4 -->
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*253.36*/routes/*253.42*/.Assets.versioned("img/clients/06.png")),format.raw/*253.81*/("""" alt="Client6">
                    </a><!-- .client -->
                </div><!-- .col-md-2.col-sm-4 -->
            </div><!-- .row -->
        </div>
    </section>

    <!-- Footer -->
    <!-- Use modifier class ".footer-dark" to switch to dark skin. -->
    <footer class="footer footer-dark space-bottom-3x">
        <div class="container">
            <form class="row subscription">
                <div class="col-sm-9">
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="form-control">
                                <i class="pe-7s-user"></i>
                                <input type="text" placeholder="Nom">
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="form-control">
                                <i class="pe-7s-mail"></i>
                                <input type="email" placeholder="Email">
                            </div>
                        </div>
                    </div>
                </div><!-- .col-sm-9 -->
                <div class="col-sm-3">
                    <button type="submit" class="btn btn-ghost  btn-info btn-block">Newsletter</button>
                </div><!-- .col-sm-3 -->
                <div class="col-sm-12">
                    <span class="text-muted">* Restez informé sur l'actualité.</span>
                </div><!-- .col-sm-12 -->
            </form><!-- .row.subscription -->


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
    </footer><!-- .footer -->
</div><!-- .page-wrapper -->

<!-- JavaScript (jQuery) libraries, plugins and custom scripts -->
<script src=""""),_display_(/*318.15*/routes/*318.21*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*318.71*/(""""></script>
<script src=""""),_display_(/*319.15*/routes/*319.21*/.Assets.versioned("js/vendor/bootstrap.min.js")),format.raw/*319.68*/(""""></script>
<script src=""""),_display_(/*320.15*/routes/*320.21*/.Assets.versioned("js/vendor/placeholder.js")),format.raw/*320.66*/(""""></script>
<script src=""""),_display_(/*321.15*/routes/*321.21*/.Assets.versioned("js/vendor/smoothscroll.js")),format.raw/*321.67*/(""""></script>
<script src=""""),_display_(/*322.15*/routes/*322.21*/.Assets.versioned("js/vendor/jquery.stellar.min.js")),format.raw/*322.73*/(""""></script>
<script src=""""),_display_(/*323.15*/routes/*323.21*/.Assets.versioned("js/vendor/velocity.min.js")),format.raw/*323.67*/(""""></script>
<script src=""""),_display_(/*324.15*/routes/*324.21*/.Assets.versioned("js/vendor/magnific-popup.min.js")),format.raw/*324.73*/(""""></script>
<script src=""""),_display_(/*325.15*/routes/*325.21*/.Assets.versioned("js/vendor/owl.carousel.min.js")),format.raw/*325.71*/(""""></script>
<script src=""""),_display_(/*326.15*/routes/*326.21*/.Assets.versioned("js/scripts.js")),format.raw/*326.55*/(""""></script>

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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Mar 01 21:00:40 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/index.scala.html
                  HASH: 10424b748a93a0ffd854b1c878a46fc1520f843d
                  MATRIX: 827->0|1425->571|1440->577|1493->609|1572->661|1587->667|1640->699|1810->842|1825->848|1885->887|1965->940|1980->946|2042->987|2159->1077|2174->1083|2245->1133|2341->1202|2356->1208|2419->1250|3453->2257|3468->2263|3522->2296|6832->5578|6848->5584|6913->5626|9003->7688|9019->7694|9089->7742|9179->7804|9195->7810|9265->7858|9355->7920|9371->7926|9441->7974|10020->8525|10036->8531|10090->8563|10262->8707|10278->8713|10332->8745|10504->8889|10520->8895|10574->8927|10964->9288|10981->9294|11048->9338|11188->9449|11205->9455|11272->9499|11412->9610|11429->9616|11496->9660|13935->12071|13951->12077|14012->12116|14349->12425|14365->12431|14426->12470|14763->12779|14779->12785|14840->12824|15177->13133|15193->13139|15254->13178|15591->13487|15607->13493|15668->13532|16005->13841|16021->13847|16082->13886|19218->16994|19234->17000|19306->17050|19361->17077|19377->17083|19446->17130|19501->17157|19517->17163|19584->17208|19639->17235|19655->17241|19723->17287|19778->17314|19794->17320|19868->17372|19923->17399|19939->17405|20007->17451|20062->17478|20078->17484|20152->17536|20207->17563|20223->17569|20295->17619|20350->17646|20366->17652|20422->17686
                  LINES: 32->1|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|59->28|59->28|59->28|78->47|78->47|78->47|145->114|145->114|145->114|178->147|178->147|178->147|179->148|179->148|179->148|180->149|180->149|180->149|194->163|194->163|194->163|197->166|197->166|197->166|200->169|200->169|200->169|209->178|209->178|209->178|210->179|210->179|210->179|211->180|211->180|211->180|259->228|259->228|259->228|264->233|264->233|264->233|269->238|269->238|269->238|274->243|274->243|274->243|279->248|279->248|279->248|284->253|284->253|284->253|349->318|349->318|349->318|350->319|350->319|350->319|351->320|351->320|351->320|352->321|352->321|352->321|353->322|353->322|353->322|354->323|354->323|354->323|355->324|355->324|355->324|356->325|356->325|356->325|357->326|357->326|357->326
                  -- GENERATED --
              */
          