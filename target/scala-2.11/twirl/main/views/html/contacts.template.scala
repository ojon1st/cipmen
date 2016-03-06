
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contacts_Scope0 {
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

class contacts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Contact")/*2.17*/{_display_(Seq[Any](format.raw/*2.18*/("""
    """),format.raw/*3.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url("""),_display_(/*3.80*/routes/*3.86*/.Assets.versioned("img/home/header.jpg")),format.raw/*3.126*/(""");" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity :.25 ;"></span>
        <div class="container">
            <div class="inner">
                <div class="title">
                    <h2 class="text-light"><strong>Contacts</strong></h2>
                </div>

            </div>
        </div>
    </div>

    <section class="contacts-split space-top-3x">
        <div class="column">

                <!-- Data API:
             data-height="500" height of the map in pixels
             data-address="Your address" string
             data-zoom="number" to control map zoom when loaded
             data-disable-controls="false/true" enable/disable map controls like pan, zoom, etc.
             data-scrollwheel="true/false" enable/disable mouse scroll wheel zoom
             data-marker="path_to_your_image" path to custom marker image
             data-marker-title=" Your title" appears on marker hover
             data-styles="[array]" you can adjust the look and feel of your map. Recommend to use https://snazzymaps.com
         -->
            <div class="google-map"
            data-height="450"
            data-address="Niamey"
            data-zoom="6"
            data-disable-controls="false"
            data-scrollwheel="false"
            data-marker=""""),_display_(/*34.27*/routes/*34.33*/.Assets.versioned("img/map-marker.png")),format.raw/*34.72*/(""""
            data-marker-title="Cipmen Niamey"
            data-styles='["""),format.raw/*36.27*/("""{"""),format.raw/*36.28*/(""""featureType":"road","elementType":"geometry","stylers":["""),format.raw/*36.85*/("""{"""),format.raw/*36.86*/(""""lightness":100"""),format.raw/*36.101*/("""}"""),format.raw/*36.102*/(""","""),format.raw/*36.103*/("""{"""),format.raw/*36.104*/(""""visibility":"simplified""""),format.raw/*36.129*/("""}"""),format.raw/*36.130*/("""]"""),format.raw/*36.131*/("""}"""),format.raw/*36.132*/(""","""),format.raw/*36.133*/("""{"""),format.raw/*36.134*/(""""featureType":"water","elementType":"geometry","stylers":["""),format.raw/*36.192*/("""{"""),format.raw/*36.193*/(""""visibility":"on""""),format.raw/*36.210*/("""}"""),format.raw/*36.211*/(""","""),format.raw/*36.212*/("""{"""),format.raw/*36.213*/(""""color":"#C6E2FF""""),format.raw/*36.230*/("""}"""),format.raw/*36.231*/("""]"""),format.raw/*36.232*/("""}"""),format.raw/*36.233*/(""","""),format.raw/*36.234*/("""{"""),format.raw/*36.235*/(""""featureType":"poi","elementType":"geometry.fill","stylers":["""),format.raw/*36.296*/("""{"""),format.raw/*36.297*/(""""color":"#C5E3BF""""),format.raw/*36.314*/("""}"""),format.raw/*36.315*/("""]"""),format.raw/*36.316*/("""}"""),format.raw/*36.317*/(""","""),format.raw/*36.318*/("""{"""),format.raw/*36.319*/(""""featureType":"road","elementType":"geometry.fill","stylers":["""),format.raw/*36.381*/("""{"""),format.raw/*36.382*/(""""color":"#D1D1B8""""),format.raw/*36.399*/("""}"""),format.raw/*36.400*/("""]"""),format.raw/*36.401*/("""}"""),format.raw/*36.402*/("""]'>
            </div>
        </div>
        <div class="column">
            <form method="post" class="contact-form ajax-form" autocomplete="off" action="contacts">
                <h4>Pour plus d'information, veuillez nous écrire</h4>
                <p class="text-muted">Cipmen, quartier yantala, plateau</p>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="form-control">
                            <i class="pe-7s-user"></i>
                            <input type="text" name="nom" placeholder="Nom" required="required">
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="form-control">
                            <i class="pe-7s-mail"></i>
                            <input type="email" name="expediteur" placeholder="Email" required="required">
                        </div>
                    </div>
                </div>
                <div class="form-control">
                    <i class="pe-7s-comment"></i>
                    <textarea rows="3" name="message" placeholder="Message" required="required"></textarea>
                </div>
                <div class="row">
                    <div class="col-sm-6 padding-top">
                        <label class="checkbox">
                            <input type="checkbox" name="newsletter"> S'inscrire à la newsletter
                        </label>
                    </div>
                    <div class="col-sm-6 text-right">
                        <input type="hidden" name="destinataire" value="contact@cipmen.org">
                        <button type="submit" class="btn btn-ghost btn-primary">Envoyer le message</button>
                    </div>
                </div>
                <div class="response-holder"></div>
            </form>
        </div>
    </section>
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
object contacts extends contacts_Scope0.contacts
              /*
                  -- GENERATED --
                  DATE: Sat Mar 05 23:24:16 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/contacts.scala.html
                  HASH: fd411ed8f75e419ac3435daadfc51fc760680410
                  MATRIX: 833->3|856->18|894->19|926->25|1027->100|1041->106|1102->146|2476->1493|2491->1499|2551->1538|2655->1614|2684->1615|2769->1672|2798->1673|2842->1688|2872->1689|2902->1690|2932->1691|2986->1716|3016->1717|3046->1718|3076->1719|3106->1720|3136->1721|3223->1779|3253->1780|3299->1797|3329->1798|3359->1799|3389->1800|3435->1817|3465->1818|3495->1819|3525->1820|3555->1821|3585->1822|3675->1883|3705->1884|3751->1901|3781->1902|3811->1903|3841->1904|3871->1905|3901->1906|3992->1968|4022->1969|4068->1986|4098->1987|4128->1988|4158->1989
                  LINES: 32->2|32->2|32->2|33->3|33->3|33->3|33->3|64->34|64->34|64->34|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36
                  -- GENERATED --
              */
          