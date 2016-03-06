
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Accueil")/*3.17*/{_display_(Seq[Any](format.raw/*3.18*/("""
    """),format.raw/*4.5*/("""<section class="intro-section" style="background-image: url("""),_display_(/*4.66*/routes/*4.72*/.Assets.versioned("img/home/header.jpg")),format.raw/*4.112*/(""");" data-stellar-background-ratio="0.65">
        <span class="overlay" style="opacity: .25;"></span>
        <div class="container">
            <div class="row">
                <div class="col-lg-5 col-lg-offset-1 col-md-6 col-sm-6 padding-bottom-3x mobile-center">
                    <div class="padding-top-3x hidden-xs"></div>
                    <h2 class="text-light"><strong>CIPMEN</strong> le premier incubateur des PME au Niger</h2>
                    <div class="mobile-center" style="padding-top:150px">
                        <a href="/postule" class="btn  btn-light btn-icon-right">
                            Je postule
                            <i class="icon-arrow-right"></i>
                        </a>
                    </div>
                </div>


            </div>
        </div>
        <span class="inner-shadow"></span>
    </section>
    """),_display_(/*24.6*/if(flash.containsKey("newslettererror"))/*24.46*/ {_display_(Seq[Any](format.raw/*24.48*/("""
        """),_display_(/*25.10*/flash/*25.15*/.get("newslettererror")),format.raw/*25.38*/("""
    """)))}),format.raw/*26.6*/("""
    """),_display_(/*27.6*/if(flash.containsKey("newslettersuccess"))/*27.48*/ {_display_(Seq[Any](format.raw/*27.50*/("""
        """),_display_(/*28.10*/flash/*28.15*/.get("newslettersuccess")),format.raw/*28.40*/("""
    """)))}),format.raw/*29.6*/("""

    """),format.raw/*31.5*/("""<section class="fw-section padding-top-3x padding-bottom-3x">
        <div class="container">
            <div class="row">
                <div class="col-sm-4">
                    <img src=""""),_display_(/*35.32*/routes/*35.38*/.Assets.versioned("img/home/secteurs/technology.jpg")),format.raw/*35.91*/("""" class="img-rounded block-cente" alt="Square">
                </div>
                <div class="col-sm-4">
                    <img src=""""),_display_(/*38.32*/routes/*38.38*/.Assets.versioned("img/home/secteurs/energie.jpg")),format.raw/*38.88*/("""" class="img-rounded block-cente" alt="Square">
                </div>
                <div class="col-sm-4">
                    <img src=""""),_display_(/*41.32*/routes/*41.38*/.Assets.versioned("img/home/secteurs/environnement.jpg")),format.raw/*41.94*/("""" class="img-rounded block-cente" alt="Square">
                </div>

            </div>
        </div>
    </section>

    <section class="split-section split-gallery">
        <div class="tab-content">
            <div class="tab-pane transition fade scaledown in active" id="img1" style="background-image: url("""),_display_(/*50.111*/routes/*50.117*/.Assets.versioned("img/home/slides/2.jpg")),format.raw/*50.159*/(""")"></div>
            <div class="tab-pane transition fade scaledown" id="img2" style="background-image: url("""),_display_(/*51.101*/routes/*51.107*/.Assets.versioned("img/home/slides/1.jpg")),format.raw/*51.149*/(""")"></div>
            <div class="tab-pane transition fade scaledown" id="img3" style="background-image: url("""),_display_(/*52.101*/routes/*52.107*/.Assets.versioned("img/home/slides/3.jpg")),format.raw/*52.149*/(""")"></div>
        </div>
        <div class="content">

            <nav class="filters-bar space-bottom-2x">
                <div class="column">
                    <div class="custom-controls">
                        <a href="#" class="prev-btn"><i class="pe-7s-angle-left"></i></a>
                        <ul class="bullets">
                            <li class="active"><a href="#img1" data-toggle="tab"></a></li>
                            <li><a href="#img2" data-toggle="tab"></a></li>
                            <li><a href="#img3" data-toggle="tab"></a></li>
                        </ul>
                        <a href="#" class="next-btn"><i class="pe-7s-angle-right"></i></a>
                    </div>
                </div>
            </nav>
            <h3>Pourquoi intégrer le CIPMEN ?</h3>
            <ol>
                <li>tester votre fibre entreprenariale</li>
                <li>Être hébergé presque gratuitement</li>
                <li>Ne plus être seul dans votre aventure</li>
                <li>Bénéficier des conseils des experts</li>
                <li>Faire du networking</li>
                <li>S'appuyer sur la marque de CIPMEN et crédibiliser votre projet</li>
                <li>Profiter des opportunités qui se présentent qu'au CIPMEN
                </li>
            </ol>

            <ul class="counters">
                <li>
                    <i class="pe-7s-check"></i>
                    <h4>Environnement</h4>
                </li>
                <li>
                    <i class="pe-7s-check"></i>
                    <h4>Energies renouvellables</h4>
                </li>
                <li>
                    <i class="pe-7s-check"></i>
                    <h4>Technologie</h4>
                </li>
            </ul>
        </div>
    </section>

    <section>
        <div class="container">
            <div class="row">
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*103.36*/routes/*103.42*/.Assets.versioned("img/clients/1.jpg")),format.raw/*103.80*/("""" alt="Client1">
                    </a>
                </div>
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*108.36*/routes/*108.42*/.Assets.versioned("img/clients/2.jpg")),format.raw/*108.80*/("""" alt="Client2">
                    </a>
                </div>
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*113.36*/routes/*113.42*/.Assets.versioned("img/clients/3.jpg")),format.raw/*113.80*/("""" alt="Client3">
                    </a>
                </div>
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*118.36*/routes/*118.42*/.Assets.versioned("img/clients/4.jpg")),format.raw/*118.80*/("""" alt="Client4">
                    </a>
                </div>
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*123.36*/routes/*123.42*/.Assets.versioned("img/clients/5.jpg")),format.raw/*123.80*/("""" alt="Client5">
                    </a>
                </div>
            </div>
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Mar 05 02:26:56 WAT 2016
                  SOURCE: /home/brabo/IdeaProjects/cipmen/app/views/index.scala.html
                  HASH: 04962d5da72065bb2b6cf3ee2ad7c80e0aafe808
                  MATRIX: 827->5|850->20|888->21|920->27|1007->88|1021->94|1082->134|2007->1033|2056->1073|2096->1075|2134->1086|2148->1091|2192->1114|2229->1121|2262->1128|2313->1170|2353->1172|2391->1183|2405->1188|2451->1213|2488->1220|2523->1228|2748->1426|2763->1432|2837->1485|3008->1629|3023->1635|3094->1685|3265->1829|3280->1835|3357->1891|3710->2216|3726->2222|3790->2264|3929->2375|3945->2381|4009->2423|4148->2534|4164->2540|4228->2582|6399->4725|6415->4731|6475->4769|6769->5035|6785->5041|6845->5079|7139->5345|7155->5351|7215->5389|7509->5655|7525->5661|7585->5699|7879->5965|7895->5971|7955->6009
                  LINES: 32->3|32->3|32->3|33->4|33->4|33->4|33->4|53->24|53->24|53->24|54->25|54->25|54->25|55->26|56->27|56->27|56->27|57->28|57->28|57->28|58->29|60->31|64->35|64->35|64->35|67->38|67->38|67->38|70->41|70->41|70->41|79->50|79->50|79->50|80->51|80->51|80->51|81->52|81->52|81->52|132->103|132->103|132->103|137->108|137->108|137->108|142->113|142->113|142->113|147->118|147->118|147->118|152->123|152->123|152->123
                  -- GENERATED --
              */
          