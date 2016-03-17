
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
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

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<header class="navbar navbar-fixed">
    <div class="container">
        <div class="inner">

            <a href="/" class="site-logo">
                <img src=""""),_display_(/*6.28*/routes/*6.34*/.Assets.versioned("img/logo.png")),format.raw/*6.67*/("""" alt="CIPMEN">
            </a>
            <div class="mobile-dropdown">

                <div class="mobile-tools">
                    <div class="social-bar text-center">
                        <a href="#" class="sb-facebook"><i class="fa fa-facebook"></i></a>
                        <a href="#" class="sb-twitter"><i class="fa fa-twitter"></i></a>
                    </div>
                </div>

                <nav class="main-navigation">
                    <ul class="menu">
                        <li>
                            <a href="/incubateur">L'incubateur</a>
                        </li>
                        <li class="menu-item-has-children">
                            <a href="#">Les incubés<span>&#8211;</span></a>
                            <ul class="sub-menu">
                                <li><a href="/startup/stratetic">Stratetic</a></li>
                                <li><a href="/startup/apkode">APKode</a></li>
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
                    </ul>
                </nav>
            </div>

            <div class="toolbar">
                <span class="divider"></span>
                <div class="share-btn">
                    <i class="pe-7s-share"></i>
                    <ul class="dropdown">
                        <li><a href="#" class="sb-facebook"><i class="fa fa-facebook"></i>Facebook</a></li>
                        <li><a href="#" class="sb-twitter"><i class="fa fa-twitter"></i>Twitter</a></li>
                    </ul>
                </div>
                <a href="/profil" class="btn btn-sm btn-info btn-ghost btn-icon-left scroll-to" data-offset-top="115">
                    <i class="pe-7s-download"></i>Mon espace
                </a>
                <div class="nav-toggle"><span></span></div>
            </div>
        </div>
    </div>
</header>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Thu Mar 17 17:09:56 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/header.scala.html
                  HASH: 1e747e9fc6d18a7f13f74b58c68b4e5823f2353e
                  MATRIX: 829->0|1019->164|1033->170|1086->203
                  LINES: 32->1|37->6|37->6|37->6
                  -- GENERATED --
              */
          