
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


Seq[Any](_display_(/*2.2*/main("Connexion")/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""
    """),format.raw/*3.5*/("""<div class="page-404">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2">
                    <h1>Connexion</h1>
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
                            <button type="submit" class="btn btn-ghost btn-default">Connexion</button>
                            <a class="btn btn-default" href="/inscription" title="Inscription">Inscription</a>
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
                  DATE: Sat Mar 05 00:19:43 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/connexion.scala.html
                  HASH: cdecd1aab5a2e0150ace13340cdd54a716b30adb
                  MATRIX: 835->2|860->19|898->20|929->25
                  LINES: 32->2|32->2|32->2|33->3
                  -- GENERATED --
              */
          