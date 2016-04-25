
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object connexion_Scope0 {
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

class connexion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Connexion")/*1.19*/{_display_(Seq[Any](format.raw/*1.20*/("""
    """),format.raw/*2.5*/("""<div class="page-404">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2">
                    <form method="post" action="/connexion">
                        <div class="form-control">
                            <i class="pe-7s-mail"></i>
                            <input type="email" name="email" placeholder="Email">
                        </div>
                        <div class="form-control">
                            <i class="pe-7s-key"></i>
                            <input type="password" name="password" placeholder="Mot de passe">
                        </div>
                        <div class="form-control">
                            <button type="submit" class="btn btn-default">Connexion</button>
                        </div>
                        <div class="form-control">
                            <a class="btn btn-ghost btn-default" href="/inscription" title="Inscription">Créer un compte</a>
                        </div>
                    </form>
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
object connexion extends connexion_Scope0.connexion
              /*
                  -- GENERATED --
                  DATE: Mon Apr 25 02:51:25 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/connexion.scala.html
                  HASH: d9764c3196cb47667591bdfe97404bc06e77e4e7
                  MATRIX: 835->1|860->18|898->19|929->24
                  LINES: 32->1|32->1|32->1|33->2
                  -- GENERATED --
              */
          