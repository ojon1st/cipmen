
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object novatech_Scope0 {
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

class novatech extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
                    <h2 class="text-light"><strong>Novatech</strong></h2>
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
                                        <p><strong>NOVATECH</strong> est une startup qui offre des solutions technologiques innovantes dans le domaine du Numérique.<br><br> Crée en 2014 avec une équipe de 4 personnes, NOVATECH est spécialisée dans les services réseaux et le développement d'applications mobiles et web.</p>
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
                                        Application mobile Guida
                                    </a>
                                </div>
                                <div id="pb01" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        « Guida » est une application mobile qui permet aux populations de trouver ​ ​facilement et rapidement des maisons à louer ou à acheter. La recherche ​ ​de logements à Niamey et dans les autres villes du Niger ​étant pénible ​ ​ ​ car la demande est forte et l’offre est très réduite. Grâce à cette application ​ ​ mobile, vous pouvez facilement trouver des​ logements au Niger avec des ​ ​ images, de la géolocalisation, des alertes ​SMS et Email et la liste des ​ ​services sociaux aux alentours des logements ​ ​(école, pharmacie, clinique, ​ ​ boutique).                                    </div>
                                </div>
                            </div>
                            <div class="panel">
                                <div class="panel-heading">
                                    <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion3" href="#pb02">
                                        Système de Communication Unifiée
                                    </a>
                                </div>
                                <div id="pb02" class="panel-collapse collapse" role="tabpanel">
                                    <div class="panel-body">
                                        Il s'agit d'un Système de Communication qui permet de communiquer et de partager des ressources en Entreprise à travers leur réseau informatique existant Wifi ou Cablé. Il s'agit d'une solution Open Source qui vous permet d'échanger par Messagerie Instantanée, par Voix et par Video sans passer par Internet.                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="tile" id="ask-question">
                    <form method="post" autocomplete="off" action="contacts">
                        <h3 class="text-center">Vous voulez nous contacter ?</h3>
                        <p class="text-gray text-center"><strong>daoudahamadou@gmail.com<br>(227) 91 01 22 12</strong> </p>
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
object novatech extends novatech_Scope0.novatech
              /*
                  -- GENERATED --
                  DATE: Mon Apr 25 02:51:24 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/novatech.scala.html
                  HASH: 537d8d4f22052cd8dc2a2efc26deee292295d1b0
                  MATRIX: 833->2|856->17|894->18|925->23|1026->98|1040->104|1102->145|1131->146
                  LINES: 32->2|32->2|32->2|33->3|33->3|33->3|33->3|33->3
                  -- GENERATED --
              */
          