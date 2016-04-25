
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
    """),format.raw/*3.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url("""),_display_(/*3.80*/routes/*3.86*/.Assets.versioned("img/home/header.jpg")),format.raw/*3.126*/(""" """),format.raw/*3.127*/(""") ;" data-stellar-background-ratio="0.65">
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
                        <li><a href="/deconnexion" role="tab" >Déconnexion</a></li>
                    </ul>
                </nav>
            </div>

            <div class="col-md-9 col-sm-8">
                <div class="tab-content transparent space-bottom-2x">
                    <div role="tabpanel" class="tab-pane transition fade scale in active" id="ressources">
                        <div class="table-responsive space-bottom-2x">
                            <table class="table-striped">
                                <tr>
                                    <td><a href=""""),_display_(/*33.51*/routes/*33.57*/.Assets.versioned("ressources/canvas.pptx")),format.raw/*33.100*/("""" title="" >Business Canevas</a> </td>
                                </tr>
                                <tr>
                                    <td><a href=""""),_display_(/*36.51*/routes/*36.57*/.Assets.versioned("ressources/pitch_19.pptx")),format.raw/*36.102*/("""" title="" >Model Pitch</a> </td>
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
                  DATE: Mon Apr 25 02:51:25 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/profil.scala.html
                  HASH: e0945b339b6b943e26a55ba81168f578c0bffa80
                  MATRIX: 829->2|851->16|889->17|920->22|1021->97|1035->103|1096->143|1125->144|2420->1412|2435->1418|2500->1461|2691->1625|2706->1631|2773->1676
                  LINES: 32->2|32->2|32->2|33->3|33->3|33->3|33->3|33->3|63->33|63->33|63->33|66->36|66->36|66->36
                  -- GENERATED --
              */
          