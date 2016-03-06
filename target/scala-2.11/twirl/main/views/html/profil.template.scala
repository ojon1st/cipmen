
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profil_Scope0 {
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

class profil extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Profil")/*2.16*/{_display_(Seq[Any](format.raw/*2.17*/("""
    """),format.raw/*3.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url("""),_display_(/*3.80*/routes/*3.86*/.Assets.versioned("img/home/header.jpg")),format.raw/*3.126*/(""");" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity :.25 ;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h2 class="text-light"><strong>Mon profil</strong></h2>
                </div>

            </div>
        </div>
    </div>

    <div class="container space-bottom-2x">
        <div class="row">

            <div class="col-md-3 col-sm-4 space-bottom-2x">
                <nav class="side-nav">
                    <ul role="tablist">
                        <li class="active"><a href="#ressources" role="tab" data-toggle="tab">Mes ressources</a></li>
                    </ul>
                </nav>
            </div>

            <div class="col-md-9 col-sm-8">
                <div class="tab-content transparent space-bottom-2x">
                    <div role="tabpanel" class="tab-pane transition fade scale in active" id="ressources">
                        <div class="table-responsive space-bottom-2x">
                            <table class="table-striped">
                                <tr>
                                    <td>Concours</td>
                                </tr>
                                <tr>
                                    <td><a href="" title="" >Business Canevas</a> </td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object profil extends profil_Scope0.profil
              /*
                  -- GENERATED --
                  DATE: Sat Mar 05 23:04:54 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/profil.scala.html
                  HASH: 7e66193f331b9caa870ea4b580f3fda3cde3846a
                  MATRIX: 829->2|851->16|889->17|920->22|1021->97|1035->103|1096->143
                  LINES: 32->2|32->2|32->2|33->3|33->3|33->3|33->3
                  -- GENERATED --
              */
          