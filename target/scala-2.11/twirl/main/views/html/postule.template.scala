
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object postule_Scope0 {
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

class postule extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <meta name="description" content="CIPMEN - je postule" />
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
                    <h1>Je postule</h1>
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
                <nav class="side-nav">
                    <ul role="tablist">
                        <li class="active"><a href="#energie" role="tab" data-toggle="tab">Énergie</a></li>
                        <li><a href="#environnement" role="tab" data-toggle="tab">Environnement</a></li>
                        <li><a href="#tic" role="tab" data-toggle="tab">TIC</a></li>
                    </ul>
                </nav><!-- .side-nav -->
            </div><!-- .col-md-3.col-sm-4 -->

            <!-- Content -->
            <div class="col-md-9 col-sm-8">
                <div class="tab-content transparent space-bottom-2x">
                    <div role="tabpanel" class="tab-pane transition fade scale in active" id="energie">
                        <h5 class="text-uppercase text-gray text-thin space-bottom">Energie renouvelables</h5>
                            <div class="form-control">
                                <i class="pe-7s-user"></i>
                                <input type="text" placeholder="Name">
                            </div>
                            <div class="form-control">
                                <i class="pe-7s-mail"></i>
                                <input type="email" class="valid" placeholder="Valid field">
                            </div>
                            <div class="form-control">
                                <i class="pe-7s-call"></i>
                                <input type="text" class="error" placeholder="Error field">
                            </div>
                            <div class="form-control">
                                <i class="pe-7s-comment"></i>
                                <textarea rows="3" placeholder="Textarea"></textarea>
                            </div>
                        <div class="form-group">
                            <label class="checkbox">
                                <input type="checkbox"> Checkbox
                            </label>
                            <label class="checkbox">
                                <input type="checkbox" checked> Checkbox
                            </label>
                        </div>
                        <div class="form-group">
                            <label class="radio">
                                <input type="radio" name="rad_demo_1"> Radio
                            </label>
                            <label class="radio">
                                <input type="radio" name="rad_demo_1" checked> Radio
                            </label>
                            <label class="radio">
                                <input type="radio" name="rad_demo_1"> Radio
                            </label>
                            <label class="radio">
                                <input type="radio" name="rad_demo_1" checked> Radio
                            </label>
                        </div>
                        <div class="form-group">
                            <label class="checkbox checkbox-inline">
                                <input type="checkbox"> Checkbox
                            </label>
                            <label class="checkbox checkbox-inline">
                                <input type="checkbox" checked> Checkbox
                            </label>
                            <label class="checkbox checkbox-inline">
                                <input type="checkbox"> Checkbox
                            </label>
                            <label class="checkbox checkbox-inline">
                                <input type="checkbox" checked> Checkbox
                            </label>
                        </div>
                        <div class="form-group">
                            <label class="radio radio-inline">
                                <input type="radio" name="rad_demo_2"> Radio
                            </label>
                            <label class="radio radio-inline">
                                <input type="radio" name="rad_demo_2" checked> Radio
                            </label>
                            <label class="radio radio-inline">
                                <input type="radio" name="rad_demo_2"> Radio
                            </label>
                            <label class="radio radio-inline">
                                <input type="radio" name="rad_demo_2" checked> Radio
                            </label>
                        </div>
                    </div><!-- .tab-panel -->
                    <div role="tabpanel" class="tab-pane transition fade scale" id="environnement">
                        <h5 class="text-uppercase text-gray text-thin space-bottom">Environnement</h5>
                        <div class="form-control">
                            <i class="pe-7s-user"></i>
                            <input type="text" placeholder="Name">
                        </div>
                        <div class="form-control">
                            <i class="pe-7s-mail"></i>
                            <input type="email" class="valid" placeholder="Valid field">
                        </div>
                        <div class="form-control">
                            <i class="pe-7s-call"></i>
                            <input type="text" class="error" placeholder="Error field">
                        </div>
                        <div class="form-control">
                            <i class="pe-7s-comment"></i>
                            <textarea rows="3" placeholder="Textarea"></textarea>
                        </div>
                        <div class="form-group">
                            <label class="checkbox">
                                <input type="checkbox"> Checkbox
                            </label>
                            <label class="checkbox">
                                <input type="checkbox" checked> Checkbox
                            </label>
                        </div>
                        <div class="form-group">
                            <label class="radio">
                                <input type="radio" name="rad_demo_1"> Radio
                            </label>
                            <label class="radio">
                                <input type="radio" name="rad_demo_1" checked> Radio
                            </label>
                            <label class="radio">
                                <input type="radio" name="rad_demo_1"> Radio
                            </label>
                            <label class="radio">
                                <input type="radio" name="rad_demo_1" checked> Radio
                            </label>
                        </div>
                        <div class="form-group">
                            <label class="checkbox checkbox-inline">
                                <input type="checkbox"> Checkbox
                            </label>
                            <label class="checkbox checkbox-inline">
                                <input type="checkbox" checked> Checkbox
                            </label>
                            <label class="checkbox checkbox-inline">
                                <input type="checkbox"> Checkbox
                            </label>
                            <label class="checkbox checkbox-inline">
                                <input type="checkbox" checked> Checkbox
                            </label>
                        </div>
                        <div class="form-group">
                            <label class="radio radio-inline">
                                <input type="radio" name="rad_demo_2"> Radio
                            </label>
                            <label class="radio radio-inline">
                                <input type="radio" name="rad_demo_2" checked> Radio
                            </label>
                            <label class="radio radio-inline">
                                <input type="radio" name="rad_demo_2"> Radio
                            </label>
                            <label class="radio radio-inline">
                                <input type="radio" name="rad_demo_2" checked> Radio
                            </label>
                        </div>
                    </div><!-- .tab-panel -->
                    <div role="tabpanel" class="tab-pane transition fade scale" id="tic">
                        <h5 class="text-uppercase text-gray text-thin space-bottom">TIC</h5>
                        <div class="form-control">
                            <i class="pe-7s-user"></i>
                            <input type="text" placeholder="Name">
                        </div>
                        <div class="form-control">
                            <i class="pe-7s-mail"></i>
                            <input type="email" class="valid" placeholder="Valid field">
                        </div>
                        <div class="form-control">
                            <i class="pe-7s-call"></i>
                            <input type="text" class="error" placeholder="Error field">
                        </div>
                        <div class="form-control">
                            <i class="pe-7s-comment"></i>
                            <textarea rows="3" placeholder="Textarea"></textarea>
                        </div>
                        <div class="form-group">
                            <label class="checkbox">
                                <input type="checkbox"> Checkbox
                            </label>
                            <label class="checkbox">
                                <input type="checkbox" checked> Checkbox
                            </label>
                        </div>
                        <div class="form-group">
                            <label class="radio">
                                <input type="radio" name="rad_demo_1"> Radio
                            </label>
                            <label class="radio">
                                <input type="radio" name="rad_demo_1" checked> Radio
                            </label>
                            <label class="radio">
                                <input type="radio" name="rad_demo_1"> Radio
                            </label>
                            <label class="radio">
                                <input type="radio" name="rad_demo_1" checked> Radio
                            </label>
                        </div>
                        <div class="form-group">
                            <label class="checkbox checkbox-inline">
                                <input type="checkbox"> Checkbox
                            </label>
                            <label class="checkbox checkbox-inline">
                                <input type="checkbox" checked> Checkbox
                            </label>
                            <label class="checkbox checkbox-inline">
                                <input type="checkbox"> Checkbox
                            </label>
                            <label class="checkbox checkbox-inline">
                                <input type="checkbox" checked> Checkbox
                            </label>
                        </div>
                        <div class="form-group">
                            <label class="radio radio-inline">
                                <input type="radio" name="rad_demo_2"> Radio
                            </label>
                            <label class="radio radio-inline">
                                <input type="radio" name="rad_demo_2" checked> Radio
                            </label>
                            <label class="radio radio-inline">
                                <input type="radio" name="rad_demo_2"> Radio
                            </label>
                            <label class="radio radio-inline">
                                <input type="radio" name="rad_demo_2" checked> Radio
                            </label>
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
<script src=""""),_display_(/*396.15*/routes/*396.21*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*396.71*/(""""></script>
<script src=""""),_display_(/*397.15*/routes/*397.21*/.Assets.versioned("js/vendor/bootstrap.min.js")),format.raw/*397.68*/(""""></script>
<script src=""""),_display_(/*398.15*/routes/*398.21*/.Assets.versioned("js/vendor/placeholder.js")),format.raw/*398.66*/(""""></script>
<script src=""""),_display_(/*399.15*/routes/*399.21*/.Assets.versioned("js/vendor/smoothscroll.js")),format.raw/*399.67*/(""""></script>
<script src=""""),_display_(/*400.15*/routes/*400.21*/.Assets.versioned("js/vendor/jquery.stellar.min.js")),format.raw/*400.73*/(""""></script>
<script src=""""),_display_(/*401.15*/routes/*401.21*/.Assets.versioned("js/vendor/velocity.min.js")),format.raw/*401.67*/(""""></script>
<script src=""""),_display_(/*402.15*/routes/*402.21*/.Assets.versioned("js/vendor/magnific-popup.min.js")),format.raw/*402.73*/(""""></script>
<script src=""""),_display_(/*403.15*/routes/*403.21*/.Assets.versioned("js/vendor/owl.carousel.min.js")),format.raw/*403.71*/(""""></script>
<script src=""""),_display_(/*404.15*/routes/*404.21*/.Assets.versioned("js/scripts.js")),format.raw/*404.55*/(""""></script>

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
object postule extends postule_Scope0.postule
              /*
                  -- GENERATED --
                  DATE: Tue Mar 01 20:44:37 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/postule.scala.html
                  HASH: 02aaab1839f19a6edccfdf0219f167943398d7ca
                  MATRIX: 831->0|1475->617|1490->623|1543->655|1625->710|1640->716|1693->748|1872->900|1887->906|1947->945|2030->1001|2045->1007|2107->1048|2233->1147|2248->1153|2319->1203|2424->1281|2439->1287|2502->1329|3645->2445|3660->2451|3714->2484|7555->6297|7571->6303|7638->6347|22693->21374|22709->21380|22781->21430|22835->21456|22851->21462|22920->21509|22974->21535|22990->21541|23057->21586|23111->21612|23127->21618|23195->21664|23249->21690|23265->21696|23339->21748|23393->21774|23409->21780|23477->21826|23531->21852|23547->21858|23621->21910|23675->21936|23691->21942|23763->21992|23817->22018|23833->22024|23889->22058
                  LINES: 32->1|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|59->28|59->28|59->28|78->47|78->47|78->47|146->115|146->115|146->115|427->396|427->396|427->396|428->397|428->397|428->397|429->398|429->398|429->398|430->399|430->399|430->399|431->400|431->400|431->400|432->401|432->401|432->401|433->402|433->402|433->402|434->403|434->403|434->403|435->404|435->404|435->404
                  -- GENERATED --
              */
          