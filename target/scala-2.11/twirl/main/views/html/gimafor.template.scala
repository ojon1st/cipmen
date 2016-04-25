
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object gimafor_Scope0 {
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

class gimafor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Startup")/*2.17*/{_display_(Seq[Any](format.raw/*2.18*/("""
    """),format.raw/*3.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url("""),_display_(/*3.80*/routes/*3.86*/.Assets.versioned("img/home/header1.jpg")),format.raw/*3.127*/(""" """),format.raw/*3.128*/(""") ;" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity :.25 ;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h2 class="text-light"><strong>Gimafor</strong></h2>
                </div>

            </div>
        </div>
    </div>

    <div class="container space-bottom-2x">
        <div class="row">

            <div class="col-md-3 col-sm-4 space-bottom-2x">
                <nav class="side-nav dark-skin">
                    <ul role="tablist">
                        <li class="active"><a href="#presentation" role="tab" data-toggle="tab">Présentation</a></li>
                        <li><a href="#produits" role="tab" data-toggle="tab">Produits / services</a></li>
                        <li><a href="#ask-question" class="scroll-to" data-offset-top="165">Nous contacter</a></li>
                    </ul>
                </nav>
            </div>

            <div class="col-md-9 col-sm-8">
                <div class="tab-content transparent space-bottom-2x">
                    <div role="tabpanel" class="tab-pane transition fade scale in active" id="presentation">
                        <div class="panel-group" id="accordion">
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title" data-toggle="collapse" data-parent="#accordion" href="#ac02">
                                        Qui sommes-nous ?
                                    </a>
                                </div>
                                <div id="ac02" class="panel-collapse collapse in" role="tabpanel">
                                    <div class="panel-body">
                                        <p>Le Groupe d’ingénierie, de Management, deFormation et de Recherche (GIMAFOR) est une entreprise dont la force réside dans sa capacité à élaborer, développer et exécuter des projets de développement à travers le déploiement de systèmes énergétiques.</p>
                                        <div class="embed-responsive embed-responsive-16by9 space-top-2x space-bottom-2x">
                                            <iframe src="https://www.youtube.com/embed/AUNNQWy-vC0" frameborder="0" allowfullscreen class="embed-responsive-item"></iframe>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div role="tabpanel" class="tab-pane transition fade scale" id="produits">
                        <div class="panel-group" id="accordion3">
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion3" href="#pb01">
                                        Energies & développement
                                    </a>
                                </div>
                                <div id="pb01" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        Etude de faisabilité et Dimensionnement des systèmes énergétiques ; Installation, ingénierie et management, l’efficacité énergétique, l’économie d’énergie, énergies renouvelables, installations et équipements électriques                                     </div>
                                </div>
                                <div class="panel">
                                    <div class="panel-heading">
                                        <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion3" href="#pb02">
                                            Maintenance et Sureté de fonctionnement des systèmes énergétiques
                                        </a>
                                    </div>
                                    <div id="pb02" class="panel-collapse collapse" role="tabpanel">
                                        <div class="panel-body">
                                            Maintenance et Sureté de fonctionnement des systèmes énergétiques                                        </div>
                                    </div>
                                </div>
                                <div class="panel">
                                    <div class="panel-heading">
                                        <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion3" href="#pb02">
                                            Recherche et Développement de systèmes énergétiques innovants.
                                        </a>
                                    </div>
                                    <div id="pb02" class="panel-collapse collapse" role="tabpanel">
                                        <div class="panel-body">
                                            Recherche et Développement de systèmes énergétiques innovants.
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="tile" id="ask-question">
                            <form method="post" autocomplete="off" action="contacts">
                                <h3 class="text-center">Vous voulez nous contacter ?</h3>
                                <p class="text-gray text-center"><strong>infos@tele-irrigation.net<br>(227) 90 32 60 35 / 96 96 62 89</strong> </p>
                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="form-control">
                                            <i class="pe-7s-user"></i>
                                            <input type="text" placeholder="Nom" name="nom" required="required">
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-control">
                                            <i class="pe-7s-mail"></i>
                                            <input type="email" placeholder="Email" name="expediteur" required="required">
                                        </div>
                                    </div>
                                </div>
                                <div class="form-control">
                                    <i class="pe-7s-help1"></i>
                                    <textarea rows="3" placeholder="Message" name="message" required="required"></textarea>
                                </div>
                                <div class="row">
                                    <div class="col-sm-6 text-right">
                                        <input type="hidden" name="newsletter" value="0">
                                        <input type="hidden" name="destinataire" value="contact@stratetic.org">
                                        <button type="submit" class="btn btn-ghost btn-primary">Envoyer</button>
                                    </div>
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
object gimafor extends gimafor_Scope0.gimafor
              /*
                  -- GENERATED --
                  DATE: Mon Apr 25 02:51:24 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/gimafor.scala.html
                  HASH: 3fa62e67e113281c1313e990d9c13eaa103ff01b
                  MATRIX: 831->2|854->17|892->18|923->23|1024->98|1038->104|1100->145|1129->146
                  LINES: 32->2|32->2|32->2|33->3|33->3|33->3|33->3|33->3
                  -- GENERATED --
              */
          