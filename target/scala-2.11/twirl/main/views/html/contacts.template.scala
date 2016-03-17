
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
    """),format.raw/*3.5*/("""<div class="page-title pt-dark pt-parallax" style="background-image : url ( """),_display_(/*3.82*/routes/*3.88*/.Assets.versioned("img/home/header.jpg")),format.raw/*3.128*/(""" """),format.raw/*3.129*/(""") ;" data-stellar-background-ratio="0.65">
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
                  DATE: Thu Mar 17 17:09:56 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/contacts.scala.html
                  HASH: 99a03956302c071b939e4cc20797e60bd3381946
                  MATRIX: 833->3|856->18|894->19|926->25|1029->102|1043->108|1104->148|1133->149|2508->1497|2523->1503|2583->1542|2687->1618|2716->1619|2801->1676|2830->1677|2874->1692|2904->1693|2934->1694|2964->1695|3018->1720|3048->1721|3078->1722|3108->1723|3138->1724|3168->1725|3255->1783|3285->1784|3331->1801|3361->1802|3391->1803|3421->1804|3467->1821|3497->1822|3527->1823|3557->1824|3587->1825|3617->1826|3707->1887|3737->1888|3783->1905|3813->1906|3843->1907|3873->1908|3903->1909|3933->1910|4024->1972|4054->1973|4100->1990|4130->1991|4160->1992|4190->1993
                  LINES: 32->2|32->2|32->2|33->3|33->3|33->3|33->3|33->3|64->34|64->34|64->34|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36|66->36
                  -- GENERATED --
              */
          