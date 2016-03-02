
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object incubateur_Scope0 {
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

class incubateur extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <meta name="description" content="CIPMEN - Incubateur" />
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

    <!-- Intro Section -->
    <section class="intro-section padding-bottom-2x" style="background-image: url("""),_display_(/*114.84*/routes/*114.90*/.Assets.versioned("img/home/intro/2.jpg")),format.raw/*114.131*/(""");" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity: .85;"></span>
        <div class="container">
            <div class="row">
                <div class="col-lg-5 col-lg-offset-1 col-md-6 col-sm-6 padding-bottom-3x mobile-center">
                    <h2 class="text-light">Hack'4 dev</h2>
                    <div class="video-popup-placeholder">
                        <img src=""""),_display_(/*121.36*/routes/*121.42*/.Assets.versioned("img/home/intro/1.jpg")),format.raw/*121.83*/("""" alt="Video">
                        <a href="https://vimeo.com/33984473" class="play-btn"></a>
                    </div><!-- .video-popup-placeholder -->
                    <p class="text-light opacity-50 hidden-xs">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
                    <div class="mobile-center">
                    </div>
                </div><!-- .col-lg-5. col-lg-offset-1 -->

                <!-- Features -->
                <div class="col-lg-5 col-lg-offset-1 col-md-6 col-sm-6">
                    <div class="box-with-icon horizontal-box light-skin">
                        <div class="box-with-icon-icon">
                            <i class="pe-7s-cloud-upload"></i>
                        </div>
                        <div class="box-with-icon-content">
                            <h3 class="box-with-icon-title">Accompagnement business</h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</p>
                        </div>
                    </div><!-- .box-with-icon.horizontal-box.light-skin -->
                    <div class="box-with-icon horizontal-box light-skin">
                        <div class="box-with-icon-icon">
                            <i class="pe-7s-micro"></i>
                        </div>
                        <div class="box-with-icon-content">
                            <h3 class="box-with-icon-title">Développement international</h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</p>
                        </div>
                    </div><!-- .box-with-icon.horizontal-box.light-skin -->
                    <div class="box-with-icon horizontal-box light-skin">
                        <div class="box-with-icon-icon">
                            <i class="pe-7s-config"></i>
                        </div>
                        <div class="box-with-icon-content">
                            <h3 class="box-with-icon-title">Evénements</h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</p>
                        </div>
                    </div><!-- .box-with-icon.horizontal-box.light-skin -->
                    <div class="box-with-icon horizontal-box light-skin">
                        <div class="box-with-icon-icon">
                            <i class="pe-7s-comment"></i>
                        </div>
                        <div class="box-with-icon-content">
                            <h3 class="box-with-icon-title">Chat In Your App</h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</p>
                        </div>
                    </div><!-- .box-with-icon.horizontal-box.light-skin -->
                </div><!-- .col-lg-5. col-lg-offset-1 -->
            </div><!-- .row -->
        </div><!-- .container -->
    </section><!-- .intro-section -->

    <!-- Features -->
    <section class="fw-section bg-white border-top padding-top-3x padding-bottom-3x">
        <div class="container">
            <h2 class="block-title text-center">Nos offres
                <small>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium</small>
            </h2>
            <div class="row">
                <div class="col-sm-4">
                    <!-- Use ".light-skin" class to alter appearance. -->
                    <div class="box-with-icon text-center">
                        <div class="box-with-icon-icon">
                            <i class="pe-7s-cloud-upload"></i>
                        </div>
                        <h3 class="box-with-icon-title">Accompagnement business</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</p>
                    </div><!-- .box-with-icon -->
                </div><!-- .col-sm-4 -->
                <div class="col-sm-4">
                    <!-- Use ".light-skin" class to alter appearance. -->
                    <div class="box-with-icon text-center">
                        <div class="box-with-icon-icon">
                            <i class="pe-7s-micro"></i>
                        </div>
                        <h3 class="box-with-icon-title">Développement international</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</p>
                    </div><!-- .box-with-icon -->
                </div><!-- .col-sm-4 -->
                <div class="col-sm-4">
                    <!-- Use ".light-skin" class to alter appearance. -->
                    <div class="box-with-icon text-center">
                        <div class="box-with-icon-icon">
                            <i class="pe-7s-config"></i>
                        </div>
                        <h3 class="box-with-icon-title">Financement</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</p>
                    </div><!-- .box-with-icon -->
                </div><!-- .col-sm-4 -->
            </div><!-- .row -->
            <div class="row">
                <div class="col-sm-4">
                    <!-- Use ".light-skin" class to alter appearance. -->
                    <div class="box-with-icon text-center">
                        <div class="box-with-icon-icon">
                            <i class="pe-7s-credit"></i>
                        </div>
                        <h3 class="box-with-icon-title">Evénements</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</p>
                    </div><!-- .box-with-icon -->
                </div><!-- .col-sm-4 -->
                <div class="col-sm-4">
                    <!-- Use ".light-skin" class to alter appearance. -->
                    <div class="box-with-icon text-center">
                        <div class="box-with-icon-icon">
                            <i class="pe-7s-comment"></i>
                        </div>
                        <h3 class="box-with-icon-title">Hébergement</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</p>
                    </div><!-- .box-with-icon -->
                </div><!-- .col-sm-4 -->
                <div class="col-sm-4">
                    <!-- Use ".light-skin" class to alter appearance. -->
                    <div class="box-with-icon text-center">
                        <div class="box-with-icon-icon">
                            <i class="pe-7s-date"></i>
                        </div>
                        <h3 class="box-with-icon-title">Coatching</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</p>
                    </div><!-- .box-with-icon -->
                </div><!-- .col-sm-4 -->
            </div><!-- .row -->
        </div><!-- .container -->
    </section>

    <!-- Video Popup -->
    <section class="fw-section parallax text-center padding-top-3x padding-bottom-3x" style="background-image: url("""),_display_(/*246.117*/routes/*246.123*/.Assets.versioned("img/home/video-bg.jpg")),format.raw/*246.165*/(""");" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity: .78;"></span>
        <div class="container padding-top-3x padding-bottom-3x">
            <!-- Remove ".light-skin" class to alter appearance. -->
            <a href="https://vimeo.com/33984473" class="video-popup-btn light-skin space-top-3x space-bottom">
                <i class="pe-7s-film"></i>
            </a>
            <p class="text-lg text-light space-bottom-2x">Vidéo de présentation</p>
        </div><!-- .container -->
    </section><!-- .fw-section -->

    <!-- Testimonials Carousel -->
    <!-- Data API:
      data-loop="true/false" enable/disable looping
      data-autoplay="true/false" enable/disable carousel autoplay
      data-interval="3000" autoplay interval timeout in miliseconds 
      Simply add necessary data attribute to the ".testimonials-carousel" with appropriate value to adjust carousel functionality.
     -->
    <section class="container padding-top-3x padding-bottom-3x">
        <h2 class="block-title text-center">Témoignages</h2>
        <div class="testimonials-carousel" data-loop="true">
            <div class="inner">
                <div class="testimonial">
                    <div class="testimonial-author-ava">
                        <img src=""""),_display_(/*270.36*/routes/*270.42*/.Assets.versioned("img/testimonials/01.jpg")),format.raw/*270.86*/("""" alt="Jessie Pinkman">
                    </div>
                    <h3 class="testimonial-author-name">Bob marley</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore.</p>
                    <img src=""""),_display_(/*274.32*/routes/*274.38*/.Assets.versioned("img/testimonials/logo01.png")),format.raw/*274.86*/("""" alt="MailChimp">
                </div><!-- .testimonial -->
                <div class="testimonial">
                    <div class="testimonial-author-ava">
                        <img src=""""),_display_(/*278.36*/routes/*278.42*/.Assets.versioned("img/testimonials/02.jpg")),format.raw/*278.86*/("""" alt="Lara Goodwill">
                    </div>
                    <h3 class="testimonial-author-name">Damian Marley</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore.</p>
                    <img src=""""),_display_(/*282.32*/routes/*282.38*/.Assets.versioned("img/testimonials/logo02.png")),format.raw/*282.86*/("""" alt="WordPress">
                </div><!-- .testimonial -->
                <div class="testimonial">
                    <div class="testimonial-author-ava">
                        <img src=""""),_display_(/*286.36*/routes/*286.42*/.Assets.versioned("img/testimonials/03.jpg")),format.raw/*286.86*/("""" alt="Mike Johnson">
                    </div>
                    <h3 class="testimonial-author-name">Michael Jackson</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore.</p>
                    <img src=""""),_display_(/*290.32*/routes/*290.38*/.Assets.versioned("img/testimonials/logo03.png")),format.raw/*290.86*/("""" alt="Bootstrap">
                </div><!-- .testimonial -->
            </div><!-- .inner -->
        </div><!-- .testimonials-carousel -->
    </section><!-- .container.padding-bottom-3x -->


    <!-- Team -->
    <section class="fw-section bg-white padding-top-3x padding-bottom-3x">
        <div class="container">
            <h2 class="block-title text-center">
                Notre équipe
                <small>Jeune et dynamique</small>
            </h2>
            <div class="row">
                <div class="col-sm-4">
                    <!-- Use ".light-skin" class to alter appearance. -->
                    <div class="box-with-image text-center">
                        <div class="box-with-image-image">
                            <img src=""""),_display_(/*309.40*/routes/*309.46*/.Assets.versioned("img/team/01.jpg")),format.raw/*309.82*/("""" alt="Johnathan Doe">
                        </div>
                        <h3 class="box-with-image-title">Moctac
                            <small>CEO</small>
                        </h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.</p>
                        <div class="social-bar text-center">
                            <a href="#" class="sb-facebook" data-toggle="tooltip" data-placement="top" title="Facebook">
                                <i class="fa fa-facebook"></i>
                            </a>
                            <a href="#" class="sb-twitter" data-toggle="tooltip" data-placement="top" title="Twitter">
                                <i class="fa fa-twitter"></i>
                            </a>
                            <a href="#" class="sb-google-plus" data-toggle="tooltip" data-placement="top" title="Google+">
                                <i class="fa fa-google-plus"></i>
                            </a>
                        </div>
                    </div><!-- .box-with-image -->
                </div><!-- .col-sm-4 -->
                <div class="col-sm-4">
                    <!-- Use ".light-skin" class to alter appearance. -->
                    <div class="box-with-image text-center">
                        <div class="box-with-image-image">
                            <img src=""""),_display_(/*332.40*/routes/*332.46*/.Assets.versioned("img/team/02.jpg")),format.raw/*332.82*/("""" alt="Anabelle Dorris">
                        </div>
                        <h3 class="box-with-image-title">Bambino
                            <small>Business developper</small>
                        </h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.</p>
                        <div class="social-bar text-center">
                            <a href="#" class="sb-facebook" data-toggle="tooltip" data-placement="top" title="Facebook">
                                <i class="fa fa-facebook"></i>
                            </a>
                            <a href="#" class="sb-google-plus" data-toggle="tooltip" data-placement="top" title="Google+">
                                <i class="fa fa-google-plus"></i>
                            </a>
                            <a href="#" class="sb-instagram" data-toggle="tooltip" data-placement="top" title="Instagram">
                                <i class="fa fa-instagram"></i>
                            </a>
                        </div>
                    </div><!-- .box-with-image -->
                </div><!-- .col-sm-4 -->
                <div class="col-sm-4">
                    <!-- Use ".light-skin" class to alter appearance. -->
                    <div class="box-with-image text-center">
                        <div class="box-with-image-image">
                            <img src=""""),_display_(/*355.40*/routes/*355.46*/.Assets.versioned("img/team/03.jpg")),format.raw/*355.82*/("""" alt="Taylor White">
                        </div>
                        <h3 class="box-with-image-title">Maliyaro
                            <small>UX / UI Engeneer</small>
                        </h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.</p>
                        <div class="social-bar text-center">
                            <a href="#" class="sb-facebook" data-toggle="tooltip" data-placement="top" title="Facebook">
                                <i class="fa fa-facebook"></i>
                            </a>
                            <a href="#" class="sb-twitter" data-toggle="tooltip" data-placement="top" title="Twitter">
                                <i class="fa fa-twitter"></i>
                            </a>
                            <a href="#" class="sb-google-plus" data-toggle="tooltip" data-placement="top" title="Google+">
                                <i class="fa fa-google-plus"></i>
                            </a>
                        </div>
                    </div><!-- .box-with-image -->
                </div><!-- .col-sm-4 -->
            </div><!-- .row -->

            <div class="row">
                <div class="col-sm-4">
                    <!-- Use ".light-skin" class to alter appearance. -->
                    <div class="box-with-image text-center">
                        <div class="box-with-image-image">
                            <img src=""""),_display_(/*381.40*/routes/*381.46*/.Assets.versioned("img/team/04.jpg")),format.raw/*381.82*/("""" alt="Suasanna Davis">
                        </div>
                        <h3 class="box-with-image-title">Brelote Ba
                            <small>Marketing Director</small>
                        </h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.</p>
                        <div class="social-bar text-center">
                            <a href="#" class="sb-facebook" data-toggle="tooltip" data-placement="top" title="Facebook">
                                <i class="fa fa-facebook"></i>
                            </a>
                            <a href="#" class="sb-google-plus" data-toggle="tooltip" data-placement="top" title="Google+">
                                <i class="fa fa-google-plus"></i>
                            </a>
                            <a href="#" class="sb-instagram" data-toggle="tooltip" data-placement="top" title="Instagram">
                                <i class="fa fa-instagram"></i>
                            </a>
                        </div>
                    </div><!-- .box-with-image -->
                </div><!-- .col-sm-4 -->
                <div class="col-sm-4">
                    <!-- Use ".light-skin" class to alter appearance. -->
                    <div class="box-with-image text-center">
                        <div class="box-with-image-image">
                            <img src=""""),_display_(/*404.40*/routes/*404.46*/.Assets.versioned("img/team/05.jpg")),format.raw/*404.82*/("""" alt="Christopher Walker">
                        </div>
                        <h3 class="box-with-image-title">Housseini
                            <small>Chauffeur</small>
                        </h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.</p>
                        <div class="social-bar text-center">
                            <a href="#" class="sb-facebook" data-toggle="tooltip" data-placement="top" title="Facebook">
                                <i class="fa fa-facebook"></i>
                            </a>
                            <a href="#" class="sb-twitter" data-toggle="tooltip" data-placement="top" title="Twitter">
                                <i class="fa fa-twitter"></i>
                            </a>
                            <a href="#" class="sb-google-plus" data-toggle="tooltip" data-placement="top" title="Google+">
                                <i class="fa fa-google-plus"></i>
                            </a>
                        </div>
                    </div><!-- .box-with-image -->
                </div><!-- .col-sm-4 -->
                <div class="col-sm-4">
                    <!-- Use ".light-skin" class to alter appearance. -->
                    <div class="box-with-image text-center">
                        <div class="box-with-image-image">
                            <img src=""""),_display_(/*427.40*/routes/*427.46*/.Assets.versioned("img/team/06.jpg")),format.raw/*427.82*/("""" alt="Endy Garcia">
                        </div>
                        <h3 class="box-with-image-title">Emilie la joie
                            <small>Java Developer</small>
                        </h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.</p>
                        <div class="social-bar text-center">
                            <a href="#" class="sb-facebook" data-toggle="tooltip" data-placement="top" title="Facebook">
                                <i class="fa fa-facebook"></i>
                            </a>
                            <a href="#" class="sb-google-plus" data-toggle="tooltip" data-placement="top" title="Google+">
                                <i class="fa fa-google-plus"></i>
                            </a>
                            <a href="#" class="sb-instagram" data-toggle="tooltip" data-placement="top" title="Instagram">
                                <i class="fa fa-instagram"></i>
                            </a>
                        </div>
                    </div><!-- .box-with-image -->
                </div><!-- .col-sm-4 -->
            </div><!-- .row -->
        </div><!-- .container -->
    </section><!-- .fw-section.bg-white -->

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
<script src=""""),_display_(/*486.15*/routes/*486.21*/.Assets.versioned("js/vendor/jquery-2.1.4.min.js")),format.raw/*486.71*/(""""></script>
<script src=""""),_display_(/*487.15*/routes/*487.21*/.Assets.versioned("js/vendor/bootstrap.min.js")),format.raw/*487.68*/(""""></script>
<script src=""""),_display_(/*488.15*/routes/*488.21*/.Assets.versioned("js/vendor/placeholder.js")),format.raw/*488.66*/(""""></script>
<script src=""""),_display_(/*489.15*/routes/*489.21*/.Assets.versioned("js/vendor/smoothscroll.js")),format.raw/*489.67*/(""""></script>
<script src=""""),_display_(/*490.15*/routes/*490.21*/.Assets.versioned("js/vendor/jquery.stellar.min.js")),format.raw/*490.73*/(""""></script>
<script src=""""),_display_(/*491.15*/routes/*491.21*/.Assets.versioned("js/vendor/velocity.min.js")),format.raw/*491.67*/(""""></script>
<script src=""""),_display_(/*492.15*/routes/*492.21*/.Assets.versioned("js/vendor/magnific-popup.min.js")),format.raw/*492.73*/(""""></script>
<script src=""""),_display_(/*493.15*/routes/*493.21*/.Assets.versioned("js/vendor/owl.carousel.min.js")),format.raw/*493.71*/(""""></script>
<script src=""""),_display_(/*494.15*/routes/*494.21*/.Assets.versioned("js/scripts.js")),format.raw/*494.55*/(""""></script>

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
object incubateur extends incubateur_Scope0.incubateur
              /*
                  -- GENERATED --
                  DATE: Tue Mar 01 20:44:37 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/incubateur.scala.html
                  HASH: 8ad47baae5c58e5a9d6e99d5b38ab49b79bf5412
                  MATRIX: 837->0|1497->633|1512->639|1565->671|1648->727|1663->733|1716->765|1898->920|1913->926|1973->965|2057->1022|2072->1028|2134->1069|2263->1171|2278->1177|2349->1227|2457->1308|2472->1314|2535->1356|3697->2491|3712->2497|3766->2530|7582->6318|7598->6324|7662->6365|8118->6793|8134->6799|8197->6840|16421->15035|16438->15041|16503->15083|17850->16402|17866->16408|17932->16452|18455->16947|18471->16953|18541->17001|18770->17202|18786->17208|18852->17252|19377->17749|19393->17755|19463->17803|19692->18004|19708->18010|19774->18054|20300->18552|20316->18558|20386->18606|21203->19395|21219->19401|21277->19437|22754->20886|22770->20892|22828->20928|24330->22402|24346->22408|24404->22444|25961->23973|25977->23979|26035->24015|27538->25490|27554->25496|27612->25532|29103->26995|29119->27001|29177->27037|32374->30206|32390->30212|32462->30262|32517->30289|32533->30295|32602->30342|32657->30369|32673->30375|32740->30420|32795->30447|32811->30453|32879->30499|32934->30526|32950->30532|33024->30584|33079->30611|33095->30617|33163->30663|33218->30690|33234->30696|33308->30748|33363->30775|33379->30781|33451->30831|33506->30858|33522->30864|33578->30898
                  LINES: 32->1|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|59->28|59->28|59->28|78->47|78->47|78->47|145->114|145->114|145->114|152->121|152->121|152->121|277->246|277->246|277->246|301->270|301->270|301->270|305->274|305->274|305->274|309->278|309->278|309->278|313->282|313->282|313->282|317->286|317->286|317->286|321->290|321->290|321->290|340->309|340->309|340->309|363->332|363->332|363->332|386->355|386->355|386->355|412->381|412->381|412->381|435->404|435->404|435->404|458->427|458->427|458->427|517->486|517->486|517->486|518->487|518->487|518->487|519->488|519->488|519->488|520->489|520->489|520->489|521->490|521->490|521->490|522->491|522->491|522->491|523->492|523->492|523->492|524->493|524->493|524->493|525->494|525->494|525->494
                  -- GENERATED --
              */
          