
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
                    <h2 class="text-light"><strong>CIPMEN, le premier incubateur des PME au Niger</strong> </h2>
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
                <div class="col-sm-3">
                    <img src=""""),_display_(/*35.32*/routes/*35.38*/.Assets.versioned("img/home/secteurs/technology.jpg")),format.raw/*35.91*/("""" class="img-rounded block-cente" alt="Square">
                </div>
                <div class="col-sm-3">
                    <img src=""""),_display_(/*38.32*/routes/*38.38*/.Assets.versioned("img/home/secteurs/energie.jpg")),format.raw/*38.88*/("""" class="img-rounded block-cente" alt="Square">
                </div>
                <div class="col-sm-3">
                    <img src=""""),_display_(/*41.32*/routes/*41.38*/.Assets.versioned("img/home/secteurs/environnement.jpg")),format.raw/*41.94*/("""" class="img-rounded block-cente" alt="Square">
                </div>
                <div class="col-sm-3">
                    <img src=""""),_display_(/*44.32*/routes/*44.38*/.Assets.versioned("img/home/secteurs/agrobusiness.jpg")),format.raw/*44.93*/("""" class="img-rounded block-cente" alt="Square">
                </div>

            </div>
        </div>
    </section>

    <section class="split-section split-gallery">
        <div class="tab-content">
            <div class="tab-pane transition fade scaledown in active" id="img1" style="background-image: url("""),_display_(/*53.111*/routes/*53.117*/.Assets.versioned("img/home/slides/2.jpg")),format.raw/*53.159*/(""")"></div>
            <div class="tab-pane transition fade scaledown" id="img2" style="background-image: url("""),_display_(/*54.101*/routes/*54.107*/.Assets.versioned("img/home/slides/1.jpg")),format.raw/*54.149*/(""")"></div>
            <div class="tab-pane transition fade scaledown" id="img3" style="background-image: url("""),_display_(/*55.101*/routes/*55.107*/.Assets.versioned("img/home/slides/3.jpg")),format.raw/*55.149*/(""")"></div>
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
                        <img src=""""),_display_(/*106.36*/routes/*106.42*/.Assets.versioned("img/clients/1.jpg")),format.raw/*106.80*/("""" alt="Client1">
                    </a>
                </div>
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*111.36*/routes/*111.42*/.Assets.versioned("img/clients/2.jpg")),format.raw/*111.80*/("""" alt="Client2">
                    </a>
                </div>
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*116.36*/routes/*116.42*/.Assets.versioned("img/clients/3.jpg")),format.raw/*116.80*/("""" alt="Client3">
                    </a>
                </div>
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*121.36*/routes/*121.42*/.Assets.versioned("img/clients/4.jpg")),format.raw/*121.80*/("""" alt="Client4">
                    </a>
                </div>
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*126.36*/routes/*126.42*/.Assets.versioned("img/clients/5.jpg")),format.raw/*126.80*/("""" alt="Client5">
                    </a>
                </div>
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*131.36*/routes/*131.42*/.Assets.versioned("img/clients/6.jpg")),format.raw/*131.80*/("""" alt="Client5">
                    </a>
                </div>
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*136.36*/routes/*136.42*/.Assets.versioned("img/clients/7.jpg")),format.raw/*136.80*/("""" alt="Client5">
                    </a>
                </div>
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*141.36*/routes/*141.42*/.Assets.versioned("img/clients/8.jpg")),format.raw/*141.80*/("""" alt="Client5">
                    </a>
                </div>
                <div class="col-md-2 col-sm-4">
                    <a href="#" class="client" data-toggle="tooltip" data-placement="top" title="Visit website">
                        <img src=""""),_display_(/*146.36*/routes/*146.42*/.Assets.versioned("img/clients/9.jpg")),format.raw/*146.80*/("""" alt="Client5">
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
                  DATE: Mon Apr 25 02:51:25 WAT 2016
                  SOURCE: /home/brabo/Desktop/cipmen/app/views/index.scala.html
                  HASH: 5507e62b555de03a534050c8ae8599620ce02b14
                  MATRIX: 827->5|850->20|888->21|920->27|1007->88|1021->94|1082->134|2009->1035|2058->1075|2098->1077|2136->1088|2150->1093|2194->1116|2231->1123|2264->1130|2315->1172|2355->1174|2393->1185|2407->1190|2453->1215|2490->1222|2525->1230|2750->1428|2765->1434|2839->1487|3010->1631|3025->1637|3096->1687|3267->1831|3282->1837|3359->1893|3530->2037|3545->2043|3621->2098|3974->2423|3990->2429|4054->2471|4193->2582|4209->2588|4273->2630|4412->2741|4428->2747|4492->2789|6663->4932|6679->4938|6739->4976|7033->5242|7049->5248|7109->5286|7403->5552|7419->5558|7479->5596|7773->5862|7789->5868|7849->5906|8143->6172|8159->6178|8219->6216|8513->6482|8529->6488|8589->6526|8883->6792|8899->6798|8959->6836|9253->7102|9269->7108|9329->7146|9623->7412|9639->7418|9699->7456
                  LINES: 32->3|32->3|32->3|33->4|33->4|33->4|33->4|53->24|53->24|53->24|54->25|54->25|54->25|55->26|56->27|56->27|56->27|57->28|57->28|57->28|58->29|60->31|64->35|64->35|64->35|67->38|67->38|67->38|70->41|70->41|70->41|73->44|73->44|73->44|82->53|82->53|82->53|83->54|83->54|83->54|84->55|84->55|84->55|135->106|135->106|135->106|140->111|140->111|140->111|145->116|145->116|145->116|150->121|150->121|150->121|155->126|155->126|155->126|160->131|160->131|160->131|165->136|165->136|165->136|170->141|170->141|170->141|175->146|175->146|175->146
                  -- GENERATED --
              */
          