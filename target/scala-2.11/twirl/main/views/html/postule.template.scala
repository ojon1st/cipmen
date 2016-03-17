
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object postule_Scope0 {
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

class postule extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Je postule")/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
    """),format.raw/*3.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url ( """),_display_(/*3.82*/routes/*3.88*/.Assets.versioned("img/home/header.jpg")),format.raw/*3.128*/(""" """),format.raw/*3.129*/(""") ;" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity :.25 ;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h2 class="text-light"><strong>Je postule</strong></h2>
                </div>

            </div>
        </div>
    </div>

    <div class="container space-bottom-2x">
        <div class="row">

            <div class="col-md-3 col-sm-4 space-bottom-2x">
                <nav class="side-nav">
                    <ul role="tablist">
                        <li class="active"><a href="#energie" role="tab" data-toggle="tab">Énergie</a></li>
                        <li><a href="#environnement" role="tab" data-toggle="tab">Environnement</a></li>
                        <li><a href="#tic" role="tab" data-toggle="tab">TIC</a></li>
                    </ul>
                </nav>
            </div>
            """),_display_(/*27.14*/if(flash.containsKey("postuleerror"))/*27.51*/ {_display_(Seq[Any](format.raw/*27.53*/("""
                """),_display_(/*28.18*/flash/*28.23*/.get("postuleerror")),format.raw/*28.43*/("""
            """)))}),format.raw/*29.14*/("""
            """),_display_(/*30.14*/if(flash.containsKey("postulesuccess"))/*30.53*/ {_display_(Seq[Any](format.raw/*30.55*/("""
                """),_display_(/*31.18*/flash/*31.23*/.get("postulesuccess")),format.raw/*31.45*/("""
            """)))}),format.raw/*32.14*/("""
            """),format.raw/*33.13*/("""<div class="col-md-9 col-sm-8">
                <div class="tab-content transparent space-bottom-2x">
                    <div role="tabpanel" class="tab-pane transition fade scale in active" id="energie">
                        <form method="post" action="postule">
                            <div class="form-control">
                                <input type="text" name="nom" placeholder="Nom">
                                <input type="text" name="prenom" placeholder="Prénom">
                                <input type="email" name="email" placeholder="Email">
                                <input type="text" name="adresse" placeholder="Adresse">
                                <input type="hidden" name="type" value="energie">
                            </div>
                            <div class="form-control">
                                <textarea rows="3"  name="description" placeholder="Description de votre projet"></textarea>
                            </div>
                            <div class="form-control">
                                <textarea rows="3" name="probleme" placeholder="Problèmes constatés ou opportunités"></textarea>
                            </div>
                            <div class="form-control">
                                <textarea rows="3" name="clientele" placeholder="Cientèle cible"></textarea>
                            </div>
                            <div class="form-group">
                                <p style="padding-left: 30px;">Stade de développement</p>
                                <label class="radio">
                                    <input type="radio" name="stade" value="Idée"> Idée
                                </label>
                                <label class="radio">
                                    <input type="radio" name="stade" value="Prototype"> Prototype
                                </label>
                                <label class="radio">
                                    <input type="radio" name="stade"  value="test sur le marché"> Test sur le marché
                                </label>
                            </div>
                            <div class="form-control">
                                <textarea rows="3" name="frein" placeholder="Freins à la réalisation"></textarea>
                            </div>
                            <div class="form-control">
                                <textarea rows="3" name="attente" placeholder="Vos attentes vis-à-vis du Cipmen"></textarea>
                            </div>
                            <div class="form-control">
                                <button type="submit" class="btn btn-ghost btn-default">Envoyer</button>
                            </div>
                        </form>
                    </div>
                    <div role="tabpanel" class="tab-pane transition fade scale" id="environnement">
                        <form method="post" action="postule">
                            <div class="form-control">
                                <input type="text" name="nom" placeholder="Nom">
                                <input type="text" name="prenom" placeholder="Prénom">
                                <input type="email" name="email" placeholder="Email">
                                <input type="text" name="adresse" placeholder="Adresse">
                                <input type="hidden" name="type" value="environnement">
                            </div>
                            <div class="form-control">
                                <textarea rows="3" placeholder="Description de votre projet"></textarea>
                            </div>
                            <div class="form-control">
                                <textarea rows="3" placeholder="Problèmes constatés ou opportunités"></textarea>
                            </div>
                            <div class="form-control">
                                <textarea rows="3" placeholder="Cientèle cible"></textarea>
                            </div>
                            <div class="form-group">
                                <p style="padding-left: 30px;">Stade de développement</p>
                                <label class="radio">
                                    <input type="radio" name="stade" value="Idée"> Idée
                                </label>
                                <label class="radio">
                                    <input type="radio" name="stade" value="Prototype"> Prototype
                                </label>
                                <label class="radio">
                                    <input type="radio" name="stade"  value="test sur le marché"> Test sur le marché
                                </label>
                            </div>
                            <div class="form-control">
                                <textarea rows="3" placeholder="Freins à la réalisation"></textarea>
                            </div>
                            <div class="form-control">
                                <textarea rows="3" placeholder="Vos attentes vis-à-vis du Cipmen"></textarea>
                            </div>
                            <div class="form-control">
                                <button type="submit" class="btn btn-ghost btn-default">Envoyer</button>
                            </div>
                        </form>
                    </div>
                    <div role="tabpanel" class="tab-pane transition fade scale" id="tic">
                        <form method="post" action="postule">
                            <div class="form-control">
                                <input type="text" name="nom" placeholder="Nom">
                                <input type="text" name="prenom" placeholder="Prénom">
                                <input type="email" name="email" placeholder="Email">
                                <input type="text" name="adresse" placeholder="Adresse">
                                <input type="hidden" name="type" value="tic">
                            </div>
                            <div class="form-control">
                                <textarea rows="3" placeholder="Description de votre projet"></textarea>
                            </div>
                            <div class="form-control">
                                <textarea rows="3" placeholder="Problèmes constatés ou opportunités"></textarea>
                            </div>
                            <div class="form-control">
                                <textarea rows="3" placeholder="Cientèle cible"></textarea>
                            </div>
                            <div class="form-group">
                                <p style="padding-left: 30px;">Stade de développement</p>
                                <label class="radio">
                                    <input type="radio" name="stade" value="Idée"> Idée
                                </label>
                                <label class="radio">
                                    <input type="radio" name="stade" value="Prototype"> Prototype
                                </label>
                                <label class="radio">
                                    <input type="radio" name="stade"  value="test sur le marché"> Test sur le marché
                                </label>
                            </div>
                            <div class="form-control">
                                <textarea rows="3" placeholder="Freins à la réalisation"></textarea>
                            </div>
                            <div class="form-control">
                                <textarea rows="3" placeholder="Vos attentes vis-à-vis du Cipmen"></textarea>
                            </div>
                            <div class="form-control">
                                <button type="submit" class="btn btn-ghost btn-default">Envoyer</button>
                            </div>
                        </form>
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
object postule extends postule_Scope0.postule
              /*
                  -- GENERATED --
                  DATE: Thu Mar 17 17:09:55 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/postule.scala.html
                  HASH: e80b20500e470556bab82188b79d475658d300dc
                  MATRIX: 831->2|857->20|895->21|926->26|1029->103|1043->109|1104->149|1133->150|2099->1089|2145->1126|2185->1128|2230->1146|2244->1151|2285->1171|2330->1185|2371->1199|2419->1238|2459->1240|2504->1258|2518->1263|2561->1285|2606->1299|2647->1312
                  LINES: 32->2|32->2|32->2|33->3|33->3|33->3|33->3|33->3|57->27|57->27|57->27|58->28|58->28|58->28|59->29|60->30|60->30|60->30|61->31|61->31|61->31|62->32|63->33
                  -- GENERATED --
              */
          