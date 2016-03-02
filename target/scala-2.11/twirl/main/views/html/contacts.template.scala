
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contacts_Scope0 {
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

class contacts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <title>CIPMEN | Contacts</title>

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
    <div class="page-title pt-dark" style="background-image: url("""),_display_(/*115.67*/routes/*115.73*/.Assets.versioned("img/page-title/contacts.jpg")),format.raw/*115.121*/(""");" data-stellar-background-ratio="0.65">
      <span class="overlay" style="opacity: .8;"></span>
      <div class="container">
        <div class="inner">
          <div class="title">
            <h1>Contacts</h1>
          </div><!-- .title -->
          <div class="breadcrumbs">
            <a href="/">Accueil</a>
            <span>Contact</span>
          </div><!-- .breadcrumbs -->
        </div><!-- .inner -->
      </div><!-- .container -->
    </div><!-- .page-title -->

    <!-- Map / Contact Form section -->
    <!-- Use modifier class "contacts-reverse" to change position of the map/form. Please note you also need to change markup position as well. -->
    <section class="contacts-split space-top-3x">
      <div class="column">

        <!-- Data API: 
             data-height="500" height of the map in pixels
             data-address="Your address" string
             data-zoom="number" to control map zoom when loaded
             data-disable-controls="false/true" enable/disable map controls like pan, zoom, etc.
             data-scrollwheel="true/false" enable/disable mouse scroll wheel zoom
             data-marker="path_to_your_image" path to custom marker image
             data-marker-title=" Your title" appears on marker hover
             data-styles="[array]" you can adjust the look and feel of your map. Recommend to use https://snazzymaps.com
         -->
        <div class="google-map"
             data-height="450"
             data-address="Niamey"
             data-zoom="6"
             data-disable-controls="false"
             data-scrollwheel="false"
             data-marker=""""),_display_(/*151.28*/routes/*151.34*/.Assets.versioned("img/map-marker.png")),format.raw/*151.73*/(""""
             data-marker-title="Cipmen Niamey"
             data-styles='["""),format.raw/*153.28*/("""{"""),format.raw/*153.29*/(""""featureType":"road","elementType":"geometry","stylers":["""),format.raw/*153.86*/("""{"""),format.raw/*153.87*/(""""lightness":100"""),format.raw/*153.102*/("""}"""),format.raw/*153.103*/(""","""),format.raw/*153.104*/("""{"""),format.raw/*153.105*/(""""visibility":"simplified""""),format.raw/*153.130*/("""}"""),format.raw/*153.131*/("""]"""),format.raw/*153.132*/("""}"""),format.raw/*153.133*/(""","""),format.raw/*153.134*/("""{"""),format.raw/*153.135*/(""""featureType":"water","elementType":"geometry","stylers":["""),format.raw/*153.193*/("""{"""),format.raw/*153.194*/(""""visibility":"on""""),format.raw/*153.211*/("""}"""),format.raw/*153.212*/(""","""),format.raw/*153.213*/("""{"""),format.raw/*153.214*/(""""color":"#C6E2FF""""),format.raw/*153.231*/("""}"""),format.raw/*153.232*/("""]"""),format.raw/*153.233*/("""}"""),format.raw/*153.234*/(""","""),format.raw/*153.235*/("""{"""),format.raw/*153.236*/(""""featureType":"poi","elementType":"geometry.fill","stylers":["""),format.raw/*153.297*/("""{"""),format.raw/*153.298*/(""""color":"#C5E3BF""""),format.raw/*153.315*/("""}"""),format.raw/*153.316*/("""]"""),format.raw/*153.317*/("""}"""),format.raw/*153.318*/(""","""),format.raw/*153.319*/("""{"""),format.raw/*153.320*/(""""featureType":"road","elementType":"geometry.fill","stylers":["""),format.raw/*153.382*/("""{"""),format.raw/*153.383*/(""""color":"#D1D1B8""""),format.raw/*153.400*/("""}"""),format.raw/*153.401*/("""]"""),format.raw/*153.402*/("""}"""),format.raw/*153.403*/("""]'
        ></div><!-- .google-map -->
      </div><!-- .column -->
      <div class="column">
        <form method="post" class="contact-form ajax-form" autocomplete="off">
          <h4>Pour plus d'information, veuillez nous écrire</h4>
          <p class="text-muted">Cipmen, quartier yantala, plateau</p>
          <div class="row">
            <div class="col-sm-6">
              <div class="form-control">
                <i class="pe-7s-user"></i>
                <input type="text" name="name" placeholder="Nom">
              </div><!-- .form-control -->
            </div><!-- .col-sm-6 -->
            <div class="col-sm-6">
              <div class="form-control">
                <i class="pe-7s-mail"></i>
                <input type="email" name="email" placeholder="Email">
              </div><!-- .form-control -->
            </div><!-- .col-sm-6 -->
          </div><!-- .row -->
          <div class="form-control">
            <i class="pe-7s-comment"></i>
            <textarea rows="3" name="message" placeholder="Message"></textarea>
          </div><!-- .form-control -->
          <div class="row">
            <div class="col-sm-6 padding-top">
              <label class="checkbox">
                <input type="checkbox"> S'inscrire à la newsletter
              </label>
            </div><!-- .col-sm-6 -->
            <div class="col-sm-6 text-right">
              <button type="submit" class="btn btn-ghost btn-primary">Envoyer le message</button>
            </div><!-- .col-sm-6 -->
          </div><!-- .row -->
          <!-- Validation Response -->
          <div class="response-holder"></div>
        </form><!-- .contact-form -->
      </div><!-- .column -->
    </section><!-- .contacts-split -->

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
      </footer><!-- .footer -->  </div><!-- .page-wrapper -->
  
  <!-- JavaScript (jQuery) libraries, plugins and custom scripts -->
  <script src=""""),_display_(/*230.17*/routes/*230.23*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*230.73*/(""""></script>
  <script src=""""),_display_(/*231.17*/routes/*231.23*/.Assets.versioned("js/vendor/bootstrap.min.js")),format.raw/*231.70*/(""""></script>
  <script src=""""),_display_(/*232.17*/routes/*232.23*/.Assets.versioned("js/vendor/placeholder.js")),format.raw/*232.68*/(""""></script>
  <script src=""""),_display_(/*233.17*/routes/*233.23*/.Assets.versioned("js/vendor/smoothscroll.js")),format.raw/*233.69*/(""""></script>
  <script src=""""),_display_(/*234.17*/routes/*234.23*/.Assets.versioned("js/vendor/jquery.stellar.min.js")),format.raw/*234.75*/(""""></script>
  <script src=""""),_display_(/*235.17*/routes/*235.23*/.Assets.versioned("js/vendor/velocity.min.js")),format.raw/*235.69*/(""""></script>
  <script src=""""),_display_(/*236.17*/routes/*236.23*/.Assets.versioned("js/vendor/magnific-popup.min.js")),format.raw/*236.75*/(""""></script>
  <script src=""""),_display_(/*237.17*/routes/*237.23*/.Assets.versioned("js/vendor/owl.carousel.min.js")),format.raw/*237.73*/(""""></script>
  <script src=""""),_display_(/*238.17*/routes/*238.23*/.Assets.versioned("js/scripts.js")),format.raw/*238.57*/(""""></script>

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
object contacts extends contacts_Scope0.contacts
              /*
                  -- GENERATED --
                  DATE: Tue Mar 01 20:45:36 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/contacts.scala.html
                  HASH: 6501101eb66b029bf2b127b7f5ed9971635d59ad
                  MATRIX: 833->0|1491->631|1506->637|1559->669|1642->725|1657->731|1710->763|1892->918|1907->924|1967->963|2051->1020|2066->1026|2128->1067|2257->1169|2272->1175|2343->1225|2451->1306|2466->1312|2529->1354|3691->2489|3706->2495|3760->2528|7669->6409|7685->6415|7756->6463|9456->8135|9472->8141|9533->8180|9640->8258|9670->8259|9756->8316|9786->8317|9831->8332|9862->8333|9893->8334|9924->8335|9979->8360|10010->8361|10041->8362|10072->8363|10103->8364|10134->8365|10222->8423|10253->8424|10300->8441|10331->8442|10362->8443|10393->8444|10440->8461|10471->8462|10502->8463|10533->8464|10564->8465|10595->8466|10686->8527|10717->8528|10764->8545|10795->8546|10826->8547|10857->8548|10888->8549|10919->8550|11011->8612|11042->8613|11089->8630|11120->8631|11151->8632|11182->8633|14913->12336|14929->12342|15001->12392|15058->12421|15074->12427|15143->12474|15200->12503|15216->12509|15283->12554|15340->12583|15356->12589|15424->12635|15481->12664|15497->12670|15571->12722|15628->12751|15644->12757|15712->12803|15769->12832|15785->12838|15859->12890|15916->12919|15932->12925|16004->12975|16061->13004|16077->13010|16133->13044
                  LINES: 32->1|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|59->28|59->28|59->28|78->47|78->47|78->47|146->115|146->115|146->115|182->151|182->151|182->151|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|261->230|261->230|261->230|262->231|262->231|262->231|263->232|263->232|263->232|264->233|264->233|264->233|265->234|265->234|265->234|266->235|266->235|266->235|267->236|267->236|267->236|268->237|268->237|268->237|269->238|269->238|269->238
                  -- GENERATED --
              */
          