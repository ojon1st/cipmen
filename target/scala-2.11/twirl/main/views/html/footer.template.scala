
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object footer_Scope0 {
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

class footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<footer class="footer space-top-3x">
    <div class="container">
        <form class="row subscription" method="post" action="/newsletter">
            <div class="col-sm-9">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="form-control">
                            <i class="pe-7s-user"></i>
                            <input type="text" name="nom" placeholder="Nom">
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="form-control">
                            <i class="pe-7s-mail"></i>
                            <input type="email" name="email" placeholder="Email">
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-3">
                <button type="submit" class="btn btn-ghost  btn-info btn-block">Newsletter</button>
            </div>
            <div class="col-sm-12">
                <span class="text-muted">* Restez informé sur l'actualité.</span>
            </div>
        </form>
        <div class="copyright">
            <div class="inner">
                <div class="column">
                    <span class="copy-text">&copy; 2016. Tous droits réservés</span>
                </div>
                <div class="column">
                    <nav class="footer-nav">
                        <ul>
                            <li><a href="/mediatheques">Mediathèque</a></li>
                            <li><a href="/postule">Porteurs de projet</a></li>
                            <li><a href="/contacts">Contacts</a></li>
                        </ul>
                    </nav>
                </div>
                <div class="column">
                    <div class="social-bar">
                        <a href="https://www.facebook.com/incubateurCIPMEN/" class="sb-facebook" data-toggle="tooltip" data-placement="top" title="Facebook"><i class="fa fa-facebook"></i></a>
                        <a href="https://twitter.com/cipmen" class="sb-twitter" data-toggle="tooltip" data-placement="top" title="Twitter"><i class="fa fa-twitter"></i></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object footer extends footer_Scope0.footer
              /*
                  -- GENERATED --
                  DATE: Mon Apr 25 02:51:24 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/footer.scala.html
                  HASH: 3a6b96068128de055a35729ba9d3dbf32a02d76b
                  MATRIX: 829->0
                  LINES: 32->1
                  -- GENERATED --
              */
          