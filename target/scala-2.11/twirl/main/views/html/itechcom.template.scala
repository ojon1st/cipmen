
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object itechcom_Scope0 {
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

class itechcom extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Startup")/*2.17*/{_display_(Seq[Any](format.raw/*2.18*/("""
"""),format.raw/*3.1*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url("""),_display_(/*3.76*/routes/*3.82*/.Assets.versioned("img/home/header1.jpg")),format.raw/*3.123*/(""" """),format.raw/*3.124*/(""") ;" data-stellar-background-ratio="0.65">
<span class="overlay" style="opacity :.25 ;"></span>
<div class="container">
    <div class="inner">
        <div class="title">
            <h2 class="text-light"><strong>Itechcom</strong></h2>
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
                                    <p><strong>TECHCOM sarl</strong> est une jeune entreprise qui se donne pour mission d'accompagner le développement socio-économique du Niger à travers la transformation numérique de la société et des entreprises</p>
                                    <p>
                                        Nous mettons en place des solutions technologiques, innovantes et adaptées à notre environnement afin de faciliter cette transformation : un réseau WIFI, couplé à des installations énergétiques solaires, pour faciliter l'accès à Internet aux populations urbaines et rurales et des solutions cloud pour fournir des services connectés (cyber sécurité, hébergement de données, emails, etc.).
                                    </p>

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
                                    Internet pour tous
                                </a>
                            </div>
                            <div id="pb01" class="panel-collapse collapse">
                                <div class="panel-body">
                                    Permettre au grand public, aux entreprises et entrepreneurs de communiquer aisément a travers la  fourniture d'un accès internet haut débit mobile par WIFI, accessible partout (dans un premier temps dans les centres de regroupement : écoles, campus, marchés, centres de loisirs, etc.) et très simplement (achat de l'accès par SMS, Mobile Money, carte de recharge des opérateurs télécoms, boutiques, super marchés, etc.) ; 
                                </div>
                            </div>
                        </div>
                        <div class="panel">
                            <div class="panel-heading">
                                <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion3" href="#pb02">
                                    Services cloud
                                </a>
                            </div>
                            <div id="pb02" class="panel-collapse collapse" role="tabpanel">
                                <div class="panel-body">
                                    Permettre aux entreprises, aux entrepreneurs ou même aux particuliers, de se focaliser sur la création de leur valeur en leur fournissant les moyens informatiques et télécoms dont ils ont besoin a travers une offre de services cloud accessibles sans Internet (emails, hébergement de données et autres sites web ou portails, applications métiers )
                                </div>
                            </div>
                        </div>
                        <div class="panel">
                            <div class="panel-heading">
                                <a class="panel-title collapsed" data-toggle="collapse" data-parent="#accordion3" href="#pb03">
                                    Externalisation de services IT
                                </a>
                            </div>
                            <div id="pb03" class="panel-collapse collapse">
                                <div class="panel-body">
                                    Permettre aux entreprises d'externaliser la gestion de leurs infrastructures systèmes et réseaux afin de gagner en efficacité et de disposer en tout temps des meilleurs technologies et pratiques du moment.
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="tile" id="ask-question">
                <form method="post" autocomplete="off" action="contacts">
                    <h3 class="text-center">Vous voulez nous contacter ?</h3>
                    <p class="text-gray text-center"><strong>contact@itechcom.live.ne<br>+227 20 73 31 82</strong> </p>
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
object itechcom extends itechcom_Scope0.itechcom
              /*
                  -- GENERATED --
                  DATE: Mon Apr 25 02:51:25 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/itechcom.scala.html
                  HASH: 37a8a2ac6330058371e9f344c342e2c9618b3b42
                  MATRIX: 833->2|856->17|894->18|921->19|1022->94|1036->100|1098->141|1127->142
                  LINES: 32->2|32->2|32->2|33->3|33->3|33->3|33->3|33->3
                  -- GENERATED --
              */
          