
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object inscription_Scope0 {
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

class inscription extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Inscription")/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""
    """),format.raw/*3.5*/("""<div class="page-404">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2">
                    """),_display_(/*7.22*/if(flash.containsKey("error"))/*7.52*/ {_display_(Seq[Any](format.raw/*7.54*/("""
                        """),format.raw/*8.25*/("""<h2>"""),_display_(/*8.30*/flash/*8.35*/.get("error")),format.raw/*8.48*/("""Elo</h2>
                    """)))}),format.raw/*9.22*/("""
                    """),format.raw/*10.21*/("""<form method="post" action="/inscription">
                        <div class="form-control">
                            <i class="pe-7s-user"></i>
                            <input type="text" name="nom" placeholder="Nom et prenom">
                        </div>
                        <div class="form-control">
                            <i class="pe-7s-mail"></i>
                            <input type="email" name="email" placeholder="Email">
                        </div>
                        <div class="form-control">
                            <i class="pe-7s-key"></i>
                            <input type="password" name="pass" placeholder="Mot de passe">
                        </div>
                        <div class="form-control">
                            <button type="submit" class="btn btn-default">Inscription</button>
                        </div>
                    </form>
                </div>
            </div>

        </div>
    </div
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
object inscription extends inscription_Scope0.inscription
              /*
                  -- GENERATED --
                  DATE: Thu Mar 17 17:09:56 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/inscription.scala.html
                  HASH: 0575bf6be5d5519fff86026dda7702726d205f50
                  MATRIX: 839->2|866->21|904->22|935->27|1147->213|1185->243|1224->245|1276->270|1307->275|1320->280|1353->293|1413->323|1462->344
                  LINES: 32->2|32->2|32->2|33->3|37->7|37->7|37->7|38->8|38->8|38->8|38->8|39->9|40->10
                  -- GENERATED --
              */
          