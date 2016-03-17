
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
    """),format.raw/*3.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url ( """),_display_(/*3.82*/routes/*3.88*/.Assets.versioned("img/home/header.jpg")),format.raw/*3.128*/(""" """),format.raw/*3.129*/(""") ;" data-stellar-background-ratio="0.65">
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
                  DATE: Thu Mar 17 17:09:56 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/profil.scala.html
                  HASH: 0d77526313e20ec1fb857ff0953a9254e8899b4d
                  MATRIX: 829->2|851->16|889->17|920->22|1023->99|1037->105|1098->145|1127->146|2422->1414|2437->1420|2502->1463|2693->1627|2708->1633|2775->1678
                  LINES: 32->2|32->2|32->2|33->3|33->3|33->3|33->3|33->3|63->33|63->33|63->33|66->36|66->36|66->36
                  -- GENERATED --
              */
          